package com.example.ejeInte.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "orden")
public class Orden {
	
	@Id
	@GeneratedValue
	private long idorden;

	private String patente;
	private Date fecha;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn (name = "propietarioid")
	private Propietario propietario;
	
	private String marca;
	private String detalle;
	
	@OneToMany(mappedBy = "orden", cascade = CascadeType.ALL)
	List<Repdetalle> listaRepdetalles;

	public Orden() {
		// TODO Auto-generated constructor stub
	}

	public Orden(String patente, Date fecha, Propietario propietario, String marca, String detalle) {
		super();
		this.patente = patente;
		this.fecha = fecha;
		this.propietario = propietario;
		this.marca = marca;
		this.detalle = detalle;
	}

	public long getIdorden() {
		return idorden;
	}

	public void setIdorden(long idorden) {
		this.idorden = idorden;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public List<Repdetalle> getListaRepdetalles() {
		return listaRepdetalles;
	}

	public void setListaRepdetalles(List<Repdetalle> listaRepdetalles) {
		this.listaRepdetalles = listaRepdetalles;
	}
	
	

}
