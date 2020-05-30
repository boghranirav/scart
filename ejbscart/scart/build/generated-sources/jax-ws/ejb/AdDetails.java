
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adDetailId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adId" type="{http://ejb/}adTable" minOccurs="0"/>
 *         &lt;element name="adTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adDetails", propOrder = {
    "adDetailId",
    "adId",
    "adTitle",
    "adValue"
})
public class AdDetails {

    protected Integer adDetailId;
    protected AdTable adId;
    protected String adTitle;
    protected String adValue;

    /**
     * Gets the value of the adDetailId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdDetailId() {
        return adDetailId;
    }

    /**
     * Sets the value of the adDetailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdDetailId(Integer value) {
        this.adDetailId = value;
    }

    /**
     * Gets the value of the adId property.
     * 
     * @return
     *     possible object is
     *     {@link AdTable }
     *     
     */
    public AdTable getAdId() {
        return adId;
    }

    /**
     * Sets the value of the adId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdTable }
     *     
     */
    public void setAdId(AdTable value) {
        this.adId = value;
    }

    /**
     * Gets the value of the adTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdTitle() {
        return adTitle;
    }

    /**
     * Sets the value of the adTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdTitle(String value) {
        this.adTitle = value;
    }

    /**
     * Gets the value of the adValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdValue() {
        return adValue;
    }

    /**
     * Sets the value of the adValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdValue(String value) {
        this.adValue = value;
    }

}
