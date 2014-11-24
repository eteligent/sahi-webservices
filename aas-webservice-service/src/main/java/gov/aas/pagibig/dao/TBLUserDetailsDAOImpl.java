package gov.aas.pagibig.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLUserDetails;

@Repository
public class TBLUserDetailsDAOImpl implements TBLUserDetailsDAO {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public TBLUserDetails getUserDetails(String firstName, String lastName,
			String middleName, String branch) throws IntegServiceException {
		List<TBLUserDetails> results = em
				.createNamedQuery("TBLUserDetails.getUserDetails")
				.setParameter("fname", firstName)
				.setParameter("lname", lastName)
				.setParameter("mname", middleName)
				.setParameter("branch", branch).getResultList();
		
		if(results.isEmpty()){
			throw new IntegServiceException("No user with matching Details", IntegErrorCode.USER_DETAILS_NOT_FOUND);
		}
		return (TBLUserDetails) results.get(0);

	}

}
