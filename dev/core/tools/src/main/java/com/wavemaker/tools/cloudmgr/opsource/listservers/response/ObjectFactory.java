/*
 *  Copyright (C) 2010-2011 VMWare, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.01.11 at 11:38:45 AM PST 
//

package com.wavemaker.tools.cloudmgr.opsource.listservers.response;

import javax.xml.bind.annotation.XmlRegistry;

import com.wavemaker.tools.cloudmgr.opsource.listservers.response.Servers.Server;
import com.wavemaker.tools.cloudmgr.opsource.listservers.response.Servers.Server.OperatingSystem;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.opsource.listservers.response package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.opsource.listservers.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.wavemaker.tools.cloudmgr.opsource.listservers.response.Servers.Server }
     * 
     */
    public Servers.Server createServersServer() {
        return new Server();
    }

    /**
     * Create an instance of {@link Servers }
     * 
     */
    public Servers createServers() {
        return new Servers();
    }

    /**
     * Create an instance of {@link OperatingSystem }
     * 
     */
    public OperatingSystem createServersServerOperatingSystem() {
        return new OperatingSystem();
    }

}
