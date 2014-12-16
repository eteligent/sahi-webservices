package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TbGetUnitdeptInfoDAO;
import gov.aas.pagibig.webservice.core.TbGetUnitdeptInfo;
import gov.aas.pagibig.webservice.IntegHrGetUnitInfoRequest;
import gov.aas.pagibig.webservice.IntegHrGetUnitInfoResponse;
import gov.aas.pagibig.webservice.IntegHrGetUnitInfoResponseList;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GetUnitdeptInfoServiceImpl
    implements GetUnitdeptInfoService
{

    @Autowired
    TbGetUnitdeptInfoDAO tbGetUnitdeptInfoDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( GetUnitdeptInfoServiceImpl.class );

    @Override
    public IntegHrGetUnitInfoResponse getUnitdeptInfo( IntegHrGetUnitInfoRequest request )
    		throws IntegServiceException
    {
    	
    	IntegHrGetUnitInfoResponse response = new IntegHrGetUnitInfoResponse();
    	
    	logger.debug( "getUnitdeptInfo getSourceSysId= " + request.getSourceSysId() );
        logger.debug( "getUnitdeptInfo getUserName= " + request.getUserName() );
        logger.debug( "getUnitdeptInfo getPassword= "+ request.getPassword());
       
        logger.debug( "getUnitdeptInfo getBranchCode= "+ request.getBranchCode());
        
       
        List<TbGetUnitdeptInfo> getUnitDeptInfoResultSet;
        
        try
        {
      
        	getUnitDeptInfoResultSet = tbGetUnitdeptInfoDAOImpl.getUnitdept_Info(request.getBranchCode());
			
			List<IntegHrGetUnitInfoResponseList> unitInfoReturnList = 
												response.getIntegHrGetUnitInfoResponseList();
    			
    			for (TbGetUnitdeptInfo result : getUnitDeptInfoResultSet) 
    			{
    				
    				IntegHrGetUnitInfoResponseList responseList = new IntegHrGetUnitInfoResponseList();
    				
    				responseList.setUnitCode(result.getBranchCode());
    				responseList.setUnitDescription(result.getDeptCode());
    				
    				unitInfoReturnList.add(responseList);

    			}
    			
        }
        
        catch (IntegServiceException aase) 
        {
        	logger.error( "Failed to get Unit/Dept. Info", aase );
        	response.setError(IISPServiceUtil.createError(aase.getErrorCode(), aase.getMessage()));
		}
        catch ( Exception e )
        {
            logger.error( "Failed to get Unit/Dept. Info ", e );
            response.setError( IISPServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }
	    
	        return response;
	        
	    }

}
