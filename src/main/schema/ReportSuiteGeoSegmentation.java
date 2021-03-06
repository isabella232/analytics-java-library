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
 * <p>Java class for report_suite_geo_segmentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="report_suite_geo_segmentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="site_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geo_segmentation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vista_enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report_suite_geo_segmentation", propOrder = {

})
public class ReportSuiteGeoSegmentation {

    @XmlElement(required = true)
    protected String rsid;
    @XmlElement(name = "site_title", required = true)
    protected String siteTitle;
    @XmlElement(name = "geo_segmentation")
    protected boolean geoSegmentation;
    @XmlElement(name = "vista_enabled")
    protected boolean vistaEnabled;

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
     * Gets the value of the siteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTitle() {
        return siteTitle;
    }

    /**
     * Sets the value of the siteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTitle(String value) {
        this.siteTitle = value;
    }

    /**
     * Gets the value of the geoSegmentation property.
     * 
     */
    public boolean isGeoSegmentation() {
        return geoSegmentation;
    }

    /**
     * Sets the value of the geoSegmentation property.
     * 
     */
    public void setGeoSegmentation(boolean value) {
        this.geoSegmentation = value;
    }

    /**
     * Gets the value of the vistaEnabled property.
     * 
     */
    public boolean isVistaEnabled() {
        return vistaEnabled;
    }

    /**
     * Sets the value of the vistaEnabled property.
     * 
     */
    public void setVistaEnabled(boolean value) {
        this.vistaEnabled = value;
    }

}
