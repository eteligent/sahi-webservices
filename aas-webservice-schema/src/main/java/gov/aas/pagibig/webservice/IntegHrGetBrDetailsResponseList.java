//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.21 at 09:21:48 PM CST 
//


package gov.aas.pagibig.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Branchcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Branchdesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "branchcode",
    "branchdesc"
})
@XmlRootElement(name = "integ_hr_get_br_details_response_list")
public class IntegHrGetBrDetailsResponseList {

    @XmlElement(name = "Branchcode", required = true)
    protected String branchcode;
    @XmlElement(name = "Branchdesc", required = true)
    protected String branchdesc;

    /**
     * Gets the value of the branchcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchcode() {
        return branchcode;
    }

    /**
     * Sets the value of the branchcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchcode(String value) {
        this.branchcode = value;
    }

    /**
     * Gets the value of the branchdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchdesc() {
        return branchdesc;
    }

    /**
     * Sets the value of the branchdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchdesc(String value) {
        this.branchdesc = value;
    }

}
