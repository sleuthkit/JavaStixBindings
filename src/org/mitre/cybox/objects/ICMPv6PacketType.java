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
 * ICMP is used to send error messages (e.g., a datagram cannot reach its destination), informational messages ( e.g., ping). Only the message types defined in RFC 4443 (ICMP v6) are included; additional message types will be defined as needed. REF: http://tools.ietf.org/html/rfc4443 and http://www.networksorcery.com/enp/protocol/icmpv6.htm and http://en.wikipedia.org/wiki/ICMPv6.
 * 
 * <p>Java class for ICMPv6PacketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICMPv6PacketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICMPv6_Header" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6HeaderType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Error_Msg" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6ErrorMessageType" minOccurs="0"/>
 *           &lt;element name="Info_Msg" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv6InfoMessageType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMPv6PacketType", propOrder = {
    "icmPv6Header",
    "infoMsg",
    "errorMsg"
})
public class ICMPv6PacketType {

    @XmlElement(name = "ICMPv6_Header")
    protected ICMPv6HeaderType icmPv6Header;
    @XmlElement(name = "Info_Msg")
    protected ICMPv6InfoMessageType infoMsg;
    @XmlElement(name = "Error_Msg")
    protected ICMPv6ErrorMessageType errorMsg;

    /**
     * Gets the value of the icmPv6Header property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6HeaderType }
     *     
     */
    public ICMPv6HeaderType getICMPv6Header() {
        return icmPv6Header;
    }

    /**
     * Sets the value of the icmPv6Header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6HeaderType }
     *     
     */
    public void setICMPv6Header(ICMPv6HeaderType value) {
        this.icmPv6Header = value;
    }

    /**
     * Gets the value of the infoMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6InfoMessageType }
     *     
     */
    public ICMPv6InfoMessageType getInfoMsg() {
        return infoMsg;
    }

    /**
     * Sets the value of the infoMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6InfoMessageType }
     *     
     */
    public void setInfoMsg(ICMPv6InfoMessageType value) {
        this.infoMsg = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv6ErrorMessageType }
     *     
     */
    public ICMPv6ErrorMessageType getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv6ErrorMessageType }
     *     
     */
    public void setErrorMsg(ICMPv6ErrorMessageType value) {
        this.errorMsg = value;
    }

}
