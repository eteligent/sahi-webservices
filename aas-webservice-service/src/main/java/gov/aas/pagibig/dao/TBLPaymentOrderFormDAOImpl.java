package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLPaymentOrderForm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TBLPaymentOrderFormDAOImpl
    implements TBLPaymentOrderFormDAO
{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertPOFHeader( TBLPaymentOrderForm paymentOrderForm )
    {
        // we call persist to save new entity
        em.persist( paymentOrderForm );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    public TBLPaymentOrderForm updatePOFHeader( TBLPaymentOrderForm paymentOrderForm )
        throws IntegServiceException
    {
        // we call merge to update existing entity, entitymanager can figure out how to properly update.
        // this api returns the newly managed entity - jowel
        List<TBLPaymentOrderForm> results =
            em.createNamedQuery( "TBLPaymentOrderForm.getPaymentOrderByPOFNo" ).setParameter( "pofNo",
                                                                                                paymentOrderForm.getPofNo() ).getResultList();

        if ( results.isEmpty() )
        {
            // need to inform that update was not successful
            throw new IntegServiceException( "POF NO: " + paymentOrderForm.getPofNo() + " not found",
                                           IntegErrorCode.POF_NO_NOT_FOUND );
        }
        else
        {
            TBLPaymentOrderForm poToUpdate = results.get( 0 );
            // update primary key of paymentOrderForm the in order for it to be merge, this is the key concept on
            // merging
            paymentOrderForm.setId( poToUpdate.getId() );
            return em.merge( paymentOrderForm );
        }
    }

}
