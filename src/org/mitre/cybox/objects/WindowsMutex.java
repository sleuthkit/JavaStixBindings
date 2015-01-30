//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.cybox.common_2.StringObjectPropertyType;


/**
 * The WindowsMutexObjectType type is intended to characterize Windows mutual exclusion (mutex) objects.
 * 
 * <p>Java class for WindowsMutexObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsMutexObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/objects#MutexObject-2}MutexObjectType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://cybox.mitre.org/objects#WinHandleObject-2}WindowsHandleObjectType" minOccurs="0"/>
 *         &lt;element name="Security_Attributes" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsMutexObjectType", namespace = "http://cybox.mitre.org/objects#WinMutexObject-2", propOrder = {
    "handle",
    "securityAttributes"
})
@XmlRootElement(name = "Windows_Mutex", namespace = "http://cybox.mitre.org/objects#WinMutexObject-2")
public class WindowsMutex
    extends MutexObjectType
{

    @XmlElement(name = "Handle")
    protected WindowsHandle handle;
    @XmlElement(name = "Security_Attributes")
    protected StringObjectPropertyType securityAttributes;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link WindowsHandle }
     *     
     */
    public WindowsHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowsHandle }
     *     
     */
    public void setHandle(WindowsHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the securityAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * Sets the value of the securityAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setSecurityAttributes(StringObjectPropertyType value) {
        this.securityAttributes = value;
    }

}