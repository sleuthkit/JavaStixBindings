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
import org.mitre.cybox.common_2.NonNegativeIntegerObjectPropertyType;


/**
 * The PDFXrefTableSubsectionType captures details of subsections contained within a PDF cross-reference table.
 * 
 * <p>Java class for PDFXrefTableSubsectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFXrefTableSubsectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="First_Object_Number" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Objects" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Cross_Reference_Entries" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFXrefEntryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFXrefTableSubsectionType", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1", propOrder = {
    "firstObjectNumber",
    "numberOfObjects",
    "crossReferenceEntries"
})
public class PDFXrefTableSubsectionType {

    @XmlElement(name = "First_Object_Number")
    protected NonNegativeIntegerObjectPropertyType firstObjectNumber;
    @XmlElement(name = "Number_Of_Objects")
    protected NonNegativeIntegerObjectPropertyType numberOfObjects;
    @XmlElement(name = "Cross_Reference_Entries")
    protected PDFXrefEntryListType crossReferenceEntries;

    /**
     * Gets the value of the firstObjectNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getFirstObjectNumber() {
        return firstObjectNumber;
    }

    /**
     * Sets the value of the firstObjectNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setFirstObjectNumber(NonNegativeIntegerObjectPropertyType value) {
        this.firstObjectNumber = value;
    }

    /**
     * Gets the value of the numberOfObjects property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Sets the value of the numberOfObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setNumberOfObjects(NonNegativeIntegerObjectPropertyType value) {
        this.numberOfObjects = value;
    }

    /**
     * Gets the value of the crossReferenceEntries property.
     * 
     * @return
     *     possible object is
     *     {@link PDFXrefEntryListType }
     *     
     */
    public PDFXrefEntryListType getCrossReferenceEntries() {
        return crossReferenceEntries;
    }

    /**
     * Sets the value of the crossReferenceEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFXrefEntryListType }
     *     
     */
    public void setCrossReferenceEntries(PDFXrefEntryListType value) {
        this.crossReferenceEntries = value;
    }

}
