package com.example.ejeFactura.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue
	private long idcliente;
	
	private String nombrecli;
	
	@OneToMany(mappedBy = "cliente")
	private List<Factura> listaFacturas;
	



	public Cliente() {
		
	}
	
	
	

	public Cliente(long idcliente, String nombrecli) {
		this.idcliente = idcliente;
		this.nombrecli = nombrecli;
	}




	public long getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(long idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombrecli() {
		return nombrecli;
	}

	public void setNombrecli(String nombrecli) {
		this.nombrecli = nombrecli;
	}

	public List<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(List<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}
	
	

}
