package gov.aas.pagibig.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import gov.aas.pagibig.common.exception.IISPException;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.validators.CreateAndUpdateSupplierMasterValidator;
import gov.aas.pagibig.webservice.IntegApCreateAndUpdateSupplierMasterRequest;
import gov.aas.pagibig.webservice.IntegApCreateAndUpdateSupplierMasterResponse;

public class SupplierMasterServiceImpl implements SupplierMasterService{

	@Override
	public IntegApCreateAndUpdateSupplierMasterResponse createOrUpdateSupplierMaster(IntegApCreateAndUpdateSupplierMasterRequest request) {
		IntegApCreateAndUpdateSupplierMasterResponse response = new IntegApCreateAndUpdateSupplierMasterResponse();
		//validate first
		
		File file = new File("temp", "files");
		file.mkdirs();
		try {
			CreateAndUpdateSupplierMasterValidator validator = new CreateAndUpdateSupplierMasterValidator(request);
			String fileName = "";
			File file2 = File.createTempFile("temp","." + request.getSourceSysId(), file);
			FileWriter writer = new FileWriter(file2);
			validator.validate();
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
			
			writer.close();
			copyFileUsingFileStreams(file2, new File("../temp/supplier/" + fileName));
			//FTPUploaderUtil.uploadGL(file2, fileName);
			response.setResponseCode("1");
			response.setResponseMessage("Successfuly Sent");
		} catch (IOException e) {
			response.setError(IISPServiceUtil.createError(IntegErrorCode.SERVER_EXCEPTION, e.getMessage()));
		} catch (IISPException e) {
			// TODO Auto-generated catch block
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
