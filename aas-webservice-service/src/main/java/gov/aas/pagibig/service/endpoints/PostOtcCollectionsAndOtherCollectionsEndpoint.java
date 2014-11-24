package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.OtcCollectionsAndOtherCollectionsService;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsRequest;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PostOtcCollectionsAndOtherCollectionsEndpoint {
	
		@Autowired
		OtcCollectionsAndOtherCollectionsService collectionsImpl;
	
	 	private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

	    private static final Logger logger = LoggerFactory.getLogger( PostOtcCollectionsAndOtherCollectionsEndpoint.class );
	    
	    @PayloadRoot(localPart = "integ_otc_post_collections_and_other_collectionsRequest", namespace = TARGET_NAMESPACE)
	    public @ResponsePayload IntegOtcPostCollectionsAndOtherCollectionsResponse postOtcCollections(@RequestPayload IntegOtcPostCollectionsAndOtherCollectionsRequest request){
	    	logger.debug("ENTERING POST OTC COLLECTIONS");
	    	IntegOtcPostCollectionsAndOtherCollectionsResponse response = collectionsImpl.postOtcCollections(request);
	    	logger.debug("DONE EXECUTING POST OTC COLLECTIONS");
	    	return response;
	    }
	    

}
