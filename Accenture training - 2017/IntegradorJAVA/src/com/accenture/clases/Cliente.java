package com.accenture.clases;

public class Cliente {
	
	private int numero;
	private String nombre;
	private String apellido;
	private int deuda;
	
	
	public Cliente(int numero, String nombre, String apellido, int deuda) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.deuda = deuda;
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
	public int getDeuda() {
		return deuda;
	}
	public void setDeuda(int deuda) {
		this.deuda = deuda;
	}
	
	
	

}
