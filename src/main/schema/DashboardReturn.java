//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dashboard_return complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dashboard_return">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="dashboards" type="{http://marketing.adobe.com/analytics/2015/04/16}dashboard" maxOccurs="unbounded"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dashboard_return", propOrder = {

})
public class DashboardReturn {

    @XmlElement(required = true)
    protected List<Dashboard> dashboards;

    /**
     * Gets the value of the dashboards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dashboards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDashboards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dashboard }
     * 
     * 
     */
    public List<Dashboard> getDashboards() {
        if (dashboards == null) {
            dashboards = new ArrayList<Dashboard>();
        }
        return this.dashboards;
    }

}