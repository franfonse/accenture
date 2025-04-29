package com.captton.programa;


import com.captton.clases.Cliente;
import com.captton.clases.Item;
import com.captton.clases.Orden;
import com.captton.clases.Repuestos;

public class Programa {

	public static void main(String[] args) {

		Cliente client1 = new Cliente(123, "Francisco", "Fonseca");
		Orden orden1 = new Orden(456, "Mayo", "modelo", "Sobrecalienta la CPU", client1);
		Repuestos repuesto1 = new Repuestos(789, "Cooler");
		Item item1 = new Item(repuesto1, 1);
		Repuestos repuesto2 = new Repuestos (4324, "Monitor");
		Item asdfas = new Item (repuesto2, 2);


		orden1.agregarItem(item1);
		
		orden1.agregarItem(asdfas);
	
		orden1.mostrarOrd1();
		
	}
}
