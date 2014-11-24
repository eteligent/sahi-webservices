package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.SearchDayRatesService;
import gov.aas.pagibig.webservice.IntegTfmsGetDayRatesRequest;
import gov.aas.pagibig.webservice.IntegTfmsGetDayRatesResponse;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SearchDayRatesEndpoint
{
    private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

    private static final Logger logger = LoggerFactory.getLogger( SearchDayRatesEndpoint.class );

    @Autowired
    private SearchDayRatesService searchDayRatesService;

    @PayloadRoot( localPart = "integ_tfms_get_day_rates_Request", namespace = TARGET_NAMESPACE )
    public @ResponsePayload
    IntegTfmsGetDayRatesResponse getDayCurrency( @RequestPayload
    		IntegTfmsGetDayRatesRequest request )
    				throws IntegServiceException 
    {
        logger.info( "entering getDayCurrency" );
        IntegTfmsGetDayRatesResponse response = searchDayRatesService.getDayCurrency( request );
        logger.info( "exiting getDayCurrency" );
        
        return response;
    }
}
