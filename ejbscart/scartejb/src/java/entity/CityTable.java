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
@Table(name = "city_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CityTable.findAll", query = "SELECT c FROM CityTable c"),
    @NamedQuery(name = "CityTable.findByCityId", query = "SELECT c FROM CityTable c WHERE c.cityId = :cityId"),
    @NamedQuery(name = "CityTable.findByCityName", query = "SELECT c FROM CityTable c WHERE c.cityName = :cityName")})
public class CityTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "city_id")
    private Integer cityId;
    @Size(max = 40)
    @Column(name = "city_name")
    private String cityName;
    @OneToMany(mappedBy = "cityId")
    private Collection<UserTable> userTableCollection;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private StateTable stateId;

    public CityTable() {
    }

    public CityTable(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @XmlTransient
    public Collection<UserTable> getUserTableCollection() {
        return userTableCollection;
    }

    public void setUserTableCollection(Collection<UserTable> userTableCollection) {
        this.userTableCollection = userTableCollection;
    }

    public StateTable getStateId() {
        return stateId;
    }

    public void setStateId(StateTable stateId) {
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityId != null ? cityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CityTable)) {
            return false;
        }
        CityTable other = (CityTable) object;
        if ((this.cityId == null && other.cityId != null) || (this.cityId != null && !this.cityId.equals(other.cityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CityTable[ cityId=" + cityId + " ]";
    }
    
}
