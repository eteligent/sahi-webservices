package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TbGetPtnShortpaymInfo;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface TbGetPtnShortpaymInfoDAO
{
	public List<TbGetPtnShortpaymInfo> get_PtnShortpaymInfo(  String payTrackNum, String payorName, String brCode, XMLGregorianCalendar date )
        throws IntegServiceException;
}
