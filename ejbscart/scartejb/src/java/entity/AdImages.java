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
@Table(name = "ad_images")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdImages.findAll", query = "SELECT a FROM AdImages a"),
    @NamedQuery(name = "AdImages.findByAdImageId", query = "SELECT a FROM AdImages a WHERE a.adImageId = :adImageId"),
    @NamedQuery(name = "AdImages.findByAdId", query = "SELECT a FROM AdImages a  WHERE a.adId = :adId"),
    @NamedQuery(name = "AdImages.findByAdImagePath", query = "SELECT a FROM AdImages a WHERE a.adImagePath = :adImagePath")})
public class AdImages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ad_image_id")
    private Integer adImageId;
    @Size(max = 200)
    @Column(name = "ad_image_path")
    private String adImagePath;
    @JoinColumn(name = "ad_id", referencedColumnName = "ad_id")
    @ManyToOne
    private AdTable adId;

    public AdImages() {
    }

    public AdImages(Integer adImageId) {
        this.adImageId = adImageId;
    }

    public Integer getAdImageId() {
        return adImageId;
    }

    public void setAdImageId(Integer adImageId) {
        this.adImageId = adImageId;
    }

    public String getAdImagePath() {
        return adImagePath;
    }

    public void setAdImagePath(String adImagePath) {
        this.adImagePath = adImagePath;
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
        hash += (adImageId != null ? adImageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdImages)) {
            return false;
        }
        AdImages other = (AdImages) object;
        if ((this.adImageId == null && other.adImageId != null) || (this.adImageId != null && !this.adImageId.equals(other.adImageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AdImages[ adImageId=" + adImageId + " ]";
    }
    
}
