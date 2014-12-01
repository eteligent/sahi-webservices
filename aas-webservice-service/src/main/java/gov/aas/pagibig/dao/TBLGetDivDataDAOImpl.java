package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TBLGetDivData;

import java.util.List;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.xml.datatype.XMLGregorianCalendar;


@Repository
@Transactional
public class TBLGetDivDataDAOImpl
    implements TBLGetDivDataDAO
{
    @PersistenceContext
    private EntityManager em;
    
    @SuppressWarnings( "unchecked" )
    @Override
    public TBLGetDivData getDData(String deptCode, XMLGregorianCalendar lastUpdatedDatetime)
    		   throws IntegServiceException
    {
    	if(deptCode == null || lastUpdatedDatetime == null )
    	{
    		throw new IntegServiceException("FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	
    	List<TBLGetDivData> results =
                em.createNamedQuery( "TBLGetDivData.getDivisionp1" )
                .setParameter( "deptCode", deptCode )
                .getResultList();
	
    	if(results.isEmpty())
    	{
    		 throw new IntegServiceException( "DEPT CODE: " + deptCode + " NOT FOUND ",
             		IntegErrorCode.POF_NO_NOT_FOUND );
    	}
    	else
    	{	
    		List<TBLGetDivData> results1 =
                    em.createNamedQuery( "TBLGetDivData.getDivisionp2" )
                    .setParameter( "deptCode", deptCode )
                    .setParameter( "lastUpdatedDatetime", lastUpdatedDatetime.toGregorianCalendar().getTime())
                    .getResultList();
    		if(results1.isEmpty()){
    			 throw new IntegServiceException( "Request Detail(s) Incorrect or Incomplete request!",
 	             		IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE );
    		}
    		else{
    		TBLGetDivData getDDet = results1.get(0);
    		return getDDet;
    		}
    	}
    }
}
