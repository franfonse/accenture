package com.captton.clases;

public abstract class Productos {

	private int codigo;
	private String nombre;
	private int precio;
	
	
	
	public Productos(int codigo, String nombre, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	
	
	

	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}



	
	
	
	
	
}
