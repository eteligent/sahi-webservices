package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TBLUpdatePofStatusDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcUpdatePofStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcUpdatePofStatusResponse;
import gov.aas.pagibig.webservice.core.TBLUpdatePofStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UpdatePofStatusServiceImpl
    implements UpdatePofStatusService
{

    @Autowired
    TBLUpdatePofStatusDAO updatePofStatusDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( UpdatePofStatusServiceImpl.class );

    @Override
    public IntegOtcUpdatePofStatusResponse updatePofStatus( IntegOtcUpdatePofStatusRequest request )
    {
        
        IntegOtcUpdatePofStatusResponse response = new IntegOtcUpdatePofStatusResponse();
     
        try
        {
        	
        	updatePofStatusDAOImpl.updatePOFStatus(request.getPofNo(),
        											 request.getPayorName(),
        											 request.getPfrNo(),
        											 request.getSrc(),
        											 request.getTotalAmt(),
        											 request.getGeneratedBy(),
        											 request.getDateGenerated(),
        											 request.getStatus(),
        											 request.getDatePaym(),
        											 request.getReceivingUnit(),
        											 request.getOfcNo());
        	
        	response.setResponseCode( AASServiceUtil.STATUS_SUCCESS );
        	response.setResponseMessage("Successful");
        }
        catch ( IntegServiceException aase )
        {
            logger.error( "Failed to udpate POF Status ", aase );
            response.setError( AASServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
        }
        
        catch ( Exception e )
        {
            logger.error( "Failed to update POF Status ", e );
            response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }

        return response;
    }

}
