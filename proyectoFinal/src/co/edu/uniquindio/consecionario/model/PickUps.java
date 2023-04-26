package co.edu.uniquindio.consecionario.model;

public class PickUps {
	private String marca;
	private String estado;
	private String modelo;
	private String transmicion;
	private String velocidadMax;
	private String cilindraje;
	private int numPasajeros;
	private int numPuertas;
	private String aireAcondicionado;
	private String camaraReversa;
	private int numBolsas;
	private String frenoABS;
	private String c4x4;
	private double capacidadCajaNegra;
	public PickUps(String marca, String estado, String modelo, String transmicion, String velocidadMax,
			String cilindraje, int numPasajeros, int numPuertas, String aireAcondicionado, String camaraReversa,
			int numBolsas, String frenoABS, String c4x4, double capacidadCajaNegra) {
		super();
		this.marca = marca;
		this.estado = estado;
		this.modelo = modelo;
		this.transmicion = transmicion;
		this.velocidadMax = velocidadMax;
		this.cilindraje = cilindraje;
		this.numPasajeros = numPasajeros;
		this.numPuertas = numPuertas;
		this.aireAcondicionado = aireAcondicionado;
		this.camaraReversa = camaraReversa;
		this.numBolsas = numBolsas;
		this.frenoABS = frenoABS;
		this.c4x4 = c4x4;
		this.capacidadCajaNegra = capacidadCajaNegra;
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
	public String getAireAcondicionado() {
		return aireAcondicionado;
	}
	public void setAireAcondicionado(String aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	public String getCamaraReversa() {
		return camaraReversa;
	}
	public void setCamaraReversa(String camaraReversa) {
		this.camaraReversa = camaraReversa;
	}
	public int getNumBolsas() {
		return numBolsas;
	}
	public void setNumBolsas(int numBolsas) {
		this.numBolsas = numBolsas;
	}
	public String getFrenoABS() {
		return frenoABS;
	}
	public void setFrenoABS(String frenoABS) {
		this.frenoABS = frenoABS;
	}
	public String getC4x4() {
		return c4x4;
	}
	public void setC4x4(String c4x4) {
		this.c4x4 = c4x4;
	}
	public double getCapacidadCajaNegra() {
		return capacidadCajaNegra;
	}
	public void setCapacidadCajaNegra(double capacidadCajaNegra) {
		this.capacidadCajaNegra = capacidadCajaNegra;
	}

	
	
	
}
