package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;

public interface TBLForeClosedPropertyDAO
{
    /**
     * The requesting IISP System module requests the Acquired Asset System to check if a payment transaction is being
     * made against an already foreclosed property. Tellering System does not accept payments for foreclosed items, and
     * will invoke this web service for validating foreclosed property
     * 
     * @return true if foreclosed property, false otherwise
     */
    public int isForeclosedProperty( String pagibigMID, String propertyNumber )
        throws IntegServiceException;
}
