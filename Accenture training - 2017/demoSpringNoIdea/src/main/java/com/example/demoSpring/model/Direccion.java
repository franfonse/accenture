package com.example.demoSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Direccion {

	private String direccion;
	private int postal;
	private String tel;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="alumno.id")
	private Alumno alumno;
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getPostal() {
		return postal;
	}

	public void setPostal(int postal) {
		this.postal = postal;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	
	
	
}
