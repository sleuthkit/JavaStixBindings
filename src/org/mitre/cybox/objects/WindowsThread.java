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
import org.mitre.cybox.common_2.DateTimeObjectPropertyType;
import org.mitre.cybox.common_2.HexBinaryObjectPropertyType;
import org.mitre.cybox.common_2.NonNegativeIntegerObjectPropertyType;
import org.mitre.cybox.common_2.ObjectPropertiesType;
import org.mitre.cybox.common_2.StringObjectPropertyType;
import org.mitre.cybox.common_2.UnsignedIntegerObjectPropertyType;


/**
 * The Windows_ThreadObjectType is intended to characterize Windows process threads. See also: http://msdn.microsoft.com/en-us/library/windows/desktop/ms684852(v=vs.85).aspx.
 * 
 * <p>Java class for WindowsThreadObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowsThreadObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cybox.mitre.org/common-2}ObjectPropertiesType">
 *       &lt;sequence>
 *         &lt;element name="Thread_ID" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Handle" type="{http://cybox.mitre.org/objects#WinHandleObject-2}WindowsHandleObjectType" minOccurs="0"/>
 *         &lt;element name="Running_Status" type="{http://cybox.mitre.org/objects#WinThreadObject-2}ThreadRunningStatusType" minOccurs="0"/>
 *         &lt;element name="Context" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://cybox.mitre.org/common-2}UnsignedIntegerObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Creation_Flags" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Creation_Time" type="{http://cybox.mitre.org/common-2}DateTimeObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Start_Address" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Parameter_Address" type="{http://cybox.mitre.org/common-2}HexBinaryObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Security_Attributes" type="{http://cybox.mitre.org/common-2}StringObjectPropertyType" minOccurs="0"/>
 *         &lt;element name="Stack_Size" type="{http://cybox.mitre.org/common-2}NonNegativeIntegerObjectPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowsThreadObjectType", namespace = "http://cybox.mitre.org/objects#WinThreadObject-2", propOrder = {
    "threadID",
    "handle",
    "runningStatus",
    "context",
    "priority",
    "creationFlags",
    "creationTime",
    "startAddress",
    "parameterAddress",
    "securityAttributes",
    "stackSize"
})
@XmlRootElement(name = "Windows_Thread", namespace = "http://cybox.mitre.org/objects#WinThreadObject-2")
public class WindowsThread
    extends ObjectPropertiesType
{

    @XmlElement(name = "Thread_ID")
    protected NonNegativeIntegerObjectPropertyType threadID;
    @XmlElement(name = "Handle")
    protected WindowsHandle handle;
    @XmlElement(name = "Running_Status")
    protected ThreadRunningStatusType runningStatus;
    @XmlElement(name = "Context")
    protected StringObjectPropertyType context;
    @XmlElement(name = "Priority")
    protected UnsignedIntegerObjectPropertyType priority;
    @XmlElement(name = "Creation_Flags")
    protected HexBinaryObjectPropertyType creationFlags;
    @XmlElement(name = "Creation_Time")
    protected DateTimeObjectPropertyType creationTime;
    @XmlElement(name = "Start_Address")
    protected HexBinaryObjectPropertyType startAddress;
    @XmlElement(name = "Parameter_Address")
    protected HexBinaryObjectPropertyType parameterAddress;
    @XmlElement(name = "Security_Attributes")
    protected StringObjectPropertyType securityAttributes;
    @XmlElement(name = "Stack_Size")
    protected NonNegativeIntegerObjectPropertyType stackSize;

    /**
     * Gets the value of the threadID property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getThreadID() {
        return threadID;
    }

    /**
     * Sets the value of the threadID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setThreadID(NonNegativeIntegerObjectPropertyType value) {
        this.threadID = value;
    }

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
     * Gets the value of the runningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ThreadRunningStatusType }
     *     
     */
    public ThreadRunningStatusType getRunningStatus() {
        return runningStatus;
    }

    /**
     * Sets the value of the runningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreadRunningStatusType }
     *     
     */
    public void setRunningStatus(ThreadRunningStatusType value) {
        this.runningStatus = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public StringObjectPropertyType getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringObjectPropertyType }
     *     
     */
    public void setContext(StringObjectPropertyType value) {
        this.context = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public UnsignedIntegerObjectPropertyType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedIntegerObjectPropertyType }
     *     
     */
    public void setPriority(UnsignedIntegerObjectPropertyType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the creationFlags property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getCreationFlags() {
        return creationFlags;
    }

    /**
     * Sets the value of the creationFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setCreationFlags(HexBinaryObjectPropertyType value) {
        this.creationFlags = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public DateTimeObjectPropertyType getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeObjectPropertyType }
     *     
     */
    public void setCreationTime(DateTimeObjectPropertyType value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the startAddress property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getStartAddress() {
        return startAddress;
    }

    /**
     * Sets the value of the startAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setStartAddress(HexBinaryObjectPropertyType value) {
        this.startAddress = value;
    }

    /**
     * Gets the value of the parameterAddress property.
     * 
     * @return
     *     possible object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public HexBinaryObjectPropertyType getParameterAddress() {
        return parameterAddress;
    }

    /**
     * Sets the value of the parameterAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link HexBinaryObjectPropertyType }
     *     
     */
    public void setParameterAddress(HexBinaryObjectPropertyType value) {
        this.parameterAddress = value;
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

    /**
     * Gets the value of the stackSize property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public NonNegativeIntegerObjectPropertyType getStackSize() {
        return stackSize;
    }

    /**
     * Sets the value of the stackSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntegerObjectPropertyType }
     *     
     */
    public void setStackSize(NonNegativeIntegerObjectPropertyType value) {
        this.stackSize = value;
    }

}