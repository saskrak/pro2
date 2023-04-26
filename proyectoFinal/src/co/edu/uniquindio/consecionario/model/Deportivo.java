package co.edu.uniquindio.consecionario.model;

public class Deportivo {
	private String marca;
	private String estado;
	private String modelo;
	private String transmicion;
	private String velocidadMax;
	private String cilindraje;
	private int numPasajeros;
	private int numPuertas;
	private double capacidadMaletero;			
	private String caballosFuerza;
	private double de0a100Kmh;
	public Deportivo(String marca, String estado, String modelo, String transmicion, String velocidadMax,
			String cilindraje, int numPasajeros, int numPuertas, double capacidadMaletero, String caballosFuerza,
			double de0a100Kmh) {
		super();
		this.marca = marca;
		this.estado = estado;
		this.modelo = modelo;
		this.transmicion = transmicion;
		this.velocidadMax = velocidadMax;
		this.cilindraje = cilindraje;
		this.numPasajeros = numPasajeros;
		this.numPuertas = numPuertas;
		this.capacidadMaletero = capacidadMaletero;
		this.caballosFuerza = caballosFuerza;
		this.de0a100Kmh = de0a100Kmh;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTransmicion() {
		return transmicion;
	}
	public void setTransmicion(String transmicion) {
		this.transmicion = transmicion;
	}
	public String getVelocidadMax() {
		return velocidadMax;
	}
	public void setVelocidadMax(String velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}
	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
	public String getCaballosFuerza() {
		return caballosFuerza;
	}
	public void setCaballosFuerza(String caballosFuerza) {
		this.caballosFuerza = caballosFuerza;
	}
	public double getDe0a100Kmh() {
		return de0a100Kmh;
	}
	public void setDe0a100Kmh(double de0a100Kmh) {
		this.de0a100Kmh = de0a100Kmh;
	}
	
	
	
}
