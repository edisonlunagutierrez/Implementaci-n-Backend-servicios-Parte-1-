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
@Table(name = "CATEGORIASSENALESTRANSITO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoriassenalestransito.findAll", query = "SELECT c FROM Categoriassenalestransito c"),
    @NamedQuery(name = "Categoriassenalestransito.findById", query = "SELECT c FROM Categoriassenalestransito c WHERE c.id = :id"),
    @NamedQuery(name = "Categoriassenalestransito.findByNombre", query = "SELECT c FROM Categoriassenalestransito c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Categoriassenalestransito.findByDescripcion", query = "SELECT c FROM Categoriassenalestransito c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Categoriassenalestransito.findByAplicacion", query = "SELECT c FROM Categoriassenalestransito c WHERE c.aplicacion = :aplicacion")})
public class Categoriassenalestransito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "APLICACION")
    private String aplicacion;

    public Categoriassenalestransito() {
    }

    public Categoriassenalestransito(Integer id) {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
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
        if (!(object instanceof Categoriassenalestransito)) {
            return false;
        }
        Categoriassenalestransito other = (Categoriassenalestransito) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Categoriassenalestransito[ id=" + id + " ]";
    }
    
}
