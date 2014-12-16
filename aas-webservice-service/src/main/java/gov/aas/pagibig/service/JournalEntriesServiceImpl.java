package gov.aas.pagibig.service;

import gov.aas.pagibig.common.exception.IISPException;
import gov.aas.pagibig.common.utils.FTPUploaderUtil;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.validators.IISPFormatterUtil;
import gov.aas.pagibig.validators.JournalEntryValidator;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequest;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlRequestList;
import gov.aas.pagibig.webservice.IntegGlPostJournalEntriesToGlResponse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

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
			File file2 = File.createTempFile("temp","." + request.getSourceSysId(), file);
			FileWriter writer = new FileWriter(file2);
			String fileName = IISPServiceUtil.generateFileName(request.getBranchCode(), request.getSourceSysId());
			List<IntegGlPostJournalEntriesToGlRequestList> list = request
					.getIntegGlPostJournalEntriesToGlRequestList();
			for (IntegGlPostJournalEntriesToGlRequestList entry : list) {
				writer.append(IISPFormatterUtil.toGLDate(entry.getAcctgDate()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getAccountType()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment1()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment2()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment3()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment4()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment5()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment6()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment7()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment8()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment9()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getSegment10()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getJournalName()) + "");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getCategoryName()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getCurrencyCode()) + "|");
				writer.append(IISPFormatterUtil.replaceNullBigDecimalWithBlank(entry.getAmount()) + "|");
				writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getReferencesOrDescription()) + "|");
				if(entry.getPfrNo().trim().length() == 0){
					writer.append("|||||||||||||||||||"); //can't think of anything right now
				}else{
					validator.validateAdditional();
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getPfrNo())+ "|");
					writer.append(IISPFormatterUtil.replaceNullBigDecimalWithBlank(entry.getCurrencyAmount()) + "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getPayorName())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getTransactionNumber())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getAccountTypeNumber())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getPaymentTrackingNumber())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getCreditMemoNumber())+ "|");
					writer.append(IISPFormatterUtil.toGLDate(entry.getClearDate())+ "|");
					writer.append(IISPFormatterUtil.toGLDate(entry.getTicketDate())+ "|");
					writer.append(IISPFormatterUtil.toGLDate(entry.getValueDate())+ "|");
					writer.append(IISPFormatterUtil.toGLDate(entry.getPercovFrm())+ "|");
					writer.append(IISPFormatterUtil.toGLDate(entry.getPercovTo())+ "|");
					writer.append(IISPFormatterUtil.replaceNullBigDecimalWithBlank(entry.getPesoAmt())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getPaySource())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getPostedBy())+ "|");
					writer.append(entry.getPfrNo() != null ? "" : IISPFormatterUtil.getGLDateToday() + "|"); /*TO BE EDITED*/
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getBankName())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getCheckNumber())+ "|");
					writer.append(IISPFormatterUtil.replaceNullWithBlank(entry.getHdrCheckType())+ "|");
				}
				writer.append(IISPFormatterUtil.replaceNullWithBlank(fileName) + "\n");
			}
			// close writer
			writer.close();
			IISPServiceUtil.copyFileUsingFileStreams(file2, new File("../temp/gl/" + fileName));
			FTPUploaderUtil.uploadGL(file2, fileName);
			response.setResponseCode("1");
			response.setResponseMessage("Successfuly Sent");
		} catch (IOException e) {
			response.setError(IISPServiceUtil.createError(
					IntegErrorCode.SERVER_EXCEPTION, e.getMessage()));
		} catch (IISPException e) {
			response.setError(IISPServiceUtil.createError(
					IntegErrorCode.GL_POSTING_ERROR, e.getMessage()));
		}

		return response;
	}
}
