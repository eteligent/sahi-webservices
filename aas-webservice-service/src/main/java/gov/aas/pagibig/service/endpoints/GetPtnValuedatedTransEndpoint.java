package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetPtnValuedatedTransService;
import gov.aas.pagibig.webservice.IntegPfmGetDatedPayRequest;
import gov.aas.pagibig.webservice.IntegPfmGetDatedPayResponse;
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
public class GetPtnValuedatedTransEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetPtnValuedatedTransEndpoint.class );

    @Autowired
    private GetPtnValuedatedTransService poService;

    @PayloadRoot( localPart = "integ_pfm_get_dated_payRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegPfmGetDatedPayResponse insertOrUpdate( @RequestPayload
    		IntegPfmGetDatedPayRequest request )throws IntegServiceException
    {
        logger.info( "entering get PTN Value Dated" );
        IntegPfmGetDatedPayResponse response = poService.getGET( request );
        logger.info( "exiting get PTN Value Dated" );

        return response;
    }

}
