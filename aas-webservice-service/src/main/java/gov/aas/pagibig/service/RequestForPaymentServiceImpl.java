package gov.aas.pagibig.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.aas.pagibig.common.exception.IISPException;
import gov.aas.pagibig.common.utils.FTPUploaderUtil;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.validators.RequestForPaymentValidator;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentList;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentRequest;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentResponse;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlResponse;

@Service
public class RequestForPaymentServiceImpl implements RequestForPaymentService {
	
	
	@Override
	public IntegApRequestForPaymentResponse requestForPayment(
			IntegApRequestForPaymentRequest request) {
		IntegApRequestForPaymentResponse response = new IntegApRequestForPaymentResponse();
		File file = new File("temp", "files");
		file.mkdirs();
		try {
			RequestForPaymentValidator validator = new RequestForPaymentValidator(request);
			validator.validate();
			String fileName = "";
			String branchCode = "";
			File file2 = File.createTempFile("temp",
					"." + request.getSourceSysId(), file);
			FileWriter writer = new FileWriter(file2);
			
			List<IntegApRequestForPaymentList> list = request.getIntegApRequestForPaymentList();
			
			for(IntegApRequestForPaymentList apRequest : list){
				writer.append(apRequest.getHdrInvoiceNum() + "|");
				writer.append(apRequest.getHdrInvoiceTypeLookupCode() + "|");
				writer.append(apRequest.getHdrInvoiceDate() + "|");
				writer.append(apRequest.getHdrVendorNum() + "|");
				writer.append(apRequest.getHdrVendorSiteCode() + "|");
				writer.append(apRequest.getHdrInvoiceAmount() + "|");
				writer.append(apRequest.getHdrDescription() + "|");
				writer.append(apRequest.getHdrGoodsReceivedDate() + "|");
				writer.append(apRequest.getHdrInvoiceDate() + "|");
				writer.append(apRequest.getHdrGlDate() + "|");
				writer.append(apRequest.getHdrSource() + "|");
				writer.append(apRequest.getDtlLineNumber() + "|");
				writer.append(apRequest.getDtlDrCompany() + "|");
				writer.append(apRequest.getDtlDrBranchOrOffice() + "|");
				writer.append(apRequest.getDtlDrActivityCode() + "|");
				writer.append(apRequest.getDtlDrCostClassification() + "|");
				writer.append(apRequest.getDtlDrGlAccount() + "|");
				writer.append(apRequest.getDtlDrFutureAccount() + "|");
				writer.append(apRequest.getDtlDrFutureAccount2() + "|");
				writer.append(apRequest.getDtlDrAmount() + "|");
				writer.append(apRequest.getDtlReferenceNumber() + "|");
				writer.append(apRequest.getDtlCrCompany() + "|");
				writer.append(apRequest.getDtlCrBranchOrOffice() + "|");
				writer.append(apRequest.getDtlCrActivityCode() + "|");
				writer.append(apRequest.getDtlCrCostClassification() + "|");
				writer.append(apRequest.getDtlCrGlAccount() + "|");
				writer.append(apRequest.getDtlCrFutureAccount() + "|");
				writer.append(apRequest.getDtlCrFutureAccount2() + "|");
				writer.append(apRequest.getDtlCrAmount() + "|");
				writer.append(apRequest.getDtlWhiteCode() + "|");
				writer.append(apRequest.getHdrCurrCode() + "|");
				writer.append(apRequest.getPaymentTermsCode() + "|");
				writer.append(apRequest.getFilename() + "|");
				writer.append(apRequest.getBranchCode() + "|");
				writer.append(apRequest.getTransactionId() + "|");
			}
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			String year = new SimpleDateFormat("yy").format(date);
			String month = new SimpleDateFormat("MM").format(date);
			String day = new SimpleDateFormat("dd").format(date);
			String hour = new SimpleDateFormat("HH").format(date);
			String minutes = new SimpleDateFormat("mm").format(date);
			String seconds = new SimpleDateFormat("ss").format(date);
			fileName = branchCode + year + month + day + hour + minutes
					+ seconds + "." + request.getSourceSysId();
			writer.close();
			File finalFile = new File("../temp/rfp/" + fileName);
			copyFileUsingFileStreams(file2, finalFile);
			FTPUploaderUtil.uploadRfp(finalFile, fileName);
			response.setResponseCode("1");
			response.setResponseMessage("Success");
		} catch (IOException e) {
			response.setError(AASServiceUtil.createError(
					IntegErrorCode.SERVER_EXCEPTION, "No Branch Code"));
		} catch (IISPException e) {
			response.setError(AASServiceUtil.createError(
					IntegErrorCode.GL_POSTING_ERROR, e.getMessage()));
		}

		return response;
	}
	
	private static void copyFileUsingFileStreams(File source, File dest)
			throws IOException {
		InputStream input = null;
		OutputStream output = null;
		input = new FileInputStream(source);
		output = new FileOutputStream(dest);
		byte[] buf = new byte[1024];
		int bytesRead;
		while ((bytesRead = input.read(buf)) > 0) {
			output.write(buf, 0, bytesRead);

		}
		input.close();
		output.close();
	}

}
