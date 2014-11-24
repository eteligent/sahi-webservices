package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.TestingPostingRequest;
import gov.aas.pagibig.webservice.TestingPostingResponse;
import gov.aas.pagibig.exception.IntegServiceException;

public interface TesterService
{

    public TestingPostingResponse postingGL( TestingPostingRequest request )
    			throws IntegServiceException;

}
