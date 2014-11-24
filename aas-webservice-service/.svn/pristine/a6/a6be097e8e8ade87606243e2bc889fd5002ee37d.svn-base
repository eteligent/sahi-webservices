package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.InsertPofDetailsService;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofDetailRequest;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofDetailResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class InsertPofDetailsEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( InsertPofDetailsEndpoint.class );

    @Autowired
    private InsertPofDetailsService poService;

    @PayloadRoot( localPart = "integ_otc_insert_acq_pof_detailRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcInsertAcqPofDetailResponse insertPofDetails
    ( @RequestPayload
    IntegOtcInsertAcqPofDetailRequest request )
    throws IntegServiceException 
    {
        logger.info( "entering insert" );
        IntegOtcInsertAcqPofDetailResponse response = poService.insertPofDetails( request );
        logger.info( "exiting insert" );

        return response;
    }

}
