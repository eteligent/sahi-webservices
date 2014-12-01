package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLInsertPofDetails;
import java.util.List;

public interface TBLGetPofDetailDAO
{

  public List<TBLInsertPofDetails> getPOFDetail(String pofNo)
		  throws IntegServiceException;

}
