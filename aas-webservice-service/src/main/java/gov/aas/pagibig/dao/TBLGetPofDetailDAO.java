package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLInsertPofDetails;

public interface TBLGetPofDetailDAO
{

  public TBLInsertPofDetails getPOFDetail(String pofNo)
		  throws IntegServiceException;

}
