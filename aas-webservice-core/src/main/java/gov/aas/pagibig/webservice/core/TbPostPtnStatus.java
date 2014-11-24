package gov.aas.pagibig.webservice.core;
// Generated Nov 13, 2014 10:28:59 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbPostPtnStatus generated by hbm2java
 */
@Entity
@Table(name="tb_post_ptn_status"
    ,catalog="db_integ_aas"
)
public class TbPostPtnStatus  implements java.io.Serializable {


     private String paymTrackNum;
     private String pfrNum;
     private String generatedBy;
     private Date dateGenerated;
     private int status;

    public TbPostPtnStatus() {
    }

    public TbPostPtnStatus(String paymTrackNum, String pfrNum, String generatedBy, Date dateGenerated, int status) {
       this.paymTrackNum = paymTrackNum;
       this.pfrNum = pfrNum;
       this.generatedBy = generatedBy;
       this.dateGenerated = dateGenerated;
       this.status = status;
    }
   
     @Id 
    
    @Column(name="paym_track_num", unique=true, nullable=false, length=32)
    public String getPaymTrackNum() {
        return this.paymTrackNum;
    }
    
    public void setPaymTrackNum(String paymTrackNum) {
        this.paymTrackNum = paymTrackNum;
    }
    
    @Column(name="pfr_num", nullable=false, length=100)
    public String getPfrNum() {
        return this.pfrNum;
    }
    
    public void setPfrNum(String pfrNum) {
        this.pfrNum = pfrNum;
    }
    
    @Column(name="generated_by", nullable=false, length=100)
    public String getGeneratedBy() {
        return this.generatedBy;
    }
    
    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date_generated", nullable=false, length=10)
    public Date getDateGenerated() {
        return this.dateGenerated;
    }
    
    public void setDateGenerated(Date dateGenerated) {
        this.dateGenerated = dateGenerated;
    }
    
    @Column(name="status", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }




}

