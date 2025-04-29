package com.captton.clase;

public class Pilotos extends Personal {

	
	private int horasVuelofaltantes;
	
	
	public Pilotos(String nombre, String apellido, int edad, int horasVuelo) {
		super(nombre, apellido, edad, horasVuelo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void viajar() {
		if (this.getHorasVuelo() >= 30) {
			System.out.print("Felicitaciones, usted a llegado a 30 horas de vuelo, tiene una semana de descanso.");
		}
			else {
				this.horasVuelofaltantes = (30-this.getHorasVuelo());
				System.out.print("Aun te faltan " + this.getHorasVuelofaltantes() + " cantidad de horas para el premio");
				
			}
	}



	public int getHorasVuelofaltantes() {
		return horasVuelofaltantes;
	}



	public void setHorasVuelofaltantes(int horasVuelofaltantes) {
		this.horasVuelofaltantes = horasVuelofaltantes;
	}
	
	
	
	
	
}
	
