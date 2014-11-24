package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegAasGetForeStatusRequest;
import gov.aas.pagibig.webservice.IntegAasGetForeStatusResponse;

public interface ForeClosedPropertyService
{
    IntegAasGetForeStatusResponse getForeClosedProperty( IntegAasGetForeStatusRequest request );
}
