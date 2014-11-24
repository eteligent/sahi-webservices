package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TbInsertPofHeaderDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderRequest;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderResponse;
import gov.aas.pagibig.webservice.core.TbInsertPofHeader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InsertPofHeaderServiceImpl
    implements InsertPofHeaderService
{

    @Autowired
    TbInsertPofHeaderDAO tbInsertPofHeaderDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( InsertPofHeaderServiceImpl.class );

    @Override
    public IntegOtcInsertAcqPofHeaderResponse insertPofHeader( IntegOtcInsertAcqPofHeaderRequest request )
    {
        
        IntegOtcInsertAcqPofHeaderResponse response = new IntegOtcInsertAcqPofHeaderResponse();
      
        logger.debug( "insertPofHeader getPofNo= " + request.getPofNo() );
        logger.debug( "insertPofHeader getPofDate= " + request.getPofDate() );
        logger.debug( "insertPofHeader getPayorName= "+ request.getPayorName());
        logger.debug( "insertPofHeader getPayMode= " + request.getPayMode() );
        logger.debug( "insertPofHeader getCurrencyCode= " + request.getCurrencyCode());
        logger.debug( "insertPofHeader getUserId= "+ request.getUserId());
        
        try
        {
        	
        	tbInsertPofHeaderDAOImpl.insertPOFHeader(request.getPofNo(),
        											 request.getPofDate(),
        											 request.getPayorName(),
        											 request.getPayMode(),
        											 request.getCurrencyCode(),
        											 request.getUserId());
        	
        	response.setStatus( AASServiceUtil.STATUS_SUCCESS );
        }
        catch ( IntegServiceException aase )
        {
            logger.error( "Failed to insert POF Header ", aase );
            response.setError( AASServiceUtil.createError( aase.getErrorCode(), aase.getMessage() ) );
        }
        
        catch ( Exception e )
        {
            logger.error( "Failed to insert POF Header  ", e );
            response.setError( AASServiceUtil.createError( IntegErrorCode.SERVER_EXCEPTION, "SYSTEM FAILURE" ) );
        }

        return response;
    }

}
