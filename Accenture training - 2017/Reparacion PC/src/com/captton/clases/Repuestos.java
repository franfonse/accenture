package com.captton.clases;

public class Repuestos {

	private int codigo;
	private String descripcion;

	public Repuestos(int codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public int getCodeigo() {
		return codigo;
	}

	public void setCodeigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
