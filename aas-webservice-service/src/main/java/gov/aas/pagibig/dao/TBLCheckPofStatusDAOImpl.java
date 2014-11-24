package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLUpdatePofStatus;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class TBLCheckPofStatusDAOImpl
    implements TBLCheckPofStatusDAO
{
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings( "unchecked" )
    @Override
    public TBLUpdatePofStatus checkPOFStats(String pofNo, String payorName, String src)
    		   throws IntegServiceException
    {
    	if(pofNo == null || payorName == null || src == null)
    	{
    		throw new IntegServiceException(" 2 -FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	
    	List<TBLUpdatePofStatus> results =
                em.createNamedQuery( "TBLUpdatePofStatus.updPOFStat" )
                .setParameter( "pofNo", pofNo )
                .getResultList();
	
    	if(results.isEmpty())
    	{
    		 throw new IntegServiceException( "POF: "+ pofNo+" does not exists!",
             		IntegErrorCode.POF_NO_NOT_FOUND);
    	}
    	else
    	{	
    	List<TBLUpdatePofStatus> results1 =
        	em.createNamedQuery( "TBLUpdatePofStatus.checkPofStat" )
        	.setParameter( "pofNo", pofNo )
        	.setParameter( "payorName", payorName )
    		.setParameter( "src", src)
        	.getResultList();
    		if(results1.isEmpty()){
    				
    			 throw new IntegServiceException( "Incorrect or Incomplete request!",
    	             		IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE );
    			
    		}
    		else{ 
    			
    		TBLUpdatePofStatus getPOFStats = results1.get(0);
    		return getPOFStats;
    		}
    	}
    }
}
