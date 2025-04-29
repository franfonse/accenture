package captton.com.alumno;

public class AlumnoPosgrado extends Alumno {

	
	private float cuota;
	private String almorzar;
	private String trabajar;
	private String trabajoTiempoExtra;
	
	
	
	public AlumnoPosgrado() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void aproboUnaMateria() {
		super.aproboUnaMateria();
		this.aproboUnaMateria = (int) (aproboUnaMateria*0.90);
	}
	




	public AlumnoPosgrado(String nom, String ape, int ed) {
		super(nom, ape, ed);
		// TODO Auto-generated constructor stub
	}
	

	public AlumnoPosgrado(String nombre, int edad, int materiasAprobadas) {
		super();
		// TODO Auto-generated constructor stub
	}



	public AlumnoPosgrado(float cuota, String almorzar, String trabajar, String trabajoTiempoExtra) {
		super();
		this.cuota = cuota;
		this.almorzar = almorzar;
		this.trabajar = trabajar;
		this.trabajoTiempoExtra = trabajoTiempoExtra;
	}
	
	
	
	
	public float getCuota() {
		return cuota;
	}



	public void setCuota(float cuota) {
		this.cuota = cuota;
	}



	public String getAlmorzar() {
		return almorzar;
	}



	public void setAlmorzar(String almorzar) {
		this.almorzar = almorzar;
	}



	public String getTrabajar() {
		return trabajar;
	}



	public void setTrabajar(String trabajar) {
		this.trabajar = trabajar;
	}



	public String getTrabajoTiempoExtra() {
		return trabajoTiempoExtra;
	}



	public void setTrabajoTiempoExtra(String trabajoTiempoExtra) {
		this.trabajoTiempoExtra = trabajoTiempoExtra;
	}



	public String almorzar () {
		return "Estoy almorzando";
	}
	
	
	final String trabajoTiempoExtra () {
		return "Yo los viernes no trabajo";
	}
	
	

}
