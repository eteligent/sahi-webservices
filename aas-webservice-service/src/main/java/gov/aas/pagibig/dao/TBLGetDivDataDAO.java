package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLGetDivData;
import javax.xml.datatype.XMLGregorianCalendar;


public interface TBLGetDivDataDAO
{

  public TBLGetDivData getDData(String deptCode, XMLGregorianCalendar lastUpdatedDatetime)
		  throws IntegServiceException;

}
