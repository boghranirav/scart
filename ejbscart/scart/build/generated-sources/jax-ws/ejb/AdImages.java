
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adImages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adImages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adId" type="{http://ejb/}adTable" minOccurs="0"/>
 *         &lt;element name="adImageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adImages", propOrder = {
    "adId",
    "adImageId",
    "adImagePath"
})
public class AdImages {

    protected AdTable adId;
    protected Integer adImageId;
    protected String adImagePath;

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
     * Gets the value of the adImageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdImageId() {
        return adImageId;
    }

    /**
     * Sets the value of the adImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdImageId(Integer value) {
        this.adImageId = value;
    }

    /**
     * Gets the value of the adImagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdImagePath() {
        return adImagePath;
    }

    /**
     * Sets the value of the adImagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdImagePath(String value) {
        this.adImagePath = value;
    }

}
