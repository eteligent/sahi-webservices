package gov.aas.pagibig.service;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.aas.pagibig.dao.TBLHolidayInformationDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcGetHolidayInformationRequest;
import gov.aas.pagibig.webservice.IntegOtcGetHolidayInformationResponse;
import gov.aas.pagibig.webservice.IntegOtcGetHolidayInformationResponseList;
import gov.aas.pagibig.webservice.core.TBLHolidayInformation;

@Service
public class HolidayInformationServiceImpl implements HolidayInformationService {

	private static final Logger logger = LoggerFactory
			.getLogger(HolidayInformationServiceImpl.class);
	@Autowired
	private TBLHolidayInformationDAO holidayInformationDaoImpl;

	@Override
	public IntegOtcGetHolidayInformationResponse getHolidayInformation(
			IntegOtcGetHolidayInformationRequest request) {

		IntegOtcGetHolidayInformationResponse response = new IntegOtcGetHolidayInformationResponse();
		List<TBLHolidayInformation> resultSet;
		try {
			resultSet = holidayInformationDaoImpl.getHolidayInformation(
					request.getFromDate(), request.getToDate());
			List<IntegOtcGetHolidayInformationResponseList> returnList = response.getIntegOtcGetHolidayInformationResponseList();
			for (TBLHolidayInformation result : resultSet) {
				IntegOtcGetHolidayInformationResponseList responseList = new IntegOtcGetHolidayInformationResponseList();
				GregorianCalendar calendar = new GregorianCalendar();
				calendar.setTime(result.getHolidayDate());
				XMLGregorianCalendar xcalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
				responseList.setHolidayDate(xcalendar);
				returnList.add(responseList);

			}
		} catch (IntegServiceException aase1) {
			response.setError(IISPServiceUtil.createError(aase1.getErrorCode(), aase1.getMessage()));
		} catch (DatatypeConfigurationException aase2) {
			response.setError(IISPServiceUtil.createError(IntegErrorCode.SERVER_EXCEPTION, aase2.getMessage()));
		}

		return response;

	}

}
