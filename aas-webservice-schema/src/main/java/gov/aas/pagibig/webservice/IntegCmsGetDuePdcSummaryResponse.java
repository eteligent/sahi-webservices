//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.01 at 11:33:54 AM CST 
//


package gov.aas.pagibig.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.aas.pagibig.schema.ErrorType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://gov/aas/pagibig/webservice}integ_cms_get_due_pdc_summary_response_list" maxOccurs="unbounded"/>
 *         &lt;element name="error" type="{http://schema.pagibig.aas.gov}errorType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "integCmsGetDuePdcSummaryResponseList",
    "error"
})
@XmlRootElement(name = "integ_cms_get_due_pdc_summaryResponse")
public class IntegCmsGetDuePdcSummaryResponse {

    @XmlElement(name = "integ_cms_get_due_pdc_summary_response_list", required = true)
    protected List<IntegCmsGetDuePdcSummaryResponseList> integCmsGetDuePdcSummaryResponseList;
    @XmlElement(required = true)
    protected ErrorType error;

    /**
     * Gets the value of the integCmsGetDuePdcSummaryResponseList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integCmsGetDuePdcSummaryResponseList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegCmsGetDuePdcSummaryResponseList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegCmsGetDuePdcSummaryResponseList }
     * 
     * 
     */
    public List<IntegCmsGetDuePdcSummaryResponseList> getIntegCmsGetDuePdcSummaryResponseList() {
        if (integCmsGetDuePdcSummaryResponseList == null) {
            integCmsGetDuePdcSummaryResponseList = new ArrayList<IntegCmsGetDuePdcSummaryResponseList>();
        }
        return this.integCmsGetDuePdcSummaryResponseList;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setError(ErrorType value) {
        this.error = value;
    }

}
