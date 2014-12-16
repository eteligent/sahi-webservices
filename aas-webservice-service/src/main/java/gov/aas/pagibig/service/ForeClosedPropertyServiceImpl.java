package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TBLForeClosedPropertyDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegAasGetForeStatusRequest;
import gov.aas.pagibig.webservice.IntegAasGetForeStatusResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForeClosedPropertyServiceImpl
    implements ForeClosedPropertyService
{

    @Autowired
    TBLForeClosedPropertyDAO foreClosedPropertyDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( ForeClosedPropertyServiceImpl.class );

    @Override
    public IntegAasGetForeStatusResponse getForeClosedProperty( IntegAasGetForeStatusRequest request )
    {
        logger.debug( "getForeClosedProperty mid=" + request.getMid() + "property no=" + request.getPropNo() );
        // call foreClosedProperty DTO here
        IntegAasGetForeStatusResponse response = new IntegAasGetForeStatusResponse();

        // Every call to *DAOImpl which deals with DB classes, mUST be enclosed within a try catch, whereby
        // catching first our project specific exception, followed by the generic Exception. This in order for us to
        // return a sensible errors to web service clients.
        try
        {
            int result = foreClosedPropertyDAOImpl.isForeclosedProperty( request.getMid(), request.getPropNo() );
            response.setStatus( String.valueOf( result ) );

        }
        catch ( IntegServiceException aase )
        {
            logger.error( "Failed to retrieved forclose property", aase );
            response.setError( IISPServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
        }
        catch ( Exception e )
        {
            logger.error( "Failed to insert or update request ", e );
            response.setError( IISPServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }

        return response;
    }

}
