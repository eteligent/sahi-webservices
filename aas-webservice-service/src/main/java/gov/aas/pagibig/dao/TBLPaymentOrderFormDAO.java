package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLPaymentOrderForm;

public interface TBLPaymentOrderFormDAO
{

    /**
     * Insert or update an Payment Order Form (POF)
     * 
     * @param paymentOrderForm
     * @return inserted entity, null otherwise
     */
    public void insertPOFHeader( TBLPaymentOrderForm paymentOrderForm );

    /**
     * Updates or update an Payment Order Form (POF)
     * 
     * @param paymentOrderForm
     * @return updated entity, null if there was no made update
     * @throws IntegServiceException
     */
    public TBLPaymentOrderForm updatePOFHeader( TBLPaymentOrderForm paymentOrderForm )
        throws IntegServiceException;
}
