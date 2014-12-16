package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLGetPtnPaymDetails;
import gov.aas.pagibig.dao.TBLGetPtnPaymDetailsDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegPfmGetPtnAccInfoRequest;
import gov.aas.pagibig.webservice.IntegPfmGetPtnAccInfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This code needs xjc binding of xsd date to java date
 * http://stackoverflow.com/questions/835889/java-util-date-to-xmlgregoriancalendar move this to xjc binding
 * http://stackoverflow.com/questions/3679266/simple-conversion-between-java-util-date-and-xmlgregoriancalendar
 * 
 * @author Jowel
 */
@Service
public class GetPtnPaymDetailsServiceImpl
    implements GetPtnPaymDetailsService
{

    @Autowired
    TBLGetPtnPaymDetailsDAO getDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(GetPtnPaymDetailsServiceImpl.class );
    
    
    @Override
    public IntegPfmGetPtnAccInfoResponse getDET( IntegPfmGetPtnAccInfoRequest request)
    {
    	
    	
    	// create web service response object
    	IntegPfmGetPtnAccInfoResponse response = new IntegPfmGetPtnAccInfoResponse();
    	

        
        // create record for update/insert
    
    	TBLGetPtnPaymDetails getForm = new TBLGetPtnPaymDetails();

    	getForm.setPaymTrackNum( request.getPaymTrackNum() );
    
    
      
         
         try
         {
        	 getForm = getDAOImpl.getPTN( getForm );
         
             response.setPaymTrackNum(String.valueOf(getForm.getPaymTrackNum()));
             response.setAccTypeCode(String.valueOf(getForm.getAccTypeCode()));
             response.setAccTypeDesc(String.valueOf(getForm.getAccTypeDesc()));
             response.setAccNo(String.valueOf(getForm.getAccNo()));
             response.setDebitMemo(String.valueOf(getForm.getDebitMemo()));
             response.setPeriod(String.valueOf(getForm.getPeriod()));
             response.setPayAllo(String.valueOf(getForm.getPayAllo()));
             response.setAmount(String.valueOf(getForm.getAmount()));
             
         }
         catch ( IntegServiceException aase )
         {
             logger.error( "Failed to insert or update request ", aase );
             response.setError( IISPServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
         }
        catch ( Exception e )
         {
             logger.error( "Failed to insert or update request ", e );
             response.setError( IISPServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
         }

         return response;
     }

}
