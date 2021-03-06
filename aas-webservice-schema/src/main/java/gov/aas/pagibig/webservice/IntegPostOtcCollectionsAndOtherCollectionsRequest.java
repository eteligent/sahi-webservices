//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.19 at 07:28:51 PM CST 
//


package gov.aas.pagibig.webservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="source_sys_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://gov/aas/pagibig/webservice}integ_post_otc_collections_and_other_collections_list" maxOccurs="unbounded"/>
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
    "sourceSysId",
    "userName",
    "password",
    "integPostOtcCollectionsAndOtherCollectionsList"
})
@XmlRootElement(name = "integ_post_otc_collections_and_other_collectionsRequest")
public class IntegPostOtcCollectionsAndOtherCollectionsRequest {

    @XmlElement(name = "source_sys_id", required = true)
    protected String sourceSysId;
    @XmlElement(name = "user_name", required = true)
    protected String userName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "integ_post_otc_collections_and_other_collections_list", required = true)
    protected List<IntegPostOtcCollectionsAndOtherCollectionsList> integPostOtcCollectionsAndOtherCollectionsList;

    /**
     * Gets the value of the sourceSysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSysId() {
        return sourceSysId;
    }

    /**
     * Sets the value of the sourceSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSysId(String value) {
        this.sourceSysId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the integPostOtcCollectionsAndOtherCollectionsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integPostOtcCollectionsAndOtherCollectionsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegPostOtcCollectionsAndOtherCollectionsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegPostOtcCollectionsAndOtherCollectionsList }
     * 
     * 
     */
    public List<IntegPostOtcCollectionsAndOtherCollectionsList> getIntegPostOtcCollectionsAndOtherCollectionsList() {
        if (integPostOtcCollectionsAndOtherCollectionsList == null) {
            integPostOtcCollectionsAndOtherCollectionsList = new ArrayList<IntegPostOtcCollectionsAndOtherCollectionsList>();
        }
        return this.integPostOtcCollectionsAndOtherCollectionsList;
    }

}
