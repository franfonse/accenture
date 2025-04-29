package com.example.ejeFactura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue
	private long idproducto;
	
	private String nombrepro;
	private float precio;
	
	
	
	
	public Producto() {
		
	}


	public Producto(long idproducto, String nombrepro, float precio) {
		this.idproducto = idproducto;
		this.nombrepro = nombrepro;
		this.precio = precio;
	}
	
	
	
	
	
	public long getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombrepro() {
		return nombrepro;
	}
	public void setNombrepro(String nombrepro) {
		this.nombrepro = nombrepro;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	

	

}
