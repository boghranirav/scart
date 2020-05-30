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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "child_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChildCategory.findAll", query = "SELECT c FROM ChildCategory c"),
    @NamedQuery(name = "ChildCategory.findByChildCategoryId", query = "SELECT c FROM ChildCategory c WHERE c.childCategoryId = :childCategoryId"),
    @NamedQuery(name = "ChildCategory.findByChildCategoryName", query = "SELECT c FROM ChildCategory c WHERE c.childCategoryName = :childCategoryName"),
    @NamedQuery(name = "ChildCategory.findByChildImage", query = "SELECT c FROM ChildCategory c WHERE c.childImage = :childImage")})
public class ChildCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "child_category_id")
    private Integer childCategoryId;
    @Size(max = 50)
    @Column(name = "child_category_name")
    private String childCategoryName;
    @Size(max = 100)
    @Column(name = "child_image")
    private String childImage;
    @OneToMany(mappedBy = "childCategoryId")
    private Collection<FieldCategoryRelation> fieldCategoryRelationCollection;
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne
    private CategoryMaster categoryId;
    @OneToMany(mappedBy = "childCategoryId")
    private Collection<DeleteAdDetails> deleteAdDetailsCollection;
    @OneToMany(mappedBy = "childCategoryId")
    private Collection<BrandList> brandListCollection;
    @OneToMany(mappedBy = "childCategoryId")
    private Collection<AdTable> adTableCollection;

    public ChildCategory() {
    }

    public ChildCategory(Integer childCategoryId) {
        this.childCategoryId = childCategoryId;
    }

    public Integer getChildCategoryId() {
        return childCategoryId;
    }

    public void setChildCategoryId(Integer childCategoryId) {
        this.childCategoryId = childCategoryId;
    }

    public String getChildCategoryName() {
        return childCategoryName;
    }

    public void setChildCategoryName(String childCategoryName) {
        this.childCategoryName = childCategoryName;
    }

    public String getChildImage() {
        return childImage;
    }

    public void setChildImage(String childImage) {
        this.childImage = childImage;
    }

    @XmlTransient
    public Collection<FieldCategoryRelation> getFieldCategoryRelationCollection() {
        return fieldCategoryRelationCollection;
    }

    public void setFieldCategoryRelationCollection(Collection<FieldCategoryRelation> fieldCategoryRelationCollection) {
        this.fieldCategoryRelationCollection = fieldCategoryRelationCollection;
    }

    public CategoryMaster getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryMaster categoryId) {
        this.categoryId = categoryId;
    }

    @XmlTransient
    public Collection<DeleteAdDetails> getDeleteAdDetailsCollection() {
        return deleteAdDetailsCollection;
    }

    public void setDeleteAdDetailsCollection(Collection<DeleteAdDetails> deleteAdDetailsCollection) {
        this.deleteAdDetailsCollection = deleteAdDetailsCollection;
    }

    @XmlTransient
    public Collection<BrandList> getBrandListCollection() {
        return brandListCollection;
    }

    public void setBrandListCollection(Collection<BrandList> brandListCollection) {
        this.brandListCollection = brandListCollection;
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
        hash += (childCategoryId != null ? childCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChildCategory)) {
            return false;
        }
        ChildCategory other = (ChildCategory) object;
        if ((this.childCategoryId == null && other.childCategoryId != null) || (this.childCategoryId != null && !this.childCategoryId.equals(other.childCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ChildCategory[ childCategoryId=" + childCategoryId + " ]";
    }
    
}
