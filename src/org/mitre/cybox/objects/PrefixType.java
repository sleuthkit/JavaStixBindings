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
 * Provides an IP address or a prefix of an IP address for NDP for IPv6.
 * 
 * <p>Java class for PrefixType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefixType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="IPv6_Addr" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *         &lt;element name="IP_Addr_Prefix" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefixType", propOrder = {
    "ipAddrPrefix",
    "iPv6Addr"
})
public class PrefixType {

    @XmlElement(name = "IP_Addr_Prefix")
    protected Address ipAddrPrefix;
    @XmlElement(name = "IPv6_Addr")
    protected Address iPv6Addr;

    /**
     * Gets the value of the ipAddrPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getIPAddrPrefix() {
        return ipAddrPrefix;
    }

    /**
     * Sets the value of the ipAddrPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setIPAddrPrefix(Address value) {
        this.ipAddrPrefix = value;
    }

    /**
     * Gets the value of the iPv6Addr property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getIPv6Addr() {
        return iPv6Addr;
    }

    /**
     * Sets the value of the iPv6Addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setIPv6Addr(Address value) {
        this.iPv6Addr = value;
    }

}
