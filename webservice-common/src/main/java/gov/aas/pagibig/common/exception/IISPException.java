package gov.aas.pagibig.common.exception;

@SuppressWarnings( "serial" )
public class IISPException
    extends Exception
{
    private ErrorCode errorCode;

    public IISPException()
    {
        super();
    }

    public IISPException( String message, Throwable cause )
    {
        super( message, cause );
    }

    public IISPException( String message, ErrorCode errorCode, Throwable cause )
    {
        super( message, cause );
        this.errorCode = errorCode;
    }

    public IISPException( String message )
    {
        super( message );
    }

    public IISPException( String message, ErrorCode errorCode )
    {
        super( message );
        this.errorCode = errorCode;
    }

    public IISPException( Throwable cause )
    {
        super( cause );
    }

    public ErrorCode getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode( ErrorCode errorCode )
    {
        this.errorCode = errorCode;
    }
}
