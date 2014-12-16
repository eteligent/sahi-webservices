package gov.aas.pagibig.service;

import gov.aas.pagibig.dao.TBLPaymentOrderFormDAO;
import gov.aas.pagibig.exception.IntegErrorCode;
import gov.aas.pagibig.exception.IntegServiceException;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderSampleRequest;
import gov.aas.pagibig.webservice.IntegOtcInsertAcqPofHeaderSampleResponse;
import gov.aas.pagibig.webservice.core.TBLPaymentOrderForm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This code needs xjc binding of xsd date to java date
 * http://stackoverflow.com/questions/835889/java-util-date-to-xmlgregoriancalendar move this to xjc binding
 * http://stackoverflow.com/questions/3679266/simple-conversion-between-java-util-date-and-xmlgregoriancalendar
 * 
 * @author Jowel
 */
@Service
public class PaymentOrderFormServiceImpl
    implements PaymentOrderFormService
{

    @Autowired
    TBLPaymentOrderFormDAO paymentOrderDAOImpl;

    private static final Logger logger = LoggerFactory.getLogger( PaymentOrderFormServiceImpl.class );

    @Override
    public IntegOtcInsertAcqPofHeaderSampleResponse insertOrUpdatePaymentOrder( IntegOtcInsertAcqPofHeaderSampleRequest request )
    {
        // create web service response object
        IntegOtcInsertAcqPofHeaderSampleResponse response = new IntegOtcInsertAcqPofHeaderSampleResponse();

        // create record for update/insert
        TBLPaymentOrderForm paymentOrderForm = new TBLPaymentOrderForm();
        
        paymentOrderForm.setPofNo( request.getPofNo() );
        
        paymentOrderForm.setPofDate( request.getPofDate().toGregorianCalendar().getTime() );
        
        paymentOrderForm.setPayorName( request.getPayorName() );
        paymentOrderForm.setPayMode( request.getPayMode() );
        paymentOrderForm.setCurrencyCode( request.getCurrencyCode() );
        paymentOrderForm.setUserId( request.getUserId() );

        // Every call to *DAOImpl which deals with DB classes, mUST be enclosed within a try catch, whereby
        // catching first our project specific exception, followed by the generic Exception. This in order for us to
        // return a sensible errors to web service clients.
        try
        {
            if ( request.isInsert() )
            {
                // insert new
                paymentOrderDAOImpl.insertPOFHeader( paymentOrderForm );
            }
            else
            {
                // update
                paymentOrderForm = paymentOrderDAOImpl.updatePOFHeader( paymentOrderForm );
            }
            response.setStatus( IISPServiceUtil.STATUS_SUCCESS );
        }
        catch ( IntegServiceException aase )
        {
            logger.error( "Failed to insert or update request ", aase );
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
