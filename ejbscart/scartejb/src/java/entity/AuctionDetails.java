/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
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
@Table(name = "auction_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuctionDetails.findAll", query = "SELECT a FROM AuctionDetails a"),
    @NamedQuery(name = "AuctionDetails.findByAuctionId", query = "SELECT a FROM AuctionDetails a WHERE a.auctionId = :auctionId"),
    @NamedQuery(name = "AuctionDetails.findByProductTitle", query = "SELECT a FROM AuctionDetails a WHERE a.productTitle = :productTitle"),
    @NamedQuery(name = "AuctionDetails.findByStartTime", query = "SELECT a FROM AuctionDetails a WHERE a.startTime = :startTime"),
    @NamedQuery(name = "AuctionDetails.findByCloseTime", query = "SELECT a FROM AuctionDetails a WHERE a.closeTime = :closeTime"),
    @NamedQuery(name = "AuctionDetails.findByStartingBid", query = "SELECT a FROM AuctionDetails a WHERE a.startingBid = :startingBid"),
    @NamedQuery(name = "AuctionDetails.findByProductCondition", query = "SELECT a FROM AuctionDetails a WHERE a.productCondition = :productCondition"),
    @NamedQuery(name = "AuctionDetails.findByDispatchTime", query = "SELECT a FROM AuctionDetails a WHERE a.dispatchTime = :dispatchTime"),
    @NamedQuery(name = "AuctionDetails.findByProductQuantity", query = "SELECT a FROM AuctionDetails a WHERE a.productQuantity = :productQuantity"),
    @NamedQuery(name = "AuctionDetails.findByDescription", query = "SELECT a FROM AuctionDetails a WHERE a.description = :description"),
    @NamedQuery(name = "AuctionDetails.findByusername", query = "SELECT a FROM AuctionDetails a WHERE a.username = :username"),
    @NamedQuery(name = "AuctionDetails.findByusernameAndDate", query = "SELECT a FROM AuctionDetails a WHERE a.username = :username AND a.auctionDate = :auctionDate"),
    @NamedQuery(name = "AuctionDetails.findByAuctionDate", query = "SELECT a FROM AuctionDetails a WHERE a.auctionDate = :auctionDate")})
public class AuctionDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auction_id")
    private Integer auctionId;
    @Size(max = 50)
    @Column(name = "product_title")
    private String productTitle;
    @Size(max = 25)
    @Column(name = "start_time")
    private String startTime;
    @Size(max = 25)
    @Column(name = "close_time")
    private String closeTime;
    @Column(name = "starting_bid")
    private Integer startingBid;
    @Size(max = 10)
    @Column(name = "product_condition")
    private String productCondition;
    @Size(max = 25)
    @Column(name = "dispatch_time")
    private String dispatchTime;
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "auction_date")
    private String auctionDate;
    @OneToMany(mappedBy = "auctionId")
    private Collection<AuctionImages> auctionImagesCollection;
    @OneToMany(mappedBy = "auctionId")
    private Collection<AuctionUserDetail> auctionUserDetailCollection;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private UserTable username;
    @OneToMany(mappedBy = "auctionId")
    private Collection<BidActivity> bidActivityCollection;

    public AuctionDetails() {
    }

    public AuctionDetails(Integer auctionId) {
        this.auctionId = auctionId;
    }

    public AuctionDetails(Integer auctionId, String auctionDate) {
        this.auctionId = auctionId;
        this.auctionDate = auctionDate;
    }

    public Integer getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Integer auctionId) {
        this.auctionId = auctionId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getStartingBid() {
        return startingBid;
    }

    public void setStartingBid(Integer startingBid) {
        this.startingBid = startingBid;
    }

    public String getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(String dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuctionDate() {
        return auctionDate;
    }

    public void setAuctionDate(String auctionDate) {
        this.auctionDate = auctionDate;
    }

    @XmlTransient
    public Collection<AuctionImages> getAuctionImagesCollection() {
        return auctionImagesCollection;
    }

    public void setAuctionImagesCollection(Collection<AuctionImages> auctionImagesCollection) {
        this.auctionImagesCollection = auctionImagesCollection;
    }

    @XmlTransient
    public Collection<AuctionUserDetail> getAuctionUserDetailCollection() {
        return auctionUserDetailCollection;
    }

    public void setAuctionUserDetailCollection(Collection<AuctionUserDetail> auctionUserDetailCollection) {
        this.auctionUserDetailCollection = auctionUserDetailCollection;
    }

    public UserTable getUsername() {
        return username;
    }

    public void setUsername(UserTable username) {
        this.username = username;
    }

    @XmlTransient
    public Collection<BidActivity> getBidActivityCollection() {
        return bidActivityCollection;
    }

    public void setBidActivityCollection(Collection<BidActivity> bidActivityCollection) {
        this.bidActivityCollection = bidActivityCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auctionId != null ? auctionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuctionDetails)) {
            return false;
        }
        AuctionDetails other = (AuctionDetails) object;
        if ((this.auctionId == null && other.auctionId != null) || (this.auctionId != null && !this.auctionId.equals(other.auctionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AuctionDetails[ auctionId=" + auctionId + " ]";
    }
    
}
