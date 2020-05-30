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
@Table(name = "auction_user_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuctionUserDetail.findAll", query = "SELECT a FROM AuctionUserDetail a"),
    @NamedQuery(name = "AuctionUserDetail.findByAuctionUdId", query = "SELECT a FROM AuctionUserDetail a WHERE a.auctionUdId = :auctionUdId"),
    @NamedQuery(name = "AuctionUserDetail.findByReturnPolicy", query = "SELECT a FROM AuctionUserDetail a WHERE a.returnPolicy = :returnPolicy"),
    @NamedQuery(name = "AuctionUserDetail.findBySellerDescription", query = "SELECT a FROM AuctionUserDetail a WHERE a.sellerDescription = :sellerDescription")})
public class AuctionUserDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auction_ud_id")
    private Integer auctionUdId;
    @Size(max = 100)
    @Column(name = "return_policy")
    private String returnPolicy;
    @Size(max = 100)
    @Column(name = "seller_description")
    private String sellerDescription;
    @JoinColumn(name = "auction_id", referencedColumnName = "auction_id")
    @ManyToOne
    private AuctionDetails auctionId;

    public AuctionUserDetail() {
    }

    public AuctionUserDetail(Integer auctionUdId) {
        this.auctionUdId = auctionUdId;
    }

    public Integer getAuctionUdId() {
        return auctionUdId;
    }

    public void setAuctionUdId(Integer auctionUdId) {
        this.auctionUdId = auctionUdId;
    }

    public String getReturnPolicy() {
        return returnPolicy;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public String getSellerDescription() {
        return sellerDescription;
    }

    public void setSellerDescription(String sellerDescription) {
        this.sellerDescription = sellerDescription;
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
        hash += (auctionUdId != null ? auctionUdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuctionUserDetail)) {
            return false;
        }
        AuctionUserDetail other = (AuctionUserDetail) object;
        if ((this.auctionUdId == null && other.auctionUdId != null) || (this.auctionUdId != null && !this.auctionUdId.equals(other.auctionUdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AuctionUserDetail[ auctionUdId=" + auctionUdId + " ]";
    }
    
}
