package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLGetPtnPaymDetails;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TBLGetPtnPaymDetailsDAOImpl
    implements TBLGetPtnPaymDetailsDAO
{
    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings( "unchecked" )
    @Override
    public TBLGetPtnPaymDetails getPTN( TBLGetPtnPaymDetails getForm )
    	throws IntegServiceException
    {
        // we call merge to update existing entity, entitymanager can figure out how to properly update.
        // this api returns the newly managed entity - jowel
        List<TBLGetPtnPaymDetails> results =
            em.createNamedQuery( "TBLGetPtnPaymDetails.getDetails" )
            .setParameter( "paymTrackNum", getForm.getPaymTrackNum() )
            .getResultList();

        if ( results.isEmpty() )
        {
        	  // need to inform that update was not successful
            throw new IntegServiceException( "PAYMENT TRACK NUM : " + getForm.getPaymTrackNum()   + " not found",
            		IntegErrorCode.PAYMENT_TRACK_NUM_NOT_FOUND );
        }
        else
        {
        	TBLGetPtnPaymDetails poToUpdate = results.get( 0 );
            // update primary key of paymentOrderForm the in order for it to be merge, this is the key concept on
            // merging
            getForm.setPaymTrackNum( poToUpdate.getPaymTrackNum() );
            getForm.setAccTypeCode( poToUpdate.getAccTypeCode() );
            getForm.setAccTypeDesc( poToUpdate.getAccTypeDesc() );
            getForm.setAccNo( poToUpdate.getAccNo() );
            getForm.setDebitMemo( poToUpdate.getDebitMemo() );
            getForm.setPeriod( poToUpdate.getPeriod() );
            getForm.setPayAllo( poToUpdate.getPayAllo() );
            getForm.setAmount( poToUpdate.getAmount() );
            return em.merge( getForm );
        }
    }
  
}
