//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dashboard_bookmark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dashboard_bookmark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayInfo" type="{http://marketing.adobe.com/analytics/2015/04/16}dashboard_display_info"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dashboard_bookmark", propOrder = {

})
public class DashboardBookmark {

    @XmlElement(required = true)
    protected String name;
    protected int id;
    @XmlElement(required = true)
    protected String rsid;
    @XmlElement(required = true)
    protected DashboardDisplayInfo displayInfo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
    }

    /**
     * Gets the value of the displayInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DashboardDisplayInfo }
     *     
     */
    public DashboardDisplayInfo getDisplayInfo() {
        return displayInfo;
    }

    /**
     * Sets the value of the displayInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DashboardDisplayInfo }
     *     
     */
    public void setDisplayInfo(DashboardDisplayInfo value) {
        this.displayInfo = value;
    }

}
