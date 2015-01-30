//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemoryPageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MemoryPageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEM_IMAGE"/>
 *     &lt;enumeration value="MEM_MAPPED"/>
 *     &lt;enumeration value="MEM_PRIVATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemoryPageTypeEnum", namespace = "http://cybox.mitre.org/objects#WinMemoryPageRegionObject-2")
@XmlEnum
public enum MemoryPageTypeEnum {


    /**
     * From Microsoft: "Indicates that the memory pages within the region are mapped into the view of an image section.".
     * 
     */
    MEM_IMAGE,

    /**
     * From Microsoft: "Indicates that the memory pages within the region are mapped into the view of a section.".
     * 
     */
    MEM_MAPPED,

    /**
     * From Microsoft: "Indicates that the memory pages within the region are private (that is, not shared by other processes).".
     * 
     */
    MEM_PRIVATE;

    public String value() {
        return name();
    }

    public static MemoryPageTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}