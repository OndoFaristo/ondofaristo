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
 * The mime-mappingType defines a mapping between an extension and a mime type.
 * 
 * Used in: web-app
 * 
 * 
 * 
 * <p>
 * Java class for mime-mappingType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mime-mappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://java.sun.com/xml/ns/j2ee}string"/>
 *         &lt;element name="mime-type" type="{http://java.sun.com/xml/ns/j2ee}mime-typeType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mime-mappingType", propOrder = { "extension", "mimeType" })
public class MimeMappingType {

    @XmlElement(required = true)
    protected com.wavemaker.tools.webapp.schema.String extension;

    @XmlElement(name = "mime-type", required = true)
    protected MimeTypeType mimeType;

    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the extension property.
     * 
     * @return possible object is {@link com.wavemaker.tools.webapp.schema.String }
     * 
     */
    public com.wavemaker.tools.webapp.schema.String getExtension() {
        return this.extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value allowed object is {@link com.wavemaker.tools.webapp.schema.String }
     * 
     */
    public void setExtension(com.wavemaker.tools.webapp.schema.String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return possible object is {@link MimeTypeType }
     * 
     */
    public MimeTypeType getMimeType() {
        return this.mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value allowed object is {@link MimeTypeType }
     * 
     */
    public void setMimeType(MimeTypeType value) {
        this.mimeType = value;
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
