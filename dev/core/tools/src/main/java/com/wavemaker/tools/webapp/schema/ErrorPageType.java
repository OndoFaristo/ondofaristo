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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * 
 * The error-pageType contains a mapping between an error code or exception type to the path of a resource in the web
 * application.
 * 
 * Used in: web-app
 * 
 * 
 * 
 * <p>
 * Java class for error-pageType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="error-pageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="error-code" type="{http://java.sun.com/xml/ns/j2ee}error-codeType"/>
 *           &lt;element name="exception-type" type="{http://java.sun.com/xml/ns/j2ee}fully-qualified-classType"/>
 *         &lt;/choice>
 *         &lt;element name="location" type="{http://java.sun.com/xml/ns/j2ee}war-pathType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error-pageType", propOrder = { "errorCode", "exceptionType", "location" })
public class ErrorPageType {

    @XmlElement(name = "error-code")
    protected ErrorCodeType errorCode;

    @XmlElement(name = "exception-type")
    protected FullyQualifiedClassType exceptionType;

    @XmlElement(required = true)
    protected WarPathType location;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return possible object is {@link ErrorCodeType }
     * 
     */
    public ErrorCodeType getErrorCode() {
        return this.errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value allowed object is {@link ErrorCodeType }
     * 
     */
    public void setErrorCode(ErrorCodeType value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the exceptionType property.
     * 
     * @return possible object is {@link FullyQualifiedClassType }
     * 
     */
    public FullyQualifiedClassType getExceptionType() {
        return this.exceptionType;
    }

    /**
     * Sets the value of the exceptionType property.
     * 
     * @param value allowed object is {@link FullyQualifiedClassType }
     * 
     */
    public void setExceptionType(FullyQualifiedClassType value) {
        this.exceptionType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return possible object is {@link WarPathType }
     * 
     */
    public WarPathType getLocation() {
        return this.location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value allowed object is {@link WarPathType }
     * 
     */
    public void setLocation(WarPathType value) {
        this.location = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link java.lang.String }
     * 
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link java.lang.String }
     * 
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
