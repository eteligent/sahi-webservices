package gov.aas.pagibig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.aas.pagibig.dao.TBLBranchPfrNoSeriesReponseDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegCmsGetBranchPfrNoSeriesRequest;
import gov.aas.pagibig.webservice.IntegCmsGetBranchPfrNoSeriesResponse;
import gov.aas.pagibig.webservice.IntegOtcGetHolidayInformationRequest;
import gov.aas.pagibig.webservice.core.TBLBranchPfrNoSeries;

@Service
public class BranchPfrNoSeriesServiceImpl implements BranchPfrNoSeriesService{

	@Autowired
	private TBLBranchPfrNoSeriesReponseDAO branchPfrSeriesResponesDaoImpl;
	@Override
	public IntegCmsGetBranchPfrNoSeriesResponse getBranchPfrNoSeries(IntegCmsGetBranchPfrNoSeriesRequest request) {
		IntegCmsGetBranchPfrNoSeriesResponse response = new IntegCmsGetBranchPfrNoSeriesResponse();
		try{
			
			TBLBranchPfrNoSeries result = branchPfrSeriesResponesDaoImpl.getBranchPfrNoSeries(request.getBranchCode());
			response.setBranchCode(result.getBranchCode());
			response.setBranchDesc(result.getBranchDesc());
			response.setEndNo(Integer.parseInt(result.getEndNo()));
			response.setStartNo(Integer.parseInt(result.getStartNo()));
			response.setPrefix(result.getPrefix());
		}catch(IntegServiceException ex){
			response.setError(IISPServiceUtil.createError(ex.getErrorCode(), ex.getMessage()));
		}
		return response;
	}

}
