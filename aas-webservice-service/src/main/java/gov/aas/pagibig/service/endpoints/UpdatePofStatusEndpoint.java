package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.UpdatePofStatusService;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcUpdatePofStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcUpdatePofStatusResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UpdatePofStatusEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( UpdatePofStatusEndpoint.class );

    @Autowired
    private UpdatePofStatusService poService;

    @PayloadRoot( localPart = "integ_otc_update_pof_statusRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcUpdatePofStatusResponse updatePofStatus
    ( @RequestPayload
    IntegOtcUpdatePofStatusRequest request )
    throws IntegServiceException 
    {
        logger.info( "entering update pof status" );
        IntegOtcUpdatePofStatusResponse response = poService.updatePofStatus( request );
        logger.info( "exiting update pof status" );

        return response;
    }

}
