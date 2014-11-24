package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetPtnShortpaymInfoService;
import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoRequest;
import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GetPtnShortpaymInfoEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetPtnShortpaymInfoEndpoint.class );

    @Autowired
    private GetPtnShortpaymInfoService poService;

    @PayloadRoot( localPart = "integ_pfm_get_ptn_info_Request", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegPfmGetPtnInfoResponse getPtnShortpaymInfo( @RequestPayload
    		IntegPfmGetPtnInfoRequest request )
    {
        logger.info( "entering insertOrUpdate" );
        IntegPfmGetPtnInfoResponse response = poService.getPtnShortpaymInfo( request );
        logger.info( "exiting insertOrUpdate" );

        return response;
    }

}
