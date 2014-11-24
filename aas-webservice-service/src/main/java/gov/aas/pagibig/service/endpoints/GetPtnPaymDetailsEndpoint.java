package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetPtnPaymDetailsService;
import gov.aas.pagibig.webservice.IntegPfmGetPtnAccInfoRequest;
import gov.aas.pagibig.webservice.IntegPfmGetPtnAccInfoResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GetPtnPaymDetailsEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetPtnPaymDetailsEndpoint.class );

    @Autowired
    private GetPtnPaymDetailsService poService;

    @PayloadRoot( localPart = "integ_pfm_get_ptn_acc_infoRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegPfmGetPtnAccInfoResponse getDet( @RequestPayload
    		IntegPfmGetPtnAccInfoRequest request )
    {
        logger.info( "entering get PTN Payment Details" );
        IntegPfmGetPtnAccInfoResponse response = poService.getDET( request );
        logger.info( "exiting get PTN Payment Details" );

        return response;
    }

}
