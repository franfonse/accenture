package com.example.ejercicioSpring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Book {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@OneToOne(cascade= CascadeType.ALL, mappedBy = "libro")
	private BookDetails details;

	
	public Book() {
		
	}

	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public BookDetails getDetails() {
		return details;
	}




	public void setDetails(BookDetails details) {
		this.details = details;
	}
	
	
	
	
}
