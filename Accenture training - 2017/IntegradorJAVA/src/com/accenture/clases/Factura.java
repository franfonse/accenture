package com.accenture.clases;

import java.util.ArrayList;

public class Factura {
	
	private Cliente cliente;
	private int total;
	ArrayList<Item> listaItems;
	
	
	public Factura(Cliente cliente) {
		this.cliente = cliente;
		listaItems = new ArrayList<>();
	}
	
	
	
	public void AgregarItems(Item items) {
		listaItems.add(items);
	}
	
	public void Facturar() {
		if (cliente.getDeuda() < 4000) {
			for (int i=0; i>listaItems.size(); i++) {
				int total = listaItems.get(i).getProductos().getPrecio() * listaItems.get(i).getCantidad();
				System.out.println(listaItems.get(i) + " " + total);
			}
		}
		else {
			System.out.print("No puede realizar una compra, su deuda es mayor a $4000.");
		}
	}
	
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public ArrayList<Item> getListaItems() {
		return listaItems;
	}


	public void setListaItems(ArrayList<Item> listaItems) {
		this.listaItems = listaItems;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	

}
