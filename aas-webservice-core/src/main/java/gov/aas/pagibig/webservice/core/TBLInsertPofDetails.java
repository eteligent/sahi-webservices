package gov.aas.pagibig.webservice.core;
// Generated Oct 21, 2014 9:52:07 AM by Hibernate Tools 3.2.2.GA

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="tb_insert_pof_details"
    , uniqueConstraints = @UniqueConstraint(columnNames="pof_no") 
)
@NamedQueries( @NamedQuery( name = "TBLInsertPofDetails.insertPOFDet", query = "SELECT tbl FROM TBLInsertPofDetails tbl WHERE tbl.pofNo = :pofNo" )
)

public class TBLInsertPofDetails  implements java.io.Serializable {


    private Integer id;
    private String pofNo;
    private String accountTypeCode;
    private String accountType;
    private BigDecimal amount;

   public TBLInsertPofDetails() {
   }

   public TBLInsertPofDetails(String pofNo, String accountTypeCode, String accountType, BigDecimal amount) {
      this.pofNo = pofNo;
      this.accountTypeCode = accountTypeCode;
      this.accountType = accountType;
      this.amount = amount;
   }
  
   /* for mysql @Id @GeneratedValue(strategy=IDENTITY)
   
   @Column(name="id", unique=true, nullable=false)*/
   
   @Id
   @Column(name = "ID")
   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
   @SequenceGenerator(name = "id_Sequence", sequenceName = "sq_pof_id")
   public Integer getId() {
       return this.id;
   }
   
   public void setId(Integer id) {
       this.id = id;
   }
   
   @Column(name="pof_no", nullable=false, length=50)
   public String getPofNo() {
       return this.pofNo;
   }
   
   public void setPofNo(String pofNo) {
       this.pofNo = pofNo;
   }
   
   @Column(name="account_type_code", nullable=false, length=50)
   public String getAccountTypeCode() {
       return this.accountTypeCode;
   }
   
   public void setAccountTypeCode(String accountTypeCode) {
       this.accountTypeCode = accountTypeCode;
   }
   
   @Column(name="account_type", nullable=false, length=200)
   public String getAccountType() {
       return this.accountType;
   }
   
   public void setAccountType(String accountType) {
       this.accountType = accountType;
   }
   
   @Column(name="amount", nullable=false, precision=20)
   public BigDecimal getAmount() {
       return this.amount;
   }
   
   public void setAmount(BigDecimal amount) {
       this.amount = amount;
   }




}


