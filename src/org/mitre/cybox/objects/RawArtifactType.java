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
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.EndiannessTypeEnum;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The RawArtifactType is intended to convey, with minimal characterization, the content of the Raw Artifact itself.
 * 
 * <p>Java class for RawArtifactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RawArtifactType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://cybox.mitre.org/common-2>StringObjectPropertyType">
 *       &lt;attribute name="byte_order" type="{http://cybox.mitre.org/common-2}EndiannessTypeEnum" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RawArtifactType", namespace = "http://cybox.mitre.org/objects#ArtifactObject-2")
public class RawArtifactType
    extends StringObjectPropertyType
{

    @XmlAttribute(name = "byte_order")
    protected EndiannessTypeEnum byteOrder;

    /**
     * Gets the value of the byteOrder property.
     * 
     * @return
     *     possible object is
     *     {@link EndiannessTypeEnum }
     *     
     */
    public EndiannessTypeEnum getByteOrder() {
        return byteOrder;
    }

    /**
     * Sets the value of the byteOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndiannessTypeEnum }
     *     
     */
    public void setByteOrder(EndiannessTypeEnum value) {
        this.byteOrder = value;
    }

}