package com.captton.clase;

public class Gerente extends Empleado {

	
	private float salario;
	

	
	public Gerente(String nombre, int numero, float salario) {
		super(nombre, numero);
		this.salario = salario;
	}



	public float getSalario() {
		return salario;
	}



	public void setSalario(float salario) {
		this.salario = salario;
	}

	
	
	
	

}
