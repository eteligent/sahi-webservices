//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.27 at 04:46:55 PM CST 
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
 *         &lt;element name="payor_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pfr_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="total_amt" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="generated_by" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_generated" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_paym" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="receiving_unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ofc_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "payorName",
    "pfrNo",
    "src",
    "totalAmt",
    "generatedBy",
    "dateGenerated",
    "status",
    "datePaym",
    "receivingUnit",
    "ofcNo"
})
@XmlRootElement(name = "integ_otc_update_pof_statusRequest")
public class IntegOtcUpdatePofStatusRequest {

    @XmlElement(name = "pof_no", required = true)
    protected String pofNo;
    @XmlElement(name = "payor_name", required = true)
    protected String payorName;
    @XmlElement(name = "pfr_no", required = true)
    protected String pfrNo;
    @XmlElement(required = true)
    protected String src;
    @XmlElement(name = "total_amt")
    protected float totalAmt;
    @XmlElement(name = "generated_by", required = true)
    protected String generatedBy;
    @XmlElement(name = "date_generated", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateGenerated;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "date_paym", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePaym;
    @XmlElement(name = "receiving_unit", required = true)
    protected String receivingUnit;
    @XmlElement(name = "ofc_no")
    protected int ofcNo;

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
     * Gets the value of the pfrNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfrNo() {
        return pfrNo;
    }

    /**
     * Sets the value of the pfrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfrNo(String value) {
        this.pfrNo = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     */
    public float getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     */
    public void setTotalAmt(float value) {
        this.totalAmt = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the datePaym property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePaym() {
        return datePaym;
    }

    /**
     * Sets the value of the datePaym property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePaym(XMLGregorianCalendar value) {
        this.datePaym = value;
    }

    /**
     * Gets the value of the receivingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingUnit() {
        return receivingUnit;
    }

    /**
     * Sets the value of the receivingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingUnit(String value) {
        this.receivingUnit = value;
    }

    /**
     * Gets the value of the ofcNo property.
     * 
     */
    public int getOfcNo() {
        return ofcNo;
    }

    /**
     * Sets the value of the ofcNo property.
     * 
     */
    public void setOfcNo(int value) {
        this.ofcNo = value;
    }

}
