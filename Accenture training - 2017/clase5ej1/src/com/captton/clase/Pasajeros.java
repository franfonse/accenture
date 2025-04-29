package com.captton.clase;

public class Pasajeros extends Personal{
	
	
	private int horasVuelofaltantes;
	
	

	public Pasajeros(String nombre, String apellido, int edad, int horasVuelo) {
		super(nombre, apellido, edad, horasVuelo);
		// TODO Auto-generated constructor stub
	}

	
	
	public void viajar() {
		if (this.getHorasVuelo() >= 100) {
			System.out.print("Felicitaciones ud. ha llegado/superado las 100 horas y al ser frecuente se le regala un pasaje a Miami.");
		}
			else {
				this.horasVuelofaltantes = (100-this.getHorasVuelo());
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
