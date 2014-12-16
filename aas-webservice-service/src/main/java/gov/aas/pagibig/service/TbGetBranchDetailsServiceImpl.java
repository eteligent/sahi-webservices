package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TbGetBranchDetailsDAO;
import gov.aas.pagibig.webservice.core.TbGetBranchDetails;
import gov.aas.pagibig.webservice.IntegHrGetBrDetailsRequest;
import gov.aas.pagibig.webservice.IntegHrGetBrDetailsResponse;
import gov.aas.pagibig.webservice.IntegHrGetBrDetailsResponseList;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TbGetBranchDetailsServiceImpl
    implements TbGetBranchDetailsService
{

    @Autowired
    TbGetBranchDetailsDAO tbGetBranchDetailsDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( TbGetBranchDetailsServiceImpl.class );

    @Override
    public IntegHrGetBrDetailsResponse getBranchDetails( IntegHrGetBrDetailsRequest request )
    		throws IntegServiceException
    {
    	
    	IntegHrGetBrDetailsResponse response = new IntegHrGetBrDetailsResponse();
    	
    	logger.debug( "getBranchDetails getSourceSysId= " + request.getSourceSysId() );
        logger.debug( "getBranchDetails getUserName= " + request.getUserName() );
        logger.debug( "getBranchDetails getPassword= "+ request.getPassword());
       
        List<TbGetBranchDetails> getBranchDetailsResultSet;
        
        try
        {
      
        	getBranchDetailsResultSet = tbGetBranchDetailsDAOImpl.getBranch_Details();
			
			List<IntegHrGetBrDetailsResponseList> branchDetailsReturnList = 
																		response.getIntegHrGetBrDetailsResponseList();
    			
    			for (TbGetBranchDetails result : getBranchDetailsResultSet) 
    			{
    				
    				IntegHrGetBrDetailsResponseList responseList = new IntegHrGetBrDetailsResponseList();
    				
    				responseList.setBranchcode(result.getBranchCode());
    				responseList.setBranchdesc(result.getBranchDesc());
    				
    				branchDetailsReturnList.add(responseList);

    			}
    			
        }
        
        catch (IntegServiceException aase) 
        {
        	logger.error( "Failed to get Branch Details! ", aase );
        	response.setError(IISPServiceUtil.createError(aase.getErrorCode(), aase.getMessage()));
		}
        catch ( Exception e )
        {
            logger.error( "Failed to get Branch Details! ", e );
            response.setError( IISPServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }
	    
	        return response;
	        
	    }

}
