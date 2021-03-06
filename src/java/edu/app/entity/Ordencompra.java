/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.app.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author naiba
 */
@Entity
@Table(name = "ordencompra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordencompra.findAll", query = "SELECT o FROM Ordencompra o")
    , @NamedQuery(name = "Ordencompra.findByCantidad", query = "SELECT o FROM Ordencompra o WHERE o.cantidad = :cantidad")
    , @NamedQuery(name = "Ordencompra.findByIdOrdenCompra", query = "SELECT o FROM Ordencompra o WHERE o.idOrdenCompra = :idOrdenCompra")
    , @NamedQuery(name = "Ordencompra.findByClienteId", query = "SELECT o FROM Ordencompra o WHERE o.clienteId = :clienteId")
    , @NamedQuery(name = "Ordencompra.findByRecepcionistaId", query = "SELECT o FROM Ordencompra o WHERE o.recepcionistaId = :recepcionistaId")
    , @NamedQuery(name = "Ordencompra.findByProductoIdproducto", query = "SELECT o FROM Ordencompra o WHERE o.productoIdproducto = :productoIdproducto")})
public class Ordencompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOrdenCompra")
    private Integer idOrdenCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_id")
    private int clienteId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recepcionista_id")
    private int recepcionistaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "producto_idproducto")
    private int productoIdproducto;

    public Ordencompra() {
    }

    public Ordencompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public Ordencompra(Integer idOrdenCompra, int cantidad, int clienteId, int recepcionistaId, int productoIdproducto) {
        this.idOrdenCompra = idOrdenCompra;
        this.cantidad = cantidad;
        this.clienteId = clienteId;
        this.recepcionistaId = recepcionistaId;
        this.productoIdproducto = productoIdproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getRecepcionistaId() {
        return recepcionistaId;
    }

    public void setRecepcionistaId(int recepcionistaId) {
        this.recepcionistaId = recepcionistaId;
    }

    public int getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(int productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenCompra != null ? idOrdenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordencompra)) {
            return false;
        }
        Ordencompra other = (Ordencompra) object;
        if ((this.idOrdenCompra == null && other.idOrdenCompra != null) || (this.idOrdenCompra != null && !this.idOrdenCompra.equals(other.idOrdenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.app.entity.Ordencompra[ idOrdenCompra=" + idOrdenCompra + " ]";
    }
    
}
