package gov.aas.pagibig.validators;

import java.util.List;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsList;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsRequest;

public final class OtcCollectionValidator {
	private IntegOtcPostCollectionsAndOtherCollectionsRequest request;
	
	public OtcCollectionValidator(IntegOtcPostCollectionsAndOtherCollectionsRequest request){
		this.request = request;
	}
	
	public void validate() throws IntegServiceException{
		IISPValidatorUtil.isEmpty(request.getSourceSysId(), "SOURCE SYSTEM");
		IISPValidatorUtil.isEmpty(request.getBranchCode(), "BRANCH CODE");
		List<IntegOtcPostCollectionsAndOtherCollectionsList> list = request.getIntegOtcPostCollectionsAndOtherCollectionsList();
		for(IntegOtcPostCollectionsAndOtherCollectionsList otcList : list){
			IISPValidatorUtil.isEmpty(otcList.getHdrReceiptNo(), "HDR RECEIPT NUMBER");
			IISPValidatorUtil.validateDate(otcList.getHdrReceiptDate(), "RECEIPT DATE");
			IISPValidatorUtil.validateAmount(otcList.getHdrAmount(), "HDR AMOUNT");
			IISPValidatorUtil.validateDate(otcList.getHdrGlDate(), "HDR GL DATE");
			IISPValidatorUtil.isEmpty(otcList.getHdrReceiptMethodName(), "HDR RECEIPT METHOD NAME");
			IISPValidatorUtil.isEmpty(otcList.getHdrCurrencyCode(), "HDR CURRENCY CODE");
			IISPValidatorUtil.isEmpty(otcList.getDtlReceivableActivity(), "RECEIVABLE ACTIVITY");
			IISPValidatorUtil.isEmpty(otcList.getTransactionId(),"TRANSACTION ID");
		}
	}
}
