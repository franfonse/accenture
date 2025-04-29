package com.example.ejercicioSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class BookDetails {

	@Id
	@GeneratedValue
	private Long id;
	
	private String autor;
	private String editoral;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="libro_id")
	private Book libro;
	
	
	
	
	public BookDetails() {
		
	}

	
	
	
	

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditoral() {
		return editoral;
	}


	public void setEditoral(String editoral) {
		this.editoral = editoral;
	}






	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public Book getLibro() {
		return libro;
	}






	public void setLibro(Book libro) {
		this.libro = libro;
	}
	
	
	
	
	
	
}
