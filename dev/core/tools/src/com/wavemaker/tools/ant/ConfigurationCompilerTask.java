/*
 *  Copyright (C) 2007-2010 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wavemaker.tools.ant;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;

import javax.xml.bind.JAXBException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.types.Resource;

import com.wavemaker.tools.project.Project;
import com.wavemaker.tools.project.ProjectConstants;
import com.wavemaker.tools.service.ConfigurationCompiler;
import com.wavemaker.tools.service.DesignServiceManager;
import com.wavemaker.tools.service.FileService;
import com.wavemaker.tools.service.definitions.Service;
import com.wavemaker.tools.service.definitions.ServiceComparator;
import com.wavemaker.tools.util.DesignTimeUtils;


/**
 * Generate runtime configuration (spring and SMD; anything generated by
 * DesignServiceManager.generateRuntimeConfiguration()).
 * The destWebAppRoot takes precedence over project, but project should still be
 * set to read project-specific configuration.
 *
 * @author small
 * @version $Rev$ - $Date$
 *
 */
public class ConfigurationCompilerTask extends AbstractServiceCompilerTask {

    public ConfigurationCompilerTask() {
        super(true);
    }

    private File destWebAppRoot;
    private File destServicesDir;

    public File getDestWebAppRoot() {
        return destWebAppRoot;
    }
    public void setDestWebAppRoot(File destWebAppRoot) {
        this.destWebAppRoot = destWebAppRoot;
    }
    
    public File getDestServicesDir() {
        return destServicesDir;
    }
    /**
     * Set a destination directory for the SMDs (runtime services).
     */
    public void setDestServicesDir(File destServicesDir) {
        this.destServicesDir = destServicesDir;
    }

    /**
     * @see DesignServiceManager.generateRuntimeConfiguration()
     */
    @Override
    protected void doExecute() throws BuildException {

        File destination;
        FileService fileService = null;
        if (null!=getDestWebAppRoot()) {
            destination = getDestWebAppRoot();
        } else if (null!=getAGProject()) {
            Project p = getAGProject();
            destination = p.getWebAppRoot();
            fileService = p;
        } else {
            throw new BuildException("one of destWebAppRoot or projectRoot must be set");
        }

        if (null==fileService) {
            System.out.println("using "+destination+" as a default project directory; please set projectRoot");
            fileService = new Project(destination);
        }


        boolean doXmlBuild = false;
        SortedSet<Service> doBuildServices = new TreeSet<Service>(
                new ServiceComparator());
        SortedSet<Service> allServices = new TreeSet<Service>(
                new ServiceComparator());
        Map<Service, Long> serviceToMtime = new HashMap<Service, Long>();

        Iterator<?> it = getUnion().iterator();
        while (it.hasNext()) {
            Resource resource = (Resource) it.next();

            try {
                InputStream is = resource.getInputStream();
                Service service;
                try {
                    service = DesignServiceManager.loadServiceDefinition(is);
                } finally {
                    is.close();
                }

                if (getVerbose()) {
                    System.out.println("checking service "+service.getId());
                }

                serviceToMtime.put(service, resource.getLastModified());

                allServices.add(service);
            } catch (JAXBException e) {
                throw new BuildException(e);
            } catch (IOException e) {
                throw new BuildException(e);
            }
        }

        File webInf = new File(destination, ProjectConstants.WEB_INF);
        File servicesXml = new File(webInf, ConfigurationCompiler.RUNTIME_SERVICES);
        File managersXml = new File(webInf, ConfigurationCompiler.RUNTIME_MANAGERS);
        File typesJs = new File(destination, ConfigurationCompiler.TYPE_RUNTIME_FILE);
        
        File servicesDir;
        if (null!=getDestServicesDir()) {
            servicesDir = getDestServicesDir();
        } else {
            servicesDir = new File(destination,
                    ConfigurationCompiler.RUNTIME_SERVICES_DIR);
        }


        // check files for a build
        if (!servicesXml.exists() || !managersXml.exists() || !typesJs.exists()) {
            doXmlBuild = true;
        }

        // check SMDs for a build
        for (Entry<Service, Long> entry: serviceToMtime.entrySet()) {

            Service service = entry.getKey();
            long mtime = entry.getValue();
            File smdFile = ConfigurationCompiler.getSmdFile(servicesDir,
                    service.getId());

            if (!smdFile.exists() || (smdFile.lastModified() < mtime)) {
                doBuildServices.add(service);
                doXmlBuild = true;
            }
        }


        try {
            if (doXmlBuild) {
                ConfigurationCompiler.generateServices(fileService,
                        servicesXml, allServices);

                ConfigurationCompiler.generateManagers(fileService,
                        managersXml, allServices);

                System.out.println("Regenerated spring configuration for "+
                        allServices.size()+" services");
            }

            if (0 < doBuildServices.size()) {
                ConfigurationCompiler.generateSMDs(fileService, servicesDir,
                        doBuildServices);

                System.out.println("Configured " + doBuildServices.size()
                        + " services");
            }
            
            // if we're doing any sort of build, generate types
            if (doXmlBuild || 0<doBuildServices.size()) {
                DesignServiceManager dsm = DesignTimeUtils.getDSMForProjectRoot(
                        fileService.getFileServiceRoot(), true);
                ConfigurationCompiler.generateTypes(fileService, typesJs,
                        allServices, dsm.getPrimitiveDataObjects());
                
                System.out.println("Regenerated types & services information");
            }
        } catch (JAXBException ex) {
            throw new BuildException(ex);
        } catch (IOException ex) {
            throw new BuildException(ex);
        } catch (NoSuchMethodException ex) {
            throw new BuildException(ex);
        }

    }
}
