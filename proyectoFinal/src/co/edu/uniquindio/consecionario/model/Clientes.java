package co.edu.uniquindio.consecionario.model;

public class Clientes {
	private String nombre;
	private String identificacion;
	
	
	
	public Clientes(String nombre, String identificacion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	
}
