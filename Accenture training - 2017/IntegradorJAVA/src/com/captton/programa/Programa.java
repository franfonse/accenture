package com.captton.programa;

import com.captton.clases.Cliente;
import com.captton.clases.Factura;
import com.captton.clases.Item;
import com.captton.clases.ProductoManufactura;
import com.captton.clases.ProductoServicio;

public class Programa {


	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente (8504, "Francisco", "Fonseca", 1000);
		ProductoManufactura manufactura1 = new ProductoManufactura (123, "iPhone", 16000, true);
		ProductoServicio servicio1 = new ProductoServicio (456, "Garantia por un año", 1000);
		Item item1 = new Item (manufactura1, 1);
		Item item2 = new Item (servicio1, 1);
		Factura factura1 = new Factura (cliente1, item1, 0);
		
		factura1.AgregarItems(item1);
		factura1.AgregarItems(item2);
		
		factura1.Facturar();
		
		
	}

}