package gov.aas.pagibig.dao;

import gov.aas.pagibig.webservice.core.TbGetUnitdeptInfo;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TbGetUnitdeptInfoDAOImpl
    implements TbGetUnitdeptInfoDAO
{

    @PersistenceContext
    private EntityManager em;
    
    
    @SuppressWarnings( "unchecked" )
    @Override
    public List<TbGetUnitdeptInfo> getUnitdept_Info(String branchCode)
    		throws IntegServiceException
    {
   
    	if(branchCode == null)
    	{
    		throw new IntegServiceException("-FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
    	}
    	
        List<TbGetUnitdeptInfo> unitDeptInfoList = 
        		em.createNamedQuery( "TbGetUnitdeptInfo.getByUnitDept" )
        		.setParameter( "branchCode",branchCode)
        		.getResultList();
       
		        if (unitDeptInfoList.isEmpty()) 
			        {
						throw new IntegServiceException(
								"-FAILED TO SEND REQUEST:Unit/Dept. Info NOT FOUND!", IntegErrorCode.UNIT_DEPT_INFO_NOT_FOUND);
					}
       
		return unitDeptInfoList;
       
    }
   
}