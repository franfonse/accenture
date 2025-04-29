package com.captton.programa;

import com.captton.clase.Azafatas;
import com.captton.clase.Pasajeros;
import com.captton.clase.Pilotos;

public class Programa {
	
	
	

	public static void main(String[] args) {
		
		Pilotos pilot1 = new Pilotos ( "Juan", "Fonseca", 40, 50);
		System.out.print("Sus horas de vuelo son: " + pilot1.getHorasVuelo() + ". ");
		pilot1.viajar();
		
		
		Azafatas azafata1 = new Azafatas ("Maria", "Fonseca", 20, 45);
		System.out.println("Sus horas de vuelo son: " + azafata1.getHorasVuelo() + ". ");
		azafata1.viajar();
		
		
		Pasajeros pasaj1 = new Pasajeros ( "Miguel", "Fonseca", 50, 125);
		System.out.print("Sus horas de vuelo son: " + pasaj1.getHorasVuelo() + ". ");
		pasaj1.viajar();

	}
	
	
	
	
	
	

}
