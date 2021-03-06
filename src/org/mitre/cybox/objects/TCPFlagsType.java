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


/**
 * Defines the 9 different flags in the TCP header.
 * 
 * <p>Java class for TCPFlagsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCPFlagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cwr" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ece" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="urg" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ack" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="psh" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rst" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="syn" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCPFlagsType")
public class TCPFlagsType {

    @XmlAttribute(name = "ns")
    protected Boolean ns;
    @XmlAttribute(name = "cwr")
    protected Boolean cwr;
    @XmlAttribute(name = "ece")
    protected Boolean ece;
    @XmlAttribute(name = "urg")
    protected Boolean urg;
    @XmlAttribute(name = "ack")
    protected Boolean ack;
    @XmlAttribute(name = "psh")
    protected Boolean psh;
    @XmlAttribute(name = "rst")
    protected Boolean rst;
    @XmlAttribute(name = "syn")
    protected Boolean syn;
    @XmlAttribute(name = "fin")
    protected Boolean fin;

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNs() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNs(Boolean value) {
        this.ns = value;
    }

    /**
     * Gets the value of the cwr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCwr() {
        return cwr;
    }

    /**
     * Sets the value of the cwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCwr(Boolean value) {
        this.cwr = value;
    }

    /**
     * Gets the value of the ece property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEce() {
        return ece;
    }

    /**
     * Sets the value of the ece property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEce(Boolean value) {
        this.ece = value;
    }

    /**
     * Gets the value of the urg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrg() {
        return urg;
    }

    /**
     * Sets the value of the urg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrg(Boolean value) {
        this.urg = value;
    }

    /**
     * Gets the value of the ack property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAck(Boolean value) {
        this.ack = value;
    }

    /**
     * Gets the value of the psh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPsh() {
        return psh;
    }

    /**
     * Sets the value of the psh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPsh(Boolean value) {
        this.psh = value;
    }

    /**
     * Gets the value of the rst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRst() {
        return rst;
    }

    /**
     * Sets the value of the rst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRst(Boolean value) {
        this.rst = value;
    }

    /**
     * Gets the value of the syn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSyn() {
        return syn;
    }

    /**
     * Sets the value of the syn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSyn(Boolean value) {
        this.syn = value;
    }

    /**
     * Gets the value of the fin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFin() {
        return fin;
    }

    /**
     * Sets the value of the fin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFin(Boolean value) {
        this.fin = value;
    }

}
