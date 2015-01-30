//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.default_vocabularies_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementClassEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagementClassEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Internally-Managed"/>
 *     &lt;enumeration value="Externally-Management"/>
 *     &lt;enumeration value="Co-Management"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagementClassEnum-1.0")
@XmlEnum
public enum ManagementClassEnum10 {


    /**
     * The asset is managed internally.
     * 
     */
    @XmlEnumValue("Internally-Managed")
    INTERNALLY_MANAGED("Internally-Managed"),

    /**
     * The asset is managed externally.
     * 
     */
    @XmlEnumValue("Externally-Management")
    EXTERNALLY_MANAGEMENT("Externally-Management"),

    /**
     * The asset is co-managed.
     * 
     */
    @XmlEnumValue("Co-Management")
    CO_MANAGEMENT("Co-Management"),

    /**
     * The asset management class is unknown.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    ManagementClassEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagementClassEnum10 fromValue(String v) {
        for (ManagementClassEnum10 c: ManagementClassEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}