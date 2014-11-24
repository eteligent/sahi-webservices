package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TbGetPtnShortpaymInfoDAO;
import gov.aas.pagibig.webservice.core.TbGetPtnShortpaymInfo;
import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoRequest;
import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoResponse;
import gov.aas.pagibig.webservice.IntegPfmGetPtnInfoResponseList;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Service
public class GetPtnShortpaymInfoServiceImpl
    implements GetPtnShortpaymInfoService
{

    @Autowired
    TbGetPtnShortpaymInfoDAO tbGetPtnShortpaymInfoDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( GetPtnShortpaymInfoServiceImpl.class );

    @Override
    public IntegPfmGetPtnInfoResponse getPtnShortpaymInfo( IntegPfmGetPtnInfoRequest request )
    {
    	IntegPfmGetPtnInfoResponse response = new IntegPfmGetPtnInfoResponse();
    	
    	logger.debug( "getPtnShortpaymInfo getSourceSysId= " + request.getSourceSysId() );
        logger.debug( "getPtnShortpaymInfo getUserName= " + request.getUserName() );
        logger.debug( "getPtnShortpaymInfo getPassword= "+ request.getPassword());
       
        logger.debug( "getPtnShortpaymInfo getPayTrackNum= " + request.getPayTrackNum());
        logger.debug( "getPtnShortpaymInfo getPayorName= " + request.getPayorName());
        logger.debug( "getPtnShortpaymInfo getBrCode= "+ request.getBrCode());
        logger.debug( "getPtnShortpaymInfo getDate= " + request.getDate());
      
        List<TbGetPtnShortpaymInfo> getPtnShortpaymInfoResultSet;
        
        try
        {
        	
        	getPtnShortpaymInfoResultSet = tbGetPtnShortpaymInfoDAOImpl.
    					get_PtnShortpaymInfo(  request.getPayTrackNum(), 
    											request.getPayorName(), 
    											request.getBrCode(), 
    											request.getDate() );
    			
    			List<IntegPfmGetPtnInfoResponseList> getPtnShortpaymInfoReturnList = response
    					.getIntegPfmGetPtnInfoResponseList();
    			
    			for (TbGetPtnShortpaymInfo result : getPtnShortpaymInfoResultSet) {
    				
    				IntegPfmGetPtnInfoResponseList responseList = new IntegPfmGetPtnInfoResponseList();
    				
    				GregorianCalendar calendar = new GregorianCalendar();
    				calendar.setTime(result.getDate());
    				XMLGregorianCalendar xcalendar = DatatypeFactory.newInstance()
    						.newXMLGregorianCalendar(calendar);
    				
    				responseList.setPaytracknum(result.getPayTrackNum());
    				responseList.setPayorid(result.getPayorId());
    				responseList.setPayorname(result.getPayorName());
    				responseList.setPayoraddress(result.getPayorAddress());
    				responseList.setPayortype(result.getPayorType());
    				responseList.setPaymmode(result.getPaymMode());
    				responseList.setCurrcode(result.getCurrCode());
    				getPtnShortpaymInfoReturnList.add(responseList);

    			}
    			
        }
        
    catch (IntegServiceException aase1)
    {
    	logger.error( "Failed to get PtnShortpaymInfo", aase1 );
		response.setError(AASServiceUtil.createError(aase1.getErrorCode(), aase1.getMessage()));
	} 
    catch (DatatypeConfigurationException aase2)
    {
		logger.error( "Failed to get PtnShortpaymInfo ", aase2 );
		response.setError(AASServiceUtil.createError(IntegErrorCode.SERVER_EXCEPTION, aase2.getMessage()));
	}
    catch ( Exception e )
    {
        logger.error( "Failed to get PtnShortpaymInfo ", e );
        response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
    }

        return response;
        
    }

}
