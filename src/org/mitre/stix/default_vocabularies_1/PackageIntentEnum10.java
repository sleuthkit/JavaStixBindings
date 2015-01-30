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
 * <p>Java class for PackageIntentEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageIntentEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Collective Threat Intelligence"/>
 *     &lt;enumeration value="Threat Report"/>
 *     &lt;enumeration value="Indicators"/>
 *     &lt;enumeration value="Indicators - Phishing"/>
 *     &lt;enumeration value="Indicators - Watchlist"/>
 *     &lt;enumeration value="Indicators - Malware Artifacts"/>
 *     &lt;enumeration value="Indicators - Network Activity"/>
 *     &lt;enumeration value="Indicators - Endpoint Characteristics"/>
 *     &lt;enumeration value="Campaign Characterization"/>
 *     &lt;enumeration value="Threat Actor Characterization"/>
 *     &lt;enumeration value="Exploit Characterization"/>
 *     &lt;enumeration value="Attack Pattern Characterization"/>
 *     &lt;enumeration value="Malware Characterization"/>
 *     &lt;enumeration value="TTP - Infrastructure"/>
 *     &lt;enumeration value="TTP - Tools"/>
 *     &lt;enumeration value="Courses of Action"/>
 *     &lt;enumeration value="Incident"/>
 *     &lt;enumeration value="Observations"/>
 *     &lt;enumeration value="Observations - Email"/>
 *     &lt;enumeration value="Malware Samples"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageIntentEnum-1.0")
@XmlEnum
public enum PackageIntentEnum10 {


    /**
     * Package is intended to convey a broad characterization of a threat across multiple facets.
     * 
     */
    @XmlEnumValue("Collective Threat Intelligence")
    COLLECTIVE_THREAT_INTELLIGENCE("Collective Threat Intelligence"),

    /**
     * Package is intended to convey a broad characterization of a threat across multiple facets expressed as a cohesive report.
     * 
     */
    @XmlEnumValue("Threat Report")
    THREAT_REPORT("Threat Report"),

    /**
     * Package is intended to convey mainly indicators.
     * 
     */
    @XmlEnumValue("Indicators")
    INDICATORS("Indicators"),

    /**
     * Package is intended to convey mainly phishing indicators.
     * 
     */
    @XmlEnumValue("Indicators - Phishing")
    INDICATORS_PHISHING("Indicators - Phishing"),

    /**
     * Package is intended to convey mainly network watchlist indicators.
     * 
     */
    @XmlEnumValue("Indicators - Watchlist")
    INDICATORS_WATCHLIST("Indicators - Watchlist"),

    /**
     * Package is intended to convey mainly malware artifact indicators.
     * 
     */
    @XmlEnumValue("Indicators - Malware Artifacts")
    INDICATORS_MALWARE_ARTIFACTS("Indicators - Malware Artifacts"),

    /**
     * Package is intended to convey mainly network activity indicators.
     * 
     */
    @XmlEnumValue("Indicators - Network Activity")
    INDICATORS_NETWORK_ACTIVITY("Indicators - Network Activity"),

    /**
     * Package is intended to convey mainly endpoint characteristics (hashes, registry values, installed software, known vulnerabilities, etc.) indicators.
     * 
     */
    @XmlEnumValue("Indicators - Endpoint Characteristics")
    INDICATORS_ENDPOINT_CHARACTERISTICS("Indicators - Endpoint Characteristics"),

    /**
     * Package is intended to convey mainly a characterization of one or more campaigns.
     * 
     */
    @XmlEnumValue("Campaign Characterization")
    CAMPAIGN_CHARACTERIZATION("Campaign Characterization"),

    /**
     * Package is intended to convey mainly a characterization of one or more threat actors.
     * 
     */
    @XmlEnumValue("Threat Actor Characterization")
    THREAT_ACTOR_CHARACTERIZATION("Threat Actor Characterization"),

    /**
     * Package is intended to convey mainly a characterization of one or more exploits.
     * 
     */
    @XmlEnumValue("Exploit Characterization")
    EXPLOIT_CHARACTERIZATION("Exploit Characterization"),

    /**
     * Package is intended to convey mainly a characterization of one or more attack patterns.
     * 
     */
    @XmlEnumValue("Attack Pattern Characterization")
    ATTACK_PATTERN_CHARACTERIZATION("Attack Pattern Characterization"),

    /**
     * Package is intended to convey mainly a characterization of one or more malware instances.
     * 
     */
    @XmlEnumValue("Malware Characterization")
    MALWARE_CHARACTERIZATION("Malware Characterization"),

    /**
     * Package is intended to convey mainly a characterization of attacker infrastructure.
     * 
     */
    @XmlEnumValue("TTP - Infrastructure")
    TTP_INFRASTRUCTURE("TTP - Infrastructure"),

    /**
     * Package is intended to convey mainly a characterization of attacker tools.
     * 
     */
    @XmlEnumValue("TTP - Tools")
    TTP_TOOLS("TTP - Tools"),

    /**
     * Package is intended to convey mainly a set of courses of action.
     * 
     */
    @XmlEnumValue("Courses of Action")
    COURSES_OF_ACTION("Courses of Action"),

    /**
     * Package is intended to convey mainly information about one or more incidents.
     * 
     */
    @XmlEnumValue("Incident")
    INCIDENT("Incident"),

    /**
     * Package is intended to convey mainly information about instantial observations (cyber observables).
     * 
     */
    @XmlEnumValue("Observations")
    OBSERVATIONS("Observations"),

    /**
     * Package is intended to convey mainly information about instantial email observations (email cyber observables).
     * 
     */
    @XmlEnumValue("Observations - Email")
    OBSERVATIONS_EMAIL("Observations - Email"),

    /**
     * Package is intended to convey a set of malware samples.
     * 
     */
    @XmlEnumValue("Malware Samples")
    MALWARE_SAMPLES("Malware Samples");
    private final String value;

    PackageIntentEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackageIntentEnum10 fromValue(String v) {
        for (PackageIntentEnum10 c: PackageIntentEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}