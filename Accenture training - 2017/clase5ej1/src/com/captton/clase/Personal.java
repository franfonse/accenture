package com.captton.clase;

public abstract class Personal {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int horasVuelo= 0;
	
	
	
	
	
	
	public Personal(String nombre, String apellido, int edad, int horasVuelo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.horasVuelo = this.horasVuelo+horasVuelo;
	}

	
	
	public void viajar(int horas) {
		this.horasVuelo = this.horasVuelo+horas;
		System.out.println(horasVuelo);
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getHorasVuelo() {
		return horasVuelo;
	}



	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}
	
	

}
