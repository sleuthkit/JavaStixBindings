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
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;


/**
 * Defines the variable-length fields associated with IPv6 extension headers (the Hop-by-Hop Options header and the Destination Options header). Contains one or more type-length-value (TLV)-encoded options.
 * 
 * <p>Java class for OptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Option_Type" type="{http://cybox.mitre.org/objects#PacketObject-2}IPv6OptionType" minOccurs="0"/>
 *         &lt;element name="Option_Data_Len" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Pad1" type="{http://cybox.mitre.org/objects#PacketObject-2}Pad1Type" minOccurs="0"/>
 *           &lt;element name="PadN" type="{http://cybox.mitre.org/objects#PacketObject-2}PadNType" minOccurs="0"/>
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
@XmlType(name = "OptionDataType", propOrder = {
    "optionType",
    "optionDataLen",
    "padN",
    "pad1"
})
public class OptionDataType {

    @XmlElement(name = "Option_Type")
    protected IPv6OptionType optionType;
    @XmlElement(name = "Option_Data_Len")
    protected HexBinaryObjectPropertyType optionDataLen;
    @XmlElement(name = "PadN")
    protected PadNType padN;
    @XmlElement(name = "Pad1")
    protected Pad1Type pad1;

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link IPv6OptionType }
     *     
     */
    public IPv6OptionType getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6OptionType }
     *     
     */
    public void setOptionType(IPv6OptionType value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the optionDataLen property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getOptionDataLen() {
        return optionDataLen;
    }

    /**
     * Sets the value of the optionDataLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setOptionDataLen(HexBinaryObjectPropertyType value) {
        this.optionDataLen = value;
    }

    /**
     * Gets the value of the padN property.
     * 
     * @return
     *     possible object is
     *     {@link PadNType }
     *     
     */
    public PadNType getPadN() {
        return padN;
    }

    /**
     * Sets the value of the padN property.
     * 
     * @param value
     *     allowed object is
     *     {@link PadNType }
     *     
     */
    public void setPadN(PadNType value) {
        this.padN = value;
    }

    /**
     * Gets the value of the pad1 property.
     * 
     * @return
     *     possible object is
     *     {@link Pad1Type }
     *     
     */
    public Pad1Type getPad1() {
        return pad1;
    }

    /**
     * Sets the value of the pad1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pad1Type }
     *     
     */
    public void setPad1(Pad1Type value) {
        this.pad1 = value;
    }

}