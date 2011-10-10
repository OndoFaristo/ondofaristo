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
// Generated on: 2010.01.12 at 04:35:32 PM PST 
//

package com.wavemaker.tools.cloudmgr.opsource.listnetworks.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Networks element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="Networks">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Network">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "network" })
@XmlRootElement(name = "Networks")
public class Networks {

    @XmlElement(name = "Network", namespace = "http://oec.api.opsource.net/schemas/network", required = true)
    protected List<Network> network;

    /**
     * Gets the value of the network property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the network property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Network }
     * 
     * 
     */
    public List<Network> getNetwork() {
        if (this.network == null) {
            this.network = new ArrayList<Network>();
        }
        return this.network;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="resourcePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "id", "resourcePath", "name", "description" })
    public static class Network {

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/network")
        protected String id;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/network")
        protected String resourcePath;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/network")
        protected String name;

        @XmlElement(namespace = "http://oec.api.opsource.net/schemas/network")
        protected String description;

        /**
         * Gets the value of the id property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getId() {
            return this.id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the resourcePath property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getResourcePath() {
            return this.resourcePath;
        }

        /**
         * Sets the value of the resourcePath property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setResourcePath(String value) {
            this.resourcePath = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getName() {
            return this.name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}
