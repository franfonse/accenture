package com.accenture.programa;

import com.accenture.clases.Cliente;
import com.accenture.clases.Factura;
import com.accenture.clases.Item;
import com.accenture.clases.ProductoManufactura;
import com.accenture.clases.ProductoServicio;

public class Programa {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente (8594, "Francisco", "Fonseca", 1000);
		ProductoManufactura manufactura1 = new ProductoManufactura (123, "iPhone 7", 16000);
		ProductoServicio servicio1 = new ProductoServicio (456, "Garantia de un año", 1000);
		Item item1 = new Item (manufactura1, 1);
		Item item2 = new Item (servicio1, 1);
		Factura factura1 = new Factura (cliente1);
		
		factura1.AgregarItems(item1);
		factura1.AgregarItems(item2);
		
		factura1.Facturar();

	}

}
