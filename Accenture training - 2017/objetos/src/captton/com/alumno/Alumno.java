package captton.com.alumno;

import java.util.ArrayList;

public class Alumno {
		
		private String nombre;
		private int edad;
		private int materiasAprobadas;
		private static int count=0;
		private Contacto contacto;
		protected int aproboUnaMateria;
		private Curso curso;
		ArrayList<Curso> cursos;
		
		public Alumno()
		{		
		}
		
		public Alumno(String nom, String ape, int ed)
		{
		  this.nombre = nom;
		  this.edad = ed;
		  this.materiasAprobadas=0;
		  Alumno.count++;
		  ArrayList<Curso> curs = new ArrayList<Curso>();
		 
		}
		
		
		

		public void setNombre(String nom)
		{
			this.nombre = nom;
		}
		
		
		public void setEdad(int ed)
		{
			this.edad = ed;
		}
		
		public String getNombre()
		{
			return this.nombre;
		}
		

		public int getMateriasAprobadas() {
			return materiasAprobadas;
		}

		public void setMateriasAprobadas(int materiasAprobadas) {
			this.materiasAprobadas = materiasAprobadas;
		}

		public void setAproboUnaMateria (int unaMAt) {
			this.materiasAprobadas = materiasAprobadas+1;
		}
		
		public static int getCount() {
			return count;
		}

		public static void setCount(int count) {
			Alumno.count = count;
		}
		
		public void aproboUnaMateria()
		{
			this.materiasAprobadas++;
		}

		
		public int getEdad() {
			return edad;
		}

		public Contacto getContacto() {
			return contacto;
		}

		public void setContacto(Contacto contacto) {
			this.contacto = contacto;
		}



		public Curso getCurso() {
			return curso;
		}

		public void setCurso(Curso curso) {
			this.curso = curso;
		}
		
		
		
		
		
		
		
	}