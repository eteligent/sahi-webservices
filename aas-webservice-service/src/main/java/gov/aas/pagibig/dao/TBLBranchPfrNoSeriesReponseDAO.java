package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLBranchPfrNoSeries;

public interface TBLBranchPfrNoSeriesReponseDAO{
	public TBLBranchPfrNoSeries getBranchPfrNoSeries(String branchCode) throws IntegServiceException;
}
