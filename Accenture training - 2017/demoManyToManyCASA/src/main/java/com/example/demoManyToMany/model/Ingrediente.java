package com.example.demoManyToMany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ingrediente")
public class Ingrediente {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String marca;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "ingrediente")
	private List<Receingre> receingre;
	
	
	public Ingrediente() {
		// TODO Auto-generated constructor stub
		receingre = new ArrayList<Receingre>();
	}
	
	


	public Ingrediente(String nombre, String marca) {
		this.nombre = nombre;
		this.marca = marca;
		this.receingre = new ArrayList<Receingre>();
	}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public List<Receingre> getReceingre() {
		return receingre;
	}


	public void setReceingre(List<Receingre> receingre) {
		this.receingre = receingre;
	}
	
	

}
