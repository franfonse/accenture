package com.example.demoOneToMany.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fabricante")
public class Fabricante {

	@Id
    @GeneratedValue
    private Long id;
	
	private String nombre;
	
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fabricante")
	List<Articulo> listaArticulos;
	
	@JoinColumn(name = "municipio_id")
	private Municipio municipio;
	
	
	public Fabricante() {
		// TODO Auto-generated constructor stub
	}

	
	public void agregarArticulos(Articulo articulo) {
		this.listaArticulos.add(articulo);
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Municipio getMunicipio() {
		return municipio;
	}


	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	
	
}
