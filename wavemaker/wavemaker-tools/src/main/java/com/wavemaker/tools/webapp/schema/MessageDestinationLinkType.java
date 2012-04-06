/*
 *  Copyright (C) 2008-2012 VMware, Inc. All rights reserved.
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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/02/2007 10:39 AM(ffu)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.20 at 10:31:30 AM PST 
//

package com.wavemaker.tools.webapp.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 
 * The message-destination-linkType is used to link a message destination reference or message-driven bean to a message
 * destination.
 * 
 * The Assembler sets the value to reflect the flow of messages between producers and consumers in the application.
 * 
 * The value must be the message-destination-name of a message destination in the same Deployment File or in another
 * Deployment File in the same J2EE application unit.
 * 
 * Alternatively, the value may be composed of a path name specifying a Deployment File containing the referenced
 * message destination with the message-destination-name of the destination appended and separated from the path name by
 * "#". The path name is relative to the Deployment File containing Deployment Component that is referencing the message
 * destination. This allows multiple message destinations with the same name to be uniquely identified.
 * 
 * 
 * 
 * <p>
 * Java class for message-destination-linkType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-destination-linkType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/j2ee>string">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message-destination-linkType")
public class MessageDestinationLinkType extends String {

}
