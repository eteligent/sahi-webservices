package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TbInsertPofHeader;

public interface TbGetPofHeaderDAO
{

  public TbInsertPofHeader getPOFHeader( String pofNo)throws IntegServiceException;

}
