package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.core.TBLGetPtnValuedatedTrans;
import gov.aas.pagibig.dao.TBLGetPtnValuedatedTransDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegPfmGetDatedPayRequest;
import gov.aas.pagibig.webservice.IntegPfmGetDatedPayResponse;
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
public class GetPtnValuedatedTransServiceImpl
    implements GetPtnValuedatedTransService
{

    @Autowired
    TBLGetPtnValuedatedTransDAO postPdcDAOImpl;

    private static final Logger logger =  	LoggerFactory.getLogger(GetPtnValuedatedTransServiceImpl.class );
    
    
    @Override
    public IntegPfmGetDatedPayResponse getGET( IntegPfmGetDatedPayRequest request)
    		throws IntegServiceException {
    	
    	
    	// create web service response object
    	IntegPfmGetDatedPayResponse response = new IntegPfmGetDatedPayResponse();
    	

        
        // create record for update/insert
    
    	TBLGetPtnValuedatedTrans ptnForm = new TBLGetPtnValuedatedTrans();


         
         try
         {
        	 ptnForm = postPdcDAOImpl.getPtnVal(request.getPayTrackNum(),request.getPayorName(),request.getBrCode(), request.getSysDate());
        	 GregorianCalendar calendar = new GregorianCalendar();
				calendar.setTime(ptnForm.getCheckDate());
				XMLGregorianCalendar xcalendar = DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(calendar);
				
             response.setPayTrackNum(String.valueOf(ptnForm.getPayTrackNum()));
             response.setPayorId(String.valueOf(ptnForm.getPayorId()));
             response.setPayorName(String.valueOf(ptnForm.getPayorName()));
             response.setPayorAddress(String.valueOf(ptnForm.getPayorAddress()));
             response.setPayorType(String.valueOf(ptnForm.getPayorType()));
             response.setAmtForPayment(String.valueOf(ptnForm.getAmtForPayment()));
             response.setPaymMode(String.valueOf(ptnForm.getPaymMode()));
             response.setCurrCode(String.valueOf(ptnForm.getCurrCode()));
             response.setBankCode(String.valueOf(ptnForm.getBankCode()));
             response.setBankName(String.valueOf(ptnForm.getBankName()));
             response.setCheckNo(String.valueOf(ptnForm.getCheckNo()));
             response.setCheckDate(String.valueOf(ptnForm.getCheckDate()));
             response.setCheckType(String.valueOf(ptnForm.getCheckType()));
             
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
