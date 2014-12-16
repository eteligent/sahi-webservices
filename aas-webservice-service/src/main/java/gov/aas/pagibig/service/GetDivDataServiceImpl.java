package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLGetDivData;
import gov.aas.pagibig.dao.TBLGetDivDataDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegHrisGetDivDataRequest;
import gov.aas.pagibig.webservice.IntegHrisGetDivDataResponse;
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
public class GetDivDataServiceImpl
    implements GetDivDataService
{

    @Autowired
    TBLGetDivDataDAO getDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(GetDivDataServiceImpl.class );
    
    
    @Override
    public IntegHrisGetDivDataResponse getDivision( IntegHrisGetDivDataRequest request)
    			throws IntegServiceException
    {
    	
    	
    	// create web service response object
    	IntegHrisGetDivDataResponse response = new IntegHrisGetDivDataResponse();
     
        // create record for update/insert
    
    	TBLGetDivData divForm = new TBLGetDivData();
    	
    	     
         try
         {
        	 divForm = getDAOImpl.getDData(request.getDeptCode(),request.getLastUpdatedDatetime());
             
        	 response.setDeptCode(divForm.getDeptCode());
             response.setDivCode(divForm.getDivCode());
             response.setDivName(divForm.getDivName());             
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
