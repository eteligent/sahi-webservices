package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetPofHeaderService;
import gov.aas.pagibig.webservice.IntegOtcGetPofHeaderRequest;
import gov.aas.pagibig.webservice.IntegOtcGetPofHeaderResponse;
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
public class GetPofHeaderEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetPofHeaderEndpoint.class );

    @Autowired
    private GetPofHeaderService poService;

    @PayloadRoot( localPart = "integ_otc_get_pof_headerRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcGetPofHeaderResponse insertOrUpdate( @RequestPayload
    		IntegOtcGetPofHeaderRequest request )throws IntegServiceException
    {
        logger.info( "entering get POF Header" );
        IntegOtcGetPofHeaderResponse response = poService.getPOFHead( request );
        logger.info( "exiting get POF Header" );

        return response;
    }

}
