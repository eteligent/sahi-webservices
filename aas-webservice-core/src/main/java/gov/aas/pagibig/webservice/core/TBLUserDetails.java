package gov.aas.pagibig.webservice.core;
// Generated Oct 24, 2014 2:13:39 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

/**
 * TBLUserDetails generated by hbm2java
 */
@Entity
@Table(name="tb_get_user_details"
    ,catalog="db_integ_aas"
)
@NamedQueries(@NamedQuery(name="TBLUserDetails.getUserDetails",query="SELECT tbl FROM TBLUserDetails tbl WHERE tbl.fname = :fname AND tbl.mname = :mname AND tbl.lname = :lname AND tbl.branch = :branch"))
public class TBLUserDetails  implements java.io.Serializable {


     private String employeeId;
     private String fname;
     private String mname;
     private String lname;
     private String branch;
     private String position;

    public TBLUserDetails() {
    }

    public TBLUserDetails(String employeeId, String fname, String mname, String lname, String branch, String position) {
       this.employeeId = employeeId;
       this.fname = fname;
       this.mname = mname;
       this.lname = lname;
       this.branch = branch;
       this.position = position;
    }
   
     @Id 
    
    @Column(name="employee_id", unique=true, nullable=false, length=50)
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @Column(name="fname", nullable=false, length=50)
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    
    @Column(name="mname", nullable=false, length=50)
    public String getMname() {
        return this.mname;
    }
    
    public void setMname(String mname) {
        this.mname = mname;
    }
    
    @Column(name="lname", nullable=false, length=50)
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    @Column(name="branch", nullable=false, length=100)
    public String getBranch() {
        return this.branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    @Column(name="position", nullable=false, length=50)
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }




}

