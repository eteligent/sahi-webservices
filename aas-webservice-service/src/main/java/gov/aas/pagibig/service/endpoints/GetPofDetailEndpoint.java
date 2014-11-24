 package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetPofDetailService;
import gov.aas.pagibig.webservice.IntegOtcGetPofDetailRequest;
import gov.aas.pagibig.webservice.IntegOtcGetPofDetailResponse;
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
public class GetPofDetailEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( GetPofDetailEndpoint.class );

    @Autowired
    private GetPofDetailService poService;

    @PayloadRoot( localPart = "integ_otc_get_pof_detailRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcGetPofDetailResponse insertOrUpdate( @RequestPayload
    		IntegOtcGetPofDetailRequest request )throws IntegServiceException
    {
        logger.info( "entering get POF Detail" );
        IntegOtcGetPofDetailResponse response = poService.getPOFDet( request );
        logger.info( "exiting get POF Detail" );

        return response;
    }

}
