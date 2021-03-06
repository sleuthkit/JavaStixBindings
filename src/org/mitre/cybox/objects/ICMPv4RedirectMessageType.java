//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Redirect Message error message; ICMP type=5.
 * 
 * <p>Java class for ICMPv4RedirectMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICMPv4RedirectMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Network_Redirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Host_Redirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="ToS_Network_Redirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="ToS_Host_Redirect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="IP_Address" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMPv4RedirectMessageType", propOrder = {
    "toSHostRedirect",
    "toSNetworkRedirect",
    "hostRedirect",
    "networkRedirect",
    "ipAddress"
})
public class ICMPv4RedirectMessageType {

    @XmlElement(name = "ToS_Host_Redirect")
    protected Boolean toSHostRedirect;
    @XmlElement(name = "ToS_Network_Redirect")
    protected Boolean toSNetworkRedirect;
    @XmlElement(name = "Host_Redirect")
    protected Boolean hostRedirect;
    @XmlElement(name = "Network_Redirect")
    protected Boolean networkRedirect;
    @XmlElement(name = "IP_Address")
    protected Address ipAddress;

    /**
     * Gets the value of the toSHostRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToSHostRedirect() {
        return toSHostRedirect;
    }

    /**
     * Sets the value of the toSHostRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToSHostRedirect(Boolean value) {
        this.toSHostRedirect = value;
    }

    /**
     * Gets the value of the toSNetworkRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToSNetworkRedirect() {
        return toSNetworkRedirect;
    }

    /**
     * Sets the value of the toSNetworkRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToSNetworkRedirect(Boolean value) {
        this.toSNetworkRedirect = value;
    }

    /**
     * Gets the value of the hostRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostRedirect() {
        return hostRedirect;
    }

    /**
     * Sets the value of the hostRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostRedirect(Boolean value) {
        this.hostRedirect = value;
    }

    /**
     * Gets the value of the networkRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetworkRedirect() {
        return networkRedirect;
    }

    /**
     * Sets the value of the networkRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetworkRedirect(Boolean value) {
        this.networkRedirect = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setIPAddress(Address value) {
        this.ipAddress = value;
    }

}
