/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SR MOON
 */
@Entity
@Table(name = "SITUACIONESANORMALESRIESGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Situacionesanormalesriesgo.findAll", query = "SELECT s FROM Situacionesanormalesriesgo s"),
    @NamedQuery(name = "Situacionesanormalesriesgo.findById", query = "SELECT s FROM Situacionesanormalesriesgo s WHERE s.id = :id"),
    @NamedQuery(name = "Situacionesanormalesriesgo.findByNombre", query = "SELECT s FROM Situacionesanormalesriesgo s WHERE s.nombre = :nombre"),
    @NamedQuery(name = "Situacionesanormalesriesgo.findByTipoactorvial", query = "SELECT s FROM Situacionesanormalesriesgo s WHERE s.tipoactorvial = :tipoactorvial"),
    @NamedQuery(name = "Situacionesanormalesriesgo.findByLatitud", query = "SELECT s FROM Situacionesanormalesriesgo s WHERE s.latitud = :latitud"),
    @NamedQuery(name = "Situacionesanormalesriesgo.findByLongitud", query = "SELECT s FROM Situacionesanormalesriesgo s WHERE s.longitud = :longitud"),
    @NamedQuery(name = "Situacionesanormalesriesgo.findByExistenciasenalestransito", query = "SELECT s FROM Situacionesanormalesriesgo s WHERE s.existenciasenalestransito = :existenciasenalestransito")})
public class Situacionesanormalesriesgo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "TIPOACTORVIAL")
    private String tipoactorvial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private BigDecimal latitud;
    @Column(name = "LONGITUD")
    private BigDecimal longitud;
    @Column(name = "EXISTENCIASENALESTRANSITO")
    private Boolean existenciasenalestransito;
    @OneToMany(mappedBy = "reporteid")
    private Collection<Estadisticasseguridadvial> estadisticasseguridadvialCollection;
    @JoinColumn(name = "LOCALIDADID", referencedColumnName = "ID")
    @ManyToOne
    private Localidades localidadid;

    public Situacionesanormalesriesgo() {
    }

    public Situacionesanormalesriesgo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoactorvial() {
        return tipoactorvial;
    }

    public void setTipoactorvial(String tipoactorvial) {
        this.tipoactorvial = tipoactorvial;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public Boolean getExistenciasenalestransito() {
        return existenciasenalestransito;
    }

    public void setExistenciasenalestransito(Boolean existenciasenalestransito) {
        this.existenciasenalestransito = existenciasenalestransito;
    }

    @XmlTransient
    public Collection<Estadisticasseguridadvial> getEstadisticasseguridadvialCollection() {
        return estadisticasseguridadvialCollection;
    }

    public void setEstadisticasseguridadvialCollection(Collection<Estadisticasseguridadvial> estadisticasseguridadvialCollection) {
        this.estadisticasseguridadvialCollection = estadisticasseguridadvialCollection;
    }

    public Localidades getLocalidadid() {
        return localidadid;
    }

    public void setLocalidadid(Localidades localidadid) {
        this.localidadid = localidadid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Situacionesanormalesriesgo)) {
            return false;
        }
        Situacionesanormalesriesgo other = (Situacionesanormalesriesgo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Situacionesanormalesriesgo[ id=" + id + " ]";
    }
    
}
