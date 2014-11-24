package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.UserDetailsService;
import gov.aas.pagibig.webservice.IntegOtcGetUserDetailsRequest;
import gov.aas.pagibig.webservice.IntegOtcGetUserDetailsResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserDetailsEndpoint {
	private static final Logger logger = LoggerFactory
			.getLogger(UserDetailsEndpoint.class);

	@Autowired
	private UserDetailsService userDetailsServiceImpl;

	@PayloadRoot(localPart = "integ_otc_get_user_detailsRequest", namespace = EndpointUtil.TARGET_NAMESPACE)
	public @ResponsePayload IntegOtcGetUserDetailsResponse getUserDetails(
			@RequestPayload IntegOtcGetUserDetailsRequest request) {
		
		logger.info("Entering User Details Service");
		IntegOtcGetUserDetailsResponse response = userDetailsServiceImpl
				.getUserDetails(request);
		logger.info("Leaving User Details Service");
		return response;
	}
}
