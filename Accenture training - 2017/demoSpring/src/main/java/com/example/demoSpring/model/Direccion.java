package com.example.demoSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Direccion {
	
	private String calle;
	private int numero;

	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="alumno.id")
	private Alumno alumno;
	
	
	public Direccion() {
		
	}

	
	
	
	
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	

}
