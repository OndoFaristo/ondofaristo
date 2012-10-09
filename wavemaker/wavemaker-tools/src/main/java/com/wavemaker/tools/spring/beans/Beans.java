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
// Generated on: 2008.02.26 at 04:39:33 PM PST 
//

package com.wavemaker.tools.spring.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &lt;element ref="{http://www.springframework.org/schema/beans}description" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.springframework.org/schema/beans}import"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}alias"/>
 *           &lt;element ref="{http://www.springframework.org/schema/beans}bean"/>
 *           &lt;any/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="default-lazy-init" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="default-merge" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="default-dependency-check" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="simple"/>
 *             &lt;enumeration value="objects"/>
 *             &lt;enumeration value="all"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="default-autowire" default="no">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="no"/>
 *             &lt;enumeration value="byName"/>
 *             &lt;enumeration value="byType"/>
 *             &lt;enumeration value="constructor"/>
 *             &lt;enumeration value="autodetect"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="default-init-method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default-destroy-method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "description", "importsAndAliasAndBeen" })
@XmlRootElement(name = "beans")
public class Beans {
    @XmlElement(namespace="http://schema.cloudfoundry.org/spring")

    protected Description description;

    @XmlElementRefs({ @XmlElementRef(name = "import", namespace = "http://www.springframework.org/schema/beans", type = Import.class),
        @XmlElementRef(name = "bean", namespace = "http://www.springframework.org/schema/beans", type = Bean.class),
        @XmlElementRef(name = "alias", namespace = "http://www.springframework.org/schema/beans", type = Alias.class) })
    @XmlAnyElement(lax = true)
    protected List<Object> importsAndAliasAndBeen;

    @XmlAttribute(name = "default-lazy-init")
    protected Boolean defaultLazyInit;

    @XmlAttribute(name = "default-merge")
    protected Boolean defaultMerge;

    @XmlAttribute(name = "default-dependency-check")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultDependencyCheck;

    @XmlAttribute(name = "default-autowire")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String defaultAutowire;

    @XmlAttribute(name = "default-init-method")
    protected String defaultInitMethod;

    @XmlAttribute(name = "default-destroy-method")
    protected String defaultDestroyMethod;

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link Description }
     * 
     */
    public Description getDescription() {
        return this.description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link Description }
     * 
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the importsAndAliasAndBeen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the importsAndAliasAndBeen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getImportsAndAliasAndBeen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Import } {@link Alias } {@link Bean } {@link Object }
     * 
     * 
     */
    public List<Object> getImportsAndAliasAndBean() {
        if (this.importsAndAliasAndBeen == null) {
            this.importsAndAliasAndBeen = new ArrayList<Object>();
        }
        return this.importsAndAliasAndBeen;
    }

    /**
     * Gets the value of the defaultLazyInit property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isDefaultLazyInit() {
        if (this.defaultLazyInit == null) {
            return false;
        } else {
            return this.defaultLazyInit;
        }
    }

    /**
     * Sets the value of the defaultLazyInit property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setDefaultLazyInit(Boolean value) {
        this.defaultLazyInit = value;
    }

    /**
     * Gets the value of the defaultMerge property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isDefaultMerge() {
        if (this.defaultMerge == null) {
            return false;
        } else {
            return this.defaultMerge;
        }
    }

    /**
     * Sets the value of the defaultMerge property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setDefaultMerge(Boolean value) {
        this.defaultMerge = value;
    }

    /**
     * Gets the value of the defaultDependencyCheck property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDefaultDependencyCheck() {
        if (this.defaultDependencyCheck == null) {
            return "none";
        } else {
            return this.defaultDependencyCheck;
        }
    }

    /**
     * Sets the value of the defaultDependencyCheck property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDefaultDependencyCheck(String value) {
        this.defaultDependencyCheck = value;
    }

    /**
     * Gets the value of the defaultAutowire property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDefaultAutowire() {
        if (this.defaultAutowire == null) {
            return "no";
        } else {
            return this.defaultAutowire;
        }
    }

    /**
     * Sets the value of the defaultAutowire property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDefaultAutowire(String value) {
        this.defaultAutowire = value;
    }

    /**
     * Gets the value of the defaultInitMethod property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDefaultInitMethod() {
        return this.defaultInitMethod;
    }

    /**
     * Sets the value of the defaultInitMethod property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDefaultInitMethod(String value) {
        this.defaultInitMethod = value;
    }

    /**
     * Gets the value of the defaultDestroyMethod property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDefaultDestroyMethod() {
        return this.defaultDestroyMethod;
    }

    /**
     * Sets the value of the defaultDestroyMethod property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDefaultDestroyMethod(String value) {
        this.defaultDestroyMethod = value;
    }

    /**
     * Sets the value of the importsAndAliasAndBeen property.
     * 
     * @param importsAndAliasAndBeen allowed object is {@link Import } {@link Alias } {@link Bean } {@link Object }
     * 
     */
    public void setImportsAndAliasAndBeen(List<Object> importsAndAliasAndBeen) {
        this.importsAndAliasAndBeen = importsAndAliasAndBeen;
    }

    // --simple--preserve
    /**
     * Returns the Bean for the specified bean ID.
     * 
     * @param id The bean ID.
     * @return The Bean for the specified bean ID.
     */
    public Bean getBeanById(String id) {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        for (Object o : importOrAliasOrBeanList) {
            if (o instanceof Bean && id.equals(((Bean) o).getId())) {
                return (Bean) o;
            }
        }
        return null;
    }

    /**
     * Returns a list of Beans that are of the specified type.
     * 
     * @param clazz The type of the Beans to return.
     * @return The Beans for the specified type.
     */
    public List<Bean> getBeansByType(String clazz) {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        List<Bean> rtn = new ArrayList<Bean>();
        for (Object o : importOrAliasOrBeanList) {
            if (o instanceof Bean) {
                Bean b = (Bean) o;
                if (clazz.equals(b.getClazz())) {
                    rtn.add(b);
                }
            }
        }
        return rtn;
    }

    /**
     * Returns a list of Beans that are of the specified type.
     * 
     * @param clazz The type of the Beans to return.
     * @return The Beans for the specified type.
     */
    public List<Bean> getBeansByType(Class<?> clazz) {
        return getBeansByType(clazz.getName());
    }

    /**
     * Adds a bean to this <code>Beans</code>.
     * 
     * @param bean The bean to be added.
     */
    public void addBean(Bean bean) {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        importOrAliasOrBeanList.add(bean);
    }

    /**
     * Adds an alias to this <code>Beans</code>.
     * 
     * @param alias The alias to be added.
     */
    public void addAlias(Alias alias) {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        importOrAliasOrBeanList.add(alias);
    }

    /**
     * Removes the specified bean from this <code>Beans</code>.
     * 
     * @param id The bean ID of the bean to be removed.
     * @return <tt>true</tt> if this <code>Bean</code> contained the specified bean.
     */
    public boolean removeBeanById(String id) {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        for (Object o : importOrAliasOrBeanList) {
            if (o instanceof Bean && id.equals(((Bean) o).getId())) {
                return importOrAliasOrBeanList.remove(o);
            }
        }
        return false;
    }

    /**
     * Returns a list of <code>Bean</code> in this <code>Beans</code>.
     * 
     * @return A list of <code>Bean</code>.
     */
    public List<Bean> getBeanList() {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        List<Bean> beans = new ArrayList<Bean>();
        for (Object o : importOrAliasOrBeanList) {
            if (o instanceof Bean) {
                beans.add((Bean) o);
            }
        }
        return beans;
    }

    /**
     * Sets the given bean list to this <code>Beans</code>.
     * 
     * @param beans A list of <code>Bean</code> to be added to this <code>Beans</code>.
     */
    public void setBeanList(List<Bean> beans) {
        List<Object> importOrAliasOrBeanList = getImportsAndAliasAndBean();
        for (Bean bean : beans) {
            if (!importOrAliasOrBeanList.contains(bean)) {
                importOrAliasOrBeanList.add(bean);
            }
        }
    }
    // --simple--preserve
}
