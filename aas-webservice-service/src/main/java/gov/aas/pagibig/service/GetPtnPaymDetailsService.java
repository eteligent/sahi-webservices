package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegPfmGetPtnAccInfoRequest;
import gov.aas.pagibig.webservice.IntegPfmGetPtnAccInfoResponse;
import gov.aas.pagibig.exception.IntegServiceException;

public interface GetPtnPaymDetailsService
{

	IntegPfmGetPtnAccInfoResponse getDET( IntegPfmGetPtnAccInfoRequest request);


}
