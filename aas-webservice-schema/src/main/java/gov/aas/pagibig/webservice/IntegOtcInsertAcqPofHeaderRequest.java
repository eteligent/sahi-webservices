//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 04:14:11 PM CST 
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
 *         &lt;element name="pof_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pof_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="payor_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pay_mode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currency_code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pofNo",
    "pofDate",
    "payorName",
    "payMode",
    "currencyCode",
    "userId"
})
@XmlRootElement(name = "integ_otc_insert_acq_pof_headerRequest")
public class IntegOtcInsertAcqPofHeaderRequest {

    @XmlElement(name = "pof_no", required = true)
    protected String pofNo;
    @XmlElement(name = "pof_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pofDate;
    @XmlElement(name = "payor_name", required = true)
    protected String payorName;
    @XmlElement(name = "pay_mode")
    protected int payMode;
    @XmlElement(name = "currency_code")
    protected int currencyCode;
    @XmlElement(name = "user_id", required = true)
    protected String userId;

    /**
     * Gets the value of the pofNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPofNo() {
        return pofNo;
    }

    /**
     * Sets the value of the pofNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPofNo(String value) {
        this.pofNo = value;
    }

    /**
     * Gets the value of the pofDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPofDate() {
        return pofDate;
    }

    /**
     * Sets the value of the pofDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPofDate(XMLGregorianCalendar value) {
        this.pofDate = value;
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
     * Gets the value of the payMode property.
     * 
     */
    public int getPayMode() {
        return payMode;
    }

    /**
     * Sets the value of the payMode property.
     * 
     */
    public void setPayMode(int value) {
        this.payMode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     */
    public int getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     */
    public void setCurrencyCode(int value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
