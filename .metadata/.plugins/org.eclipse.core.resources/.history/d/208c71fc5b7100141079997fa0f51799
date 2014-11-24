package gov.aas.pagibig.webservice.core;
// Generated Oct 21, 2014 9:52:07 AM by Hibernate Tools 3.2.2.GA

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="tb_post_pdcpaym_status"
    , uniqueConstraints = @UniqueConstraint(columnNames="pdc_ref_no") 
)
@NamedQueries( @NamedQuery( name = "TBLPostPdcpaymStatus.setStatus", query = "SELECT tbl FROM TBLPostPdcpaymStatus tbl WHERE tbl.pdcRefNo = :pdcRefNo AND tbl.payorId = :payorId" )
)

public class TBLPostPdcpaymStatus  implements java.io.Serializable {


     private String pdcRefNo;
     private String payorId;
     private String generatedBy;
     private Date dateGenerated;
     private String transRefNum;
     private String payorName;
     private int status;
     private int transStatus;

    public TBLPostPdcpaymStatus() {
    }

	
    public TBLPostPdcpaymStatus(String pdcRefNo, String payorId, String transRefNum, int status, int transStatus) {
        this.pdcRefNo = pdcRefNo;
        this.payorId = payorId;
        this.transRefNum = transRefNum;
        this.status = status;
        this.transStatus = transStatus;
    }
    public TBLPostPdcpaymStatus(String pdcRefNo, String payorId, String generatedBy, Date dateGenerated, String transRefNum, String payorName, int status, int transStatus) {
       this.pdcRefNo = pdcRefNo;
       this.payorId = payorId;
       this.generatedBy = generatedBy;
       this.dateGenerated = dateGenerated;
       this.transRefNum = transRefNum;
       this.payorName = payorName;
       this.status = status;
       this.transStatus = transStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="pdc_ref_no", unique=true, nullable=false, length=50)
    public String getPdcRefNo() {
        return this.pdcRefNo;
    }
    
    public void setPdcRefNo(String pdcRefNo) {
        this.pdcRefNo = pdcRefNo;
    }
    
    @Column(name="payor_id", nullable=false, length=50)
    public String getPayorId() {
        return this.payorId;
    }
    
    public void setPayorId(String payorId) {
        this.payorId = payorId;
    }
    
    @Column(name="generated_by", length=50)
    public String getGeneratedBy() {
        return this.generatedBy;
    }
    
    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date_generated", length=10)
    public Date getDateGenerated() {
        return this.dateGenerated;
    }
    
    public void setDateGenerated(Date dateGenerated) {
        this.dateGenerated = dateGenerated;
    }
    
    @Column(name="trans_ref_num", nullable=false, length=50)
    public String getTransRefNum() {
        return this.transRefNum;
    }
    
    public void setTransRefNum(String transRefNum) {
        this.transRefNum = transRefNum;
    }
    
    @Column(name="payor_name", length=50)
    public String getPayorName() {
        return this.payorName;
    }
    
    public void setPayorName(String payorName) {
        this.payorName = payorName;
    }
    
    @Column(name="status", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    @Column(name="trans_status", nullable=false)
    public int getTransStatus() {
        return this.transStatus;
    }
    
    public void setTransStatus(int transStatus) {
        this.transStatus = transStatus;
    }




}


