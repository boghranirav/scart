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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "ad_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdTable.findAll", query = "SELECT a FROM AdTable a"),
    @NamedQuery(name = "AdTable.findByAdId", query = "SELECT a FROM AdTable a WHERE a.adId = :adId"),
    @NamedQuery(name = "AdTable.findByTitle", query = "SELECT a FROM AdTable a WHERE a.title = :title"),
    @NamedQuery(name = "AdTable.findByPrice", query = "SELECT a FROM AdTable a WHERE a.price = :price"),
    @NamedQuery(name = "AdTable.findByPriceAsc", query = "SELECT a FROM AdTable a WHERE a.title = :title ORDER BY a.price ASC "),
    @NamedQuery(name = "AdTable.findByPriceDesc", query = "SELECT a FROM AdTable a WHERE a.title = :title ORDER BY a.price DESC"),
    
    @NamedQuery(name = "AdTable.findByAdDate", query = "SELECT a FROM AdTable a WHERE a.adDate = :adDate"),
     @NamedQuery(name = "AdTable.findByusername", query = "SELECT a FROM AdTable a WHERE a.username = :username"),
     @NamedQuery(name = "AdTable.findBychildCategoryId", query = "SELECT a FROM AdTable a WHERE a.childCategoryId = :childCategoryId"),
    @NamedQuery(name = "AdTable.findByUsernameAndDate", query = "SELECT a FROM AdTable a WHERE a.username = :username AND a.adDate = :adDate"),
    @NamedQuery(name = "AdTable.findByCateAndName", query = "SELECT a FROM AdTable a WHERE a.childCategoryId = :childCategoryId AND a.title = :title"),
    @NamedQuery(name = "AdTable.findByCityAndName", query = "SELECT a FROM AdTable a WHERE a.username.cityId.cityName = :username AND a.title = :title"),
    @NamedQuery(name = "AdTable.findByCityAndNameAsc", query = "SELECT a FROM AdTable a WHERE a.username.cityId.cityName = :username AND a.title = :title ORDER BY a.price ASC"),
    @NamedQuery(name = "AdTable.findByCityAndNameDesc", query = "SELECT a FROM AdTable a WHERE a.username.cityId.cityName = :username AND a.title = :title ORDER BY a.price DESC"),
    @NamedQuery(name = "AdTable.findByStatus", query = "SELECT a FROM AdTable a WHERE a.status = :status")})
public class AdTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ad_id")
    private Integer adId;
    @Size(max = 50)
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private Integer price;
    @Size(max = 25)
    @Column(name = "ad_date")
    private String adDate;
    @Size(max = 10)
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "adId")
    private Collection<AdDetails> adDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adId")
    private Collection<UserChat> userChatCollection;
    @OneToMany(mappedBy = "adId")
    private Collection<AdImages> adImagesCollection;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private UserTable username;
    @JoinColumn(name = "child_category_id", referencedColumnName = "child_category_id")
    @ManyToOne
    private ChildCategory childCategoryId;

    public AdTable() {
    }

    public AdTable(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAdDate() {
        return adDate;
    }

    public void setAdDate(String adDate) {
        this.adDate = adDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<AdDetails> getAdDetailsCollection() {
        return adDetailsCollection;
    }

    public void setAdDetailsCollection(Collection<AdDetails> adDetailsCollection) {
        this.adDetailsCollection = adDetailsCollection;
    }

    @XmlTransient
    public Collection<UserChat> getUserChatCollection() {
        return userChatCollection;
    }

    public void setUserChatCollection(Collection<UserChat> userChatCollection) {
        this.userChatCollection = userChatCollection;
    }

    @XmlTransient
    public Collection<AdImages> getAdImagesCollection() {
        return adImagesCollection;
    }

    public void setAdImagesCollection(Collection<AdImages> adImagesCollection) {
        this.adImagesCollection = adImagesCollection;
    }

    public UserTable getUsername() {
        return username;
    }

    public void setUsername(UserTable username) {
        this.username = username;
    }

    public ChildCategory getChildCategoryId() {
        return childCategoryId;
    }

    public void setChildCategoryId(ChildCategory childCategoryId) {
        this.childCategoryId = childCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adId != null ? adId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdTable)) {
            return false;
        }
        AdTable other = (AdTable) object;
        if ((this.adId == null && other.adId != null) || (this.adId != null && !this.adId.equals(other.adId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AdTable[ adId=" + adId + " ]";
    }
    
}
