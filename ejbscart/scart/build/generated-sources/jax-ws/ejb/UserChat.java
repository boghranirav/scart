
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userChat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userChat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adId" type="{http://ejb/}adTable" minOccurs="0"/>
 *         &lt;element name="chatDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chatId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fromStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromUsername" type="{http://ejb/}userTable" minOccurs="0"/>
 *         &lt;element name="toStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toUsername" type="{http://ejb/}userTable" minOccurs="0"/>
 *         &lt;element name="userMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userChat", propOrder = {
    "adId",
    "chatDate",
    "chatId",
    "fromStatus",
    "fromUsername",
    "toStatus",
    "toUsername",
    "userMessage"
})
public class UserChat {

    protected AdTable adId;
    protected String chatDate;
    protected Integer chatId;
    protected String fromStatus;
    protected UserTable fromUsername;
    protected String toStatus;
    protected UserTable toUsername;
    protected String userMessage;

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
     * Gets the value of the chatDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChatDate() {
        return chatDate;
    }

    /**
     * Sets the value of the chatDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChatDate(String value) {
        this.chatDate = value;
    }

    /**
     * Gets the value of the chatId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChatId() {
        return chatId;
    }

    /**
     * Sets the value of the chatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChatId(Integer value) {
        this.chatId = value;
    }

    /**
     * Gets the value of the fromStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromStatus() {
        return fromStatus;
    }

    /**
     * Sets the value of the fromStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromStatus(String value) {
        this.fromStatus = value;
    }

    /**
     * Gets the value of the fromUsername property.
     * 
     * @return
     *     possible object is
     *     {@link UserTable }
     *     
     */
    public UserTable getFromUsername() {
        return fromUsername;
    }

    /**
     * Sets the value of the fromUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTable }
     *     
     */
    public void setFromUsername(UserTable value) {
        this.fromUsername = value;
    }

    /**
     * Gets the value of the toStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToStatus() {
        return toStatus;
    }

    /**
     * Sets the value of the toStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToStatus(String value) {
        this.toStatus = value;
    }

    /**
     * Gets the value of the toUsername property.
     * 
     * @return
     *     possible object is
     *     {@link UserTable }
     *     
     */
    public UserTable getToUsername() {
        return toUsername;
    }

    /**
     * Sets the value of the toUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTable }
     *     
     */
    public void setToUsername(UserTable value) {
        this.toUsername = value;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * Sets the value of the userMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessage(String value) {
        this.userMessage = value;
    }

}
