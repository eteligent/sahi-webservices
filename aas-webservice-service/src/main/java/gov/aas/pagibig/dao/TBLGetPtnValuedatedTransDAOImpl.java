package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLGetPtnValuedatedTrans;
import java.util.Date;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public class TBLGetPtnValuedatedTransDAOImpl
    implements TBLGetPtnValuedatedTransDAO
{
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings( "unchecked" )
    @Override
    public TBLGetPtnValuedatedTrans getPtnVal( String payTrackNum, String payorName, String brCode, XMLGregorianCalendar sysDate)
     throws IntegServiceException
    {
    	
    	
    	if( payTrackNum == null || payorName == null || brCode == null || sysDate == null){
    		
    		  throw new IntegServiceException( "Request detail(s) is incorrect or incomplete",
    				  IntegErrorCode.PAYMENT_TRACK_NUM_NOT_FOUND );
    	}
        // we call merge to update existing entity, entitymanager can figure out how to properly update.
        // this api returns the newly managed entity - jowel
        List<TBLGetPtnValuedatedTrans> results =
            em.createNamedQuery( "TBLGetPtnValuedatedTrans.getValueDetails" )
            .setParameter( "payTrackNum", payTrackNum )
            .setParameter( "payorName", payorName )
            .setParameter( "brCode", brCode )
            .setParameter( "sysDate", sysDate.toGregorianCalendar().getTime() )
            .getResultList();
                		
        	
        if ( results.isEmpty() )
        {	
        	  // need to inform that update was not successful
            throw new IntegServiceException( "PAYMENT TRACKING NUMBER: " + payTrackNum + "NOT FOUND",
            		IntegErrorCode.PAYMENT_TRACK_NUM_NOT_FOUND );
        }
    
        else
        {        	
        	TBLGetPtnValuedatedTrans getVDT = results.get( 0 );
        	
        	return getVDT;
        }
    }
  
}
	