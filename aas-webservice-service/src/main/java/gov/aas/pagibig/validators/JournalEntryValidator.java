package gov.aas.pagibig.validators;

import java.util.List;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequest;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequestList;

public final class JournalEntryValidator {
	private IntegGlPostJournalEntriesToGlRequest request;
	
	public JournalEntryValidator(IntegGlPostJournalEntriesToGlRequest request){
		this.request = request;
	}
	
	public void validate() throws IntegServiceException{
		IISPValidatorUtil.isEmpty(request.getSourceSysId(), "SOURCE SYSTEM");
		IISPValidatorUtil.isEmpty(request.getBranchCode(), "BRANCH CODE");
		List <IntegGlPostJournalEntriesToGlRequestList> list = request.getIntegGlPostJournalEntriesToGlRequestList();
		for(IntegGlPostJournalEntriesToGlRequestList glList : list){
			IISPValidatorUtil.validateDate(glList.getAcctgDate(), "ACCTG DATE");
			IISPValidatorUtil.isEmpty(glList.getAccountType(), "ACCOUNT TYPE");
			IISPValidatorUtil.isEmpty(glList.getSegment1(), "SEGMENT 1");
			IISPValidatorUtil.isEmpty(glList.getSegment2(), "SEGMENT 2");
			IISPValidatorUtil.isEmpty(glList.getSegment3(), "SEGMENT 3");
			IISPValidatorUtil.isEmpty(glList.getSegment4(), "SEGMENT 4");
			IISPValidatorUtil.isEmpty(glList.getSegment5(), "SEGMENT 5");
			IISPValidatorUtil.isEmpty(glList.getSegment6(), "SEGMENT 6");
			IISPValidatorUtil.isEmpty(glList.getSegment7(), "SEGMENT 7");
			IISPValidatorUtil.isEmpty(glList.getJournalName(), "JOURNAL NAME");
			IISPValidatorUtil.isEmpty(glList.getCategoryName(), "CATEGORY NAME");
			IISPValidatorUtil.isEmpty(glList.getSegment1(), "CURRENCY CODE");
			IISPValidatorUtil.validateAmount(glList.getAmount(), "AMOUNT");
			IISPValidatorUtil.isEmpty(glList.getReferencesOrDescription(), "REFERENCES/DESCRIPTION");
			IISPValidatorUtil.isEmpty(glList.getTransactionId(),"TRANSACTION ID");
		}
	}
}
