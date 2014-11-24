//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.21 at 09:21:48 PM CST 
//


package gov.aas.pagibig.webservice;

import java.math.BigDecimal;
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
 *         &lt;element name="pay_track_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pdc_ref_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payor_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amt_for_payment" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="paym_mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bank_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bank_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="check_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="check_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "payTrackNum",
    "pdcRefNo",
    "payorId",
    "payorName",
    "payorAddress",
    "payorType",
    "amtForPayment",
    "paymMode",
    "bankCode",
    "bankName",
    "checkNo",
    "checkDate"
})
@XmlRootElement(name = "integ_cms_get_due_pdc_summary_response_list")
public class IntegCmsGetDuePdcSummaryResponseList {

    @XmlElement(name = "pay_track_num", required = true)
    protected String payTrackNum;
    @XmlElement(name = "pdc_ref_no", required = true)
    protected String pdcRefNo;
    @XmlElement(name = "payor_id", required = true)
    protected String payorId;
    @XmlElement(name = "payor_name", required = true)
    protected String payorName;
    @XmlElement(name = "payor_address", required = true)
    protected String payorAddress;
    @XmlElement(name = "payor_type", required = true)
    protected String payorType;
    @XmlElement(name = "amt_for_payment", required = true)
    protected BigDecimal amtForPayment;
    @XmlElement(name = "paym_mode", required = true)
    protected String paymMode;
    @XmlElement(name = "bank_code", required = true)
    protected String bankCode;
    @XmlElement(name = "bank_name", required = true)
    protected String bankName;
    @XmlElement(name = "check_no", required = true)
    protected String checkNo;
    @XmlElement(name = "check_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkDate;

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
     * Gets the value of the payorAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorAddress() {
        return payorAddress;
    }

    /**
     * Sets the value of the payorAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorAddress(String value) {
        this.payorAddress = value;
    }

    /**
     * Gets the value of the payorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorType() {
        return payorType;
    }

    /**
     * Sets the value of the payorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorType(String value) {
        this.payorType = value;
    }

    /**
     * Gets the value of the amtForPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtForPayment() {
        return amtForPayment;
    }

    /**
     * Sets the value of the amtForPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtForPayment(BigDecimal value) {
        this.amtForPayment = value;
    }

    /**
     * Gets the value of the paymMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymMode() {
        return paymMode;
    }

    /**
     * Sets the value of the paymMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymMode(String value) {
        this.paymMode = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the checkNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * Sets the value of the checkNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNo(String value) {
        this.checkNo = value;
    }

    /**
     * Gets the value of the checkDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckDate() {
        return checkDate;
    }

    /**
     * Sets the value of the checkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckDate(XMLGregorianCalendar value) {
        this.checkDate = value;
    }

}
