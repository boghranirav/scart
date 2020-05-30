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
@Table(name = "state_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StateTable.findAll", query = "SELECT s FROM StateTable s"),
    @NamedQuery(name = "StateTable.findByStateId", query = "SELECT s FROM StateTable s WHERE s.stateId = :stateId"),
    @NamedQuery(name = "StateTable.findByStateName", query = "SELECT s FROM StateTable s WHERE s.stateName = :stateName")})
public class StateTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "state_id")
    private Integer stateId;
    @Size(max = 40)
    @Column(name = "state_name")
    private String stateName;
    @OneToMany(mappedBy = "stateId")
    private Collection<UserTable> userTableCollection;
    @OneToMany(mappedBy = "stateId")
    private Collection<CityTable> cityTableCollection;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne
    private CountryTable countryId;

    public StateTable() {
    }

    public StateTable(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @XmlTransient
    public Collection<UserTable> getUserTableCollection() {
        return userTableCollection;
    }

    public void setUserTableCollection(Collection<UserTable> userTableCollection) {
        this.userTableCollection = userTableCollection;
    }

    @XmlTransient
    public Collection<CityTable> getCityTableCollection() {
        return cityTableCollection;
    }

    public void setCityTableCollection(Collection<CityTable> cityTableCollection) {
        this.cityTableCollection = cityTableCollection;
    }

    public CountryTable getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryTable countryId) {
        this.countryId = countryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StateTable)) {
            return false;
        }
        StateTable other = (StateTable) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.StateTable[ stateId=" + stateId + " ]";
    }
    
}
