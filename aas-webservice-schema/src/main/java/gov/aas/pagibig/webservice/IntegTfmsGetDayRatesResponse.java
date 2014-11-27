//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.27 at 04:46:55 PM CST 
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
 *         &lt;element name="Currentbrdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Currencycode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Currencydate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Rates" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "currentbrdate",
    "currencycode",
    "currencydate",
    "rates",
    "error"
})
@XmlRootElement(name = "integ_tfms_get_day_rates_Response")
public class IntegTfmsGetDayRatesResponse {

    @XmlElement(name = "Currentbrdate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentbrdate;
    @XmlElement(name = "Currencycode")
    protected int currencycode;
    @XmlElement(name = "Currencydate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currencydate;
    @XmlElement(name = "Rates", required = true)
    protected BigDecimal rates;
    @XmlElement(required = true)
    protected ErrorType error;

    /**
     * Gets the value of the currentbrdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentbrdate() {
        return currentbrdate;
    }

    /**
     * Sets the value of the currentbrdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentbrdate(XMLGregorianCalendar value) {
        this.currentbrdate = value;
    }

    /**
     * Gets the value of the currencycode property.
     * 
     */
    public int getCurrencycode() {
        return currencycode;
    }

    /**
     * Sets the value of the currencycode property.
     * 
     */
    public void setCurrencycode(int value) {
        this.currencycode = value;
    }

    /**
     * Gets the value of the currencydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrencydate() {
        return currencydate;
    }

    /**
     * Sets the value of the currencydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrencydate(XMLGregorianCalendar value) {
        this.currencydate = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRates(BigDecimal value) {
        this.rates = value;
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
