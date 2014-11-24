package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLPostPdcpaymStatus;
import gov.aas.pagibig.dao.TBLPostPdcpaymStatusDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcPostPdcpaymStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcPostPdcpaymStatusResponse;
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
public class PostPdcpaymStatusServiceImpl
    implements PostPdcpaymStatusService
{

    @Autowired
    TBLPostPdcpaymStatusDAO postPdcDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(PostPdcpaymStatusServiceImpl.class );
    
    
    @Override
    public IntegOtcPostPdcpaymStatusResponse updatePDCStatus( IntegOtcPostPdcpaymStatusRequest request)
    {
    	
    	
    	// create web service response object
    	IntegOtcPostPdcpaymStatusResponse response = new IntegOtcPostPdcpaymStatusResponse();
    	

        
        // create record for update/insert
    
    	TBLPostPdcpaymStatus pdcForm = new TBLPostPdcpaymStatus();

	 	pdcForm.setTransStatus(1);
    	pdcForm.setStatus( request.getStatus() );
    	pdcForm.setPdcRefNo( request.getPdcRefNo());
        pdcForm.setPayorId( request.getPayorId());
      
         
         try
         {
             pdcForm = postPdcDAOImpl.updatePOSTPdc( pdcForm );
          
             response.setResponseCode(1);
             response.setResponseMessage("Success");
         }
         catch ( IntegServiceException aase )
         {
             logger.error( "Failed to insert or update request ", aase );
             response.setError( AASServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
         }
         catch ( Exception e )
         {
             logger.error( "Failed to insert or update request ", e );
             response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
         }

         return response;
     }

}
