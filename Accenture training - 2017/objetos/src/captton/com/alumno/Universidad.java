package captton.com.alumno;

import java.util.ArrayList;

public class Universidad {
	
	private String nombre;
	private String tipo;
	private Profesor profesor;
	ArrayList<Universidad> universidades;
	private ArrayList<Alumno> alumnos;
	
	
	
	
	
	
	public Universidad(String nombre, String carrera, ArrayList<Alumno> alumnos) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.alumnos = alumnos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	

}
