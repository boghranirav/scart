/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "user_chat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserChat.findAll", query = "SELECT u FROM UserChat u"),
    @NamedQuery(name = "UserChat.findByChatId", query = "SELECT u FROM UserChat u WHERE u.chatId = :chatId"),
    @NamedQuery(name = "UserChat.findByUserMessage", query = "SELECT u FROM UserChat u WHERE u.userMessage = :userMessage"),
    @NamedQuery(name = "UserChat.findByToStatus", query = "SELECT u FROM UserChat u WHERE u.toStatus = :toStatus"),
    @NamedQuery(name = "UserChat.findByChatDate", query = "SELECT u FROM UserChat u WHERE u.chatDate = :chatDate"),
    @NamedQuery(name = "UserChat.findByFromStatus", query = "SELECT u FROM UserChat u WHERE u.fromStatus = :fromStatus")})
public class UserChat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "chat_id")
    private Integer chatId;
    @Size(max = 500)
    @Column(name = "user_message")
    private String userMessage;
    @Size(max = 6)
    @Column(name = "to_status")
    private String toStatus;
    @Size(max = 25)
    @Column(name = "chat_date")
    private String chatDate;
    @Size(max = 6)
    @Column(name = "from_status")
    private String fromStatus;
    @JoinColumn(name = "from_username", referencedColumnName = "username")
    @ManyToOne
    private UserTable fromUsername;
    @JoinColumn(name = "to_username", referencedColumnName = "username")
    @ManyToOne
    private UserTable toUsername;
    @JoinColumn(name = "ad_id", referencedColumnName = "ad_id")
    @ManyToOne(optional = false)
    private AdTable adId;

    public UserChat() {
    }

    public UserChat(Integer chatId) {
        this.chatId = chatId;
    }

    public UserChat(Integer chatId, String fromStatus) {
        this.chatId = chatId;
        this.fromStatus = fromStatus;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }

    public String getChatDate() {
        return chatDate;
    }

    public void setChatDate(String chatDate) {
        this.chatDate = chatDate;
    }

    public String getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }

    public UserTable getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(UserTable fromUsername) {
        this.fromUsername = fromUsername;
    }

    public UserTable getToUsername() {
        return toUsername;
    }

    public void setToUsername(UserTable toUsername) {
        this.toUsername = toUsername;
    }

    public AdTable getAdId() {
        return adId;
    }

    public void setAdId(AdTable adId) {
        this.adId = adId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chatId != null ? chatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserChat)) {
            return false;
        }
        UserChat other = (UserChat) object;
        if ((this.chatId == null && other.chatId != null) || (this.chatId != null && !this.chatId.equals(other.chatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UserChat[ chatId=" + chatId + " ]";
    }
    
}
