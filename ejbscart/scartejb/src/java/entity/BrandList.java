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
@Table(name = "brand_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BrandList.findAll", query = "SELECT b FROM BrandList b"),
    @NamedQuery(name = "BrandList.findByBrandId", query = "SELECT b FROM BrandList b WHERE b.brandId = :brandId"),
    @NamedQuery(name = "BrandList.findByBrandName", query = "SELECT b FROM BrandList b WHERE b.brandName = :brandName")})
public class BrandList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "brand_id")
    private Integer brandId;
    @Size(max = 30)
    @Column(name = "brand_name")
    private String brandName;
    @JoinColumn(name = "child_category_id", referencedColumnName = "child_category_id")
    @ManyToOne
    private ChildCategory childCategoryId;

    public BrandList() {
    }

    public BrandList(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
        hash += (brandId != null ? brandId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BrandList)) {
            return false;
        }
        BrandList other = (BrandList) object;
        if ((this.brandId == null && other.brandId != null) || (this.brandId != null && !this.brandId.equals(other.brandId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.BrandList[ brandId=" + brandId + " ]";
    }
    
}
