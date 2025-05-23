package com.example.demoSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String apellido;
	private int edad;
	
	@OneToOne(cascade= CascadeType.ALL, mappedBy = "alumno")
	private Direccion direccion;

	public Alumno() {
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getId() {
		return id;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
