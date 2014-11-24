package gov.aas.pagibig.webservice.core;
// Generated Oct 21, 2014 9:52:07 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbPostOtcCollections generated by hbm2java
 */
@Entity
@Table(name="tb_post_otc_collections"
    ,catalog="db_integ_aas"
)
public class TbPostOtcCollections  implements java.io.Serializable {


     private String pfrNo;
     private Date pfrDate;
     private BigDecimal amt;
     private Date date;
     private int paymMode;
     private String brCode;
     private String acctTypeCode;
     private String acctTypeDesc;
     private BigDecimal cashReceiptTotalAmt;
     private BigDecimal cashReceiptTotalAmtPesos;
     private Date glDate;
     private String receiptMethod;
     private String customerName;
     private String branch;
     private String currCode;
     private String invoiceNo;
     private String receiptPurpose;
     private String receiptDesc;
     private String checkNo;

    public TbPostOtcCollections() {
    }

    public TbPostOtcCollections(String pfrNo, Date pfrDate, BigDecimal amt, Date date, int paymMode, String brCode, String acctTypeCode, String acctTypeDesc, BigDecimal cashReceiptTotalAmt, BigDecimal cashReceiptTotalAmtPesos, Date glDate, String receiptMethod, String customerName, String branch, String currCode, String invoiceNo, String receiptPurpose, String receiptDesc, String checkNo) {
       this.pfrNo = pfrNo;
       this.pfrDate = pfrDate;
       this.amt = amt;
       this.date = date;
       this.paymMode = paymMode;
       this.brCode = brCode;
       this.acctTypeCode = acctTypeCode;
       this.acctTypeDesc = acctTypeDesc;
       this.cashReceiptTotalAmt = cashReceiptTotalAmt;
       this.cashReceiptTotalAmtPesos = cashReceiptTotalAmtPesos;
       this.glDate = glDate;
       this.receiptMethod = receiptMethod;
       this.customerName = customerName;
       this.branch = branch;
       this.currCode = currCode;
       this.invoiceNo = invoiceNo;
       this.receiptPurpose = receiptPurpose;
       this.receiptDesc = receiptDesc;
       this.checkNo = checkNo;
    }
   
     @Id 
    
    @Column(name="pfr_no", unique=true, nullable=false, length=50)
    public String getPfrNo() {
        return this.pfrNo;
    }
    
    public void setPfrNo(String pfrNo) {
        this.pfrNo = pfrNo;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="pfr_date", nullable=false, length=10)
    public Date getPfrDate() {
        return this.pfrDate;
    }
    
    public void setPfrDate(Date pfrDate) {
        this.pfrDate = pfrDate;
    }
    
    @Column(name="amt", nullable=false, precision=15)
    public BigDecimal getAmt() {
        return this.amt;
    }
    
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date", nullable=false, length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Column(name="paym_mode", nullable=false)
    public int getPaymMode() {
        return this.paymMode;
    }
    
    public void setPaymMode(int paymMode) {
        this.paymMode = paymMode;
    }
    
    @Column(name="br_code", nullable=false, length=20)
    public String getBrCode() {
        return this.brCode;
    }
    
    public void setBrCode(String brCode) {
        this.brCode = brCode;
    }
    
    @Column(name="acct_type_code", nullable=false, length=50)
    public String getAcctTypeCode() {
        return this.acctTypeCode;
    }
    
    public void setAcctTypeCode(String acctTypeCode) {
        this.acctTypeCode = acctTypeCode;
    }
    
    @Column(name="acct_type_desc", nullable=false, length=100)
    public String getAcctTypeDesc() {
        return this.acctTypeDesc;
    }
    
    public void setAcctTypeDesc(String acctTypeDesc) {
        this.acctTypeDesc = acctTypeDesc;
    }
    
    @Column(name="cash_receipt_total_amt", nullable=false, precision=15)
    public BigDecimal getCashReceiptTotalAmt() {
        return this.cashReceiptTotalAmt;
    }
    
    public void setCashReceiptTotalAmt(BigDecimal cashReceiptTotalAmt) {
        this.cashReceiptTotalAmt = cashReceiptTotalAmt;
    }
    
    @Column(name="cash_receipt_total_amt_pesos", nullable=false, precision=15)
    public BigDecimal getCashReceiptTotalAmtPesos() {
        return this.cashReceiptTotalAmtPesos;
    }
    
    public void setCashReceiptTotalAmtPesos(BigDecimal cashReceiptTotalAmtPesos) {
        this.cashReceiptTotalAmtPesos = cashReceiptTotalAmtPesos;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="gl_date", nullable=false, length=10)
    public Date getGlDate() {
        return this.glDate;
    }
    
    public void setGlDate(Date glDate) {
        this.glDate = glDate;
    }
    
    @Column(name="receipt_method", nullable=false, length=30)
    public String getReceiptMethod() {
        return this.receiptMethod;
    }
    
    public void setReceiptMethod(String receiptMethod) {
        this.receiptMethod = receiptMethod;
    }
    
    @Column(name="customer_name", nullable=false, length=30)
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Column(name="branch", nullable=false, length=30)
    public String getBranch() {
        return this.branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    @Column(name="curr_code", nullable=false, length=15)
    public String getCurrCode() {
        return this.currCode;
    }
    
    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }
    
    @Column(name="invoice_no", nullable=false, length=30)
    public String getInvoiceNo() {
        return this.invoiceNo;
    }
    
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    
    @Column(name="receipt_purpose", nullable=false, length=30)
    public String getReceiptPurpose() {
        return this.receiptPurpose;
    }
    
    public void setReceiptPurpose(String receiptPurpose) {
        this.receiptPurpose = receiptPurpose;
    }
    
    @Column(name="receipt_desc", nullable=false, length=100)
    public String getReceiptDesc() {
        return this.receiptDesc;
    }
    
    public void setReceiptDesc(String receiptDesc) {
        this.receiptDesc = receiptDesc;
    }
    
    @Column(name="check_no", nullable=false, length=50)
    public String getCheckNo() {
        return this.checkNo;
    }
    
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }




}

