package gov.aas.pagibig.validators;

import java.util.List;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentList;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentRequest;

public final class RequestForPaymentValidator {
	private IntegApRequestForPaymentRequest request;
	
	public RequestForPaymentValidator(IntegApRequestForPaymentRequest list){
		this.request = list;
	}
	public void validate() throws IntegServiceException{
		IISPValidatorUtil.isEmpty(request.getSourceSysId(), "SOURCE SYSTEM");
		List<IntegApRequestForPaymentList> list = request.getIntegApRequestForPaymentList(); 
		for(IntegApRequestForPaymentList apList : list){
			IISPValidatorUtil.isEmpty(apList.getHdrInvoiceNum(), "HDR INVOICE NUMBER");
			IISPValidatorUtil.isEmpty(apList.getHdrInvoiceTypeLookupCode(), "HDR INVOICE TYPE LOOKUP CODE");
			IISPValidatorUtil.isEmpty(apList.getHdrVendorNum(),"HDR VENDOR NUMBER");
			IISPValidatorUtil.isEmpty(apList.getHdrVendorSiteCode(), "HDR VENDOR SITE CODE");
			IISPValidatorUtil.isEmpty(apList.getHdrDescription(), "HDR DESCRIPTION");
			IISPValidatorUtil.validateDate(apList.getHdrGlDate(), "HDR GL DATE");
			IISPValidatorUtil.validateAmount(apList.getHdrInvoiceAmount(), "HDR INVOICE AMOUNT");
			IISPValidatorUtil.validateDate(apList.getHdrInvoiceDate(), "HDR INVOICE DATE");
			IISPValidatorUtil.validateDate(apList.getHdrGoodsReceivedDate(), "HDR GOODS RECEIVED DATE");
			IISPValidatorUtil.isEmpty(apList.getBranchCode(), "BRANCH CODE");
			IISPValidatorUtil.validateAmount(apList.getDtlAmount(), "DTL AMOUNT");
			IISPValidatorUtil.validateDate(apList.getHdrInvoiceDate(), "HDR INVOICE RECEIVED DATE");
			IISPValidatorUtil.isEmpty(apList.getHdrSource(), "HDR SOURCE");
			IISPValidatorUtil.isEmpty(apList.getDtlLineNumber(), "DTL LINE NUMBER");
			IISPValidatorUtil.isEmpty(apList.getDtlLineTypeLookupCode(), "DTL LINE TYPE LOOK UP CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlDrCompany(), "DTL DR COMPANY");
			IISPValidatorUtil.isEmpty(apList.getDtlDrBranchOrOffice(), "DTL DR BRANCH/OFFICE");
			IISPValidatorUtil.isEmpty(apList.getDtlDrActivityCode(), "DTL DR ACTIVITY CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlDrCostClassification(), "DTL DR COST CLASSIFICATION");
			IISPValidatorUtil.isEmpty(apList.getDtlDrGlAccount(), "DTL DR GL ACCOUNT");
			IISPValidatorUtil.isEmpty(apList.getDtlDrFutureAccount(), "DTL DR FUTURE ACCOUNT");
			IISPValidatorUtil.isEmpty(apList.getDtlDrFutureAccount2(), "DTL DR FUTURE ACCOUNT 2");
			IISPValidatorUtil.validateAmount(apList.getDtlDrAmount(), "DTL DR AMOUNT");
			IISPValidatorUtil.isEmpty(apList.getHdrCurrCode(), "HDR CURR CODE");
			IISPValidatorUtil.isEmpty(apList.getPaymentTermsCode(), "PAYMENT TERMS CODE");
			IISPValidatorUtil.isEmpty(apList.getBranchCode(), "BRANCH CODE");
			IISPValidatorUtil.isEmpty(apList.getTransactionId(),"TRANSACTION ID");
		}
	}
}
