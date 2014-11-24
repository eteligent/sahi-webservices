package gov.aas.pagibig.dao;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLDuePdcSummary;

public interface TBLDuePdcSummaryDAO {
	public List<TBLDuePdcSummary> getDuePdcSummary(XMLGregorianCalendar date) throws IntegServiceException;
}
