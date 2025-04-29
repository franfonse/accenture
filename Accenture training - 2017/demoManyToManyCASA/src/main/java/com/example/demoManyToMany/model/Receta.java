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
@Table(name = "receta")
public class Receta {

	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "receta")
	private List<Receingre> listaReceingre;
	
	

	public Receta() {
		this.listaReceingre = new ArrayList<Receingre>();
	}




	public Receta(String nombre) {
		this.nombre = nombre;
		this.listaReceingre = new ArrayList<Receingre>();
		
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



	public List<Receingre> getListaReceingre() {
		return listaReceingre;
	}



	public void setListaReceingre(List<Receingre> listaReceingre) {
		this.listaReceingre = listaReceingre;
	}
	
	
	public void agregoIngrediente(Receingre receingre) {
		this.listaReceingre.add(receingre);
		receingre.setReceta(this);
	}
	

}
