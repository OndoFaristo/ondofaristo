/*
 *  Copyright (C) 2008-2011 VMware, Inc. All rights reserved.
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
 * 
 * The ejb-linkType is used by ejb-link elements in the ejb-ref or ejb-local-ref elements to specify that an EJB
 * reference is linked to enterprise bean.
 * 
 * The value of the ejb-link element must be the ejb-name of an enterprise bean in the same ejb-jar file or in another
 * ejb-jar file in the same J2EE application unit.
 * 
 * Alternatively, the name in the ejb-link element may be composed of a path name specifying the ejb-jar containing the
 * referenced enterprise bean with the ejb-name of the target bean appended and separated from the path name by "#". The
 * path name is relative to the Deployment File containing Deployment Component that is referencing the enterprise bean.
 * This allows multiple enterprise beans with the same ejb-name to be uniquely identified.
 * 
 * Examples:
 * 
 * <ejb-link>EmployeeRecord</ejb-link>
 * 
 * <ejb-link>../products/product.jar#ProductEJB</ejb-link>
 * 
 * 
 * 
 * 
 * <p>
 * Java class for ejb-linkType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejb-linkType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://java.sun.com/xml/ns/j2ee>string">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejb-linkType")
public class EjbLinkType extends String {

}
