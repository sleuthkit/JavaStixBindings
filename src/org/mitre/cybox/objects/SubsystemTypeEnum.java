//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.25 at 01:41:27 PM EDT 
//


package org.mitre.cybox.objects;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubsystemTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubsystemTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Native"/>
 *     &lt;enumeration value="Windows_GUI"/>
 *     &lt;enumeration value="Windows_CUI"/>
 *     &lt;enumeration value="OS2_CUI"/>
 *     &lt;enumeration value="POSIX_CUI"/>
 *     &lt;enumeration value="Native_Win9x_Driver"/>
 *     &lt;enumeration value="Windows_CE_GUI"/>
 *     &lt;enumeration value="EFI_Application"/>
 *     &lt;enumeration value="EFI_Boot_Service_Driver"/>
 *     &lt;enumeration value="EFI_Runtime_Driver"/>
 *     &lt;enumeration value="EFI_ROM"/>
 *     &lt;enumeration value="XBOX"/>
 *     &lt;enumeration value="Windows_Boot_Application"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubsystemTypeEnum", namespace = "http://cybox.mitre.org/objects#WinExecutableFileObject-2")
@XmlEnum
public enum SubsystemTypeEnum {


    /**
     * Specifies an unknown subsystem.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Specifies that no subsystem is required to run the image (i.e. only device drivers and native system processes are needed).
     * 
     */
    @XmlEnumValue("Native")
    NATIVE("Native"),

    /**
     * Specifies the Windows Graphical user interface (GUI) subsystem.
     * 
     */
    @XmlEnumValue("Windows_GUI")
    WINDOWS_GUI("Windows_GUI"),

    /**
     * Specifies the Windows character-mode user interface (CUI) subsystem.
     * 
     */
    @XmlEnumValue("Windows_CUI")
    WINDOWS_CUI("Windows_CUI"),

    /**
     * Specifies the OS/2 CUI subsystem.
     * 
     */
    @XmlEnumValue("OS2_CUI")
    OS_2_CUI("OS2_CUI"),

    /**
     * Specifies the POSIX CUI subsystem.
     * 
     */
    POSIX_CUI("POSIX_CUI"),

    /**
     * Specifies the Native Windows 9x drivers. This is denoted by the value IMAGE_SUBSYSTEM_NATIVE_WINDOWS or 0x8.
     * 
     */
    @XmlEnumValue("Native_Win9x_Driver")
    NATIVE_WIN_9_X_DRIVER("Native_Win9x_Driver"),

    /**
     * Specifies the Windows CE system with a GUI.
     * 
     */
    @XmlEnumValue("Windows_CE_GUI")
    WINDOWS_CE_GUI("Windows_CE_GUI"),

    /**
     * Specifies the Extensible Firmware Interface (EFI) application.
     * 
     */
    @XmlEnumValue("EFI_Application")
    EFI_APPLICATION("EFI_Application"),

    /**
     * Specifies the Extensible Firmware Interface (EFI) driver with boot services.
     * 
     */
    @XmlEnumValue("EFI_Boot_Service_Driver")
    EFI_BOOT_SERVICE_DRIVER("EFI_Boot_Service_Driver"),

    /**
     * Specifies the Extensible Firmware Interface (EFI) driver with run-time services.
     * 
     */
    @XmlEnumValue("EFI_Runtime_Driver")
    EFI_RUNTIME_DRIVER("EFI_Runtime_Driver"),

    /**
     * Specifies the Extensible Firmware Interface (EFI) image.
     * 
     */
    EFI_ROM("EFI_ROM"),

    /**
     * Specifies the XBOX system.
     * 
     */
    XBOX("XBOX"),

    /**
     * Specifies the Windows Boot application.
     * 
     */
    @XmlEnumValue("Windows_Boot_Application")
    WINDOWS_BOOT_APPLICATION("Windows_Boot_Application");
    private final String value;

    SubsystemTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubsystemTypeEnum fromValue(String v) {
        for (SubsystemTypeEnum c: SubsystemTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
