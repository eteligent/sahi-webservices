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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Paytracknum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payorid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payorname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payoraddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payortype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Paymmode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Currcode" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "paytracknum",
    "payorid",
    "payorname",
    "payoraddress",
    "payortype",
    "paymmode",
    "currcode"
})
@XmlRootElement(name = "integ_pfm_get_ptn_info_response_list")
public class IntegPfmGetPtnInfoResponseList {

    @XmlElement(name = "Paytracknum", required = true)
    protected String paytracknum;
    @XmlElement(name = "Payorid", required = true)
    protected String payorid;
    @XmlElement(name = "Payorname", required = true)
    protected String payorname;
    @XmlElement(name = "Payoraddress", required = true)
    protected String payoraddress;
    @XmlElement(name = "Payortype", required = true)
    protected String payortype;
    @XmlElement(name = "Paymmode")
    protected int paymmode;
    @XmlElement(name = "Currcode")
    protected int currcode;

    /**
     * Gets the value of the paytracknum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaytracknum() {
        return paytracknum;
    }

    /**
     * Sets the value of the paytracknum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaytracknum(String value) {
        this.paytracknum = value;
    }

    /**
     * Gets the value of the payorid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorid() {
        return payorid;
    }

    /**
     * Sets the value of the payorid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorid(String value) {
        this.payorid = value;
    }

    /**
     * Gets the value of the payorname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayorname() {
        return payorname;
    }

    /**
     * Sets the value of the payorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayorname(String value) {
        this.payorname = value;
    }

    /**
     * Gets the value of the payoraddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoraddress() {
        return payoraddress;
    }

    /**
     * Sets the value of the payoraddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoraddress(String value) {
        this.payoraddress = value;
    }

    /**
     * Gets the value of the payortype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayortype() {
        return payortype;
    }

    /**
     * Sets the value of the payortype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayortype(String value) {
        this.payortype = value;
    }

    /**
     * Gets the value of the paymmode property.
     * 
     */
    public int getPaymmode() {
        return paymmode;
    }

    /**
     * Sets the value of the paymmode property.
     * 
     */
    public void setPaymmode(int value) {
        this.paymmode = value;
    }

    /**
     * Gets the value of the currcode property.
     * 
     */
    public int getCurrcode() {
        return currcode;
    }

    /**
     * Sets the value of the currcode property.
     * 
     */
    public void setCurrcode(int value) {
        this.currcode = value;
    }

}
