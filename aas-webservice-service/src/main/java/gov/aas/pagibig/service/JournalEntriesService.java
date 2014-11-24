package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequest;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlResponse;

public interface JournalEntriesService {
	public IntegGlPostJournalEntriesToGlResponse postJournalEntriesToGL(IntegGlPostJournalEntriesToGlRequest request);
}
