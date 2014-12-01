package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLInsertPofDetails;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;

@Repository
@Transactional
public class TBLInsertPofDetailsDAOImpl
    implements TBLInsertPofDetailsDAO
{
    @PersistenceContext
    private EntityManager em;

    public void insertPOFDetail( String pofNo,String accountTypeCode,String accountType, BigDecimal amount)
    		   throws IntegServiceException
    {
    	if(pofNo == null || pofNo == " " || pofNo == "?" || accountTypeCode == null || accountTypeCode == " " || accountTypeCode == "?" || accountType == null || accountType == "" || accountType == "?" || amount == null || amount == BigDecimal.ZERO)
    	{
    		throw new IntegServiceException(" 2 -FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	

    		TBLInsertPofDetails insertPofDet = new TBLInsertPofDetails();
    		insertPofDet.setPofNo( pofNo);
    		insertPofDet.setAccountTypeCode( accountTypeCode);
    		insertPofDet.setAccountType( accountType);
    		insertPofDet.setAmount( amount);
           	
        	em.persist( insertPofDet );
    	
    }
}
