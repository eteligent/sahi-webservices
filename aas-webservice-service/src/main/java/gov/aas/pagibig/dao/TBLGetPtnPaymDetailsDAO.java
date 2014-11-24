package gov.aas.pagibig.dao;

import gov.aas.pagibig.webservice.core.TBLGetPtnPaymDetails;
import gov.aas.pagibig.exception.IntegServiceException;

public interface TBLGetPtnPaymDetailsDAO
{

    /**
     * Insert or update an Payment Order Form (POF)
     * 
     * @param paymentOrderForm
     * @return inserted entity, null otherwise
     */
    //public void insertPOFHeader( TBLPaymentOrderForm paymentOrderForm );

    /**
     * Updates or update an Payment Order Form (POF)
     * 
     * @param paymentOrderForm
     * @return updated entity, null if there was no made update
     */
    public TBLGetPtnPaymDetails getPTN( TBLGetPtnPaymDetails getForm )
    		 throws IntegServiceException;
    
}
 