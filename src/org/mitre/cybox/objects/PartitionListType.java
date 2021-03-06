//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The PartionListType type specifies a list of partitions.
 * 
 * <p>Java class for PartitionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartitionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Partition" type="{http://cybox.mitre.org/objects#DiskPartitionObject-2}DiskPartitionObjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartitionListType", namespace = "http://cybox.mitre.org/objects#DiskObject-2", propOrder = {
    "partitions"
})
public class PartitionListType {

    @XmlElement(name = "Partition", required = true)
    protected List<DiskPartition> partitions;

    /**
     * Gets the value of the partitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiskPartition }
     * 
     * 
     */
    public List<DiskPartition> getPartitions() {
        if (partitions == null) {
            partitions = new ArrayList<DiskPartition>();
        }
        return this.partitions;
    }

}
