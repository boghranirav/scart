/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shailesh
 */
@Entity
@Table(name = "delete_ad_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DeleteAdDetails.findAll", query = "SELECT d FROM DeleteAdDetails d"),
    @NamedQuery(name = "DeleteAdDetails.findByDeletedId", query = "SELECT d FROM DeleteAdDetails d WHERE d.deletedId = :deletedId"),
    @NamedQuery(name = "DeleteAdDetails.findByDeleteAdId", query = "SELECT d FROM DeleteAdDetails d WHERE d.deleteAdId = :deleteAdId"),
    @NamedQuery(name = "DeleteAdDetails.findByDeleteAdTitle", query = "SELECT d FROM DeleteAdDetails d WHERE d.deleteAdTitle = :deleteAdTitle"),
    @NamedQuery(name = "DeleteAdDetails.findByDeleteAdValue", query = "SELECT d FROM DeleteAdDetails d WHERE d.deleteAdValue = :deleteAdValue"),
    @NamedQuery(name = "DeleteAdDetails.findByDeleteDate", query = "SELECT d FROM DeleteAdDetails d WHERE d.deleteDate = :deleteDate")})
public class DeleteAdDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "deleted_id")
    private Integer deletedId;
    @Column(name = "delete_ad_id")
    private Integer deleteAdId;
    @Size(max = 40)
    @Column(name = "delete_ad_title")
    private String deleteAdTitle;
    @Size(max = 200)
    @Column(name = "delete_ad_value")
    private String deleteAdValue;
    @Column(name = "delete_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleteDate;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private UserTable username;
    @JoinColumn(name = "child_category_id", referencedColumnName = "child_category_id")
    @ManyToOne
    private ChildCategory childCategoryId;

    public DeleteAdDetails() {
    }

    public DeleteAdDetails(Integer deletedId) {
        this.deletedId = deletedId;
    }

    public Integer getDeletedId() {
        return deletedId;
    }

    public void setDeletedId(Integer deletedId) {
        this.deletedId = deletedId;
    }

    public Integer getDeleteAdId() {
        return deleteAdId;
    }

    public void setDeleteAdId(Integer deleteAdId) {
        this.deleteAdId = deleteAdId;
    }

    public String getDeleteAdTitle() {
        return deleteAdTitle;
    }

    public void setDeleteAdTitle(String deleteAdTitle) {
        this.deleteAdTitle = deleteAdTitle;
    }

    public String getDeleteAdValue() {
        return deleteAdValue;
    }

    public void setDeleteAdValue(String deleteAdValue) {
        this.deleteAdValue = deleteAdValue;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
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
        hash += (deletedId != null ? deletedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeleteAdDetails)) {
            return false;
        }
        DeleteAdDetails other = (DeleteAdDetails) object;
        if ((this.deletedId == null && other.deletedId != null) || (this.deletedId != null && !this.deletedId.equals(other.deletedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DeleteAdDetails[ deletedId=" + deletedId + " ]";
    }
    
}
