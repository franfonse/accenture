package com.captton.programa;


import com.captton.clase.Cliente;
import com.captton.clase.Item;
import com.captton.clase.Orden;
import com.captton.clase.Repuestos;

public class Programa {

	public static void main(String[] args) {
		
		
		
		Cliente cliente1 = new Cliente ("Francisco", "Fonseca", 8594);
		Orden orden1 = new Orden (123, "Mayo", "Sobrecalienta la CPU", cliente1);
		Repuestos repuesto1 = new Repuestos (789, "CPU");
		Item item1 = new Item (repuesto1, 1);
		
		
		System.out.println(orden1);
		
		
	}
}