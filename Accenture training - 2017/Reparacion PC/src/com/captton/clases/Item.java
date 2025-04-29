package com.captton.clases;

public class Item {

	private Repuestos repuesto;
	private int cantidad;

	public Item(Repuestos repuesto, int cantidad) {
		this.repuesto = repuesto;
		this.cantidad = cantidad;
	}

	public Repuestos getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(Repuestos repuesto) {
		this.repuesto = repuesto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
