/*
 *  Copyright (C) 2012-2013 CloudJee, Inc. All rights reserved.
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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.07 at 09:51:34 AM PST 
//


package com.wavemaker.tools.webapp.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 	Declaration of the filter mappings in this web
 * 	application is done by using filter-mappingType.
 * 	The container uses the filter-mapping
 * 	declarations to decide which filters to apply to a request,
 * 	and in what order. The container matches the request URI to
 * 	a Servlet in the normal way. To determine which filters to
 * 	apply it matches filter-mapping declarations either on
 * 	servlet-name, or on url-pattern for each filter-mapping
 * 	element, depending on which style is used. The order in
 * 	which filters are invoked is the order in which
 * 	filter-mapping declarations that match a request URI for a
 * 	servlet appear in the list of filter-mapping elements.The
 * 	filter-name value must be the value of the filter-name
 * 	sub-elements of one of the filter declarations in the
 * 	deployment descriptor.
 * 
 *       
 * 
 * <p>Java class for filter-mappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filter-mappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter-name" type="{http://java.sun.com/xml/ns/javaee}filter-nameType"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="url-pattern" type="{http://java.sun.com/xml/ns/javaee}url-patternType"/>
 *           &lt;element name="servlet-name" type="{http://java.sun.com/xml/ns/javaee}servlet-nameType"/>
 *         &lt;/choice>
 *         &lt;element name="dispatcher" type="{http://java.sun.com/xml/ns/javaee}dispatcherType" maxOccurs="4" minOccurs="0"/>
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
@XmlType(name = "filter-mappingType", propOrder = {
    "filterName",
    "urlPatternOrServletName",
    "dispatcher"
})
public class FilterMappingType {

    @XmlElement(name = "filter-name", required = true)
    protected FilterNameType filterName;
    @XmlElements({
        @XmlElement(name = "servlet-name", type = ServletNameType.class),
        @XmlElement(name = "url-pattern", type = UrlPatternType.class)
    })
    protected List<Object> urlPatternOrServletName;
    protected List<DispatcherType> dispatcher;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link FilterNameType }
     *     
     */
    public FilterNameType getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterNameType }
     *     
     */
    public void setFilterName(FilterNameType value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the urlPatternOrServletName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlPatternOrServletName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlPatternOrServletName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServletNameType }
     * {@link UrlPatternType }
     * 
     * 
     */
    public List<Object> getUrlPatternOrServletName() {
        if (urlPatternOrServletName == null) {
            urlPatternOrServletName = new ArrayList<Object>();
        }
        return this.urlPatternOrServletName;
    }

    /**
     * Gets the value of the dispatcher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispatcher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispatcher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DispatcherType }
     * 
     * 
     */
    public List<DispatcherType> getDispatcher() {
        if (dispatcher == null) {
            dispatcher = new ArrayList<DispatcherType>();
        }
        return this.dispatcher;
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
