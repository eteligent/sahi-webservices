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
import javax.xml.bind.annotation.XmlType;
import gov.aas.pagibig.schema.ErrorType;


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
 *         &lt;element name="account_type_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="account_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="error" type="{http://schema.pagibig.aas.gov}errorType"/>
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
    "accountTypeCode",
    "accountType",
    "amount",
    "error"
})
@XmlRootElement(name = "integ_otc_get_pof_detailResponse")
public class IntegOtcGetPofDetailResponse {

    @XmlElement(name = "pof_no", required = true)
    protected String pofNo;
    @XmlElement(name = "account_type_code", required = true)
    protected String accountTypeCode;
    @XmlElement(name = "account_type", required = true)
    protected String accountType;
    @XmlElement(required = true)
    protected String amount;
    @XmlElement(required = true)
    protected ErrorType error;

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
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}
