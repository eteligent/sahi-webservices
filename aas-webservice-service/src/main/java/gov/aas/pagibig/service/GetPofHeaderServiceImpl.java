package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TbInsertPofHeader;
import gov.aas.pagibig.dao.TbGetPofHeaderDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcGetPofHeaderRequest;
import gov.aas.pagibig.webservice.IntegOtcGetPofHeaderResponse;
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
public class GetPofHeaderServiceImpl
    implements GetPofHeaderService
{

    @Autowired
    TbGetPofHeaderDAO getPofDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(GetPofHeaderServiceImpl.class );
    
    
    @Override
    public IntegOtcGetPofHeaderResponse getPOFHead( IntegOtcGetPofHeaderRequest request)
    		throws IntegServiceException {
    	
    	// create web service response object
    	IntegOtcGetPofHeaderResponse response = new IntegOtcGetPofHeaderResponse();   
        // create record for update/insert
    
    	TbInsertPofHeader pofForm = new TbInsertPofHeader(); 
         try
         {
        	 pofForm = getPofDAOImpl.getPOFHeader(request.getPofNo());
     			
             response.setPofDate(String.valueOf(pofForm.getPofDate()));
             response.setPayorName(String.valueOf(pofForm.getPayorName()));
             response.setPayMode(String.valueOf(pofForm.getPayMode()));
             response.setUserId(String.valueOf(pofForm.getUserId()));    
             response.setCurrencyCode(String.valueOf(pofForm.getCurrencyCode()));
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
