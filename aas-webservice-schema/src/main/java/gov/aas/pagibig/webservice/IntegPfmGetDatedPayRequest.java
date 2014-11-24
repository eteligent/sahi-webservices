//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 06:31:22 PM CST 
//


package gov.aas.pagibig.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source_sys_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pay_track_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="br_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sys_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sourceSysId",
    "userName",
    "password",
    "payTrackNum",
    "payorName",
    "brCode",
    "sysDate"
})
@XmlRootElement(name = "integ_pfm_get_dated_payRequest")
public class IntegPfmGetDatedPayRequest {

    @XmlElement(name = "source_sys_id", required = true)
    protected String sourceSysId;
    @XmlElement(name = "user_name", required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(name = "pay_track_num", required = true)
    protected String payTrackNum;
    @XmlElement(name = "payor_name", required = true)
    protected String payorName;
    @XmlElement(name = "br_code", required = true)
    protected String brCode;
    @XmlElement(name = "sys_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDate;

    /**
     * Gets the value of the sourceSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSysId() {
        return sourceSysId;
    }

    /**
     * Sets the value of the sourceSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSysId(String value) {
        this.sourceSysId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the payTrackNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayTrackNum() {
        return payTrackNum;
    }

    /**
     * Sets the value of the payTrackNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayTrackNum(String value) {
        this.payTrackNum = value;
    }

    /**
     * Gets the value of the payorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorName() {
        return payorName;
    }

    /**
     * Sets the value of the payorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorName(String value) {
        this.payorName = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrCode(String value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the sysDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysDate() {
        return sysDate;
    }

    /**
     * Sets the value of the sysDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSysDate(XMLGregorianCalendar value) {
        this.sysDate = value;
    }

}
