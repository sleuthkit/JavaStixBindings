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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EncryptionType captures any encryption packaging details for an artifact.
 * 
 * <p>Java class for EncryptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="encryption_mechanism" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encryption_mechanism_ref" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="encryption_key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="encryption_key_ref" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionType", namespace = "http://cybox.mitre.org/objects#ArtifactObject-2")
public class EncryptionType {

    @XmlAttribute(name = "encryption_mechanism")
    protected String encryptionMechanism;
    @XmlAttribute(name = "encryption_mechanism_ref")
    @XmlSchemaType(name = "anyURI")
    protected String encryptionMechanismRef;
    @XmlAttribute(name = "encryption_key")
    protected String encryptionKey;
    @XmlAttribute(name = "encryption_key_ref")
    @XmlSchemaType(name = "anyURI")
    protected String encryptionKeyRef;

    /**
     * Gets the value of the encryptionMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionMechanism() {
        return encryptionMechanism;
    }

    /**
     * Sets the value of the encryptionMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionMechanism(String value) {
        this.encryptionMechanism = value;
    }

    /**
     * Gets the value of the encryptionMechanismRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionMechanismRef() {
        return encryptionMechanismRef;
    }

    /**
     * Sets the value of the encryptionMechanismRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionMechanismRef(String value) {
        this.encryptionMechanismRef = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * Gets the value of the encryptionKeyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKeyRef() {
        return encryptionKeyRef;
    }

    /**
     * Sets the value of the encryptionKeyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKeyRef(String value) {
        this.encryptionKeyRef = value;
    }

}