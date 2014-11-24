package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.service.HolidayInformationService;
import gov.aas.pagibig.webservice.IntegOtcGetHolidayInformationRequest;
import gov.aas.pagibig.webservice.IntegOtcGetHolidayInformationResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HolidayInformationEndpoint {
	@Autowired
	HolidayInformationService holidayInformationService;

	private static final Logger logger = LoggerFactory
			.getLogger(HolidayInformationEndpoint.class);

	@PayloadRoot(localPart = "integ_otc_get_holiday_informationRequest", namespace = EndpointUtil.TARGET_NAMESPACE)
	public @ResponsePayload IntegOtcGetHolidayInformationResponse getHolidayInformation(
			@RequestPayload IntegOtcGetHolidayInformationRequest request)
			throws IntegServiceException {
		logger.info("Entering Holiday Information");
		IntegOtcGetHolidayInformationResponse response = holidayInformationService
				.getHolidayInformation(request);
		logger.info("Done fetching Holiday Information");
		return response;
	}

}
