package com.example.inteFinal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="repuesto")
public class Repuesto {
	
	@Id
	@GeneratedValue
	private long idrepuesto;
	
	private String descripcion;
	private float costo;
	
	@OneToMany(mappedBy="repuesto", cascade= CascadeType.ALL)
	List<Repdetalle> listaRepdetalles;
	

	public Repuesto() {
		// TODO Auto-generated constructor stub
	}


	public Repuesto(String descripcion, float costo) {
		super();
		this.descripcion = descripcion;
		this.costo = costo;
	}


	public long getIdrepuesto() {
		return idrepuesto;
	}


	public void setIdrepuesto(long idrepuesto) {
		this.idrepuesto = idrepuesto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public float getCosto() {
		return costo;
	}


	public void setCosto(float costo) {
		this.costo = costo;
	}


	public List<Repdetalle> getListaRepdetalles() {
		return listaRepdetalles;
	}


	public void setListaRepdetalles(List<Repdetalle> listaRepdetalles) {
		this.listaRepdetalles = listaRepdetalles;
	}
	
	

}
