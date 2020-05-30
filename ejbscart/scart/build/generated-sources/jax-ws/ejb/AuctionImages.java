
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auctionImages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auctionImages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auctionId" type="{http://ejb/}auctionDetails" minOccurs="0"/>
 *         &lt;element name="auctionImageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="auctionImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auctionImages", propOrder = {
    "auctionId",
    "auctionImageId",
    "auctionImagePath"
})
public class AuctionImages {

    protected AuctionDetails auctionId;
    protected Integer auctionImageId;
    protected String auctionImagePath;

    /**
     * Gets the value of the auctionId property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionDetails }
     *     
     */
    public AuctionDetails getAuctionId() {
        return auctionId;
    }

    /**
     * Sets the value of the auctionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionDetails }
     *     
     */
    public void setAuctionId(AuctionDetails value) {
        this.auctionId = value;
    }

    /**
     * Gets the value of the auctionImageId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuctionImageId() {
        return auctionImageId;
    }

    /**
     * Sets the value of the auctionImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuctionImageId(Integer value) {
        this.auctionImageId = value;
    }

    /**
     * Gets the value of the auctionImagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionImagePath() {
        return auctionImagePath;
    }

    /**
     * Sets the value of the auctionImagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionImagePath(String value) {
        this.auctionImagePath = value;
    }

}
