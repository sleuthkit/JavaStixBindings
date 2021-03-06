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
import org.mitre.cybox.common_2.IntegerObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * Defines elements of a netflow v5 header. http://netflow.caligare.com/netflow_v5.htm.
 * 
 * <p>Java class for NetflowV5FlowHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetflowV5FlowHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Sys_Up_Time" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Unix_Secs" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Unix_Nsecs" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Flow_Sequence" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Engine_Type" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Engine_ID" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Sampling_Interval" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetflowV5FlowHeaderType", namespace = "http://cybox.mitre.org/objects#NetworkFlowObject-2", propOrder = {
    "version",
    "count",
    "sysUpTime",
    "unixSecs",
    "unixNsecs",
    "flowSequence",
    "engineType",
    "engineID",
    "samplingInterval"
})
public class NetflowV5FlowHeaderType {

    @XmlElement(name = "Version", defaultValue = "05")
    protected HexBinaryObjectPropertyType version;
    @XmlElement(name = "Count")
    protected IntegerObjectPropertyType count;
    @XmlElement(name = "Sys_Up_Time")
    protected IntegerObjectPropertyType sysUpTime;
    @XmlElement(name = "Unix_Secs")
    protected IntegerObjectPropertyType unixSecs;
    @XmlElement(name = "Unix_Nsecs")
    protected IntegerObjectPropertyType unixNsecs;
    @XmlElement(name = "Flow_Sequence")
    protected IntegerObjectPropertyType flowSequence;
    @XmlElement(name = "Engine_Type")
    protected StringObjectPropertyType engineType;
    @XmlElement(name = "Engine_ID")
    protected IntegerObjectPropertyType engineID;
    @XmlElement(name = "Sampling_Interval")
    protected HexBinaryObjectPropertyType samplingInterval;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setVersion(HexBinaryObjectPropertyType value) {
        this.version = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setCount(IntegerObjectPropertyType value) {
        this.count = value;
    }

    /**
     * Gets the value of the sysUpTime property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getSysUpTime() {
        return sysUpTime;
    }

    /**
     * Sets the value of the sysUpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setSysUpTime(IntegerObjectPropertyType value) {
        this.sysUpTime = value;
    }

    /**
     * Gets the value of the unixSecs property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getUnixSecs() {
        return unixSecs;
    }

    /**
     * Sets the value of the unixSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setUnixSecs(IntegerObjectPropertyType value) {
        this.unixSecs = value;
    }

    /**
     * Gets the value of the unixNsecs property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getUnixNsecs() {
        return unixNsecs;
    }

    /**
     * Sets the value of the unixNsecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setUnixNsecs(IntegerObjectPropertyType value) {
        this.unixNsecs = value;
    }

    /**
     * Gets the value of the flowSequence property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getFlowSequence() {
        return flowSequence;
    }

    /**
     * Sets the value of the flowSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setFlowSequence(IntegerObjectPropertyType value) {
        this.flowSequence = value;
    }

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setEngineType(StringObjectPropertyType value) {
        this.engineType = value;
    }

    /**
     * Gets the value of the engineID property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getEngineID() {
        return engineID;
    }

    /**
     * Sets the value of the engineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setEngineID(IntegerObjectPropertyType value) {
        this.engineID = value;
    }

    /**
     * Gets the value of the samplingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getSamplingInterval() {
        return samplingInterval;
    }

    /**
     * Sets the value of the samplingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setSamplingInterval(HexBinaryObjectPropertyType value) {
        this.samplingInterval = value;
    }

}
