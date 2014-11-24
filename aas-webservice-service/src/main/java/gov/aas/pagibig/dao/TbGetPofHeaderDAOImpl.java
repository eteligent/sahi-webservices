package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TbInsertPofHeader;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class TbGetPofHeaderDAOImpl
    implements TbGetPofHeaderDAO
{
    @PersistenceContext
    private EntityManager em;
    @SuppressWarnings( "unchecked" )
    @Override
    public TbInsertPofHeader getPOFHeader( String pofNo)
    		   throws IntegServiceException
    {
    	if(pofNo == null)
    	{
    		throw new IntegServiceException(" 2 -FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	
    	List<TbInsertPofHeader> results =
                em.createNamedQuery( "TbInsertPofHeader.insertByPofNo" )
                .setParameter( "pofNo", pofNo )
                .getResultList();
	
    	if(results.isEmpty())
    	{
    		 throw new IntegServiceException( "POF : " + pofNo + " NOT FOUND ",
             		IntegErrorCode.POF_NO_NOT_FOUND );
    	}
    	else
    	{	
    		TbInsertPofHeader getHeaderDet = results.get(0);
    		return getHeaderDet;
    	}
    }
}
