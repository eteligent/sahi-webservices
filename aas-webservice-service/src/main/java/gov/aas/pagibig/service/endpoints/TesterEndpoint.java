package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.TesterService;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.TestingPostingRequest;
import gov.aas.pagibig.webservice.TestingPostingResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TesterEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( TesterEndpoint.class );

    @Autowired
    private TesterService poService;

   @PayloadRoot( localPart = "testing_postingRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    TestingPostingResponse postingGL
    ( @RequestPayload
    TestingPostingRequest request )
    throws IntegServiceException 
    {
        logger.info( "entering insert" );
        TestingPostingResponse response = poService.postingGL( request );
        logger.info( "exiting insert" );

        return response;
    }

}
