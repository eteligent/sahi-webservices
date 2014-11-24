package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.CheckPofStatusService;
import gov.aas.pagibig.webservice.IntegOtcCheckPofStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcCheckPofStatusResponse;
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
public class CheckPofStatusEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( CheckPofStatusEndpoint.class );

    @Autowired
    private CheckPofStatusService poService;

    @PayloadRoot( localPart = "integ_otc_check_pof_statusRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcCheckPofStatusResponse checkPofStatus( @RequestPayload
    		IntegOtcCheckPofStatusRequest request )throws IntegServiceException
    {
        logger.info( "entering check pof status" );
        IntegOtcCheckPofStatusResponse response = poService.checkPofStatus( request );
        logger.info( "exiting check pof status" );

        return response;
    }

}
