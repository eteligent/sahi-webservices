package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLInsertPofDetails;
import gov.aas.pagibig.dao.TBLGetPofDetailDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcGetPofDetailRequest;
import gov.aas.pagibig.webservice.IntegOtcGetPofDetailResponse;
import gov.aas.pagibig.webservice.IntegOtcGetPofDetailResponseList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

/**
 * This code needs xjc binding of xsd date to java date
 * http://stackoverflow.com/questions/835889/java-util-date-to-xmlgregoriancalendar move this to xjc binding
 * http://stackoverflow.com/questions/3679266/simple-conversion-between-java-util-date-and-xmlgregoriancalendar
 * 
 * @author Jowel
 */
@Service
public class GetPofDetailServiceImpl
    implements GetPofDetailService
{

    @Autowired
    TBLGetPofDetailDAO getPofDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(GetPofDetailServiceImpl.class );
    
    
    @Override
    public IntegOtcGetPofDetailResponse getPOFDet( IntegOtcGetPofDetailRequest request)
    		throws IntegServiceException {
    	
    	// create web service response object
    	IntegOtcGetPofDetailResponse response = new IntegOtcGetPofDetailResponse();   
        // create record for update/insert
    
    	List<TBLInsertPofDetails> getPofDetailsResultSet ; 
         try
         {
        	 
        	 getPofDetailsResultSet = getPofDAOImpl.getPOFDetail(request.getPofNo());
        			 
        	 List<IntegOtcGetPofDetailResponseList> returnList = response.getIntegOtcGetPofDetailResponseList(); 
        	 for(TBLInsertPofDetails result : getPofDetailsResultSet){
        		 
        		 IntegOtcGetPofDetailResponseList responseList = new IntegOtcGetPofDetailResponseList();
        		 
        		 responseList.setPofNo(result.getPofNo());
        		 responseList.setAccountTypeCode(result.getAccountTypeCode());
        		 responseList.setAccountType(result.getAccountType());
        		 responseList.setAmount(result.getAmount());
        		 
        		 returnList.add(responseList);
        		 
        	 }
     			
         }
         catch ( IntegServiceException aase )
         {
             logger.error( "Failed to insert or update request ", aase );
             response.setError( IISPServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
         }
         catch ( Exception e )
         {
             logger.error( "Failed to insert or update request ", e );
             response.setError( IISPServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE") );
         }

         return response;
     }

}
