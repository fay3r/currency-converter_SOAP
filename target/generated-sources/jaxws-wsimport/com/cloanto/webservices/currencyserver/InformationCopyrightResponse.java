
package com.cloanto.webservices.currencyserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InformationCopyrightResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "informationCopyrightResult"
})
@XmlRootElement(name = "InformationCopyrightResponse")
public class InformationCopyrightResponse {

    @XmlElement(name = "InformationCopyrightResult")
    protected String informationCopyrightResult;

    /**
     * Gets the value of the informationCopyrightResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationCopyrightResult() {
        return informationCopyrightResult;
    }

    /**
     * Sets the value of the informationCopyrightResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationCopyrightResult(String value) {
        this.informationCopyrightResult = value;
    }

}
