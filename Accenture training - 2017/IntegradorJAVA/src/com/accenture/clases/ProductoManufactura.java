package com.accenture.clases;

public class ProductoManufactura extends Producto {

	private int stock;
	
	public ProductoManufactura(int codigo, String nombre, int precio) {
		super(codigo, nombre, precio);
	}
	
	
	
	
	
	

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
}
