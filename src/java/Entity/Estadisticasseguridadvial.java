/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SR MOON
 */
@Entity
@Table(name = "ESTADISTICASSEGURIDADVIAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadisticasseguridadvial.findAll", query = "SELECT e FROM Estadisticasseguridadvial e"),
    @NamedQuery(name = "Estadisticasseguridadvial.findById", query = "SELECT e FROM Estadisticasseguridadvial e WHERE e.id = :id"),
    @NamedQuery(name = "Estadisticasseguridadvial.findByContenido", query = "SELECT e FROM Estadisticasseguridadvial e WHERE e.contenido = :contenido"),
    @NamedQuery(name = "Estadisticasseguridadvial.findByTipoestadistica", query = "SELECT e FROM Estadisticasseguridadvial e WHERE e.tipoestadistica = :tipoestadistica"),
    @NamedQuery(name = "Estadisticasseguridadvial.findByAnio", query = "SELECT e FROM Estadisticasseguridadvial e WHERE e.anio = :anio"),
    @NamedQuery(name = "Estadisticasseguridadvial.findByMes", query = "SELECT e FROM Estadisticasseguridadvial e WHERE e.mes = :mes")})
public class Estadisticasseguridadvial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "CONTENIDO")
    private String contenido;
    @Size(max = 50)
    @Column(name = "TIPOESTADISTICA")
    private String tipoestadistica;
    @Column(name = "ANIO")
    private Integer anio;
    @Column(name = "MES")
    private Integer mes;
    @JoinColumn(name = "REPORTEID", referencedColumnName = "ID")
    @ManyToOne
    private Situacionesanormalesriesgo reporteid;
    @JoinColumn(name = "RESPONSABLEID", referencedColumnName = "ID")
    @ManyToOne
    private Usuarios responsableid;

    public Estadisticasseguridadvial() {
    }

    public Estadisticasseguridadvial(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipoestadistica() {
        return tipoestadistica;
    }

    public void setTipoestadistica(String tipoestadistica) {
        this.tipoestadistica = tipoestadistica;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Situacionesanormalesriesgo getReporteid() {
        return reporteid;
    }

    public void setReporteid(Situacionesanormalesriesgo reporteid) {
        this.reporteid = reporteid;
    }

    public Usuarios getResponsableid() {
        return responsableid;
    }

    public void setResponsableid(Usuarios responsableid) {
        this.responsableid = responsableid;
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
        if (!(object instanceof Estadisticasseguridadvial)) {
            return false;
        }
        Estadisticasseguridadvial other = (Estadisticasseguridadvial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Estadisticasseguridadvial[ id=" + id + " ]";
    }
    
}
