package com.example.inteFinal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="propietario")
public class Propietario {
	
	@Id
	@GeneratedValue
	private long idpropietario;
	
	private int dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private int tel;
	
	@OneToMany(mappedBy = "propietario", cascade= CascadeType.ALL)
	List<Orden> listaOrdenes;
	

	public Propietario() {
		// TODO Auto-generated constructor stub
	}


	public Propietario(int dni, String nombre, String apellido, String direccion, int tel) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.tel = tel;
	}


	public long getIdpropietario() {
		return idpropietario;
	}


	public void setIdpropietario(long idpropietario) {
		this.idpropietario = idpropietario;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getTel() {
		return tel;
	}


	public void setTel(int tel) {
		this.tel = tel;
	}


	public List<Orden> getListaOrdenes() {
		return listaOrdenes;
	}


	public void setListaOrdenes(List<Orden> listaOrdenes) {
		this.listaOrdenes = listaOrdenes;
	}
	
	
	

}
