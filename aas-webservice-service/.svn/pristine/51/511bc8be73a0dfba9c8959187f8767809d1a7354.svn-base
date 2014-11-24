package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.GetUnitdeptInfoService;
import gov.aas.pagibig.webservice.IntegHrGetUnitInfoRequest;
import gov.aas.pagibig.webservice.IntegHrGetUnitInfoResponse;
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
public class GetUnitdeptInfoEndpoint
{
    private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

    private static final Logger logger = LoggerFactory.getLogger( GetUnitdeptInfoEndpoint.class );

    @Autowired
    private GetUnitdeptInfoService getUnitdeptInfoService;

    @PayloadRoot( localPart = "integ_hr_get_unit_info_Request", namespace = TARGET_NAMESPACE )
    public @ResponsePayload
    IntegHrGetUnitInfoResponse getUnitdeptInfo( @RequestPayload
    		IntegHrGetUnitInfoRequest request )
    				throws IntegServiceException 
    {
        logger.info( "entering getUnitDeptInfo" );
        IntegHrGetUnitInfoResponse response = getUnitdeptInfoService.getUnitdeptInfo( request );
        logger.info( "exiting getUnitDeptInfo" );
        
        return response;
    }
}
