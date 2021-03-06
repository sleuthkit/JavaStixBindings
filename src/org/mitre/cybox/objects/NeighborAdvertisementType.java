//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A node sends Neighbor Advertisements in response to Neighbor Solicitations and sends unsolicited Neighbor Advertisements in order to (unreliably) propagate new information quickly. (type=136; code=0).
 * 
 * <p>Java class for NeighborAdvertisementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeighborAdvertisementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Target_IPv6_Addr" type="{http://cybox.mitre.org/objects#AddressObject-2}AddressObjectType" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://cybox.mitre.org/objects#PacketObject-2}NeighborOptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="router_flag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="solicited_flag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="override_flag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeighborAdvertisementType", propOrder = {
    "targetIPv6Addr",
    "options"
})
public class NeighborAdvertisementType {

    @XmlElement(name = "Target_IPv6_Addr")
    protected Address targetIPv6Addr;
    @XmlElement(name = "Options")
    protected NeighborOptionsType options;
    @XmlAttribute(name = "router_flag")
    protected Boolean routerFlag;
    @XmlAttribute(name = "solicited_flag")
    protected Boolean solicitedFlag;
    @XmlAttribute(name = "override_flag")
    protected Boolean overrideFlag;

    /**
     * Gets the value of the targetIPv6Addr property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTargetIPv6Addr() {
        return targetIPv6Addr;
    }

    /**
     * Sets the value of the targetIPv6Addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTargetIPv6Addr(Address value) {
        this.targetIPv6Addr = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link NeighborOptionsType }
     *     
     */
    public NeighborOptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighborOptionsType }
     *     
     */
    public void setOptions(NeighborOptionsType value) {
        this.options = value;
    }

    /**
     * Gets the value of the routerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouterFlag() {
        return routerFlag;
    }

    /**
     * Sets the value of the routerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouterFlag(Boolean value) {
        this.routerFlag = value;
    }

    /**
     * Gets the value of the solicitedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitedFlag() {
        return solicitedFlag;
    }

    /**
     * Sets the value of the solicitedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitedFlag(Boolean value) {
        this.solicitedFlag = value;
    }

    /**
     * Gets the value of the overrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Sets the value of the overrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideFlag(Boolean value) {
        this.overrideFlag = value;
    }

}
