package com.example.ejePost.controller.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="post")
public class Post {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String titulo;
	private Date fecha;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "post")
	List<PostComment> listaPost;
	
	
	

	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Post(String titulo, Date fecha) {
		this.titulo = titulo;
		this.fecha = fecha;
	}









	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

}
