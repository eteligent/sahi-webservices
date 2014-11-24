package gov.aas.pagibig.service;

import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.aas.pagibig.dao.TBLDuePdcSummaryDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegCmsGetDuePdcSummaryRequest;
import gov.aas.pagibig.webservice.IntegCmsGetDuePdcSummaryResponse;
import gov.aas.pagibig.webservice.IntegCmsGetDuePdcSummaryResponseList;
import gov.aas.pagibig.webservice.core.TBLDuePdcSummary;

// to be refactor using iterator pattern. 
@Service
public class DuePdcSummaryServiceImpl implements DuePdcSummaryService{

	@Autowired 
	TBLDuePdcSummaryDAO duePdcSummaryImpl;
	@Override
	public IntegCmsGetDuePdcSummaryResponse getDuePdcSummary(IntegCmsGetDuePdcSummaryRequest request) {
		IntegCmsGetDuePdcSummaryResponse response = new IntegCmsGetDuePdcSummaryResponse();
		List<IntegCmsGetDuePdcSummaryResponseList> responseList = response.getIntegCmsGetDuePdcSummaryResponseList();
		try {
			List<TBLDuePdcSummary> resultSet = duePdcSummaryImpl.getDuePdcSummary(request.getPdcDate());
			IntegCmsGetDuePdcSummaryResponseList resultList = new IntegCmsGetDuePdcSummaryResponseList();
			for(TBLDuePdcSummary result:resultSet){
				resultList.setAmtForPayment(result.getAmtForPayment());
				resultList.setBankCode(result.getBankCode());
				resultList.setBankName(result.getBankName());
				GregorianCalendar calendar = new GregorianCalendar();
				calendar.setTime(result.getCheckDate());
				XMLGregorianCalendar xcalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
				resultList.setCheckDate(xcalendar);
				resultList.setCheckNo(result.getCheckNo());
				resultList.setPaymMode(result.getPaymMode() + "");
				resultList.setPayorAddress(result.getPayorAddress());
				resultList.setPayorId(result.getPayorId());
				resultList.setPayorName(result.getPayorAddress());
				resultList.setPayorType(result.getPayorType());
				resultList.setPayTrackNum(result.getPayTrackNum());
				resultList.setPdcRefNo(result.getPdcRefNo());
			}
		} catch (IntegServiceException aase1) {
			response.setError(AASServiceUtil.createError(aase1.getErrorCode(), aase1.getMessage()));
		} catch (DatatypeConfigurationException aase2) {
			response.setError(AASServiceUtil.createError(IntegErrorCode.SERVER_EXCEPTION, aase2.getMessage()));
		}
		return response;
	}

}
