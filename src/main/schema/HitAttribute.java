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
 * <p>Java class for hit_attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hit_attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="type" type="{http://marketing.adobe.com/analytics/2015/04/16}hit_attribute_type"/>
 *         &lt;element name="query_string_parameter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hit_attribute", propOrder = {

})
public class HitAttribute {

    @XmlElement(required = true)
    protected HitAttributeType type;
    @XmlElement(name = "query_string_parameter", required = true)
    protected String queryStringParameter;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link HitAttributeType }
     *     
     */
    public HitAttributeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link HitAttributeType }
     *     
     */
    public void setType(HitAttributeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the queryStringParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryStringParameter() {
        return queryStringParameter;
    }

    /**
     * Sets the value of the queryStringParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryStringParameter(String value) {
        this.queryStringParameter = value;
    }

}
