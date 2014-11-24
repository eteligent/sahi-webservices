package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoRequest;
import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoResponse;

public interface GetPtnShortpaymInfoService
{

	public IntegPfmGetPtnInfoResponse getPtnShortpaymInfo( IntegPfmGetPtnInfoRequest request );

}

