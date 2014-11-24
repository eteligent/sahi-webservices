package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegOtcUpdatePofStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcUpdatePofStatusResponse;
import gov.aas.pagibig.exception.IntegServiceException;

public interface UpdatePofStatusService
{

    public IntegOtcUpdatePofStatusResponse updatePofStatus( IntegOtcUpdatePofStatusRequest request )
 throws IntegServiceException;

}
