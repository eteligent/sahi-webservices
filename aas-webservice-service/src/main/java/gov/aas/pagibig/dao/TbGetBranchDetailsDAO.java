package gov.aas.pagibig.dao;
import gov.aas.pagibig.webservice.core.TbGetBranchDetails;
import gov.aas.pagibig.exception.IntegServiceException;
import java.util.List;

public interface TbGetBranchDetailsDAO
{
    public List<TbGetBranchDetails> getBranch_Details() throws IntegServiceException; 
   
}
