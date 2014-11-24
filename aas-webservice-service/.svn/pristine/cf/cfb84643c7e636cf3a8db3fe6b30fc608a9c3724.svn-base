package gov.aas.pagibig.dao;

import gov.aas.pagibig.webservice.core.TbSearchDayRates;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.Date;

@Repository
public class TbSearchDayRatesDAOImpl
    implements TbSearchDayRatesDAO
{

    @PersistenceContext
    private EntityManager em;
    
    
    @SuppressWarnings( "unchecked" )
    @Override
    public TbSearchDayRates get_DayCurrencyRates( XMLGregorianCalendar currentBrDate) 
    		throws IntegServiceException
    {
 
    	if(currentBrDate == null){
			throw new IntegServiceException("-FAILED TO SEND REQUEST:Invalid date format! format must be yyyy-mm-dd", 
					IntegErrorCode.REQUEST_FORMAT_INVALID);
		}
	
		List<TbSearchDayRates> returnList = em
				.createNamedQuery("TbSearchDayRates.getCurrentBrDate")
				.setParameter("currentBrDate", currentBrDate.toGregorianCalendar().getTime())
				.getResultList();
		
	
		if (returnList.isEmpty()) 
		{
			throw new IntegServiceException(
					"-FAILED TO SEND REQUEST:Currency rate NOT FOUND!", IntegErrorCode.DAY_CURRENCY_RATE_NOT_FOUND);
		}
		
		TbSearchDayRates tbSearchDayRates = returnList.get( 0 );
		
		return tbSearchDayRates;
    }
   
}