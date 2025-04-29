package com.captton.clase;

public class Azafatas extends Personal {
	
	
	private int horasVuelofaltantes;
	
	
	
	public Azafatas(String nombre, String apellido, int edad, int horasVuelo) {
		super(nombre, apellido, edad, horasVuelo);
		// TODO Auto-generated constructor stub
	}


	public void viajar() {
		if (this.getHorasVuelo() >= 50) {
			System.out.print("Felcitaciones ud. ha  llegado/superado las 50 horas, tiene un bonus del 20% de su sueldo.");
		}
			else {
				this.horasVuelofaltantes = (50-this.getHorasVuelo());
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
