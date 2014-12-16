package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TBLInsertPofDetailsDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofDetailRequest;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofDetailResponse;
import gov.aas.pagibig.webservice.core.TBLInsertPofDetails;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InsertPofDetailsServiceImpl
    implements InsertPofDetailsService
{

    @Autowired
    TBLInsertPofDetailsDAO tbInsertPofDetailsDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( InsertPofDetailsServiceImpl.class );

    @Override
    public IntegOtcInsertAcqPofDetailResponse insertPofDetails( IntegOtcInsertAcqPofDetailRequest request )
    {
        
    	IntegOtcInsertAcqPofDetailResponse response = new IntegOtcInsertAcqPofDetailResponse();
      
 
        try
        {
        	
        	tbInsertPofDetailsDAOImpl.insertPOFDetail(request.getPofNo(),
        											 request.getAccountTypeCode(),
        											 request.getAccountType(),
        											 request.getAmount());
        	response.setResponseCode("1");
        	response.setResponseMessage("Success");
        }
        catch ( IntegServiceException aase )
        {
            logger.error( "Failed to insert POF Header ", aase );
            response.setError( IISPServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
        }
        
        catch ( Exception e )
        {
            logger.error( "Failed to insert POF Header  ", e );
            response.setError( IISPServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }

        return response;
    }

}
