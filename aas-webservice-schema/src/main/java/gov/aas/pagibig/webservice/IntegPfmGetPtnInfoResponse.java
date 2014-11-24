//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 06:31:22 PM CST 
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
 *         &lt;element ref="{http://gov/aas/pagibig/webservice}integ_pfm_get_ptn_info_response_list" maxOccurs="unbounded"/>
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
    "integPfmGetPtnInfoResponseList",
    "error"
})
@XmlRootElement(name = "integ_pfm_get_ptn_info_Response")
public class IntegPfmGetPtnInfoResponse {

    @XmlElement(name = "integ_pfm_get_ptn_info_response_list", required = true)
    protected List<IntegPfmGetPtnInfoResponseList> integPfmGetPtnInfoResponseList;
    @XmlElement(required = true)
    protected ErrorType error;

    /**
     * Gets the value of the integPfmGetPtnInfoResponseList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integPfmGetPtnInfoResponseList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegPfmGetPtnInfoResponseList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegPfmGetPtnInfoResponseList }
     * 
     * 
     */
    public List<IntegPfmGetPtnInfoResponseList> getIntegPfmGetPtnInfoResponseList() {
        if (integPfmGetPtnInfoResponseList == null) {
            integPfmGetPtnInfoResponseList = new ArrayList<IntegPfmGetPtnInfoResponseList>();
        }
        return this.integPfmGetPtnInfoResponseList;
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
