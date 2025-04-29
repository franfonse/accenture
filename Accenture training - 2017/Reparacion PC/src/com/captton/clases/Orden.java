package com.captton.clases;

import java.util.ArrayList;

public class Orden {

	private int numero;
	private String fecha;
	private String modelo;
	private String problema;
	private Cliente cliente;
	ArrayList<Item> listaDeItems;

	public Orden(int numero, String fecha, String modelo, String problema, Cliente cliente) {
		this.numero = numero;
		this.fecha = fecha;
		this.modelo = modelo;
		this.problema = problema;
		this.cliente = cliente;
		listaDeItems=new ArrayList<>();
	}

	public void agregarItem (Item asdfasefas) {
		listaDeItems.add(asdfasefas);
	}
	
	
	
	public void mostrarOrd1() {
		System.out.println(numero+" "+fecha+" "+modelo+" "+problema+" "+cliente.getNombre()
		+" "+cliente.getApellido()+" "+cliente.getNumero());
	
	
	for(int i=0; listaDeItems.size()>i;i++) {
		System.out.println(listaDeItems.get(i).getRepuesto().getCodeigo());
			System.out.println(listaDeItems.get(i).getCantidad());
	}
	
	
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


}
