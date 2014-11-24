package gov.aas.pagibig.validators;


import javax.xml.datatype.XMLGregorianCalendar;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

public final class IISPValidatorUtil {
	public static void isEmpty(String input, String fieldName) throws IntegServiceException{
		if(input == null)
			throw new IntegServiceException("Field is required! Field: " + fieldName,IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		if(input.trim().length() == 0)
			throw new IntegServiceException("Field is required! Field: "  + fieldName ,IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		
	}
	
	public static void validateDate(XMLGregorianCalendar date, String fieldName) throws IntegServiceException{
		if(date == null)
			throw new IntegServiceException("Invalid date format! format must be yyyy-mm-dd Field: "  + fieldName ,IntegErrorCode.REQUEST_FORMAT_INVALID);
	}
	
	public static void validateAmount(double input, String fieldName) throws IntegServiceException{
		if(input == 0.0)
			throw new IntegServiceException("Invalid Amount! Field: " + fieldName,IntegErrorCode.REQUEST_FORMAT_INVALID);
	}
}
