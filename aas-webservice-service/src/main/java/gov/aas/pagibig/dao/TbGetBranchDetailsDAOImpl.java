package gov.aas.pagibig.dao;

import gov.aas.pagibig.webservice.core.TbGetBranchDetails;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TbGetBranchDetailsDAOImpl
    implements TbGetBranchDetailsDAO
{

    @PersistenceContext
    private EntityManager em;
    
    
    @SuppressWarnings( "unchecked" )
    @Override
    public List<TbGetBranchDetails> getBranch_Details()
    		throws IntegServiceException
    {
   
        List<TbGetBranchDetails> branchDetailsList = 
        		em.createNamedQuery( "TbGetBranchDetails.getBranchDetails" ).getResultList();
       
		        if (branchDetailsList.isEmpty()) 
			        {
						throw new IntegServiceException(
								"-FAILED TO SEND REQUEST:Branch Details NOT FOUND!", IntegErrorCode.BRANCH_DETAILS_NOT_FOUND);
					}
       
		return branchDetailsList;
       
    }
   
}