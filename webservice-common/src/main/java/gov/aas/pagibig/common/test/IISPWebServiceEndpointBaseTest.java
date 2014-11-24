package gov.aas.pagibig.common.test;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class IISPWebServiceEndpointBaseTest
{
    private static final Logger logger = LoggerFactory.getLogger( IISPWebServiceEndpointBaseTest.class );

    protected String getRequest( String fileName )
    {
        // look in request folder name
        return readFile( "\\ws-request\\" + fileName );
    }

    protected String getResponse( String fileName )
    {
        // look in request folder name
        return readFile( "\\ws-response\\" + fileName );
    }

    private String readFile( String fileName )
    {
        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        try
        {
            logger.debug( "Reading file " + fileName );
            result = IOUtils.toString( classLoader.getResourceAsStream( fileName ) );
        }
        catch ( IOException e )
        {
            logger.error( "Failed reading file " + fileName, fileName );
        }

        return result;
    }
}
