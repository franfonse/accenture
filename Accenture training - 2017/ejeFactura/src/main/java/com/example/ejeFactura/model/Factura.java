package com.example.ejeFactura.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {

	@Id
	@GeneratedValue
	private long idfactura;
	
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name = "clienteid")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "factura")
	private List <Item> listaItem;
	
	@ManyToOne
	@JoinColumn(name= "usuarioid")
	private Usuario usuario;

	
	
	public Factura() {
	}



	public Factura(long idfactura, Date fecha, Cliente cliente) {
		this.idfactura = idfactura;
		this.fecha = fecha;
		this.cliente = cliente;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(long idfactura) {
		this.idfactura = idfactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Item> getListaItem() {
		return listaItem;
	}

	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	

}
