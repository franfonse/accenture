package com.captton.clase;

public abstract class Empleado {
	
	private String nombre;
	private int numero;
	
	
	
	public Empleado(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
	
	
	
	
	

}
