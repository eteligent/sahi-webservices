package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.InsertPofHeaderService;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderRequest;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InsertPofHeaderEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( InsertPofHeaderEndpoint.class );

    @Autowired
    private InsertPofHeaderService poService;

    @PayloadRoot( localPart = "integ_otc_insert_acq_pof_headerRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcInsertAcqPofHeaderResponse insertPofHeader
    ( @RequestPayload
    IntegOtcInsertAcqPofHeaderRequest request )
    throws IntegServiceException 
    {
        logger.info( "entering insert" );
        IntegOtcInsertAcqPofHeaderResponse response = poService.insertPofHeader( request );
        logger.info( "exiting insert" );

        return response;
    }

}
