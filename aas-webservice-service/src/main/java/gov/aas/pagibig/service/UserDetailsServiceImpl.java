package gov.aas.pagibig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.aas.pagibig.dao.TBLUserDetailsDAO;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcGetUserDetailsRequest;
import gov.aas.pagibig.webservice.IntegOtcGetUserDetailsResponse;
import gov.aas.pagibig.webservice.core.TBLUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private TBLUserDetailsDAO userDetailsDaoImpl;
	
	@Override
	public IntegOtcGetUserDetailsResponse getUserDetails(
			IntegOtcGetUserDetailsRequest request) {
		IntegOtcGetUserDetailsResponse response = new IntegOtcGetUserDetailsResponse();
		TBLUserDetails details;
		try {
			details = userDetailsDaoImpl.getUserDetails(request.getFname(), request.getLname(), request.getMname(), request.getBranch());
			response.setEmployeeId(details.getEmployeeId());
			response.setEmployeeName(details.getLname() + ", " + details.getFname() + " " + details.getMname());
			response.setPosition(details.getPosition());
		} catch (IntegServiceException e) {
			response.setError(IISPServiceUtil.createError(e.getErrorCode(), e.getMessage()));
		}
		return response;
	}

}
