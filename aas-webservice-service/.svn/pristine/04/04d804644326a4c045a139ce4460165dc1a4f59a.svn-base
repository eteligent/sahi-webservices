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
public class PaymentOrderFormEndpointTest
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
     * Test that the request sent is invalid(due to date is null) and we are able to return an sensible error message
     * and not the java.lang.NullPointerException
     */
    @Test
    public void testInvalidRequestSOAPFaultException()
    {
        Source requestPayload = new StringSource( getRequest( "pof_request1.xml" ) );
        String faultstring = getResponse( "pof_response1.xml" );
        mockClient.sendRequest( RequestCreators.withPayload( requestPayload ) ).andExpect( ResponseMatchers.serverOrReceiverFault( faultstring ) );
    }

}
