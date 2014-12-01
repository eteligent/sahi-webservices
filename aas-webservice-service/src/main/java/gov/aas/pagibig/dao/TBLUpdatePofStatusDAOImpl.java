package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLUpdatePofStatus;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.xml.datatype.XMLGregorianCalendar;


@Repository
@Transactional
public class TBLUpdatePofStatusDAOImpl
    implements TBLUpdatePofStatusDAO
{
    @PersistenceContext
    private EntityManager em;

    
    public void updatePOFStatus( 
  		  String pofNo, String payorName, String pfrNo, 
  		  String src, float totalAmt, String generatedBy, XMLGregorianCalendar dateGenerated, 
  		  String status, XMLGregorianCalendar datePaym, String receivingUnit, int ofcNo, 
  		  XMLGregorianCalendar pofDate, int payMode, int currencyCode)
    		   throws IntegServiceException
    {
    	if(pofNo == null || payorName == null || pfrNo == null|| 
    			src == null || totalAmt <= -1 || status == null || 
    			datePaym == null || receivingUnit == null || ofcNo <= 0 || pofDate == null || payMode <=0 || currencyCode <=0 )
    	{
    		throw new IntegServiceException("FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	else{
	    	List<TBLUpdatePofStatus> results =
	                em.createNamedQuery( "TBLUpdatePofStatus.updPOFStat" )
	                .setParameter( "pofNo", pofNo )
	                .getResultList();
		
	    	if(results.isEmpty())
	    	{
	    		TBLUpdatePofStatus updPofStat = new TBLUpdatePofStatus();
	    		updPofStat.setPofNo( pofNo);
	    		updPofStat.setPayorName( payorName);
	    		updPofStat.setPfrNo( pfrNo );
	    		updPofStat.setSrc( src );
	    		updPofStat.setTotalAmt(totalAmt);
	    		updPofStat.setGeneratedBy(generatedBy);
	    		updPofStat.setDateGenerated(dateGenerated.toGregorianCalendar().getTime() );
	    		updPofStat.setStatus(status);
	    		updPofStat.setDatePaym( datePaym.toGregorianCalendar().getTime() );
	            updPofStat.setReceivingUnit(receivingUnit);
	            updPofStat.setOfcNo(ofcNo);
	            updPofStat.setPofDate(pofDate.toGregorianCalendar().getTime() );
	            updPofStat.setPayMode(payMode);
	            updPofStat.setCurrencyCode(currencyCode);
	        	em.persist(updPofStat);
	    	}
	    	else
	    	{	
	    		throw new IntegServiceException("FAILED TO SEND REQUEST:POF NO ALREADY EXISTING!", IntegErrorCode.POF_NO_ALREADY_EXISTING);
	    	}
    	}
    }
}
