//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 03:06:51 PM CST 
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
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdc_ref_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generated_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_generated" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "pdcRefNo",
    "payorId",
    "payorName",
    "generatedBy",
    "dateGenerated",
    "status"
})
@XmlRootElement(name = "integ_otc_post_pdcpaym_statusRequest")
public class IntegOtcPostPdcpaymStatusRequest {

    @XmlElement(name = "source_sys_id", required = true)
    protected String sourceSysId;
    @XmlElement(name = "user_name", required = true)
    protected String userName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "pdc_ref_no", required = true)
    protected String pdcRefNo;
    @XmlElement(name = "payor_id", required = true)
    protected String payorId;
    @XmlElement(name = "payor_name", required = true)
    protected String payorName;
    @XmlElement(name = "generated_by", required = true)
    protected String generatedBy;
    @XmlElement(name = "date_generated", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateGenerated;
    protected int status;

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
     * Gets the value of the pdcRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdcRefNo() {
        return pdcRefNo;
    }

    /**
     * Sets the value of the pdcRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdcRefNo(String value) {
        this.pdcRefNo = value;
    }

    /**
     * Gets the value of the payorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorId() {
        return payorId;
    }

    /**
     * Sets the value of the payorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorId(String value) {
        this.payorId = value;
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
     * Gets the value of the generatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedBy() {
        return generatedBy;
    }

    /**
     * Sets the value of the generatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedBy(String value) {
        this.generatedBy = value;
    }

    /**
     * Gets the value of the dateGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateGenerated() {
        return dateGenerated;
    }

    /**
     * Sets the value of the dateGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateGenerated(XMLGregorianCalendar value) {
        this.dateGenerated = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
