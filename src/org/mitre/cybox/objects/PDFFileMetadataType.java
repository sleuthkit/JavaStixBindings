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
import org.mitre.cybox.common_2.PositiveIntegerObjectPropertyType;


/**
 * The PDFFileMetadaType captures some metadata regarding the PDF file object.
 * 
 * <p>Java class for PDFFileMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDFFileMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document_Information_Dictionary" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFDocumentInformationDictionaryType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Indirect_Objects" type="{http://cybox.mitre.org/common-2}PositiveIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Trailers" type="{http://cybox.mitre.org/common-2}PositiveIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Number_Of_Cross_Reference_Tables" type="{http://cybox.mitre.org/common-2}PositiveIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Keyword_Counts" type="{http://cybox.mitre.org/objects#PDFFileObject-1}PDFKeywordCountsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="optimized" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFFileMetadataType", namespace = "http://cybox.mitre.org/objects#PDFFileObject-1", propOrder = {
    "documentInformationDictionary",
    "numberOfIndirectObjects",
    "numberOfTrailers",
    "numberOfCrossReferenceTables",
    "keywordCounts"
})
public class PDFFileMetadataType {

    @XmlElement(name = "Document_Information_Dictionary")
    protected PDFDocumentInformationDictionaryType documentInformationDictionary;
    @XmlElement(name = "Number_Of_Indirect_Objects")
    protected PositiveIntegerObjectPropertyType numberOfIndirectObjects;
    @XmlElement(name = "Number_Of_Trailers")
    protected PositiveIntegerObjectPropertyType numberOfTrailers;
    @XmlElement(name = "Number_Of_Cross_Reference_Tables")
    protected PositiveIntegerObjectPropertyType numberOfCrossReferenceTables;
    @XmlElement(name = "Keyword_Counts")
    protected PDFKeywordCountsType keywordCounts;
    @XmlAttribute(name = "encrypted")
    protected Boolean encrypted;
    @XmlAttribute(name = "optimized")
    protected Boolean optimized;

    /**
     * Gets the value of the documentInformationDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link PDFDocumentInformationDictionaryType }
     *     
     */
    public PDFDocumentInformationDictionaryType getDocumentInformationDictionary() {
        return documentInformationDictionary;
    }

    /**
     * Sets the value of the documentInformationDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFDocumentInformationDictionaryType }
     *     
     */
    public void setDocumentInformationDictionary(PDFDocumentInformationDictionaryType value) {
        this.documentInformationDictionary = value;
    }

    /**
     * Gets the value of the numberOfIndirectObjects property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public PositiveIntegerObjectPropertyType getNumberOfIndirectObjects() {
        return numberOfIndirectObjects;
    }

    /**
     * Sets the value of the numberOfIndirectObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public void setNumberOfIndirectObjects(PositiveIntegerObjectPropertyType value) {
        this.numberOfIndirectObjects = value;
    }

    /**
     * Gets the value of the numberOfTrailers property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public PositiveIntegerObjectPropertyType getNumberOfTrailers() {
        return numberOfTrailers;
    }

    /**
     * Sets the value of the numberOfTrailers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public void setNumberOfTrailers(PositiveIntegerObjectPropertyType value) {
        this.numberOfTrailers = value;
    }

    /**
     * Gets the value of the numberOfCrossReferenceTables property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public PositiveIntegerObjectPropertyType getNumberOfCrossReferenceTables() {
        return numberOfCrossReferenceTables;
    }

    /**
     * Sets the value of the numberOfCrossReferenceTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveIntegerObjectPropertyType }
     *     
     */
    public void setNumberOfCrossReferenceTables(PositiveIntegerObjectPropertyType value) {
        this.numberOfCrossReferenceTables = value;
    }

    /**
     * Gets the value of the keywordCounts property.
     * 
     * @return
     *     possible object is
     *     {@link PDFKeywordCountsType }
     *     
     */
    public PDFKeywordCountsType getKeywordCounts() {
        return keywordCounts;
    }

    /**
     * Sets the value of the keywordCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFKeywordCountsType }
     *     
     */
    public void setKeywordCounts(PDFKeywordCountsType value) {
        this.keywordCounts = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the optimized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimized() {
        return optimized;
    }

    /**
     * Sets the value of the optimized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimized(Boolean value) {
        this.optimized = value;
    }

}
