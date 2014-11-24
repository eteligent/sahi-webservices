package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.core.TbGetPtnShortpaymInfo;

import java.util.List;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.xml.datatype.XMLGregorianCalendar;

@Repository
@Transactional
public class TbGetPtnShortpaymInfoDAOImpl
    implements TbGetPtnShortpaymInfoDAO
    
    {
	
    @PersistenceContext
    private EntityManager em;

    
    @SuppressWarnings( "unchecked" )
    @Override
    public List<TbGetPtnShortpaymInfo> get_PtnShortpaymInfo(  String payTrackNum, String payorName, String brCode, XMLGregorianCalendar date  )
        throws IntegServiceException
    {

		if(payTrackNum == null || payorName == null || brCode == null || date == null)
		{
			throw new IntegServiceException("-FAILED TO SEND REQUEST:Request Parameter Incomplete", IntegErrorCode.REQUEST_PARAMETER_INCOMPLETE);
		}
		
			
    	List<TbGetPtnShortpaymInfo> getPtnShortpaymInfoResults =
            em.createNamedQuery( "TbGetPtnShortpaymInfo.getPtnInfo" )
            .setParameter( "payTrackNum",payTrackNum )
            .setParameter("payorName", payorName)
            .setParameter("brCode", brCode)
            .setParameter("date", date.toGregorianCalendar().getTime())
            .getResultList();
    	
        if ( getPtnShortpaymInfoResults.isEmpty())
        {
            throw new IntegServiceException( "-FAILED TO SEND REQUEST:PTN SHORTPAYM INFO NOT FOUND",
                                          IntegErrorCode.PTN_SHORTPAYM_INFO_NOT_FOUND );
        }
        
        
        	return getPtnShortpaymInfoResults;
        
    }

}
