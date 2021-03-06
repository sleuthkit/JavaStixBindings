//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.stix.campaign_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.stix.common_1.GenericRelationshipListType;
import org.mitre.stix.common_1.RelatedCampaignType;


/**
 * <p>Java class for AssociatedCampaignsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedCampaignsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://stix.mitre.org/common-1}GenericRelationshipListType">
 *       &lt;sequence>
 *         &lt;element name="Associated_Campaign" type="{http://stix.mitre.org/common-1}RelatedCampaignType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedCampaignsType", propOrder = {
    "associatedCampaigns"
})
public class AssociatedCampaignsType
    extends GenericRelationshipListType
{

    @XmlElement(name = "Associated_Campaign", required = true)
    protected List<RelatedCampaignType> associatedCampaigns;

    /**
     * Gets the value of the associatedCampaigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedCampaigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedCampaigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedCampaignType }
     * 
     * 
     */
    public List<RelatedCampaignType> getAssociatedCampaigns() {
        if (associatedCampaigns == null) {
            associatedCampaigns = new ArrayList<RelatedCampaignType>();
        }
        return this.associatedCampaigns;
    }

}
