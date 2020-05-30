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
@Table(name = "ad_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdDetails.findAll", query = "SELECT a FROM AdDetails a"),
    @NamedQuery(name = "AdDetails.findByAdDetailId", query = "SELECT a FROM AdDetails a WHERE a.adDetailId = :adDetailId"),
    @NamedQuery(name = "AdDetails.findByAdTitle", query = "SELECT a FROM AdDetails a WHERE a.adTitle = :adTitle"),
    @NamedQuery(name = "AdDetails.findByAdId", query = "SELECT a FROM AdDetails a WHERE a.adId = :adId"),
    @NamedQuery(name = "AdDetails.findByAdValue", query = "SELECT a FROM AdDetails a WHERE a.adValue = :adValue")})
public class AdDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ad_detail_id")
    private Integer adDetailId;
    @Size(max = 40)
    @Column(name = "ad_title")
    private String adTitle;
    @Size(max = 200)
    @Column(name = "ad_value")
    private String adValue;
    @JoinColumn(name = "ad_id", referencedColumnName = "ad_id")
    @ManyToOne
    private AdTable adId;

    public AdDetails() {
    }

    public AdDetails(Integer adDetailId) {
        this.adDetailId = adDetailId;
    }

    public Integer getAdDetailId() {
        return adDetailId;
    }

    public void setAdDetailId(Integer adDetailId) {
        this.adDetailId = adDetailId;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdValue() {
        return adValue;
    }

    public void setAdValue(String adValue) {
        this.adValue = adValue;
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
        hash += (adDetailId != null ? adDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdDetails)) {
            return false;
        }
        AdDetails other = (AdDetails) object;
        if ((this.adDetailId == null && other.adDetailId != null) || (this.adDetailId != null && !this.adDetailId.equals(other.adDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AdDetails[ adDetailId=" + adDetailId + " ]";
    }
    
}
