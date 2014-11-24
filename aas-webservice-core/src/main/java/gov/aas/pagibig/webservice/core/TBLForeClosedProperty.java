package gov.aas.pagibig.webservice.core;
// Generated Oct 21, 2014 9:52:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * TBLForeClosedProperty generated by hbm2java
 */
@Entity
@Table( name = "tb_validate_foreclose_paym" )
@NamedQueries( @NamedQuery( name = "TBLForeClosedProperty.getStatusByMidAndPropertyNo", query = "SELECT tbl.status FROM TBLForeClosedProperty tbl WHERE tbl.pagibigMid = :pagibigMid AND tbl.propertyNumber = :propertyNumber" ) )
public class TBLForeClosedProperty  implements java.io.Serializable {


     private String pagibigMid;
     private int status;
     private String propertyNumber;
     private Integer yearOfForClosure;

    public TBLForeClosedProperty() {
    }

	
    public TBLForeClosedProperty(String pagibigMid, int status, String propertyNumber) {
        this.pagibigMid = pagibigMid;
        this.status = status;
        this.propertyNumber = propertyNumber;
    }
    public TBLForeClosedProperty(String pagibigMid, int status, String propertyNumber, Integer yearOfForClosure) {
       this.pagibigMid = pagibigMid;
       this.status = status;
       this.propertyNumber = propertyNumber;
       this.yearOfForClosure = yearOfForClosure;
    }
   
     @Id 
    
    @Column(name="Mid", unique=true, nullable=false, length=32)
    public String getPagibigMid() {
        return this.pagibigMid;
    }
    
    public void setPagibigMid(String pagibigMid) {
        this.pagibigMid = pagibigMid;
    }
    
    @Column(name="Status", nullable=false)
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    @Column(name="Prop_No", nullable=false, length=30)
    public String getPropertyNumber() {
        return this.propertyNumber;
    }
    
    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }
    
    @Column(name="yearOfForClosure")
    public Integer getYearOfForClosure() {
        return this.yearOfForClosure;
    }
    
    public void setYearOfForClosure(Integer yearOfForClosure) {
        this.yearOfForClosure = yearOfForClosure;
    }




}


