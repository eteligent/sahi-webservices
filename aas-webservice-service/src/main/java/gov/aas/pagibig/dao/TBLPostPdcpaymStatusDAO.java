package gov.aas.pagibig.dao;

import gov.aas.pagibig.webservice.core.TBLPostPdcpaymStatus;
import gov.aas.pagibig.exception.IntegServiceException;
import java.util.Date;
public interface TBLPostPdcpaymStatusDAO
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
    public TBLPostPdcpaymStatus updatePOSTPdc( TBLPostPdcpaymStatus pdcForm )
    		 throws IntegServiceException;
    
}
 