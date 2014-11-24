package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLUpdatePofStatus;
import gov.aas.pagibig.dao.TBLCheckPofStatusDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcCheckPofStatusRequest;
import gov.aas.pagibig.webservice.IntegOtcCheckPofStatusResponse;
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
public class CheckPofStatusServiceImpl
    implements CheckPofStatusService
{

    @Autowired
    TBLCheckPofStatusDAO checkPofDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(CheckPofStatusServiceImpl.class );
    
    
    @Override
    public IntegOtcCheckPofStatusResponse checkPofStatus( IntegOtcCheckPofStatusRequest request)
    		throws IntegServiceException {
    	
    	// create web service response object
    	IntegOtcCheckPofStatusResponse response = new IntegOtcCheckPofStatusResponse();   
        // create record for update/insert
    
    	TBLUpdatePofStatus pofForm = new TBLUpdatePofStatus(); 
         try
         {
        	 pofForm = checkPofDAOImpl.checkPOFStats(request.getPofNo(),
        			 								 request.getPayorName(),
        			 								 request.getSrc());
     			
             response.setPofNo(String.valueOf(pofForm.getPofNo()));
             response.setPfrNo(String.valueOf(pofForm.getPfrNo()));
             response.setDatePaym(String.valueOf(pofForm.getDatePaym()));
             response.setTotalAmt(String.valueOf(pofForm.getTotalAmt()));    
             response.setReceivingUnit(String.valueOf(pofForm.getReceivingUnit()));
             response.setOfcNo(String.valueOf(pofForm.getOfcNo()));
         }
         catch ( IntegServiceException aase )
         {
             logger.error( "Failed to insert or update request ", aase );
             response.setError( AASServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
         }
         catch ( Exception e )
         {
             logger.error( "Failed to insert or update request ", e );
             response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE") );
         }

         return response;
     }

}
