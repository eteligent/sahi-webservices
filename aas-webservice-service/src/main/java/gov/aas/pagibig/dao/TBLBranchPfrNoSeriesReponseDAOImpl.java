package gov.aas.pagibig.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLBranchPfrNoSeries;

@Repository
public class TBLBranchPfrNoSeriesReponseDAOImpl implements TBLBranchPfrNoSeriesReponseDAO{

	 @PersistenceContext
	    private EntityManager em;

	@SuppressWarnings( "unchecked" )
	@Override
	public TBLBranchPfrNoSeries getBranchPfrNoSeries(String branchCode) throws IntegServiceException {
		  List<TBLBranchPfrNoSeries> resultList =
		            (List<TBLBranchPfrNoSeries>)em.createNamedQuery( "TBLBranchPfrnoSeries.getBranchPfrnoSeries" ).setParameter("branchCode", branchCode).getResultList();
		        
		  if(resultList.isEmpty()){
			throw new IntegServiceException("Branch PFR No Series not found!",IntegErrorCode.BRANCH_PFR_NO_SERIES_NOT_FOUND);  
		  }
		  return resultList.get(0);
	}

}
