package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.ForeClosedPropertyService;
import gov.aas.pagibig.webservice.IntegAasGetForeStatusRequest;
import gov.aas.pagibig.webservice.IntegAasGetForeStatusResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ForeClosedPropertyEndpoint
{
    private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

    private static final Logger logger = LoggerFactory.getLogger( ForeClosedPropertyEndpoint.class );

    @Autowired
    private ForeClosedPropertyService foreClosedPropertyService;

    @PayloadRoot( localPart = "integ_aas_get_fore_statusRequest", namespace = TARGET_NAMESPACE )
    public @ResponsePayload
    IntegAasGetForeStatusResponse getForeClosedProperty( @RequestPayload
    IntegAasGetForeStatusRequest request )
    {
        logger.info( "entering getForeClosedProperty" );
        IntegAasGetForeStatusResponse response = foreClosedPropertyService.getForeClosedProperty( request );
        logger.info( "exiting getForeClosedProperty" );

        return response;
    }
}
