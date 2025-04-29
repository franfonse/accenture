package com.captton.clases;

public class Cliente {

	private int numero;
	private String nombre;
	private String apellido;

	public Cliente(int numero, String nombre, String apellido) {
		
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

}
