package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegOtcGetPofHeaderRequest;
import gov.aas.pagibig.webservice.IntegOtcGetPofHeaderResponse;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

public interface GetPofHeaderService
{

	IntegOtcGetPofHeaderResponse getPOFHead( IntegOtcGetPofHeaderRequest request)throws IntegServiceException;

}
