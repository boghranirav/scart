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
@Table(name = "fields_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FieldsDetails.findAll", query = "SELECT f FROM FieldsDetails f"),
    @NamedQuery(name = "FieldsDetails.findByFieldId", query = "SELECT f FROM FieldsDetails f WHERE f.fieldId = :fieldId"),
    @NamedQuery(name = "FieldsDetails.findByFieldTitle", query = "SELECT f FROM FieldsDetails f WHERE f.fieldTitle = :fieldTitle"),
    @NamedQuery(name = "FieldsDetails.findByFieldType", query = "SELECT f FROM FieldsDetails f WHERE f.fieldType = :fieldType"),
    @NamedQuery(name = "FieldsDetails.findByFieldControl", query = "SELECT f FROM FieldsDetails f WHERE f.fieldControl = :fieldControl")})
public class FieldsDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "field_id")
    private Integer fieldId;
    @Size(max = 30)
    @Column(name = "field_title")
    private String fieldTitle;
    @Size(max = 30)
    @Column(name = "field_type")
    private String fieldType;
    @Size(max = 500)
    @Column(name = "field_control")
    private String fieldControl;
    @OneToMany(mappedBy = "fieldId")
    private Collection<FieldCategoryRelation> fieldCategoryRelationCollection;

    public FieldsDetails() {
    }

    public FieldsDetails(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldTitle() {
        return fieldTitle;
    }

    public void setFieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldControl() {
        return fieldControl;
    }

    public void setFieldControl(String fieldControl) {
        this.fieldControl = fieldControl;
    }

    @XmlTransient
    public Collection<FieldCategoryRelation> getFieldCategoryRelationCollection() {
        return fieldCategoryRelationCollection;
    }

    public void setFieldCategoryRelationCollection(Collection<FieldCategoryRelation> fieldCategoryRelationCollection) {
        this.fieldCategoryRelationCollection = fieldCategoryRelationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fieldId != null ? fieldId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FieldsDetails)) {
            return false;
        }
        FieldsDetails other = (FieldsDetails) object;
        if ((this.fieldId == null && other.fieldId != null) || (this.fieldId != null && !this.fieldId.equals(other.fieldId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FieldsDetails[ fieldId=" + fieldId + " ]";
    }
    
}
