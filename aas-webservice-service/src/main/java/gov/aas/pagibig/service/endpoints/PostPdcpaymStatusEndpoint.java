package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.PostPdcpaymStatusService;
import gov.aas.pagibig.webservice.IntegOtcPostPdcpaymStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcPostPdcpaymStatusResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PostPdcpaymStatusEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( PostPdcpaymStatusEndpoint.class );

    @Autowired
    private PostPdcpaymStatusService poService;

    @PayloadRoot( localPart = "integ_otc_post_pdcpaym_statusRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcPostPdcpaymStatusResponse insertOrUpdate( @RequestPayload
    		IntegOtcPostPdcpaymStatusRequest request )
    {
        logger.info( "entering update Post PDC Paym Status" );
        IntegOtcPostPdcpaymStatusResponse response = poService.updatePDCStatus( request );
        logger.info( "exiting update Post PDC Paym Status" );

        return response;
    }

}
