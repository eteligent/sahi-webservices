package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.common.test.IISPWebServiceEndpointBaseTest;

import javax.xml.transform.Source;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.ws.test.server.RequestCreators;
import org.springframework.ws.test.server.ResponseMatchers;
import org.springframework.xml.transform.StringSource;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( "classpath*:META-INF/applicationConfig-ws.xml" )
public class ForeClosedPropertyEndpointTest
    extends IISPWebServiceEndpointBaseTest
{

    @Autowired
    private ApplicationContext applicationContext;

    private MockWebServiceClient mockClient;

    @Before
    public void createClient()
    {
        mockClient = MockWebServiceClient.createClient( applicationContext );
    }

    /**
     * Test that we return a IISP errorCode and errorMessage in case we don't found the entry in the database
     */
    @Test
    public void foreClosedPropertyNotFound()
    {
        Source requestPayload = new StringSource( getRequest( "request1.xml" ) );
        Source responsePayload = new StringSource( getResponse( "response1.xml" ) );
        mockClient.sendRequest( RequestCreators.withPayload( requestPayload ) ).andExpect( ResponseMatchers.payload( responsePayload ) );
    }

    /**
     * Response status must return a status of 1 which is the value coming from the DB. Make sure you have this record
     * on DB 'AB-14567', '1', 'YT-34FA123', NULL
     */
    @Test
    public void getForeClosedPropertyStatus()
    {
        // make sure you have this record on DB 'AB-14567', '1', 'YT-34FA123', NULL
        Source requestPayload = new StringSource( getRequest( "request2.xml" ) );
        Source responsePayload = new StringSource( getResponse( "response2.xml" ) );
        mockClient.sendRequest( RequestCreators.withPayload( requestPayload ) ).andExpect( ResponseMatchers.payload( responsePayload ) );

    }
}
