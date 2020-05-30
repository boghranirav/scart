/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "user_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserTable.findAll", query = "SELECT u FROM UserTable u"),
    @NamedQuery(name = "UserTable.findByUsername", query = "SELECT u FROM UserTable u WHERE u.username = :username"),
    @NamedQuery(name = "UserTable.findByFirstname", query = "SELECT u FROM UserTable u WHERE u.firstname = :firstname"),
    @NamedQuery(name = "UserTable.findByLastname", query = "SELECT u FROM UserTable u WHERE u.lastname = :lastname"),
    @NamedQuery(name = "UserTable.findByPassword", query = "SELECT u FROM UserTable u WHERE u.password = :password"),
    @NamedQuery(name = "UserTable.findByEmailId", query = "SELECT u FROM UserTable u WHERE u.emailId = :emailId"),
    @NamedQuery(name = "UserTable.findByPhone", query = "SELECT u FROM UserTable u WHERE u.phone = :phone"),
    @NamedQuery(name = "UserTable.findByAddress", query = "SELECT u FROM UserTable u WHERE u.address = :address"),
    @NamedQuery(name = "UserTable.findByPincode", query = "SELECT u FROM UserTable u WHERE u.pincode = :pincode"),
    @NamedQuery(name = "UserTable.findByUserStatus", query = "SELECT u FROM UserTable u WHERE u.userStatus = :userStatus"),
    @NamedQuery(name = "UserTable.findByRegDate", query = "SELECT u FROM UserTable u WHERE u.regDate = :regDate"),
    @NamedQuery(name = "UserTable.findByVerificationCode", query = "SELECT u FROM UserTable u WHERE u.verificationCode = :verificationCode"),
    @NamedQuery(name = "UserTable.findByProfilePic", query = "SELECT u FROM UserTable u WHERE u.profilePic = :profilePic"),
     @NamedQuery(name = "UserTable.findByName", query = "SELECT u FROM UserTable u WHERE u.username != :username"),
    @NamedQuery(name = "UserTable.findByMobilestatus", query = "SELECT u FROM UserTable u WHERE u.mobilestatus = :mobilestatus")})
public class UserTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "username")
    private String username;
    @Size(max = 30)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 30)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 30)
    @Column(name = "password")
    private String password;
    @Size(max = 50)
    @Column(name = "email_id")
    private String emailId;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 14)
    @Column(name = "phone")
    private String phone;
    @Size(max = 200)
    @Column(name = "address")
    private String address;
    @Column(name = "pincode")
    private Integer pincode;
    @Size(max = 10)
    @Column(name = "user_status")
    private String userStatus;
    @Size(max = 25)
    @Column(name = "reg_date")
    private String regDate;
    @Size(max = 8)
    @Column(name = "verification_code")
    private String verificationCode;
    @Size(max = 200)
    @Column(name = "profile_pic")
    private String profilePic;
    @Size(max = 10)
    @Column(name = "mobilestatus")
    private String mobilestatus;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne
    private CityTable cityId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private StateTable stateId;
    @OneToMany(mappedBy = "username")
    private Collection<AuctionDetails> auctionDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userTable")
    private Collection<GroupMaster> groupMasterCollection;
    @OneToMany(mappedBy = "username")
    private Collection<DeleteAdDetails> deleteAdDetailsCollection;
    @OneToMany(mappedBy = "fromUsername")
    private Collection<UserChat> userChatCollection;
    @OneToMany(mappedBy = "toUsername")
    private Collection<UserChat> userChatCollection1;
    @OneToMany(mappedBy = "username")
    private Collection<BidActivity> bidActivityCollection;
    @OneToMany(mappedBy = "username")
    private Collection<AdTable> adTableCollection;

    public UserTable() {
    }

    public UserTable(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getMobilestatus() {
        return mobilestatus;
    }

    public void setMobilestatus(String mobilestatus) {
        this.mobilestatus = mobilestatus;
    }

    public CityTable getCityId() {
        return cityId;
    }

    public void setCityId(CityTable cityId) {
        this.cityId = cityId;
    }

    public StateTable getStateId() {
        return stateId;
    }

    public void setStateId(StateTable stateId) {
        this.stateId = stateId;
    }

    @XmlTransient
    public Collection<AuctionDetails> getAuctionDetailsCollection() {
        return auctionDetailsCollection;
    }

    public void setAuctionDetailsCollection(Collection<AuctionDetails> auctionDetailsCollection) {
        this.auctionDetailsCollection = auctionDetailsCollection;
    }

    @XmlTransient
    public Collection<GroupMaster> getGroupMasterCollection() {
        return groupMasterCollection;
    }

    public void setGroupMasterCollection(Collection<GroupMaster> groupMasterCollection) {
        this.groupMasterCollection = groupMasterCollection;
    }

    @XmlTransient
    public Collection<DeleteAdDetails> getDeleteAdDetailsCollection() {
        return deleteAdDetailsCollection;
    }

    public void setDeleteAdDetailsCollection(Collection<DeleteAdDetails> deleteAdDetailsCollection) {
        this.deleteAdDetailsCollection = deleteAdDetailsCollection;
    }

    @XmlTransient
    public Collection<UserChat> getUserChatCollection() {
        return userChatCollection;
    }

    public void setUserChatCollection(Collection<UserChat> userChatCollection) {
        this.userChatCollection = userChatCollection;
    }

    @XmlTransient
    public Collection<UserChat> getUserChatCollection1() {
        return userChatCollection1;
    }

    public void setUserChatCollection1(Collection<UserChat> userChatCollection1) {
        this.userChatCollection1 = userChatCollection1;
    }

    @XmlTransient
    public Collection<BidActivity> getBidActivityCollection() {
        return bidActivityCollection;
    }

    public void setBidActivityCollection(Collection<BidActivity> bidActivityCollection) {
        this.bidActivityCollection = bidActivityCollection;
    }

    @XmlTransient
    public Collection<AdTable> getAdTableCollection() {
        return adTableCollection;
    }

    public void setAdTableCollection(Collection<AdTable> adTableCollection) {
        this.adTableCollection = adTableCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserTable)) {
            return false;
        }
        UserTable other = (UserTable) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UserTable[ username=" + username + " ]";
    }
    
}
