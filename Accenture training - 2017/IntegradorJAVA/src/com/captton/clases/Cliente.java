package com.captton.clases;

//import java.util.ArrayList;

public class Cliente {

	private int numero;
	private String nombre;
	private String apellido;
	private int deuda;
	//ArrayList<Item> listaItems;
	
	
	public Cliente(int numero, String nombre, String apellido, int deuda) {
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.deuda = deuda;
		//listaItems = new ArrayList<>();
	}
	
	/*public void AgregarItems (Item items) {
		listaItems.add(items);
	}*/
	
	
	
	public void Comprar () {
		if (deuda < 4000) {
			/*System.out.println(numero + "-" + nombre + " " + apellido);
			for(int i = 0; i < listaItems.size(); i++) {
				int total = listaItems.get(i).getProducto().getPrecio() * listaItems.get(i).getCantidad();
				System.out.println(listaItems.get(i).getProducto().getNombre() + "-" + 
				"Cantidad: " + listaItems.get(i).getCantidad() + " " + "Precio total: " + total);
			}*/
		}
		else {
			System.out.println("No es posible realizar una compra, su deuda es mayor a $4000.");
		}
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
