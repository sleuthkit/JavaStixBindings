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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.StringObjectPropertyType;
import org.mitre.cybox.common_2.UnsignedIntegerObjectPropertyType;
import org.mitre.cybox.common_2.UnsignedLongObjectPropertyType;


/**
 * The UnixNetworkRouteEntryObjectType type is intended to characterize entries in the network routing table of a Unix system.
 * 
 * <p>Java class for UnixNetworkRouteEntryObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnixNetworkRouteEntryObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#NetworkRouteEntryObject-2}NetworkRouteEntryObjectType">
 *       &lt;sequence>
 *         &lt;element name="Flags" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="MSS" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Ref" type="{http://cybox.mitre.org/common-2}UnsignedLongObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Use" type="{http://cybox.mitre.org/common-2}UnsignedLongObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Window" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnixNetworkRouteEntryObjectType", namespace = "http://cybox.mitre.org/objects#UnixNetworkRouteEntryObject-2", propOrder = {
    "flags",
    "mss",
    "ref",
    "use",
    "window"
})
@XmlRootElement(name = "Unix_Network_Route_Entry", namespace = "http://cybox.mitre.org/objects#UnixNetworkRouteEntryObject-2")
public class UnixNetworkRouteEntry
    extends NetworkRouteEntryObjectType
{

    @XmlElement(name = "Flags")
    protected StringObjectPropertyType flags;
    @XmlElement(name = "MSS")
    protected UnsignedIntegerObjectPropertyType mss;
    @XmlElement(name = "Ref")
    protected UnsignedLongObjectPropertyType ref;
    @XmlElement(name = "Use")
    protected UnsignedLongObjectPropertyType use;
    @XmlElement(name = "Window")
    protected UnsignedIntegerObjectPropertyType window;

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setFlags(StringObjectPropertyType value) {
        this.flags = value;
    }

    /**
     * Gets the value of the mss property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getMSS() {
        return mss;
    }

    /**
     * Sets the value of the mss property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setMSS(UnsignedIntegerObjectPropertyType value) {
        this.mss = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedLongObjectPropertyType }
     *     
     */
    public UnsignedLongObjectPropertyType getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedLongObjectPropertyType }
     *     
     */
    public void setRef(UnsignedLongObjectPropertyType value) {
        this.ref = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedLongObjectPropertyType }
     *     
     */
    public UnsignedLongObjectPropertyType getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedLongObjectPropertyType }
     *     
     */
    public void setUse(UnsignedLongObjectPropertyType value) {
        this.use = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setWindow(UnsignedIntegerObjectPropertyType value) {
        this.window = value;
    }

}