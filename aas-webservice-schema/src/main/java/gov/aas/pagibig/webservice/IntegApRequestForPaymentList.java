//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 06:31:22 PM CST 
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
 *         &lt;element name="hdr_invoice_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdr_invoice_type_lookup_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdr_invoice_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hdr_vendor_num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdr_vendor_site_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdr_invoice_amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hdr_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdr_goods_received_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hdr_invoice_received_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hdr_gl_date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="hdr_source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_line_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dtl_line_type_lookup_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_branch_or_office" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_activity_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_cost_classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_gl_account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_future_account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_future_account2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_dr_amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dtl_reference_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_branch_or_office" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_activity_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_cost_classification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_gl_account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_future_account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_future_account2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtl_cr_amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dtl_white_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdr_curr_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payment_terms_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="branch_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transaction_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "hdrInvoiceNum",
    "hdrInvoiceTypeLookupCode",
    "hdrInvoiceDate",
    "hdrVendorNum",
    "hdrVendorSiteCode",
    "hdrInvoiceAmount",
    "hdrDescription",
    "hdrGoodsReceivedDate",
    "hdrInvoiceReceivedDate",
    "hdrGlDate",
    "hdrSource",
    "dtlLineNumber",
    "dtlAmount",
    "dtlLineTypeLookupCode",
    "dtlDrCompany",
    "dtlDrBranchOrOffice",
    "dtlDrActivityCode",
    "dtlDrCostClassification",
    "dtlDrGlAccount",
    "dtlDrFutureAccount",
    "dtlDrFutureAccount2",
    "dtlDrAmount",
    "dtlReferenceNumber",
    "dtlCrCompany",
    "dtlCrBranchOrOffice",
    "dtlCrActivityCode",
    "dtlCrCostClassification",
    "dtlCrGlAccount",
    "dtlCrFutureAccount",
    "dtlCrFutureAccount2",
    "dtlCrAmount",
    "dtlWhiteCode",
    "hdrCurrCode",
    "paymentTermsCode",
    "filename",
    "branchCode",
    "transactionId"
})
@XmlRootElement(name = "integ_ap_request_for_payment_list")
public class IntegApRequestForPaymentList {

    @XmlElement(name = "hdr_invoice_num", required = true)
    protected String hdrInvoiceNum;
    @XmlElement(name = "hdr_invoice_type_lookup_code", required = true)
    protected String hdrInvoiceTypeLookupCode;
    @XmlElement(name = "hdr_invoice_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hdrInvoiceDate;
    @XmlElement(name = "hdr_vendor_num", required = true)
    protected String hdrVendorNum;
    @XmlElement(name = "hdr_vendor_site_code", required = true)
    protected String hdrVendorSiteCode;
    @XmlElement(name = "hdr_invoice_amount")
    protected double hdrInvoiceAmount;
    @XmlElement(name = "hdr_description", required = true)
    protected String hdrDescription;
    @XmlElement(name = "hdr_goods_received_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hdrGoodsReceivedDate;
    @XmlElement(name = "hdr_invoice_received_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hdrInvoiceReceivedDate;
    @XmlElement(name = "hdr_gl_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hdrGlDate;
    @XmlElement(name = "hdr_source", required = true)
    protected String hdrSource;
    @XmlElement(name = "dtl_line_number", required = true)
    protected String dtlLineNumber;
    @XmlElement(name = "dtl_amount")
    protected double dtlAmount;
    @XmlElement(name = "dtl_line_type_lookup_code", required = true)
    protected String dtlLineTypeLookupCode;
    @XmlElement(name = "dtl_dr_company", required = true)
    protected String dtlDrCompany;
    @XmlElement(name = "dtl_dr_branch_or_office", required = true)
    protected String dtlDrBranchOrOffice;
    @XmlElement(name = "dtl_dr_activity_code", required = true)
    protected String dtlDrActivityCode;
    @XmlElement(name = "dtl_dr_cost_classification", required = true)
    protected String dtlDrCostClassification;
    @XmlElement(name = "dtl_dr_gl_account", required = true)
    protected String dtlDrGlAccount;
    @XmlElement(name = "dtl_dr_future_account", required = true)
    protected String dtlDrFutureAccount;
    @XmlElement(name = "dtl_dr_future_account2", required = true)
    protected String dtlDrFutureAccount2;
    @XmlElement(name = "dtl_dr_amount")
    protected double dtlDrAmount;
    @XmlElement(name = "dtl_reference_number", required = true)
    protected String dtlReferenceNumber;
    @XmlElement(name = "dtl_cr_company", required = true)
    protected String dtlCrCompany;
    @XmlElement(name = "dtl_cr_branch_or_office", required = true)
    protected String dtlCrBranchOrOffice;
    @XmlElement(name = "dtl_cr_activity_code", required = true)
    protected String dtlCrActivityCode;
    @XmlElement(name = "dtl_cr_cost_classification", required = true)
    protected String dtlCrCostClassification;
    @XmlElement(name = "dtl_cr_gl_account", required = true)
    protected String dtlCrGlAccount;
    @XmlElement(name = "dtl_cr_future_account", required = true)
    protected String dtlCrFutureAccount;
    @XmlElement(name = "dtl_cr_future_account2", required = true)
    protected String dtlCrFutureAccount2;
    @XmlElement(name = "dtl_cr_amount", required = true)
    protected BigDecimal dtlCrAmount;
    @XmlElement(name = "dtl_white_code", required = true)
    protected String dtlWhiteCode;
    @XmlElement(name = "hdr_curr_code", required = true)
    protected String hdrCurrCode;
    @XmlElement(name = "payment_terms_code", required = true)
    protected String paymentTermsCode;
    @XmlElement(required = true)
    protected String filename;
    @XmlElement(name = "branch_code", required = true)
    protected String branchCode;
    @XmlElement(name = "transaction_id", required = true)
    protected String transactionId;

    /**
     * Gets the value of the hdrInvoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrInvoiceNum() {
        return hdrInvoiceNum;
    }

    /**
     * Sets the value of the hdrInvoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrInvoiceNum(String value) {
        this.hdrInvoiceNum = value;
    }

    /**
     * Gets the value of the hdrInvoiceTypeLookupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrInvoiceTypeLookupCode() {
        return hdrInvoiceTypeLookupCode;
    }

    /**
     * Sets the value of the hdrInvoiceTypeLookupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrInvoiceTypeLookupCode(String value) {
        this.hdrInvoiceTypeLookupCode = value;
    }

    /**
     * Gets the value of the hdrInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHdrInvoiceDate() {
        return hdrInvoiceDate;
    }

    /**
     * Sets the value of the hdrInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHdrInvoiceDate(XMLGregorianCalendar value) {
        this.hdrInvoiceDate = value;
    }

    /**
     * Gets the value of the hdrVendorNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrVendorNum() {
        return hdrVendorNum;
    }

    /**
     * Sets the value of the hdrVendorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrVendorNum(String value) {
        this.hdrVendorNum = value;
    }

    /**
     * Gets the value of the hdrVendorSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrVendorSiteCode() {
        return hdrVendorSiteCode;
    }

    /**
     * Sets the value of the hdrVendorSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrVendorSiteCode(String value) {
        this.hdrVendorSiteCode = value;
    }

    /**
     * Gets the value of the hdrInvoiceAmount property.
     * 
     */
    public double getHdrInvoiceAmount() {
        return hdrInvoiceAmount;
    }

    /**
     * Sets the value of the hdrInvoiceAmount property.
     * 
     */
    public void setHdrInvoiceAmount(double value) {
        this.hdrInvoiceAmount = value;
    }

    /**
     * Gets the value of the hdrDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrDescription() {
        return hdrDescription;
    }

    /**
     * Sets the value of the hdrDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrDescription(String value) {
        this.hdrDescription = value;
    }

    /**
     * Gets the value of the hdrGoodsReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHdrGoodsReceivedDate() {
        return hdrGoodsReceivedDate;
    }

    /**
     * Sets the value of the hdrGoodsReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHdrGoodsReceivedDate(XMLGregorianCalendar value) {
        this.hdrGoodsReceivedDate = value;
    }

    /**
     * Gets the value of the hdrInvoiceReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHdrInvoiceReceivedDate() {
        return hdrInvoiceReceivedDate;
    }

    /**
     * Sets the value of the hdrInvoiceReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHdrInvoiceReceivedDate(XMLGregorianCalendar value) {
        this.hdrInvoiceReceivedDate = value;
    }

    /**
     * Gets the value of the hdrGlDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHdrGlDate() {
        return hdrGlDate;
    }

    /**
     * Sets the value of the hdrGlDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHdrGlDate(XMLGregorianCalendar value) {
        this.hdrGlDate = value;
    }

    /**
     * Gets the value of the hdrSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrSource() {
        return hdrSource;
    }

    /**
     * Sets the value of the hdrSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrSource(String value) {
        this.hdrSource = value;
    }

    /**
     * Gets the value of the dtlLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlLineNumber() {
        return dtlLineNumber;
    }

    /**
     * Sets the value of the dtlLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlLineNumber(String value) {
        this.dtlLineNumber = value;
    }

    /**
     * Gets the value of the dtlAmount property.
     * 
     */
    public double getDtlAmount() {
        return dtlAmount;
    }

    /**
     * Sets the value of the dtlAmount property.
     * 
     */
    public void setDtlAmount(double value) {
        this.dtlAmount = value;
    }

    /**
     * Gets the value of the dtlLineTypeLookupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlLineTypeLookupCode() {
        return dtlLineTypeLookupCode;
    }

    /**
     * Sets the value of the dtlLineTypeLookupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlLineTypeLookupCode(String value) {
        this.dtlLineTypeLookupCode = value;
    }

    /**
     * Gets the value of the dtlDrCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrCompany() {
        return dtlDrCompany;
    }

    /**
     * Sets the value of the dtlDrCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrCompany(String value) {
        this.dtlDrCompany = value;
    }

    /**
     * Gets the value of the dtlDrBranchOrOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrBranchOrOffice() {
        return dtlDrBranchOrOffice;
    }

    /**
     * Sets the value of the dtlDrBranchOrOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrBranchOrOffice(String value) {
        this.dtlDrBranchOrOffice = value;
    }

    /**
     * Gets the value of the dtlDrActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrActivityCode() {
        return dtlDrActivityCode;
    }

    /**
     * Sets the value of the dtlDrActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrActivityCode(String value) {
        this.dtlDrActivityCode = value;
    }

    /**
     * Gets the value of the dtlDrCostClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrCostClassification() {
        return dtlDrCostClassification;
    }

    /**
     * Sets the value of the dtlDrCostClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrCostClassification(String value) {
        this.dtlDrCostClassification = value;
    }

    /**
     * Gets the value of the dtlDrGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrGlAccount() {
        return dtlDrGlAccount;
    }

    /**
     * Sets the value of the dtlDrGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrGlAccount(String value) {
        this.dtlDrGlAccount = value;
    }

    /**
     * Gets the value of the dtlDrFutureAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrFutureAccount() {
        return dtlDrFutureAccount;
    }

    /**
     * Sets the value of the dtlDrFutureAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrFutureAccount(String value) {
        this.dtlDrFutureAccount = value;
    }

    /**
     * Gets the value of the dtlDrFutureAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlDrFutureAccount2() {
        return dtlDrFutureAccount2;
    }

    /**
     * Sets the value of the dtlDrFutureAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlDrFutureAccount2(String value) {
        this.dtlDrFutureAccount2 = value;
    }

    /**
     * Gets the value of the dtlDrAmount property.
     * 
     */
    public double getDtlDrAmount() {
        return dtlDrAmount;
    }

    /**
     * Sets the value of the dtlDrAmount property.
     * 
     */
    public void setDtlDrAmount(double value) {
        this.dtlDrAmount = value;
    }

    /**
     * Gets the value of the dtlReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlReferenceNumber() {
        return dtlReferenceNumber;
    }

    /**
     * Sets the value of the dtlReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlReferenceNumber(String value) {
        this.dtlReferenceNumber = value;
    }

    /**
     * Gets the value of the dtlCrCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrCompany() {
        return dtlCrCompany;
    }

    /**
     * Sets the value of the dtlCrCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrCompany(String value) {
        this.dtlCrCompany = value;
    }

    /**
     * Gets the value of the dtlCrBranchOrOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrBranchOrOffice() {
        return dtlCrBranchOrOffice;
    }

    /**
     * Sets the value of the dtlCrBranchOrOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrBranchOrOffice(String value) {
        this.dtlCrBranchOrOffice = value;
    }

    /**
     * Gets the value of the dtlCrActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrActivityCode() {
        return dtlCrActivityCode;
    }

    /**
     * Sets the value of the dtlCrActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrActivityCode(String value) {
        this.dtlCrActivityCode = value;
    }

    /**
     * Gets the value of the dtlCrCostClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrCostClassification() {
        return dtlCrCostClassification;
    }

    /**
     * Sets the value of the dtlCrCostClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrCostClassification(String value) {
        this.dtlCrCostClassification = value;
    }

    /**
     * Gets the value of the dtlCrGlAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrGlAccount() {
        return dtlCrGlAccount;
    }

    /**
     * Sets the value of the dtlCrGlAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrGlAccount(String value) {
        this.dtlCrGlAccount = value;
    }

    /**
     * Gets the value of the dtlCrFutureAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrFutureAccount() {
        return dtlCrFutureAccount;
    }

    /**
     * Sets the value of the dtlCrFutureAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrFutureAccount(String value) {
        this.dtlCrFutureAccount = value;
    }

    /**
     * Gets the value of the dtlCrFutureAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlCrFutureAccount2() {
        return dtlCrFutureAccount2;
    }

    /**
     * Sets the value of the dtlCrFutureAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlCrFutureAccount2(String value) {
        this.dtlCrFutureAccount2 = value;
    }

    /**
     * Gets the value of the dtlCrAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDtlCrAmount() {
        return dtlCrAmount;
    }

    /**
     * Sets the value of the dtlCrAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDtlCrAmount(BigDecimal value) {
        this.dtlCrAmount = value;
    }

    /**
     * Gets the value of the dtlWhiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtlWhiteCode() {
        return dtlWhiteCode;
    }

    /**
     * Sets the value of the dtlWhiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtlWhiteCode(String value) {
        this.dtlWhiteCode = value;
    }

    /**
     * Gets the value of the hdrCurrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdrCurrCode() {
        return hdrCurrCode;
    }

    /**
     * Sets the value of the hdrCurrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdrCurrCode(String value) {
        this.hdrCurrCode = value;
    }

    /**
     * Gets the value of the paymentTermsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTermsCode() {
        return paymentTermsCode;
    }

    /**
     * Sets the value of the paymentTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTermsCode(String value) {
        this.paymentTermsCode = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

}
