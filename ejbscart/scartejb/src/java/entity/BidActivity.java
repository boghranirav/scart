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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "bid_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BidActivity.findAll", query = "SELECT b FROM BidActivity b"),
    @NamedQuery(name = "BidActivity.findByBidActivityId", query = "SELECT b FROM BidActivity b WHERE b.bidActivityId = :bidActivityId"),
    @NamedQuery(name = "BidActivity.findByAmount", query = "SELECT b FROM BidActivity b WHERE b.amount = :amount"),
    @NamedQuery(name = "BidActivity.findByAuctionId", query = "SELECT b FROM BidActivity b WHERE b.auctionId = :auctionId"),
     @NamedQuery(name = "BidActivity.findByBidLastActivityId", query = "SELECT b FROM BidActivity b WHERE b.auctionId = :auctionId ORDER BY b.bidActivityId DESC"),
    @NamedQuery(name = "BidActivity.findByBidDate", query = "SELECT b FROM BidActivity b WHERE b.bidDate = :bidDate")})
public class BidActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bid_activity_id")
    private Integer bidActivityId;
    @Column(name = "amount")
    private Integer amount;
    @Size(max = 25)
    @Column(name = "bid_date")
    private String bidDate;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private UserTable username;
    @JoinColumn(name = "auction_id", referencedColumnName = "auction_id")
    @ManyToOne
    private AuctionDetails auctionId;

    public BidActivity() {
    }

    public BidActivity(Integer bidActivityId) {
        this.bidActivityId = bidActivityId;
    }

    public Integer getBidActivityId() {
        return bidActivityId;
    }

    public void setBidActivityId(Integer bidActivityId) {
        this.bidActivityId = bidActivityId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getBidDate() {
        return bidDate;
    }

    public void setBidDate(String bidDate) {
        this.bidDate = bidDate;
    }

    public UserTable getUsername() {
        return username;
    }

    public void setUsername(UserTable username) {
        this.username = username;
    }

    public AuctionDetails getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(AuctionDetails auctionId) {
        this.auctionId = auctionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bidActivityId != null ? bidActivityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BidActivity)) {
            return false;
        }
        BidActivity other = (BidActivity) object;
        if ((this.bidActivityId == null && other.bidActivityId != null) || (this.bidActivityId != null && !this.bidActivityId.equals(other.bidActivityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BidActivity[ bidActivityId=" + bidActivityId + " ]";
    }
    
}
