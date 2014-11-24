package gov.aas.pagibig.webservice.core;
// Generated Oct 21, 2014 9:52:07 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbGetDuepdcSummary generated by hbm2java
 */
@Entity
@Table(name="tb_get_duepdc_summary"
    ,catalog="db_integ_aas"
)
public class TbGetDuepdcSummary  implements java.io.Serializable {


     private String brCode;
     private Date pdcDate;
     private String payorName;
     private String payTrackNum;

    public TbGetDuepdcSummary() {
    }

	
    public TbGetDuepdcSummary(String brCode) {
        this.brCode = brCode;
    }
    public TbGetDuepdcSummary(String brCode, Date pdcDate, String payorName, String payTrackNum) {
       this.brCode = brCode;
       this.pdcDate = pdcDate;
       this.payorName = payorName;
       this.payTrackNum = payTrackNum;
    }
   
     @Id 
    
    @Column(name="br_code", unique=true, nullable=false, length=20)
    public String getBrCode() {
        return this.brCode;
    }
    
    public void setBrCode(String brCode) {
        this.brCode = brCode;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="pdc_date", length=10)
    public Date getPdcDate() {
        return this.pdcDate;
    }
    
    public void setPdcDate(Date pdcDate) {
        this.pdcDate = pdcDate;
    }
    
    @Column(name="payor_name", length=100)
    public String getPayorName() {
        return this.payorName;
    }
    
    public void setPayorName(String payorName) {
        this.payorName = payorName;
    }
    
    @Column(name="pay_track_num", length=45)
    public String getPayTrackNum() {
        return this.payTrackNum;
    }
    
    public void setPayTrackNum(String payTrackNum) {
        this.payTrackNum = payTrackNum;
    }




}


