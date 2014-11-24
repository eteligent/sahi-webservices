package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegTfmsGetDayRatesRequest;
import gov.aas.pagibig.webservice.IntegTfmsGetDayRatesResponse;

import gov.aas.pagibig.exception.IntegServiceException;

public interface SearchDayRatesService
{
	IntegTfmsGetDayRatesResponse getDayCurrency( IntegTfmsGetDayRatesRequest request )
			throws IntegServiceException;
}
