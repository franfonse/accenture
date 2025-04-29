package com.captton.clases;

import java.util.ArrayList;

public class Factura {
	
	private Cliente cliente;
	private Item item;
	private int total;
	ArrayList<Item> listaItems;
	
	
	
	public Factura(Cliente cliente, Item item, int total) {
		this.cliente = cliente;
		this.item = item;
		listaItems = new ArrayList<>();
	}
	
	
	
	
	public void  (Item items) {
		listaItems.add(items);
	}
	
	
	
	public void Facturar () {
		System.out.println(cliente.getNumero() + "-" + cliente.getNombre() + " " + cliente.getApellido());
		for(int i = 0; i < listaItems.size(); i++) {
			int total = listaItems.get(i).getProducto().getPrecio() * listaItems.get(i).getCantidad();
			System.out.println(listaItems.get(i).getProducto().getNombre() + "-" + 
			"Cantidad: " + listaItems.get(i).getCantidad() + " " + "Precio total: " + total);
		}
	}
	
	
	
	public Item getItem() {
		return item;
	}
	



	public void setItem(Item item) {
		this.item = item;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public ArrayList<Item> getListaItems() {
		return listaItems;
	}



	public void setListaItems(ArrayList<Item> listaItems) {
		this.listaItems = listaItems;
	}
	
	
	
	
	
	
	

}
