package gov.aas.pagibig.service;

import gov.aas.pagibig.webservice.IntegApCreateAndUpdateSupplierMasterRequest;
import gov.aas.pagibig.webservice.IntegApCreateAndUpdateSupplierMasterResponse;


public interface SupplierMasterService {
	public IntegApCreateAndUpdateSupplierMasterResponse createOrUpdateSupplierMaster(IntegApCreateAndUpdateSupplierMasterRequest request) throws IISPException;
}
