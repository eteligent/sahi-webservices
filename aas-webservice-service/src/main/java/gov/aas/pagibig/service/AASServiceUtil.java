package gov.aas.pagibig.service;

import gov.aas.pagibig.common.exception.ErrorCode;
import gov.aas.pagibig.schema.ErrorType;

public final class AASServiceUtil
{

    public static final String STATUS_SUCCESS = "1";

    // prevent external instantiation
    private AASServiceUtil()
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
}
