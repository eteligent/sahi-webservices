package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.RequestForPaymentService;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentRequest;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RequestForPaymentEndpoint {

	@Autowired
	private RequestForPaymentService rfpServiceImpl;
	
	private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

    private static final Logger logger = LoggerFactory.getLogger( RequestForPaymentEndpoint.class );
	@PayloadRoot(localPart = "integ_ap_request_for_paymentRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload IntegApRequestForPaymentResponse requestForPayment(@RequestPayload IntegApRequestForPaymentRequest request){
		logger.info("Entering REQUEST FOR PAYMENT WS");
		logger.info("THIS " + request.getIntegApRequestForPaymentList().get(0).getDtlAmount());
		IntegApRequestForPaymentResponse response = rfpServiceImpl.requestForPayment(request);
		logger.info("Exiting REQUEST FOR PAYMENT WS");
		return response;
		
	}
}
