package gov.aas.pagibig.common.exception;

public interface ErrorCode
{
    String IIS_ERROR_FMT = "IISP_%1$4s_%2$01d_%3$05d";

    /**
     * Returns the error code number
     * 
     * @return
     */
    int getErrorNum();

    /**
     * Returns the severity of this error
     * 
     * @return
     */
    int getSeverity();

    /**
     * Returns the module of this exception
     * 
     * @return
     */
    Module getModule();

    public static final class Severity
    {
        public static final int FATAL = 1;

        public static final int ERROR = 2;

        public static final int WARNING = 3;
    }

    public static class ErrorUtil
    {
        public static final String getFormatted( ErrorCode errorCode )
        {
            return String.format( IIS_ERROR_FMT, errorCode.getModule().getCode(), errorCode.getSeverity(),
                                  errorCode.getErrorNum() );
        }
    }
}
