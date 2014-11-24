package gov.aas.pagibig.webservice.core;
// Generated Nov 13, 2014 10:28:59 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TbGetBankDetails generated by hbm2java
 */
@Entity
@Table(name="tb_get_bank_details"
    ,catalog="db_integ_aas"
)
public class TbGetBankDetails  implements java.io.Serializable {


     private String bankCode;
     private String bankName;
     private String bankAbbr;

    public TbGetBankDetails() {
    }

    public TbGetBankDetails(String bankCode, String bankName, String bankAbbr) {
       this.bankCode = bankCode;
       this.bankName = bankName;
       this.bankAbbr = bankAbbr;
    }
   
     @Id 
    
    @Column(name="bank_code", unique=true, nullable=false, length=50)
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
    
    @Column(name="bank_abbr", nullable=false, length=20)
    public String getBankAbbr() {
        return this.bankAbbr;
    }
    
    public void setBankAbbr(String bankAbbr) {
        this.bankAbbr = bankAbbr;
    }




}


