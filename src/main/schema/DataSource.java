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
 * <p>Java class for data_source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data_source">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processing_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ftp" type="{http://marketing.adobe.com/analytics/2015/04/16}ftp_info"/>
 *         &lt;element name="haltOnWarning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="haltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="lockedByError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_source", propOrder = {

})
public class DataSource {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "processing_type", required = true)
    protected String processingType;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String activatedDate;
    @XmlElement(required = true)
    protected FtpInfo ftp;
    protected boolean haltOnWarning;
    protected boolean haltOnError;
    protected boolean lockedByError;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the processingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingType() {
        return processingType;
    }

    /**
     * Sets the value of the processingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingType(String value) {
        this.processingType = value;
    }

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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the activatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivatedDate() {
        return activatedDate;
    }

    /**
     * Sets the value of the activatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivatedDate(String value) {
        this.activatedDate = value;
    }

    /**
     * Gets the value of the ftp property.
     * 
     * @return
     *     possible object is
     *     {@link FtpInfo }
     *     
     */
    public FtpInfo getFtp() {
        return ftp;
    }

    /**
     * Sets the value of the ftp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtpInfo }
     *     
     */
    public void setFtp(FtpInfo value) {
        this.ftp = value;
    }

    /**
     * Gets the value of the haltOnWarning property.
     * 
     */
    public boolean isHaltOnWarning() {
        return haltOnWarning;
    }

    /**
     * Sets the value of the haltOnWarning property.
     * 
     */
    public void setHaltOnWarning(boolean value) {
        this.haltOnWarning = value;
    }

    /**
     * Gets the value of the haltOnError property.
     * 
     */
    public boolean isHaltOnError() {
        return haltOnError;
    }

    /**
     * Sets the value of the haltOnError property.
     * 
     */
    public void setHaltOnError(boolean value) {
        this.haltOnError = value;
    }

    /**
     * Gets the value of the lockedByError property.
     * 
     */
    public boolean isLockedByError() {
        return lockedByError;
    }

    /**
     * Sets the value of the lockedByError property.
     * 
     */
    public void setLockedByError(boolean value) {
        this.lockedByError = value;
    }

}
