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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "field_category_relation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldCategoryRelation.findAll", query = "SELECT f FROM FieldCategoryRelation f"),
    @NamedQuery(name = "FieldCategoryRelation.findByFieldCategoryId", query = "SELECT f FROM FieldCategoryRelation f WHERE f.fieldCategoryId = :fieldCategoryId")})
public class FieldCategoryRelation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "field_category_id")
    private Integer fieldCategoryId;
    @JoinColumn(name = "child_category_id", referencedColumnName = "child_category_id")
    @ManyToOne
    private ChildCategory childCategoryId;
    @JoinColumn(name = "field_id", referencedColumnName = "field_id")
    @ManyToOne
    private FieldsDetails fieldId;

    public FieldCategoryRelation() {
    }

    public FieldCategoryRelation(Integer fieldCategoryId) {
        this.fieldCategoryId = fieldCategoryId;
    }

    public Integer getFieldCategoryId() {
        return fieldCategoryId;
    }

    public void setFieldCategoryId(Integer fieldCategoryId) {
        this.fieldCategoryId = fieldCategoryId;
    }

    public ChildCategory getChildCategoryId() {
        return childCategoryId;
    }

    public void setChildCategoryId(ChildCategory childCategoryId) {
        this.childCategoryId = childCategoryId;
    }

    public FieldsDetails getFieldId() {
        return fieldId;
    }

    public void setFieldId(FieldsDetails fieldId) {
        this.fieldId = fieldId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldCategoryId != null ? fieldCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldCategoryRelation)) {
            return false;
        }
        FieldCategoryRelation other = (FieldCategoryRelation) object;
        if ((this.fieldCategoryId == null && other.fieldCategoryId != null) || (this.fieldCategoryId != null && !this.fieldCategoryId.equals(other.fieldCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FieldCategoryRelation[ fieldCategoryId=" + fieldCategoryId + " ]";
    }
    
}
