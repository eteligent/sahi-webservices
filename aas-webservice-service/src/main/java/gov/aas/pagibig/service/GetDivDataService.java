package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegHrisGetDivDataRequest;
import gov.aas.pagibig.webservice.IntegHrisGetDivDataResponse;
import gov.aas.pagibig.exception.IntegServiceException;

public interface GetDivDataService
{

	IntegHrisGetDivDataResponse getDivision( IntegHrisGetDivDataRequest request)
			throws IntegServiceException;


}
