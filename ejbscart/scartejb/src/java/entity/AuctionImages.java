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
@Table(name = "auction_images")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuctionImages.findAll", query = "SELECT a FROM AuctionImages a"),
    @NamedQuery(name = "AuctionImages.findByAuctionImageId", query = "SELECT a FROM AuctionImages a WHERE a.auctionImageId = :auctionImageId"),
     @NamedQuery(name = "AuctionImages.findByAuctionId", query = "SELECT a FROM AuctionImages a WHERE a.auctionId = :auctionId"),
    @NamedQuery(name = "AuctionImages.findByAuctionImagePath", query = "SELECT a FROM AuctionImages a WHERE a.auctionImagePath = :auctionImagePath")})
public class AuctionImages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "auction_image_id")
    private Integer auctionImageId;
    @Size(max = 200)
    @Column(name = "auction_image_path")
    private String auctionImagePath;
    @JoinColumn(name = "auction_id", referencedColumnName = "auction_id")
    @ManyToOne
    private AuctionDetails auctionId;

    public AuctionImages() {
    }

    public AuctionImages(Integer auctionImageId) {
        this.auctionImageId = auctionImageId;
    }

    public Integer getAuctionImageId() {
        return auctionImageId;
    }

    public void setAuctionImageId(Integer auctionImageId) {
        this.auctionImageId = auctionImageId;
    }

    public String getAuctionImagePath() {
        return auctionImagePath;
    }

    public void setAuctionImagePath(String auctionImagePath) {
        this.auctionImagePath = auctionImagePath;
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
        hash += (auctionImageId != null ? auctionImageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuctionImages)) {
            return false;
        }
        AuctionImages other = (AuctionImages) object;
        if ((this.auctionImageId == null && other.auctionImageId != null) || (this.auctionImageId != null && !this.auctionImageId.equals(other.auctionImageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AuctionImages[ auctionImageId=" + auctionImageId + " ]";
    }
    
}
