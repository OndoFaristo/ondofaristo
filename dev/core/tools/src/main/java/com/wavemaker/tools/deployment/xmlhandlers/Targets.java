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
// Generated on: 2010.01.19 at 01:31:56 PM PST 
//

package com.wavemaker.tools.deployment.xmlhandlers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Targets element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="Targets">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Target">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="destType" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="server"/>
 *                           &lt;enumeration value="storage"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="serviceProvider" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="local"/>
 *                           &lt;enumeration value="amazon"/>
 *                           &lt;enumeration value="opsource"/>
 *                           &lt;enumeration value="rackspace"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="server" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="tomcat"/>
 *                           &lt;enumeration value="websphere"/>
 *                           &lt;enumeration value="weblogic"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
 *                     &lt;element name="dnsHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="publicIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="privateIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;element name="OS" minOccurs="0">
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           &lt;enumeration value="windows"/>
 *                           &lt;enumeration value="linux"/>
 *                           &lt;enumeration value="unix"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/element>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "target" })
@XmlRootElement(name = "Targets")
public class Targets {

    @XmlElement(name = "Target", required = true)
    protected List<Target> target;

    /**
     * Gets the value of the target property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the target property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTarget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Target }
     * 
     * 
     */
    public List<Target> getTarget() {
        if (this.target == null) {
            this.target = new ArrayList<Target>();
        }
        return this.target;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="destType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="server"/>
     *               &lt;enumeration value="storage"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="serviceProvider" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="local"/>
     *               &lt;enumeration value="amazon"/>
     *               &lt;enumeration value="opsource"/>
     *               &lt;enumeration value="rackspace"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="server" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="tomcat"/>
     *               &lt;enumeration value="websphere"/>
     *               &lt;enumeration value="weblogic"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="container" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dnsHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="publicIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="privateIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="windows"/>
     *               &lt;enumeration value="linux"/>
     *               &lt;enumeration value="unix"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "name", "description", "destType", "serviceProvider", "server", "container", "dnsHost", "publicIp",
        "privateIp", "port", "user", "password", "os" })
    public static class Target {

        protected String name;

        protected String description;

        protected String destType;

        protected String serviceProvider;

        protected String server;

        protected String container;

        protected String dnsHost;

        protected String publicIp;

        protected String privateIp;

        protected String port;

        protected String user;

        protected String password;

        @XmlElement(name = "OS")
        protected String os;

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

        /**
         * Gets the value of the destType property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getDestType() {
            return this.destType;
        }

        /**
         * Sets the value of the destType property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setDestType(String value) {
            this.destType = value;
        }

        /**
         * Gets the value of the serviceProvider property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getServiceProvider() {
            return this.serviceProvider;
        }

        /**
         * Sets the value of the serviceProvider property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setServiceProvider(String value) {
            this.serviceProvider = value;
        }

        /**
         * Gets the value of the server property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getServer() {
            return this.server;
        }

        /**
         * Sets the value of the server property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setServer(String value) {
            this.server = value;
        }

        /**
         * Gets the value of the container property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getContainer() {
            return this.container;
        }

        /**
         * Sets the value of the container property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setContainer(String value) {
            this.container = value;
        }

        /**
         * Gets the value of the dnsHost property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getDnsHost() {
            return this.dnsHost;
        }

        /**
         * Sets the value of the dnsHost property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setDnsHost(String value) {
            this.dnsHost = value;
        }

        /**
         * Gets the value of the publicIp property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPublicIp() {
            return this.publicIp;
        }

        /**
         * Sets the value of the publicIp property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setPublicIp(String value) {
            this.publicIp = value;
        }

        /**
         * Gets the value of the privateIp property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * Sets the value of the privateIp property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setPrivateIp(String value) {
            this.privateIp = value;
        }

        /**
         * Gets the value of the port property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPort() {
            return this.port;
        }

        /**
         * Sets the value of the port property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setPort(String value) {
            this.port = value;
        }

        /**
         * Gets the value of the user property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getUser() {
            return this.user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setUser(String value) {
            this.user = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * Gets the value of the os property.
         * 
         * @return possible object is {@link String }
         * 
         */
        public String getOS() {
            return this.os;
        }

        /**
         * Sets the value of the os property.
         * 
         * @param value allowed object is {@link String }
         * 
         */
        public void setOS(String value) {
            this.os = value;
        }

    }

}
