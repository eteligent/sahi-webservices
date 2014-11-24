//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 05:31:12 PM CST 
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
 *         &lt;element name="branch_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="branch_desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="start_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="end_no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "branchCode",
    "branchDesc",
    "startNo",
    "endNo",
    "prefix",
    "error"
})
@XmlRootElement(name = "integ_cms_get_branch_pfr_no_seriesResponse")
public class IntegCmsGetBranchPfrNoSeriesResponse {

    @XmlElement(name = "branch_code", required = true)
    protected String branchCode;
    @XmlElement(name = "branch_desc", required = true)
    protected String branchDesc;
    @XmlElement(name = "start_no")
    protected int startNo;
    @XmlElement(name = "end_no")
    protected int endNo;
    @XmlElement(required = true)
    protected String prefix;
    @XmlElement(required = true)
    protected ErrorType error;

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchDesc() {
        return branchDesc;
    }

    /**
     * Sets the value of the branchDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchDesc(String value) {
        this.branchDesc = value;
    }

    /**
     * Gets the value of the startNo property.
     * 
     */
    public int getStartNo() {
        return startNo;
    }

    /**
     * Sets the value of the startNo property.
     * 
     */
    public void setStartNo(int value) {
        this.startNo = value;
    }

    /**
     * Gets the value of the endNo property.
     * 
     */
    public int getEndNo() {
        return endNo;
    }

    /**
     * Sets the value of the endNo property.
     * 
     */
    public void setEndNo(int value) {
        this.endNo = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
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
