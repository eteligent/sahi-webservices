package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLHolidayInformation;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Repository;

@Repository
public class TBLHolidayInformationDAOImpl implements TBLHolidayInformationDAO {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TBLHolidayInformation> getHolidayInformation( XMLGregorianCalendar from,  XMLGregorianCalendar to)
			throws IntegServiceException {

		if(from == null || to == null){
			throw new IntegServiceException("Invalid date format! format must be yyyy-mm-dd", IntegErrorCode.REQUEST_FORMAT_INVALID);
		}
		List<TBLHolidayInformation> returnList = em
				.createNamedQuery("TBLHolidayInformation.getHolidayInformation")
				.setParameter("from", from.toGregorianCalendar().getTime()).setParameter("to", to.toGregorianCalendar().getTime())
				.getResultList();
		
		
		if (returnList.isEmpty()) {
			throw new IntegServiceException(
					"No holidays found on selected period!", IntegErrorCode.HOLIDAY_INFORMATION_EMPTY);
		}
		return returnList;
	}

}
