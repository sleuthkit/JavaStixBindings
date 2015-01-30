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
 * ICMP informational messages include echo request/reply, timestamp request/reply, and address mask request/reply.
 * 
 * <p>Java class for ICMPv4InfoMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICMPv4InfoMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Echo_Reply" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4EchoReplyType" minOccurs="0"/>
 *           &lt;element name="Echo_Request" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4EchoRequestType" minOccurs="0"/>
 *           &lt;element name="Timestamp_Request" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4TimestampRequestType" minOccurs="0"/>
 *           &lt;element name="Timestamp_Reply" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4TimestampReplyType" minOccurs="0"/>
 *           &lt;element name="Address_Mask_Request" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4AddressMaskRequestType" minOccurs="0"/>
 *           &lt;element name="Address_Mask_Reply" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4AddressMaskReplyType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Info_Msg_Content" type="{http://cybox.mitre.org/objects#PacketObject-2}ICMPv4InfoMessageContentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMPv4InfoMessageType", propOrder = {
    "addressMaskReply",
    "addressMaskRequest",
    "timestampReply",
    "timestampRequest",
    "echoRequest",
    "echoReply",
    "infoMsgContent"
})
public class ICMPv4InfoMessageType {

    @XmlElement(name = "Address_Mask_Reply")
    protected ICMPv4AddressMaskReplyType addressMaskReply;
    @XmlElement(name = "Address_Mask_Request")
    protected ICMPv4AddressMaskRequestType addressMaskRequest;
    @XmlElement(name = "Timestamp_Reply")
    protected ICMPv4TimestampReplyType timestampReply;
    @XmlElement(name = "Timestamp_Request")
    protected ICMPv4TimestampRequestType timestampRequest;
    @XmlElement(name = "Echo_Request")
    protected ICMPv4EchoRequestType echoRequest;
    @XmlElement(name = "Echo_Reply")
    protected ICMPv4EchoReplyType echoReply;
    @XmlElement(name = "Info_Msg_Content")
    protected ICMPv4InfoMessageContentType infoMsgContent;

    /**
     * Gets the value of the addressMaskReply property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4AddressMaskReplyType }
     *     
     */
    public ICMPv4AddressMaskReplyType getAddressMaskReply() {
        return addressMaskReply;
    }

    /**
     * Sets the value of the addressMaskReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4AddressMaskReplyType }
     *     
     */
    public void setAddressMaskReply(ICMPv4AddressMaskReplyType value) {
        this.addressMaskReply = value;
    }

    /**
     * Gets the value of the addressMaskRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4AddressMaskRequestType }
     *     
     */
    public ICMPv4AddressMaskRequestType getAddressMaskRequest() {
        return addressMaskRequest;
    }

    /**
     * Sets the value of the addressMaskRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4AddressMaskRequestType }
     *     
     */
    public void setAddressMaskRequest(ICMPv4AddressMaskRequestType value) {
        this.addressMaskRequest = value;
    }

    /**
     * Gets the value of the timestampReply property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4TimestampReplyType }
     *     
     */
    public ICMPv4TimestampReplyType getTimestampReply() {
        return timestampReply;
    }

    /**
     * Sets the value of the timestampReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4TimestampReplyType }
     *     
     */
    public void setTimestampReply(ICMPv4TimestampReplyType value) {
        this.timestampReply = value;
    }

    /**
     * Gets the value of the timestampRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4TimestampRequestType }
     *     
     */
    public ICMPv4TimestampRequestType getTimestampRequest() {
        return timestampRequest;
    }

    /**
     * Sets the value of the timestampRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4TimestampRequestType }
     *     
     */
    public void setTimestampRequest(ICMPv4TimestampRequestType value) {
        this.timestampRequest = value;
    }

    /**
     * Gets the value of the echoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4EchoRequestType }
     *     
     */
    public ICMPv4EchoRequestType getEchoRequest() {
        return echoRequest;
    }

    /**
     * Sets the value of the echoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4EchoRequestType }
     *     
     */
    public void setEchoRequest(ICMPv4EchoRequestType value) {
        this.echoRequest = value;
    }

    /**
     * Gets the value of the echoReply property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4EchoReplyType }
     *     
     */
    public ICMPv4EchoReplyType getEchoReply() {
        return echoReply;
    }

    /**
     * Sets the value of the echoReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4EchoReplyType }
     *     
     */
    public void setEchoReply(ICMPv4EchoReplyType value) {
        this.echoReply = value;
    }

    /**
     * Gets the value of the infoMsgContent property.
     * 
     * @return
     *     possible object is
     *     {@link ICMPv4InfoMessageContentType }
     *     
     */
    public ICMPv4InfoMessageContentType getInfoMsgContent() {
        return infoMsgContent;
    }

    /**
     * Sets the value of the infoMsgContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICMPv4InfoMessageContentType }
     *     
     */
    public void setInfoMsgContent(ICMPv4InfoMessageContentType value) {
        this.infoMsgContent = value;
    }

}