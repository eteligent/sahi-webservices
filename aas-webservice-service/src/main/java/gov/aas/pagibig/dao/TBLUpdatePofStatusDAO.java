package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLUpdatePofStatus;
import javax.xml.datatype.XMLGregorianCalendar;


public interface TBLUpdatePofStatusDAO
{

  public void updatePOFStatus( 
		  String pofNo, String payorName, String pfrNo, 
		  String src, float totalAmt, String generatedBy, XMLGregorianCalendar dateGenerated, 
		  String status, XMLGregorianCalendar datePaym, String receivingUnit, int ofcNo, 
		  XMLGregorianCalendar pofDate, int payMode, int currencyCode)
   throws IntegServiceException;

}
