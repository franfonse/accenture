package com.captton.clases;

public class Item {

	private Productos producto;
	private int cantidad;
	
	
	public Item(Productos producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}


	
	
	
	
	
	public Productos getProducto() {
		return producto;
	}


	public void setProducto(Productos producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	

}
