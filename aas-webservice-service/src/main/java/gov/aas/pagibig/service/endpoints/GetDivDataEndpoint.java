package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetDivDataService;
import gov.aas.pagibig.webservice.IntegHrisGetDivDataRequest;
import gov.aas.pagibig.webservice.IntegHrisGetDivDataResponse;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GetDivDataEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetDivDataEndpoint.class );

    @Autowired
    private GetDivDataService poService;

    @PayloadRoot( localPart = "integ_hris_get_div_dataRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegHrisGetDivDataResponse getDivision( @RequestPayload
    		IntegHrisGetDivDataRequest request )throws IntegServiceException
    {
        logger.info( "entering get Division data" );
        IntegHrisGetDivDataResponse response = poService.getDivision( request );
        logger.info( "exiting get Division data" );

        return response;
    }
}
