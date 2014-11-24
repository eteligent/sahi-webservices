package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.DuePdcSummaryService;
import gov.aas.pagibig.webservice.IntegCmsGetDuePdcSummaryRequest;
import gov.aas.pagibig.webservice.IntegCmsGetDuePdcSummaryResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class DuePdcSummaryEndpoint {
	private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";
	private static final Logger logger = LoggerFactory.getLogger(DuePdcSummaryEndpoint.class);
	
	@Autowired
	private DuePdcSummaryService duePdcSummaryServiceImpl;
	
	@PayloadRoot(localPart = "integ_cms_get_due_pdc_summaryRequest", namespace = TARGET_NAMESPACE)
	public @ResponsePayload IntegCmsGetDuePdcSummaryResponse getDuePdcSummary(@RequestPayload IntegCmsGetDuePdcSummaryRequest request){
		logger.info("ENTERING GET DUE PDC SUMMARY REQUEST");
		IntegCmsGetDuePdcSummaryResponse response = duePdcSummaryServiceImpl.getDuePdcSummary(request);
		logger.info("LEAVING GET DUE PDC SUMMARY REQUEST");
		return response;
	}
}
