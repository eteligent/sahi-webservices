package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.PaymentOrderFormService;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderSampleRequest;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderSampleResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaymentOrderFormEndpoint
{
    private static final Logger logger = LoggerFactory.getLogger( PaymentOrderFormEndpoint.class );

    @Autowired
    private PaymentOrderFormService poService;

    @PayloadRoot( localPart = "integ_otc_insert_acq_pof_header_sampleRequest", namespace = EndpointUtil.TARGET_NAMESPACE )
    public @ResponsePayload
    IntegOtcInsertAcqPofHeaderSampleResponse insertOrUpdate
    ( @RequestPayload
    IntegOtcInsertAcqPofHeaderSampleRequest request )
    throws IntegServiceException 
    {
        logger.info( "entering insertOrUpdate" );
        IntegOtcInsertAcqPofHeaderSampleResponse response = poService.insertOrUpdatePaymentOrder( request );
        logger.info( "exiting insertOrUpdate" );

        return response;
    }

}
