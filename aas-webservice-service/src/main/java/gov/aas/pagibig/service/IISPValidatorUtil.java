package gov.aas.pagibig.service;


import javax.xml.datatype.XMLGregorianCalendar;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

public final class IISPValidatorUtil {
	public static void isEmpty(String input) throws IntegServiceException{
		if(input.trim().length() == 0){
			throw new IntegServiceException("Field is required!",IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
	}
	
	public static void validateDate(XMLGregorianCalendar date) throws IntegServiceException{
		if(date == null){
			throw new IntegServiceException("Invalid date format!",IntegErrorCode.REQUEST_FORMAT_INVALID);
		}
	}
}
