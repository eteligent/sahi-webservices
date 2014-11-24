package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TbInsertPofHeader;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@Repository
@Transactional
public class TbInsertPofHeaderDAOImpl
    implements TbInsertPofHeaderDAO
{
    @PersistenceContext
    private EntityManager em;

    public void insertPOFHeader( String pofNo, XMLGregorianCalendar pofDate, String payorName, int  payMode, int currencyCode, String userId)
    		   throws IntegServiceException
    {
    	if(pofNo == null || pofDate == null || payorName == null || (payMode < 1 || payMode > 2) || (currencyCode < 1 || currencyCode > 3) || userId == null )
    	{
    		throw new IntegServiceException(" 2 -FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
    	
    	List<TbInsertPofHeader> results =
                em.createNamedQuery( "TbInsertPofHeader.insertByPofNo" )
                .setParameter( "pofNo", pofNo )
                .getResultList();
	
    	if(results.isEmpty())
    	{
    	 	TbInsertPofHeader insertPofHeader = new TbInsertPofHeader();
    		insertPofHeader.setPofNo( pofNo);
            insertPofHeader.setPofDate( pofDate.toGregorianCalendar().getTime() );
            insertPofHeader.setPayorName( payorName);
            insertPofHeader.setPayMode( payMode );
            insertPofHeader.setCurrencyCode(currencyCode);
            insertPofHeader.setUserId( userId );
        	
        	em.persist( insertPofHeader );
    	}
    	else
    	{	
    		throw new IntegServiceException(" 2 -FAILED TO SEND REQUEST:POF NO ALREADY EXISTING!", IntegErrorCode.POF_NO_ALREADY_EXISTING);
    	}
    }
}
