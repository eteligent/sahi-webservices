package gov.aas.pagibig.validators;

import java.util.List;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegApCreateAndUpdateSupplierMasterList;
import gov.aas.pagibig.webservice.IntegApCreateAndUpdateSupplierMasterRequest;

public final class CreateAndUpdateSupplierMasterValidator {
	private IntegApCreateAndUpdateSupplierMasterRequest request;
	
	public CreateAndUpdateSupplierMasterValidator(IntegApCreateAndUpdateSupplierMasterRequest request){
		this.request = request;
	}

	public void validate() throws IntegServiceException{
		IISPValidatorUtil.isEmpty(request.getSourceSysId(), "SOURCE SYSTEM");
		IISPValidatorUtil.isEmpty(request.getBranchCode(), "BRANCH CODE");
		List<IntegApCreateAndUpdateSupplierMasterList> list = request.getIntegApCreateAndUpdateSupplierMasterList();
		for(IntegApCreateAndUpdateSupplierMasterList apList : list){
			IISPValidatorUtil.isEmpty(apList.getHdrSupplierName(), "HDR SUPPLIER NAME");
			IISPValidatorUtil.isEmpty(apList.getHdrSupplierCode(), "HDR SUPPLIER CODE");
			IISPValidatorUtil.isEmpty(apList.getHdrSupplierType(), "HDR SUPPLIER TYPE");
			IISPValidatorUtil.isEmpty(apList.getHdrTermsName(), "HDR TERMS NAME");
			IISPValidatorUtil.isEmpty(apList.getHdrPayDateBasisLookupCode(), "HDR PAY DATE BASIS LOOKUP CODE");
			IISPValidatorUtil.isEmpty(apList.getHdrInvoiceCurrCode(), "HDR INVOICE CURRENT CODE");
			IISPValidatorUtil.isEmpty(apList.getHdrTermsDateBasis(), "HDR TERMS DATE BASIS");
			IISPValidatorUtil.isEmpty(apList.getHdrAllowAwtFlag(), "HDR ALLOW AWT FLAG");
			IISPValidatorUtil.isEmpty(apList.getHdrAmountIncludesTaxFlag(), "HDR AMOUNT INCLUDES TAX FLAG");
			IISPValidatorUtil.isEmpty(apList.getHdrPaymentMethodCode(), "HDR PAYMENT METHOD CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlSiteCode(), "DTL SITE CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlPaySiteFlag(), "DTL PAY SITE FLAG");
			IISPValidatorUtil.isEmpty(apList.getDtlAddressLine1(), "DTL ADDRESS LINE 1");
			IISPValidatorUtil.isEmpty(apList.getDtlCountry(), "DTL COUNTRY");
			IISPValidatorUtil.isEmpty(apList.getDtlTermsDateBasis(), "DTL TERMS DATE BASIS");
			IISPValidatorUtil.isEmpty(apList.getDtlVatCode(), "DTL VAT CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlTermsName(), "DTL TERMS NAME");
			IISPValidatorUtil.isEmpty(apList.getDtlInvoiceCurrCode(), "DTL INVOICE CURR CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlPaymentCurrCode(), "DTL PAYMENT CURR CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlPaymentMethodCode(), "DTL PAYMENT METHOD CODE");
			IISPValidatorUtil.isEmpty(apList.getDtlAllowAwtFlag(), "DTL ALLOW AWT FLAG");
			IISPValidatorUtil.isEmpty(apList.getDtlAwtGroupName(), "DTL AWT GROUP NAME");
			IISPValidatorUtil.isEmpty(apList.getDtl2ContFirstName(), "DTL2 CONT FIRST NAME");
			IISPValidatorUtil.isEmpty(apList.getDtl2ContMiddleName(), "DTL2 CONT MIDDLE NAME");
			IISPValidatorUtil.isEmpty(apList.getDtl2ContLastName(), "DTL2 CONT LAST NAME");
			IISPValidatorUtil.isEmpty(apList.getSupplierTin(), "SUPPLIER TIN");
			IISPValidatorUtil.isEmpty(apList.getTransactionId(), "TRANSACTION ID");
		}
	}
}
