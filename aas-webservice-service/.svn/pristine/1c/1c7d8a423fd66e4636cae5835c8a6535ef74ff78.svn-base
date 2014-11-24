package gov.aas.pagibig.service.endpoints;

import gov.aas.pagibig.service.BranchPfrNoSeriesService;
import gov.aas.pagibig.webservice.IntegCmsGetBranchPfrNoSeriesRequest;
import gov.aas.pagibig.webservice.IntegCmsGetBranchPfrNoSeriesResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BranchPfrNoSeriesEndpoint {
    private static final String TARGET_NAMESPACE = "http://gov/aas/pagibig/webservice";

    private static final Logger logger = LoggerFactory.getLogger( BranchPfrNoSeriesEndpoint.class );

    @Autowired
    private BranchPfrNoSeriesService branchPfrNoSeriesServiceImpl;

    @PayloadRoot( localPart = "integ_cms_get_branch_pfr_no_seriesRequest", namespace = TARGET_NAMESPACE )
    public @ResponsePayload
    IntegCmsGetBranchPfrNoSeriesResponse getBranchPfrSeries( @RequestPayload
    IntegCmsGetBranchPfrNoSeriesRequest request )
    {
        logger.info( "entering getBranchPfrSeries" );
        IntegCmsGetBranchPfrNoSeriesResponse response = branchPfrNoSeriesServiceImpl.getBranchPfrNoSeries(request);
        logger.info( "exiting getBranchPfrSeries" );

        return response;
    }

}
