package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetPtnCreditMemoService;
import gov.aas.pagibig.webservice.IntegPfmGetCmPayDetRequest;
import gov.aas.pagibig.webservice.IntegPfmGetCmPayDetResponse;
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
public class GetPtnCreditMemoEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetPtnCreditMemoEndpoint.class );

    @Autowired
    private GetPtnCreditMemoService poService;

    @PayloadRoot( localPart = "integ_pfm_get_cm_pay_detRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegPfmGetCmPayDetResponse getcM( @RequestPayload
    		IntegPfmGetCmPayDetRequest request )throws IntegServiceException
    {
        logger.info( "entering getPtnCreditMemo" );
        IntegPfmGetCmPayDetResponse response = poService.getCM( request );
        logger.info( "exiting getPtnCreditMemo" );

        return response;
    }

}
