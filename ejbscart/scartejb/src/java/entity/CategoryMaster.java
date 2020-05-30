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
@Table(name = "category_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryMaster.findAll", query = "SELECT c FROM CategoryMaster c"),
    @NamedQuery(name = "CategoryMaster.findByCategoryId", query = "SELECT c FROM CategoryMaster c WHERE c.categoryId = :categoryId"),
    @NamedQuery(name = "CategoryMaster.findByCategoryName", query = "SELECT c FROM CategoryMaster c WHERE c.categoryName = :categoryName"),
    @NamedQuery(name = "CategoryMaster.findByCategoryImg", query = "SELECT c FROM CategoryMaster c WHERE c.categoryImg = :categoryImg")})
public class CategoryMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Integer categoryId;
    @Size(max = 50)
    @Column(name = "category_name")
    private String categoryName;
    @Size(max = 200)
    @Column(name = "category_img")
    private String categoryImg;
    @OneToMany(mappedBy = "categoryId")
    private Collection<ChildCategory> childCategoryCollection;

    public CategoryMaster() {
    }

    public CategoryMaster(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(String categoryImg) {
        this.categoryImg = categoryImg;
    }

    @XmlTransient
    public Collection<ChildCategory> getChildCategoryCollection() {
        return childCategoryCollection;
    }

    public void setChildCategoryCollection(Collection<ChildCategory> childCategoryCollection) {
        this.childCategoryCollection = childCategoryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryMaster)) {
            return false;
        }
        CategoryMaster other = (CategoryMaster) object;
        if ((this.categoryId == null && other.categoryId != null) || (this.categoryId != null && !this.categoryId.equals(other.categoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CategoryMaster[ categoryId=" + categoryId + " ]";
    }
    
}
