package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegOtcCheckPofStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcCheckPofStatusResponse;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

public interface CheckPofStatusService
{

	IntegOtcCheckPofStatusResponse checkPofStatus( IntegOtcCheckPofStatusRequest request)throws IntegServiceException;

}
