package com.captton.clases;

public class ProductoManufactura extends Productos {

	
	private boolean stock;
	
	
	public ProductoManufactura(int codigo, String nombre, int precio, boolean stock) {
		super(codigo, nombre, precio);
		this.stock = stock;
	}
	
	
	public void Vender () {
		if (stock = true) {
			Vender();
		}
		else {
			System.out.println("No hay stock.");
		}
	}


	public boolean isStock() {
		return stock;
	}


	public void setStock(boolean stock) {
		this.stock = stock;
	}

	
	
	

}
