/*
 *  Copyright (C) 2008-2011 VMWare, Inc. All rights reserved.
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

import java.util.ArrayList;
import java.util.List;
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
 * 	The ejb-refType is used by ejb-ref elements for the
 * 	declaration of a reference to an enterprise bean's home. The
 * 	declaration consists of:
 * 
 * 	    - an optional description
 * 	    - the EJB reference name used in the code of
 * 	      the Deployment Component that's referencing the enterprise
 * 	      bean
 * 	    - the expected type of the referenced enterprise bean
 * 	    - the expected home and remote interfaces of the referenced
 * 	      enterprise bean
 * 	    - optional ejb-link information, used to specify the
 * 	      referenced enterprise bean
 * 
 *       
 * 
 * <p>Java class for ejb-refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejb-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://java.sun.com/xml/ns/j2ee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ejb-ref-name" type="{http://java.sun.com/xml/ns/j2ee}ejb-ref-nameType"/>
 *         &lt;element name="ejb-ref-type" type="{http://java.sun.com/xml/ns/j2ee}ejb-ref-typeType"/>
 *         &lt;element name="home" type="{http://java.sun.com/xml/ns/j2ee}homeType"/>
 *         &lt;element name="remote" type="{http://java.sun.com/xml/ns/j2ee}remoteType"/>
 *         &lt;element name="ejb-link" type="{http://java.sun.com/xml/ns/j2ee}ejb-linkType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejb-refType", propOrder = {
    "description",
    "ejbRefName",
    "ejbRefType",
    "home",
    "remote",
    "ejbLink"
})
public class EjbRefType {

    protected List<DescriptionType> description;
    @XmlElement(name = "ejb-ref-name", required = true)
    protected EjbRefNameType ejbRefName;
    @XmlElement(name = "ejb-ref-type", required = true)
    protected EjbRefTypeType ejbRefType;
    @XmlElement(required = true)
    protected HomeType home;
    @XmlElement(required = true)
    protected RemoteType remote;
    @XmlElement(name = "ejb-link")
    protected EjbLinkType ejbLink;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the ejbRefName property.
     * 
     * @return
     *     possible object is
     *     {@link EjbRefNameType }
     *     
     */
    public EjbRefNameType getEjbRefName() {
        return ejbRefName;
    }

    /**
     * Sets the value of the ejbRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbRefNameType }
     *     
     */
    public void setEjbRefName(EjbRefNameType value) {
        this.ejbRefName = value;
    }

    /**
     * Gets the value of the ejbRefType property.
     * 
     * @return
     *     possible object is
     *     {@link EjbRefTypeType }
     *     
     */
    public EjbRefTypeType getEjbRefType() {
        return ejbRefType;
    }

    /**
     * Sets the value of the ejbRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbRefTypeType }
     *     
     */
    public void setEjbRefType(EjbRefTypeType value) {
        this.ejbRefType = value;
    }

    /**
     * Gets the value of the home property.
     * 
     * @return
     *     possible object is
     *     {@link HomeType }
     *     
     */
    public HomeType getHome() {
        return home;
    }

    /**
     * Sets the value of the home property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeType }
     *     
     */
    public void setHome(HomeType value) {
        this.home = value;
    }

    /**
     * Gets the value of the remote property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteType }
     *     
     */
    public RemoteType getRemote() {
        return remote;
    }

    /**
     * Sets the value of the remote property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteType }
     *     
     */
    public void setRemote(RemoteType value) {
        this.remote = value;
    }

    /**
     * Gets the value of the ejbLink property.
     * 
     * @return
     *     possible object is
     *     {@link EjbLinkType }
     *     
     */
    public EjbLinkType getEjbLink() {
        return ejbLink;
    }

    /**
     * Sets the value of the ejbLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjbLinkType }
     *     
     */
    public void setEjbLink(EjbLinkType value) {
        this.ejbLink = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
