package gov.aas.pagibig.dao;

import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class TBLForeClosedPropertyDAOImpl
    implements TBLForeClosedPropertyDAO
{

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings( "unchecked" )
    @Override
    public int isForeclosedProperty( String pagibigMID, String propertyNumber )
        throws IntegServiceException
    {
        List<Integer> resultList =
            em.createNamedQuery( "TBLForeClosedProperty.getStatusByMidAndPropertyNo" ).setParameter( "pagibigMid",
                                                                                                     pagibigMID ).setParameter( "propertyNumber",

                                                                                                                                 propertyNumber ).getResultList();
        if(resultList.isEmpty()){
            throw new IntegServiceException( "Foreclose property not found with mid number=" + pagibigMID
                + " property number=" + propertyNumber, IntegErrorCode.FORECLOSE_PROPERTY_NOT_FOUND );
        }
        /* 0=true forclose property, 1=not forclose */
        return resultList.get( 0 );
    }

}
