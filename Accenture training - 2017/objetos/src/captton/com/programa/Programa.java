package captton.com.programa;

import captton.com.alumno.Alumno;
import captton.com.alumno.AlumnoPosgrado;
import captton.com.alumno.Contacto;

public class Programa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alu;
		alu = new Alumno("Fran", "Fon", 20);
		System.out.println("Edad de " + alu.getNombre() +": "+ alu.getEdad()
		+". Y aprobo " + alu.getMateriasAprobadas() + " materia");
		
		Contacto c1 = new Contacto("teodoro",3333,1234,"asas@gmail.com");
		alu.setContacto(c1);
		System.out.println(alu.getContacto().getEmail());
		
		
		Alumno alu2;
		alu2 = new Alumno("Fran", "f", 1);
		alu2.setNombre("pepe");
		System.out.println("Edad de " + alu.getNombre() +": "+ alu.getEdad());
		
		Contacto c2 = new Contacto("Godoy Cruz", 1245, 1425, "blabla@das.com");
		alu2.setContacto(c2);
		System.out.println(alu2.getContacto().getEmail());
		
		Alumno alu3;
		alu3 = new Alumno("Juan", "Mon", 23);
		System.out.println("Edad de " + alu3.getNombre() +": "+ alu3.getEdad());
		
		Contacto c3 = new Contacto("Libertador", 3423, 3123, "fa@fdf.com");
		alu3.setContacto(c3);
		System.out.println(alu3.getContacto().getEmail());
		
		
		alu.setContacto(c1);
		c1.setAlumno(alu);
		
		
		AlumnoPosgrado aluPos1 = new AlumnoPosgrado();
		aluPos1.setAlmorzar("Estoy almorzando.");
		aluPos1.setTrabajar("Trabajo de lunes a viernes.");
		aluPos1.setTrabajoTiempoExtra("Los viernes no hago horas extras.");
		System.out.println(aluPos1.getTrabajar() + " " + aluPos1.getAlmorzar() + " " + aluPos1.getTrabajoTiempoExtra());
		
		
		
		
		
	}
	
	

}