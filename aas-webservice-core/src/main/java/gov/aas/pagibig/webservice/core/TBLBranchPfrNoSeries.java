package gov.aas.pagibig.webservice.core;
// Generated Oct 28, 2014 10:31:41 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;

/**
 * TbGetBranchPfrnoSeries generated by hbm2java
 */
@Entity
@Table(name="tb_get_branch_pfrno_series")

@NamedQueries(@NamedQuery(query = "SELECT tbl FROM TBLBranchPfrNoSeries tbl WHERE tbl.branchCode = :branchCode", name = "TBLBranchPfrnoSeries.getBranchPfrnoSeries"))
public class TBLBranchPfrNoSeries  implements java.io.Serializable {


     private String branchCode;
     private String branchDesc;
     private String startNo;
     private String endNo;
     private String prefix;

    public TBLBranchPfrNoSeries() {
    }

    public TBLBranchPfrNoSeries(String branchCode, String branchDesc, String startNo, String endNo, String prefix) {
       this.branchCode = branchCode;
       this.branchDesc = branchDesc;
       this.startNo = startNo;
       this.endNo = endNo;
       this.prefix = prefix;
    }
   
     @Id 
    
    @Column(name="branch_code", unique=true, nullable=false, length=20)
    public String getBranchCode() {
        return this.branchCode;
    }
    
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
    
    @Column(name="branch_desc", nullable=false, length=100)
    public String getBranchDesc() {
        return this.branchDesc;
    }
    
    public void setBranchDesc(String branchDesc) {
        this.branchDesc = branchDesc;
    }
    
    @Column(name="start_no", nullable=false, length=20)
    public String getStartNo() {
        return this.startNo;
    }
    
    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }
    
    @Column(name="end_no", nullable=false, length=20)
    public String getEndNo() {
        return this.endNo;
    }
    
    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }
    
    @Column(name="prefix", nullable=false, length=10)
    public String getPrefix() {
        return this.prefix;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }




}

