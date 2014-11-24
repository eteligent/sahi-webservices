package gov.aas.pagibig.service;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.TestingPostingRequest;
import gov.aas.pagibig.webservice.TestingPostingResponse;
import gov.aas.pagibig.webservice.core.Tester;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TesterServiceImpl
    implements TesterService
{

//    @Autowired
//    TesterDAO insertPSTGL;

    private static final Logger logger = LoggerFactory.getLogger( TesterServiceImpl.class );

    @Override
    public TestingPostingResponse postingGL( TestingPostingRequest request )
    {
        
        TestingPostingResponse response = new TestingPostingResponse();

        
        String ssiHandler = String.valueOf(request.getSourceSysId());
        try
        {
        	if( ssiHandler == null){
        		
        		 throw new IntegServiceException( "Required Fiels cannot be null!",
                         IntegErrorCode.POF_NO_NOT_FOUND );
        	}
        	else{
 
        	response.setStatus(ssiHandler);
        	}
        }
        catch ( IntegServiceException aase )
        {
            logger.error( "Failed to insert POF Header ", aase );
            response.setError( AASServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
        }
        
        catch ( Exception e )
        {
            logger.error( "Failed to insert POF Header  ", e );
            response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }

        return response;
    }

}
