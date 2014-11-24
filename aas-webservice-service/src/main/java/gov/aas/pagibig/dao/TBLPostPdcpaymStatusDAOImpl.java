package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLPostPdcpaymStatus;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TBLPostPdcpaymStatusDAOImpl
    implements TBLPostPdcpaymStatusDAO
{
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings( "unchecked" )
    @Override
    public TBLPostPdcpaymStatus updatePOSTPdc( TBLPostPdcpaymStatus pdcForm )
     throws IntegServiceException
    {
    	if(pdcForm.getPdcRefNo() == null || pdcForm.getPayorId() == null || pdcForm.getStatus() < 0 || pdcForm.getStatus() > 1 )
    	{
    		  throw new IntegServiceException( "PDC information is incorrect or incomplete",
                      IntegErrorCode.PDC_REF_NO_NOT_FOUND );
    	}	
    		// we call merge to update existing entity, entitymanager can figure out how to properly update.
    	
        // this api returns the newly managed entity - jowel
        List<TBLPostPdcpaymStatus> results =
            em.createNamedQuery( "TBLPostPdcpaymStatus.setStatus" )
            .setParameter( "pdcRefNo", pdcForm.getPdcRefNo() )
            .setParameter( "payorId", pdcForm.getPayorId() )
            .getResultList();
                		
        	
        if ( results.isEmpty() )
        {	
        	  // need to inform that update was not successful
            throw new IntegServiceException( "PDC REF NO: " + pdcForm.getPdcRefNo()   + " NOT FOUND",
                                          IntegErrorCode.PDC_REF_NO_NOT_FOUND );
        }
    
        else
        {        	
        		TBLPostPdcpaymStatus poToUpdate = results.get( 0 );
                // update primary key of paymentOrderForm the in order for it to be merge, this is the key concept on
                // merging
                pdcForm.setPdcRefNo( poToUpdate.getPdcRefNo() );
                pdcForm.setPayorId( poToUpdate.getPayorId() );
                pdcForm.setTransRefNum( poToUpdate.getTransRefNum() );
                pdcForm.setPayorName( poToUpdate.getPayorName() );
                pdcForm.setGeneratedBy( poToUpdate.getGeneratedBy() );
                pdcForm.setDateGenerated( poToUpdate.getDateGenerated() );
                return em.merge( pdcForm );     			
        	
        }
    }
  
}
