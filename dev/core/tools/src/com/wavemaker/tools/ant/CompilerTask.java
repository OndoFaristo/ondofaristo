/*
 *  Copyright (C) 2007-2011 WaveMaker Software, Inc.
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

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import com.wavemaker.common.util.ClassLoaderUtils;
import com.wavemaker.common.util.ClassLoaderUtils.TaskNoRtn;
import com.wavemaker.tools.project.Project;
import com.wavemaker.tools.service.DesignServiceManager;
import com.wavemaker.tools.util.AntUtils;
import com.wavemaker.tools.util.DesignTimeUtils;


/**
 * Base Task.
 * 
 * @author Simon Toens
 * @version $Rev:22688 $ - $Date:2008-05-30 16:38:13 -0700 (Fri, 30 May 2008) $ */
public abstract class CompilerTask extends Task {

    private File projectRoot;
    private Project agProject;

    private String classpath;

    private boolean projectRootRequired = false;
    private boolean verbose = false;

    private DesignServiceManager designServiceManager = null;

    protected CompilerTask() {
        this(false);
    }

    protected CompilerTask(boolean init) {
        if (init) {
            AntUtils.bootstrap(getClass().getClassLoader());
        }
    }

    // REVIEW 25-Sep-07 stoens@activegrid.com -- We also need to handle
    // classpathref
    public void setClassPath(String s) {
        classpath = s;
    }

    public File getProjectRoot() {
        return projectRoot;
    }

    public void setProjectRoot(File projectRoot) {
        this.projectRoot = projectRoot;
        this.agProject = new Project(projectRoot);
    }
    
    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }
    public boolean getVerbose() {
        return this.verbose;
    }
    
    public Project getAGProject() {
        return this.agProject;
    }

    protected synchronized DesignServiceManager getDesignServiceManager() {
        if (designServiceManager == null) {
            if (projectRoot != null) {
                designServiceManager = DesignTimeUtils
                    .getDSMForProjectRoot(projectRoot);
            }
        }
        return designServiceManager;
    }
    
    protected void setProjectRootRequired(boolean projectRootRequired) {
        this.projectRootRequired = projectRootRequired;
    }

    @Override
    public final void execute() {

        validate();

        ClassLoaderUtils.TaskNoRtn task = 
            new TaskNoRtn() {
                public void run() {
                    doExecute();
                }
            };

        ClassLoaderUtils.runInClassLoaderContext(task, getClassLoader());
    }

    protected abstract void doExecute();

    protected void validate() {
        
        if (projectRootRequired) {

            if (projectRoot == null) {
                throw new BuildException("projectRoot must be set");
            }

            if (!projectRoot.exists()) {
                throw new BuildException("projectRoot: " + projectRoot + 
                                         "doesn't exist");
            }

            if (!projectRoot.isDirectory()) {
                throw new BuildException("projectRoot: " + projectRoot + 
                                         "is not a directory");
            }
        }
    }

    protected void debug(String s) {
        log(s, org.apache.tools.ant.Project.MSG_DEBUG);
    }

    private ClassLoader getClassLoader() {

        if (classpath == null) {
            // REVIEW 25-Sep-07 stoens@activegrid.com -- this is a hack for
            // running in Ant, so that we can get the taskdef's classloader
            // for this task.  All this because Ant doesn't set the Thread's
            // context ClassLoader.
            return getClass().getClassLoader();
        } else {
            // FIXME 25-Sep-07 stoens@activegrid.com -- this path needs to 
            // be split correctly on ';' and ':'.  Assume it is a single path
            // for now.

            ClassLoader parent = ClassLoaderUtils.getClassLoader();

            // and another hack related to the comment above - 
            if (getClass().getClassLoader().getClass().getName()
                .endsWith("AntClassLoader")) {
                parent = getClass().getClassLoader();
            }
            return ClassLoaderUtils
                .getClassLoaderForFile(parent, new File(classpath));
        }

    }
}
