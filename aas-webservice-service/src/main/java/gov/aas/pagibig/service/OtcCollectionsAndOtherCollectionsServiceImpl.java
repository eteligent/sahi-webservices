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

import org.springframework.stereotype.Service;

import gov.aas.pagibig.common.exception.ErrorCode;
import gov.aas.pagibig.common.exception.IISPException;
import gov.aas.pagibig.common.utils.FTPUploaderUtil;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsList;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsRequest;
import gov.aas.pagibig.webservice.IntegOtcPostCollectionsAndOtherCollectionsResponse;

@Service
public class OtcCollectionsAndOtherCollectionsServiceImpl implements
		OtcCollectionsAndOtherCollectionsService {

	@Override
	public IntegOtcPostCollectionsAndOtherCollectionsResponse postOtcCollections(
			IntegOtcPostCollectionsAndOtherCollectionsRequest request) {
		IntegOtcPostCollectionsAndOtherCollectionsResponse response = new IntegOtcPostCollectionsAndOtherCollectionsResponse();

		File file = new File("temp", "files");
		file.mkdirs();
		try {
			String fileName = "";
			String branchCode = "";
			File file2 = File.createTempFile("temp",
					"." + request.getSourceSysId(), file);
			FileWriter writer = new FileWriter(file2);

			List<IntegOtcPostCollectionsAndOtherCollectionsList> list = request
					.getIntegOtcPostCollectionsAndOtherCollectionsList();
			for (IntegOtcPostCollectionsAndOtherCollectionsList collection : list) {
				writer.append(collection.getHdrReceiptNo() + "|");
				writer.append(collection.getHdrReceiptDate() + "|");
				writer.append(collection.getHdrAmount() + "|");
				writer.append(collection.getHdrGlDate() + "|");
				writer.append(collection.getHdrReceiptMethodName() + "|");
				writer.append(collection.getHdrCustomerNumber() + "|");
				writer.append(collection.getHdrLocationCode() + "|");
				writer.append(collection.getHdrCustomerName() + "|");
				writer.append(collection.getHdrLocationName() + "|");
				writer.append(collection.getHdrCurrencyCode() + "|");
				writer.append(collection.getDtlInvoiceNumber() + "|");
				writer.append(collection.getDtlReceivableActivity() + "|");
				writer.append(collection.getDtlBankName() + "|");
				writer.append(collection.getDtlCheckNumber() + "|");
				writer.append(collection.getBranchCode() + "|");
				writer.append(collection.getTransactionId() + "\n");
				branchCode = collection.getBranchCode(); 
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
			// close writer
			writer.close();
			File finalFile  = new File("../temp/otc/" + fileName);
			copyFileUsingFileStreams(file2, finalFile);
			FTPUploaderUtil.uploadOtc(finalFile, fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IISPException e) {
			response.setError(AASServiceUtil.createError(IntegErrorCode.GL_POSTING_ERROR, e.getMessage()));
		}
		response.setResponseCode("1");
		response.setResponseMessage("Successfuly Sent");
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
