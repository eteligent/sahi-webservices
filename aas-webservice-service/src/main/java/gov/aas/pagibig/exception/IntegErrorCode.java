package gov.aas.pagibig.exception;

import gov.aas.pagibig.common.exception.ErrorCode;
import gov.aas.pagibig.common.exception.Module;

public enum IntegErrorCode
    implements ErrorCode
{
    SERVER_EXCEPTION( Severity.ERROR, 99999 ),

    POF_NO_NOT_FOUND( Severity.ERROR, 00001 ),
    
    PDC_REF_NO_NOT_FOUND( Severity.ERROR, 00003 ),
    
    PAYMENT_TRACK_NUM_NOT_FOUND( Severity.ERROR, 00001 ),
    
    PRN_NO_NOT_FOUND( Severity.ERROR, 00002 ),
    
    REQUEST_FORMAT_INVALID(Severity.ERROR, 00012),
    
    HOLIDAY_INFORMATION_EMPTY(Severity.WARNING, 00043),
    
    FORECLOSE_PROPERTY_NOT_FOUND( Severity.WARNING, 10000 ),
    
    //WS-03-001: Get Branch Details
    BRANCH_DETAILS_NOT_FOUND( Severity.WARNING, 00007 ),
    
    REQUEST_PARAMETER_INCOMPLETE(Severity.ERROR,00005),
    //WS-05-006: Insert POF Header
    POF_NO_ALREADY_EXISTING( Severity.ERROR, 00017 ),
    
    //WS-02-001: Get PTN Short Account
    PTN_SHORTPAYM_INFO_NOT_FOUND( Severity.WARNING, 000777 ),
    
    //WS-11-001: Get Currency Rates
    DAY_CURRENCY_RATE_NOT_FOUND(Severity.WARNING, 50000),
    
    //WS-03-004: Get Unit/Dept. Info
    UNIT_DEPT_INFO_NOT_FOUND(Severity.WARNING, 70007 ),
    
    USER_DETAILS_NOT_FOUND(Severity.WARNING, 25010),
    
    BRANCH_PFR_NO_SERIES_NOT_FOUND(Severity.WARNING, 00022),
    
    PDC_SUMMARY_EMPTY(Severity.WARNING, 00214),
    
    GL_POSTING_ERROR(Severity.FATAL, 02152);
   



    private final int severity;

    private final int errorNum;

    private IntegErrorCode( int severity, int errorNum )
    {
        this.severity = severity;
        this.errorNum = errorNum;
    }

    @Override
    public int getErrorNum()
    {
        return errorNum;
    }

    @Override
    public int getSeverity()
    {
        return severity;
    }

    @Override
    public Module getModule()
    {
        // state what module here, in our case it is the WS_05*
        return Module.WS_05;
    }

    @Override
    public String toString()
    {
        return ErrorUtil.getFormatted( this );
    }
}
