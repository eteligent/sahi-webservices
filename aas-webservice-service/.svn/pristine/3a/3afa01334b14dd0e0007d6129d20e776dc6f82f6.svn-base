package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.JournalEntriesService;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequest;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PostJournalEntriesToGLEndpoint {
	private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";
    private static final Logger logger = LoggerFactory.getLogger( PostJournalEntriesToGLEndpoint.class );
    
    @Autowired
    JournalEntriesService journalEntriesServiceImpl;
    @PayloadRoot(localPart="integ_gl_post_journal_entries_to_glRequest", namespace = TARGET_NAMESPACE)
    public @ResponsePayload IntegGlPostJournalEntriesToGlResponse postJournalEntriesToGL(@RequestPayload IntegGlPostJournalEntriesToGlRequest request){
    	logger.info("Entering GL Posting");
    	IntegGlPostJournalEntriesToGlResponse response = journalEntriesServiceImpl.postJournalEntriesToGL(request);
    	logger.info("Done with GL posting");
    	return response;
    }
}
