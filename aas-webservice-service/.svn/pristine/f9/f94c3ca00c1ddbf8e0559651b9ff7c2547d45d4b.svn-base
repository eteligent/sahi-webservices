package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.TbGetBranchDetailsService;
import gov.aas.pagibig.webservice.IntegHrGetBrDetailsRequest;
import gov.aas.pagibig.webservice.IntegHrGetBrDetailsResponse;
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
public class TbGetBranchDetailsEndpoint
{
    private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

    private static final Logger logger = LoggerFactory.getLogger( TbGetBranchDetailsEndpoint.class );

    @Autowired
    private TbGetBranchDetailsService tbGetBranchDetailsService;

    @PayloadRoot( localPart = "integ_hr_get_br_detailsRequest", namespace = TARGET_NAMESPACE )
    public @ResponsePayload
    IntegHrGetBrDetailsResponse getBranchDetails( @RequestPayload
    		IntegHrGetBrDetailsRequest request )
    				throws IntegServiceException 
    {
        logger.info( "entering getBranchDetails" );
        IntegHrGetBrDetailsResponse response = tbGetBranchDetailsService.getBranchDetails( request );
        logger.info( "exiting getBranchDetails" );
        
        return response;
    }
}
