package com.captton.programa;

import java.util.ArrayList;

import com.captton.clase.Empleado;
import com.captton.clase.Gerente;

public class Programa {
	
	
	public static void main(String[] args) {
		
		
	ArrayList<Empleado> listaEmpleados;

	
	
	Empleado emp1 = new Gerente ("Matias", 20, 2000);
	((Gerente)emp1).getSalario();
	System.out.println(emp1.getNombre()+" "+emp1.getNombre());
	
	
	for (Empleado emp1: listaEmpleados) {
		
		
	}
		
	}
}