package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLInsertPofDetails;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@Repository
@Transactional
public class TBLGetPofDetailDAOImpl
    implements TBLGetPofDetailDAO
{
    @PersistenceContext
    private EntityManager em;
    
    @SuppressWarnings( "unchecked" )
    @Override
    public List<TBLInsertPofDetails> getPOFDetail(String pofNo)
    		   throws IntegServiceException
    {
    	if(pofNo == null)
    	{
    		throw new IntegServiceException(" 2 -FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	
    	List<TBLInsertPofDetails> results =
                em.createNamedQuery( "TBLInsertPofDetails.insertPOFDet" )
                .setParameter( "pofNo", pofNo )
                .getResultList();
	
    	if(results.isEmpty())
    	{
    		 throw new IntegServiceException( "POF : " + pofNo + " NOT FOUND ",
             		IntegErrorCode.POF_NO_NOT_FOUND );
    	}
    	else
    	{	
    		return results;
    	}
    }
}
