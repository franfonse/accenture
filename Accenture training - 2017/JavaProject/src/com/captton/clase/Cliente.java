package com.captton.clase;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int numeroCliente;
	
	
	public Cliente(String nombre, String apellido, int numeroCliente) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroCliente = numeroCliente;
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


	public int getNumeroCliente() {
		return numeroCliente;
	}


	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	
	
	

}
