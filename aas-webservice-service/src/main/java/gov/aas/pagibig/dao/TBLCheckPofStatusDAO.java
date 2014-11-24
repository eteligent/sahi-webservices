package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLUpdatePofStatus;

public interface TBLCheckPofStatusDAO
{

  public TBLUpdatePofStatus checkPOFStats(String pofNo, String payorName, String src)throws IntegServiceException;

}
