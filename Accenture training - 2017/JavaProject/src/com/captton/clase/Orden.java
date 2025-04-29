package com.captton.clase;


public class Orden {
	
	private int numeroOrden;
	private String fecha;
	private String problema;
	private Cliente cliente;
	
	
	
	
	public Orden(int numeroOrden, String fecha, String problema, Cliente cliente) {
		this.numeroOrden = numeroOrden;
		this.fecha = fecha;
		this.problema = problema;
		this.cliente = cliente;
	}
	
	
	
	


	public int getNumeroOrden() {
		return numeroOrden;
	}


	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
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
