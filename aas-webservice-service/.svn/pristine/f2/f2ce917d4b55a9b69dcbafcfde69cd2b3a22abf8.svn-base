package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TbSearchDayRatesDAO;
import gov.aas.pagibig.webservice.core.TbSearchDayRates;
import gov.aas.pagibig.webservice.IntegTfmsGetDayRatesRequest;
import gov.aas.pagibig.webservice.IntegTfmsGetDayRatesResponse;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

@Service
public class SearchDayRatesServiceImpl
    implements SearchDayRatesService
{

    @Autowired
    TbSearchDayRatesDAO tbSearchDayRatesDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( SearchDayRatesServiceImpl.class );

    @Override
    public IntegTfmsGetDayRatesResponse getDayCurrency( IntegTfmsGetDayRatesRequest request )
    		throws IntegServiceException
    {
    	
    	IntegTfmsGetDayRatesResponse response = new IntegTfmsGetDayRatesResponse();
    	
    	logger.debug( "getDayCurrency getSourceSysId= " + request.getSourceSysId() );
        logger.debug( "getDayCurrency getUserName= " + request.getUserName() );
        logger.debug( "getDayCurrency getPassword= "+ request.getPassword());
       
        logger.debug( "getDayCurrency getCurrentBrDate= " + request.getCurrentBrDate());
       
        TbSearchDayRates searchDayRates = new TbSearchDayRates();
        
        
        try
        {
        	searchDayRates = tbSearchDayRatesDAOImpl.get_DayCurrencyRates(request.getCurrentBrDate());
      
        	GregorianCalendar calendar1 = new GregorianCalendar();
			calendar1.setTime(searchDayRates.getCurrentBrDate());
			XMLGregorianCalendar xCurrentBrDate = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(calendar1);
			
			GregorianCalendar calendar2 = new GregorianCalendar();
			calendar2.setTime(searchDayRates.getCurrencyDate());
			XMLGregorianCalendar xCurrencyDate = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(calendar2);
			
        	response.setCurrentbrdate(xCurrentBrDate);
            response.setCurrencycode(searchDayRates.getCurrencyCode());
            response.setCurrencydate(xCurrencyDate);
            response.setRates(searchDayRates.getRates());
        }
        
	catch (IntegServiceException aase1) 
    {
		logger.error( "Failed to getDayCurrency", aase1 );
		response.setError(AASServiceUtil.createError(aase1.getErrorCode(), aase1.getMessage()));
	} 
    catch (DatatypeConfigurationException aase2) 
    {
    	logger.error( "Failed to getDayCurrency", aase2 );
		response.setError(AASServiceUtil.createError(IntegErrorCode.SERVER_EXCEPTION, aase2.getMessage()));
	}
    catch ( Exception e )
    {
        logger.error( "Failed to getDayCurrency", e );
        response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
    }

	        return response;
	        
  }

}
