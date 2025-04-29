package captton.com.alumno;

import java.util.ArrayList;
import java.util.Collection;

public class Curso {
	
	private static final Collection<Alumno> Alumno = null;
	private String nombre;
	private int codigo;
	private int cargaHoraria;
	private String dia;
	private ArrayList<Alumno> alumnos;
	
	
	
	public Curso(String nombre, int codigo, int cargaHoraria, String dia) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.dia = dia;
		ArrayList<Alumno> al = new ArrayList(Alumno);
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public int getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}



	public String getDia() {
		return dia;
	}



	public void setDia(String dia) {
		this.dia = dia;
	}
	

	
	
	

}
