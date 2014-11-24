package gov.aas.pagibig.dao;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLHolidayInformation;

public interface TBLHolidayInformationDAO {
	public List<TBLHolidayInformation> getHolidayInformation( XMLGregorianCalendar from,  XMLGregorianCalendar to) throws IntegServiceException;
}
