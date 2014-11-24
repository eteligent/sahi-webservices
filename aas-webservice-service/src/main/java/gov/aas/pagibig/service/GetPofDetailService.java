package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegOtcGetPofDetailRequest;
import gov.aas.pagibig.webservice.IntegOtcGetPofDetailResponse;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

public interface GetPofDetailService
{

	IntegOtcGetPofDetailResponse getPOFDet( IntegOtcGetPofDetailRequest request)throws IntegServiceException;

}
