package com.example.ejeFactura.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	@GeneratedValue
	private long iditem;
	
	@ManyToOne
	@JoinColumn(name = "facturaid")
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name = "productoid")
	private Producto producto;
	
	private int qty;

	
	
	
	public Item() {
		
	}



	public Item(Factura factura, Producto producto, int qty) {
		this.factura = factura;
		this.producto = producto;
		this.qty = qty;
	}

	
	
	
	
	public long getIditem() {
		return iditem;
	}

	public void setIditem(long iditem) {
		this.iditem = iditem;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	
	

}
