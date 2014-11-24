package gov.aas.pagibig.dao;

import gov.aas.pagibig.webservice.core.TBLGetPtnValuedatedTrans;
import gov.aas.pagibig.exception.IntegServiceException;
import javax.xml.datatype.XMLGregorianCalendar;
public interface TBLGetPtnValuedatedTransDAO
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
    public TBLGetPtnValuedatedTrans getPtnVal(  String payTrackNum, String payorName, String brCode, XMLGregorianCalendar sysDate)
    		 throws IntegServiceException;
    
}
 