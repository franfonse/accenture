package captton.com.alumno;

public class Contacto {
	
	private String direccion;
	private int alturaCalle;
	private int codigoPostal;
	private String email;
	private Alumno alumno;
	
	
	public Contacto(String direccion, int alturaCalle, int codigoPostal, String email) {
		this.direccion = direccion;
		this.alturaCalle = alturaCalle;
		this.codigoPostal = codigoPostal;
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getAlturaCalle() {
		return alturaCalle;
	}


	public void setAlturaCalle(int alturaCalle) {
		this.alturaCalle = alturaCalle;
	}


	public int getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	

}
