package gov.aas.pagibig.webservice.core;
// Generated Nov 13, 2014 10:28:59 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbGetPtnValuedatedTrans generated by hbm2java
 */
@Entity
@Table(name="tb_get_ptn_valuedated_trans"
    ,catalog="db_integ_aas"
)
public class TbGetPtnValuedatedTrans  implements java.io.Serializable {


     private String payTrackNum;
     private String payorName;
     private String brCode;
     private Date sysDate;
     private String payorId;
     private String payorAddress;
     private String payorType;
     private BigDecimal amtForPayment;
     private int paymMode;
     private int currCode;
     private String bankCode;
     private String bankName;
     private String checkNo;
     private Date checkDate;
     private String checkType;
     private String origPtnNum;

    public TbGetPtnValuedatedTrans() {
    }

    public TbGetPtnValuedatedTrans(String payTrackNum, String payorName, String brCode, Date sysDate, String payorId, String payorAddress, String payorType, BigDecimal amtForPayment, int paymMode, int currCode, String bankCode, String bankName, String checkNo, Date checkDate, String checkType, String origPtnNum) {
       this.payTrackNum = payTrackNum;
       this.payorName = payorName;
       this.brCode = brCode;
       this.sysDate = sysDate;
       this.payorId = payorId;
       this.payorAddress = payorAddress;
       this.payorType = payorType;
       this.amtForPayment = amtForPayment;
       this.paymMode = paymMode;
       this.currCode = currCode;
       this.bankCode = bankCode;
       this.bankName = bankName;
       this.checkNo = checkNo;
       this.checkDate = checkDate;
       this.checkType = checkType;
       this.origPtnNum = origPtnNum;
    }
   
     @Id 
    
    @Column(name="pay_track_num", unique=true, nullable=false, length=50)
    public String getPayTrackNum() {
        return this.payTrackNum;
    }
    
    public void setPayTrackNum(String payTrackNum) {
        this.payTrackNum = payTrackNum;
    }
    
    @Column(name="payor_name", nullable=false, length=100)
    public String getPayorName() {
        return this.payorName;
    }
    
    public void setPayorName(String payorName) {
        this.payorName = payorName;
    }
    
    @Column(name="br_code", nullable=false, length=20)
    public String getBrCode() {
        return this.brCode;
    }
    
    public void setBrCode(String brCode) {
        this.brCode = brCode;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="sys_date", nullable=false, length=10)
    public Date getSysDate() {
        return this.sysDate;
    }
    
    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }
    
    @Column(name="payor_id", nullable=false, length=50)
    public String getPayorId() {
        return this.payorId;
    }
    
    public void setPayorId(String payorId) {
        this.payorId = payorId;
    }
    
    @Column(name="payor_address", nullable=false, length=200)
    public String getPayorAddress() {
        return this.payorAddress;
    }
    
    public void setPayorAddress(String payorAddress) {
        this.payorAddress = payorAddress;
    }
    
    @Column(name="payor_type", nullable=false, length=100)
    public String getPayorType() {
        return this.payorType;
    }
    
    public void setPayorType(String payorType) {
        this.payorType = payorType;
    }
    
    @Column(name="amt_for_payment", nullable=false, precision=20)
    public BigDecimal getAmtForPayment() {
        return this.amtForPayment;
    }
    
    public void setAmtForPayment(BigDecimal amtForPayment) {
        this.amtForPayment = amtForPayment;
    }
    
    @Column(name="paym_mode", nullable=false)
    public int getPaymMode() {
        return this.paymMode;
    }
    
    public void setPaymMode(int paymMode) {
        this.paymMode = paymMode;
    }
    
    @Column(name="curr_code", nullable=false)
    public int getCurrCode() {
        return this.currCode;
    }
    
    public void setCurrCode(int currCode) {
        this.currCode = currCode;
    }
    
    @Column(name="bank_code", nullable=false, length=50)
    public String getBankCode() {
        return this.bankCode;
    }
    
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
    
    @Column(name="bank_name", nullable=false, length=100)
    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    @Column(name="check_no", nullable=false, length=50)
    public String getCheckNo() {
        return this.checkNo;
    }
    
    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="check_date", nullable=false, length=10)
    public Date getCheckDate() {
        return this.checkDate;
    }
    
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }
    
    @Column(name="check_type", nullable=false, length=50)
    public String getCheckType() {
        return this.checkType;
    }
    
    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }
    
    @Column(name="orig_ptn_num", nullable=false, length=50)
    public String getOrigPtnNum() {
        return this.origPtnNum;
    }
    
    public void setOrigPtnNum(String origPtnNum) {
        this.origPtnNum = origPtnNum;
    }




}


