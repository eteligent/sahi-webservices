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

import gov.aas.pagibig.common.exception.IISPException;
import gov.aas.pagibig.common.utils.FTPUploaderUtil;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.validators.JournalEntryValidator;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequest;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequestList;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlResponse;

@Service
public class JournalEntriesServiceImpl implements JournalEntriesService {

	@Override
	public IntegGlPostJournalEntriesToGlResponse postJournalEntriesToGL(
			IntegGlPostJournalEntriesToGlRequest request) {
		IntegGlPostJournalEntriesToGlResponse response = new IntegGlPostJournalEntriesToGlResponse();
		File file = new File("temp", "files");
		file.mkdirs();
		// For now.. to be refactored
		try {
			JournalEntryValidator validator = new JournalEntryValidator(request);
			validator.validate();
			String fileName = "";
			File file2 = File.createTempFile("temp",
					"." + request.getSourceSysId(), file);
			FileWriter writer = new FileWriter(file2);
			String branchCode = request.getBranchCode();
			//generate file name
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
			List<IntegGlPostJournalEntriesToGlRequestList> list = request
					.getIntegGlPostJournalEntriesToGlRequestList();
			for (IntegGlPostJournalEntriesToGlRequestList entry : list) {
				writer.append(entry.getAcctgDate() + "|");
				writer.append(entry.getAccountType() + "|");
				writer.append(entry.getSegment1() + "|");
				writer.append(entry.getSegment2() + "|");
				writer.append(entry.getSegment3() + "|");
				writer.append(entry.getSegment4() + "|");
				writer.append(entry.getSegment5() + "|");
				writer.append(entry.getSegment6() + "|");
				writer.append(entry.getSegment7() + "|");
				writer.append(entry.getSegment8() + "|");
				writer.append(entry.getSegment9() + "|");
				writer.append(entry.getSegment10() + "|");
				writer.append(entry.getJournalName());
				writer.append(entry.getCategoryName() + "|");
				writer.append(entry.getCurrencyCode() + "|");
				writer.append(entry.getAmount() + "|");
				writer.append(entry.getReferencesOrDescription() + "|");
				writer.append(fileName + "\n");
			}
			// close writer
			writer.close();
			copyFileUsingFileStreams(file2, new File("../temp/gl/" + fileName));
			 FTPUploaderUtil.uploadGL(file2, fileName);
			response.setResponseCode("1");
			response.setResponseMessage("Successfuly Sent");
		} catch (IOException e) {
			response.setError(AASServiceUtil.createError(
					IntegErrorCode.SERVER_EXCEPTION, "Branch Code is Invalid"));
		} catch (IISPException e) {
			response.setError(AASServiceUtil.createError(
					IntegErrorCode.GL_POSTING_ERROR, e.getMessage()));
			e.printStackTrace();
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
