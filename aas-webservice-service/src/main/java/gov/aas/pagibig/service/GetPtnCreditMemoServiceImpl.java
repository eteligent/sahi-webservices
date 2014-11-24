package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLGetPtnCreditMemo;
import gov.aas.pagibig.dao.TBLGetPtnCreditMemoDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegPfmGetCmPayDetRequest;
import gov.aas.pagibig.webservice.IntegPfmGetCmPayDetResponse;
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
public class GetPtnCreditMemoServiceImpl
    implements GetPtnCreditMemoService
{

    @Autowired
    TBLGetPtnCreditMemoDAO postPdcDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(GetPtnCreditMemoServiceImpl.class );
    
    
    @Override
    public IntegPfmGetCmPayDetResponse getCM( IntegPfmGetCmPayDetRequest request)
    			throws IntegServiceException
    {
    	
    	
    	// create web service response object
    	IntegPfmGetCmPayDetResponse response = new IntegPfmGetCmPayDetResponse();
     
        // create record for update/insert
    
    	TBLGetPtnCreditMemo ptnCMForm = new TBLGetPtnCreditMemo();
    	
    	     
         try
         {
        	 ptnCMForm = postPdcDAOImpl.getPTNMem(request.getPayTrackNum(),request.getPayorName(),request.getBrCode(), request.getSysDate());
        		GregorianCalendar calendar = new GregorianCalendar();
				calendar.setTime(ptnCMForm.getCreditMemoDate());
				XMLGregorianCalendar xcalendar = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(calendar);
//				BigDecimal gAMT = ptnCMForm.getAmt();
             response.setPayTrackNum(ptnCMForm.getPayTrackNum());
             response.setPayorId(ptnCMForm.getPayorId());
             response.setPayorName(ptnCMForm.getPayorName());
             response.setCreditMemoNum(ptnCMForm.getCreditMemoNum());
             response.setCreditMemoDate(xcalendar);
             response.setPartic(ptnCMForm.getPartic());
             response.setAmt(String.valueOf(ptnCMForm.getAmt()));
             
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
