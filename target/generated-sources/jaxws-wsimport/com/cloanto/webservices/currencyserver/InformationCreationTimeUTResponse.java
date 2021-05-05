
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
 *         &lt;element name="InformationCreationTimeUTResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "informationCreationTimeUTResult"
})
@XmlRootElement(name = "InformationCreationTimeUTResponse")
public class InformationCreationTimeUTResponse {

    @XmlElement(name = "InformationCreationTimeUTResult")
    protected String informationCreationTimeUTResult;

    /**
     * Gets the value of the informationCreationTimeUTResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationCreationTimeUTResult() {
        return informationCreationTimeUTResult;
    }

    /**
     * Sets the value of the informationCreationTimeUTResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationCreationTimeUTResult(String value) {
        this.informationCreationTimeUTResult = value;
    }

}
