
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bidActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bidActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="auctionId" type="{http://ejb/}auctionDetails" minOccurs="0"/>
 *         &lt;element name="bidActivityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://ejb/}userTable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bidActivity", propOrder = {
    "amount",
    "auctionId",
    "bidActivityId",
    "bidDate",
    "username"
})
public class BidActivity {

    protected Integer amount;
    protected AuctionDetails auctionId;
    protected Integer bidActivityId;
    protected String bidDate;
    protected UserTable username;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

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
     * Gets the value of the bidActivityId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidActivityId() {
        return bidActivityId;
    }

    /**
     * Sets the value of the bidActivityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidActivityId(Integer value) {
        this.bidActivityId = value;
    }

    /**
     * Gets the value of the bidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidDate() {
        return bidDate;
    }

    /**
     * Sets the value of the bidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidDate(String value) {
        this.bidDate = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link UserTable }
     *     
     */
    public UserTable getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTable }
     *     
     */
    public void setUsername(UserTable value) {
        this.username = value;
    }

}
