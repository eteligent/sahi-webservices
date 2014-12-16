package gov.aas.pagibig.service;

import gov.aas.pagibig.common.exception.ErrorCode;
import gov.aas.pagibig.schema.ErrorType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class IISPServiceUtil
{

    public static final String STATUS_SUCCESS = "1";

    // prevent external instantiation
    private IISPServiceUtil()
    {

    }

    public static ErrorType createError( String errorCode, String errorMessage )
    {
        ErrorType error = new ErrorType();
        error.setErrorCode( errorCode );
        error.setErrorMessage( errorMessage );

        return error;
    }

    public static ErrorType createError( ErrorCode errorCode, String errorMessage )
    {
        ErrorType error = new ErrorType();
        error.setErrorCode( errorCode.toString() );
        error.setErrorMessage( errorMessage );

        return error;
    }   
    
    /*They have the same format naman e*/
    public static String generateFileName(String branchCode, String sourceSystemId){
    	Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String year = new SimpleDateFormat("yy").format(date);
		String month = new SimpleDateFormat("MM").format(date);
		String day = new SimpleDateFormat("dd").format(date);
		String hour = new SimpleDateFormat("HH").format(date);
		String seconds = new SimpleDateFormat("ss").format(date);
		String minutes = new SimpleDateFormat("mm").format(date);
		String fileName = branchCode + year + month + day + hour + minutes
				+ seconds + "." + sourceSystemId;
		return fileName;
    }
    
	public static void copyFileUsingFileStreams(File source, File dest)
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
