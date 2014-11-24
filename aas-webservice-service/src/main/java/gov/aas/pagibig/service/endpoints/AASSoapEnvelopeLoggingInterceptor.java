package gov.aas.pagibig.service.endpoints;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;

import org.springframework.ws.soap.server.endpoint.interceptor.SoapEnvelopeLoggingInterceptor;

public class AASSoapEnvelopeLoggingInterceptor
    extends SoapEnvelopeLoggingInterceptor
{
    @Override
    protected void logMessageSource( String message, Source source )
        throws TransformerException
    {
        if ( source != null )
        {
            Transformer trf = this.getTransformerFactory().newTransformer();
            trf.setOutputProperty( OutputKeys.INDENT, "yes" );
            trf.setOutputProperty( "{http://xml.apache.org/xslt}indent-amount", "4" );

            StringWriter writer = new StringWriter();
            StreamResult stream = new StreamResult( writer );
            trf.transform( source, stream );
            writer.flush();

            this.logger.debug( message + stream.getWriter().toString() );
        }
    }
}