/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "group_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupMaster.findAll", query = "SELECT g FROM GroupMaster g"),
    @NamedQuery(name = "GroupMaster.findByGroupname", query = "SELECT g FROM GroupMaster g WHERE g.groupMasterPK.groupname = :groupname"),
    @NamedQuery(name = "GroupMaster.findByUsername", query = "SELECT g FROM GroupMaster g WHERE g.groupMasterPK.username = :username")})
public class GroupMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GroupMasterPK groupMasterPK;
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserTable userTable;

    public GroupMaster() {
    }

    public GroupMaster(GroupMasterPK groupMasterPK) {
        this.groupMasterPK = groupMasterPK;
    }

    public GroupMaster(String groupname, String username) {
        this.groupMasterPK = new GroupMasterPK(groupname, username);
    }

    public GroupMasterPK getGroupMasterPK() {
        return groupMasterPK;
    }

    public void setGroupMasterPK(GroupMasterPK groupMasterPK) {
        this.groupMasterPK = groupMasterPK;
    }

    public UserTable getUserTable() {
        return userTable;
    }

    public void setUserTable(UserTable userTable) {
        this.userTable = userTable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupMasterPK != null ? groupMasterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupMaster)) {
            return false;
        }
        GroupMaster other = (GroupMaster) object;
        if ((this.groupMasterPK == null && other.groupMasterPK != null) || (this.groupMasterPK != null && !this.groupMasterPK.equals(other.groupMasterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.GroupMaster[ groupMasterPK=" + groupMasterPK + " ]";
    }
    
}
