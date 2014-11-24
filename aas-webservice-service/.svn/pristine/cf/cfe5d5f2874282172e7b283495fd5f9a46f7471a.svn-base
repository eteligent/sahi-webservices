package gov.aas.pagibig.dao;

import java.util.List;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLDuePdcSummary;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Repository;

@Repository
public class TBLDuePdcSummaryDAOImpl implements TBLDuePdcSummaryDAO {

	@PersistenceContext
	EntityManager em;
	@SuppressWarnings("unchecked")
	@Override
	public List<TBLDuePdcSummary> getDuePdcSummary(XMLGregorianCalendar date) throws IntegServiceException {
		if(date == null){
			throw new IntegServiceException("Invalid date format! format must be yyyy-mm-dd", IntegErrorCode.REQUEST_FORMAT_INVALID);
		}
		List <TBLDuePdcSummary> result = em.createNamedQuery("TBLDuePdcSummary.getDuePdcSummary").setParameter("pdcDate",date.toGregorianCalendar().getTime()).getResultList();
		if(result.isEmpty()){
			throw new IntegServiceException("No Result!", IntegErrorCode.PDC_SUMMARY_EMPTY);
		}
		
		return result;
	}

}
