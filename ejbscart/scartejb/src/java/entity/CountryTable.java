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
@Table(name = "country_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CountryTable.findAll", query = "SELECT c FROM CountryTable c"),
    @NamedQuery(name = "CountryTable.findByCountryId", query = "SELECT c FROM CountryTable c WHERE c.countryId = :countryId"),
    @NamedQuery(name = "CountryTable.findByCountryName", query = "SELECT c FROM CountryTable c WHERE c.countryName = :countryName")})
public class CountryTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "country_id")
    private Integer countryId;
    @Size(max = 30)
    @Column(name = "country_name")
    private String countryName;
    @OneToMany(mappedBy = "countryId")
    private Collection<StateTable> stateTableCollection;

    public CountryTable() {
    }

    public CountryTable(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @XmlTransient
    public Collection<StateTable> getStateTableCollection() {
        return stateTableCollection;
    }

    public void setStateTableCollection(Collection<StateTable> stateTableCollection) {
        this.stateTableCollection = stateTableCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryId != null ? countryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryTable)) {
            return false;
        }
        CountryTable other = (CountryTable) object;
        if ((this.countryId == null && other.countryId != null) || (this.countryId != null && !this.countryId.equals(other.countryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CountryTable[ countryId=" + countryId + " ]";
    }
    
}
