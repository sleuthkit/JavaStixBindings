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
import org.mitre.cybox.common_2.DateTimeObjectPropertyType;
import org.mitre.cybox.common_2.IntegerObjectPropertyType;
import org.mitre.cybox.common_2.LongObjectPropertyType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The PEExportsType specifies the PE File exports data section. The exports data section contains information about symbols exported by the PE File (a DLL) which can be dynamically loaded by other executables. This type abstracts, and its components, abstract the Windows structures.
 * 
 * <p>Java class for PEExportsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PEExportsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Exported_Functions" type="{http://cybox.mitre.org/objects#WinExecutableFileObject-2}PEExportedFunctionsType" minOccurs="0"/>
 *         &lt;element name="Exports_Time_Stamp" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Addresses" type="{http://cybox.mitre.org/common-2}LongObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Names" type="{http://cybox.mitre.org/common-2}LongObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Functions" type="{http://cybox.mitre.org/common-2}IntegerObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEExportsType", namespace = "http://cybox.mitre.org/objects#WinExecutableFileObject-2", propOrder = {
    "name",
    "exportedFunctions",
    "exportsTimeStamp",
    "numberOfAddresses",
    "numberOfNames",
    "numberOfFunctions"
})
public class PEExportsType {

    @XmlElement(name = "Name")
    protected StringObjectPropertyType name;
    @XmlElement(name = "Exported_Functions")
    protected PEExportedFunctionsType exportedFunctions;
    @XmlElement(name = "Exports_Time_Stamp")
    protected DateTimeObjectPropertyType exportsTimeStamp;
    @XmlElement(name = "Number_Of_Addresses")
    protected LongObjectPropertyType numberOfAddresses;
    @XmlElement(name = "Number_Of_Names")
    protected LongObjectPropertyType numberOfNames;
    @XmlElement(name = "Number_Of_Functions")
    protected IntegerObjectPropertyType numberOfFunctions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setName(StringObjectPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the exportedFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link PEExportedFunctionsType }
     *     
     */
    public PEExportedFunctionsType getExportedFunctions() {
        return exportedFunctions;
    }

    /**
     * Sets the value of the exportedFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PEExportedFunctionsType }
     *     
     */
    public void setExportedFunctions(PEExportedFunctionsType value) {
        this.exportedFunctions = value;
    }

    /**
     * Gets the value of the exportsTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getExportsTimeStamp() {
        return exportsTimeStamp;
    }

    /**
     * Sets the value of the exportsTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setExportsTimeStamp(DateTimeObjectPropertyType value) {
        this.exportsTimeStamp = value;
    }

    /**
     * Gets the value of the numberOfAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link LongObjectPropertyType }
     *     
     */
    public LongObjectPropertyType getNumberOfAddresses() {
        return numberOfAddresses;
    }

    /**
     * Sets the value of the numberOfAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongObjectPropertyType }
     *     
     */
    public void setNumberOfAddresses(LongObjectPropertyType value) {
        this.numberOfAddresses = value;
    }

    /**
     * Gets the value of the numberOfNames property.
     * 
     * @return
     *     possible object is
     *     {@link LongObjectPropertyType }
     *     
     */
    public LongObjectPropertyType getNumberOfNames() {
        return numberOfNames;
    }

    /**
     * Sets the value of the numberOfNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongObjectPropertyType }
     *     
     */
    public void setNumberOfNames(LongObjectPropertyType value) {
        this.numberOfNames = value;
    }

    /**
     * Gets the value of the numberOfFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public IntegerObjectPropertyType getNumberOfFunctions() {
        return numberOfFunctions;
    }

    /**
     * Sets the value of the numberOfFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerObjectPropertyType }
     *     
     */
    public void setNumberOfFunctions(IntegerObjectPropertyType value) {
        this.numberOfFunctions = value;
    }

}