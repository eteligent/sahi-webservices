package gov.aas.pagibig.dao;

import java.util.Date;

public interface TBLPtnStatusDao {
	public boolean postPtnStatusDao(String paymentTrackNumber, String pfrNum, String generatedBy, Date dateGenerated, boolean status);
}
