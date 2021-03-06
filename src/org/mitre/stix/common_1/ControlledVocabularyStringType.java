//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.common_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.stix.default_vocabularies_1.AssetTypeVocab10;
import org.mitre.stix.default_vocabularies_1.AttackerInfrastructureTypeVocab10;
import org.mitre.stix.default_vocabularies_1.AvailabilityLossTypeVocab10;
import org.mitre.stix.default_vocabularies_1.AvailabilityLossTypeVocab111;
import org.mitre.stix.default_vocabularies_1.COAStageVocab10;
import org.mitre.stix.default_vocabularies_1.CampaignStatusVocab10;
import org.mitre.stix.default_vocabularies_1.CourseOfActionTypeVocab10;
import org.mitre.stix.default_vocabularies_1.DiscoveryMethodVocab10;
import org.mitre.stix.default_vocabularies_1.HighMediumLowVocab10;
import org.mitre.stix.default_vocabularies_1.ImpactQualificationVocab10;
import org.mitre.stix.default_vocabularies_1.ImpactRatingVocab10;
import org.mitre.stix.default_vocabularies_1.IncidentCategoryVocab10;
import org.mitre.stix.default_vocabularies_1.IncidentEffectVocab10;
import org.mitre.stix.default_vocabularies_1.IncidentStatusVocab10;
import org.mitre.stix.default_vocabularies_1.IndicatorTypeVocab10;
import org.mitre.stix.default_vocabularies_1.IndicatorTypeVocab11;
import org.mitre.stix.default_vocabularies_1.InformationSourceRoleVocab10;
import org.mitre.stix.default_vocabularies_1.InformationTypeVocab10;
import org.mitre.stix.default_vocabularies_1.IntendedEffectVocab10;
import org.mitre.stix.default_vocabularies_1.LocationClassVocab10;
import org.mitre.stix.default_vocabularies_1.LossDurationVocab10;
import org.mitre.stix.default_vocabularies_1.LossPropertyVocab10;
import org.mitre.stix.default_vocabularies_1.MalwareTypeVocab10;
import org.mitre.stix.default_vocabularies_1.ManagementClassVocab10;
import org.mitre.stix.default_vocabularies_1.MotivationVocab10;
import org.mitre.stix.default_vocabularies_1.MotivationVocab101;
import org.mitre.stix.default_vocabularies_1.MotivationVocab11;
import org.mitre.stix.default_vocabularies_1.OwnershipClassVocab10;
import org.mitre.stix.default_vocabularies_1.PackageIntentVocab10;
import org.mitre.stix.default_vocabularies_1.PlanningAndOperationalSupportVocab10;
import org.mitre.stix.default_vocabularies_1.PlanningAndOperationalSupportVocab101;
import org.mitre.stix.default_vocabularies_1.SecurityCompromiseVocab10;
import org.mitre.stix.default_vocabularies_1.SystemTypeVocab10;
import org.mitre.stix.default_vocabularies_1.ThreatActorSophisticationVocab10;
import org.mitre.stix.default_vocabularies_1.ThreatActorTypeVocab10;
import org.mitre.stix.incident_1.AssetTypeType;
import org.mitre.stix.incident_1.NonPublicDataCompromisedType;


/**
 * The ControlledVocabularyStringType is used as the basis for defining controlled vocabularies.
 * 
 * <p>Java class for ControlledVocabularyStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledVocabularyStringType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attribute name="vocab_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vocab_reference" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledVocabularyStringType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AttackerInfrastructureTypeVocab10 .class,
    DiscoveryMethodVocab10 .class,
    HighMediumLowVocab10 .class,
    ImpactQualificationVocab10 .class,
    AssetTypeVocab10 .class,
    AvailabilityLossTypeVocab10 .class,
    PlanningAndOperationalSupportVocab101 .class,
    LocationClassVocab10 .class,
    IncidentStatusVocab10 .class,
    AvailabilityLossTypeVocab111 .class,
    SecurityCompromiseVocab10 .class,
    ThreatActorTypeVocab10 .class,
    IntendedEffectVocab10 .class,
    ThreatActorSophisticationVocab10 .class,
    PlanningAndOperationalSupportVocab10 .class,
    LossDurationVocab10 .class,
    CampaignStatusVocab10 .class,
    IndicatorTypeVocab11 .class,
    IndicatorTypeVocab10 .class,
    MotivationVocab101 .class,
    MalwareTypeVocab10 .class,
    IncidentEffectVocab10 .class,
    IncidentCategoryVocab10 .class,
    SystemTypeVocab10 .class,
    InformationSourceRoleVocab10 .class,
    COAStageVocab10 .class,
    OwnershipClassVocab10 .class,
    InformationTypeVocab10 .class,
    MotivationVocab11 .class,
    MotivationVocab10 .class,
    LossPropertyVocab10 .class,
    CourseOfActionTypeVocab10 .class,
    ImpactRatingVocab10 .class,
    ManagementClassVocab10 .class,
    PackageIntentVocab10 .class,
    AssetTypeType.class,
    NonPublicDataCompromisedType.class
})
public class ControlledVocabularyStringType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "vocab_name")
    protected String vocabName;
    @XmlAttribute(name = "vocab_reference")
    @XmlSchemaType(name = "anyURI")
    protected String vocabReference;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the vocabName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocabName() {
        return vocabName;
    }

    /**
     * Sets the value of the vocabName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocabName(String value) {
        this.vocabName = value;
    }

    /**
     * Gets the value of the vocabReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocabReference() {
        return vocabReference;
    }

    /**
     * Sets the value of the vocabReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocabReference(String value) {
        this.vocabReference = value;
    }

}
