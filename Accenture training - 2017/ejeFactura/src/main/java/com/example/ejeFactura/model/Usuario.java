package com.example.ejeFactura.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private long idusuario;
	
	private String nombre;
	private String password;
	
	@OneToMany(mappedBy="usuario")
	private List<Factura> listaFactura;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	

	public Usuario(long idusuario, String nombre, String password) {
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.password = password;
	}
	
	

	public long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword() {
		return password;
	}



	public List<Factura> getListaFactura() {
		return listaFactura;
	}


	public void setListaFactura(List<Factura> listaFactura) {
		this.listaFactura = listaFactura;
	}

	
	
	

}
