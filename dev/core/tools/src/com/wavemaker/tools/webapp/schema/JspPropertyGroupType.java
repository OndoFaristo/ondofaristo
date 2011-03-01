/*
 *  Copyright (C) 2008-2011 WaveMaker Software, Inc.
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
 * 	The jsp-property-groupType is used to group a number of
 * 	files so they can be given global property information.
 * 	All files so described are deemed to be JSP files.  The
 * 	following additional properties can be described:
 * 
 * 	    - Control whether EL is ignored
 * 	    - Control whether scripting elements are invalid
 * 	    - Indicate pageEncoding information.
 * 	    - Indicate that a resource is a JSP document (XML)
 * 	    - Prelude and Coda automatic includes.
 * 
 *       
 * 
 * <p>Java class for jsp-property-groupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jsp-property-groupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://java.sun.com/xml/ns/j2ee}descriptionGroup"/>
 *         &lt;element name="url-pattern" type="{http://java.sun.com/xml/ns/j2ee}url-patternType" maxOccurs="unbounded"/>
 *         &lt;element name="el-ignored" type="{http://java.sun.com/xml/ns/j2ee}true-falseType" minOccurs="0"/>
 *         &lt;element name="page-encoding" type="{http://java.sun.com/xml/ns/j2ee}string" minOccurs="0"/>
 *         &lt;element name="scripting-invalid" type="{http://java.sun.com/xml/ns/j2ee}true-falseType" minOccurs="0"/>
 *         &lt;element name="is-xml" type="{http://java.sun.com/xml/ns/j2ee}true-falseType" minOccurs="0"/>
 *         &lt;element name="include-prelude" type="{http://java.sun.com/xml/ns/j2ee}pathType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="include-coda" type="{http://java.sun.com/xml/ns/j2ee}pathType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "jsp-property-groupType", propOrder = {
    "description",
    "displayName",
    "icon",
    "urlPattern",
    "elIgnored",
    "pageEncoding",
    "scriptingInvalid",
    "isXml",
    "includePrelude",
    "includeCoda"
})
public class JspPropertyGroupType {

    protected List<DescriptionType> description;
    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;
    protected List<IconType> icon;
    @XmlElement(name = "url-pattern", required = true)
    protected List<UrlPatternType> urlPattern;
    @XmlElement(name = "el-ignored")
    protected TrueFalseType elIgnored;
    @XmlElement(name = "page-encoding")
    protected com.wavemaker.tools.webapp.schema.String pageEncoding;
    @XmlElement(name = "scripting-invalid")
    protected TrueFalseType scriptingInvalid;
    @XmlElement(name = "is-xml")
    protected TrueFalseType isXml;
    @XmlElement(name = "include-prelude")
    protected List<PathType> includePrelude;
    @XmlElement(name = "include-coda")
    protected List<PathType> includeCoda;
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
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayNameType }
     * 
     * 
     */
    public List<DisplayNameType> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IconType }
     * 
     * 
     */
    public List<IconType> getIcon() {
        if (icon == null) {
            icon = new ArrayList<IconType>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the urlPattern property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlPattern property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlPatternType }
     * 
     * 
     */
    public List<UrlPatternType> getUrlPattern() {
        if (urlPattern == null) {
            urlPattern = new ArrayList<UrlPatternType>();
        }
        return this.urlPattern;
    }

    /**
     * Gets the value of the elIgnored property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getElIgnored() {
        return elIgnored;
    }

    /**
     * Sets the value of the elIgnored property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setElIgnored(TrueFalseType value) {
        this.elIgnored = value;
    }

    /**
     * Gets the value of the pageEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link com.wavemaker.tools.webapp.schema.String }
     *     
     */
    public com.wavemaker.tools.webapp.schema.String getPageEncoding() {
        return pageEncoding;
    }

    /**
     * Sets the value of the pageEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.wavemaker.tools.webapp.schema.String }
     *     
     */
    public void setPageEncoding(com.wavemaker.tools.webapp.schema.String value) {
        this.pageEncoding = value;
    }

    /**
     * Gets the value of the scriptingInvalid property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getScriptingInvalid() {
        return scriptingInvalid;
    }

    /**
     * Sets the value of the scriptingInvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setScriptingInvalid(TrueFalseType value) {
        this.scriptingInvalid = value;
    }

    /**
     * Gets the value of the isXml property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getIsXml() {
        return isXml;
    }

    /**
     * Sets the value of the isXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setIsXml(TrueFalseType value) {
        this.isXml = value;
    }

    /**
     * Gets the value of the includePrelude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includePrelude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludePrelude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PathType }
     * 
     * 
     */
    public List<PathType> getIncludePrelude() {
        if (includePrelude == null) {
            includePrelude = new ArrayList<PathType>();
        }
        return this.includePrelude;
    }

    /**
     * Gets the value of the includeCoda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeCoda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeCoda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PathType }
     * 
     * 
     */
    public List<PathType> getIncludeCoda() {
        if (includeCoda == null) {
            includeCoda = new ArrayList<PathType>();
        }
        return this.includeCoda;
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
