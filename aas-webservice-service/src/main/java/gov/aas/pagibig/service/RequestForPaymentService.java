package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegApRequestForPaymentRequest;
import gov.aas.pagibig.webservice.IntegApRequestForPaymentResponse;

public interface RequestForPaymentService {
	public  IntegApRequestForPaymentResponse requestForPayment(IntegApRequestForPaymentRequest request);
}
