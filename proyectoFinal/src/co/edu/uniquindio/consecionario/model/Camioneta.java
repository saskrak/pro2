package co.edu.uniquindio.consecionario.model;

public class Camioneta {
	private String marca;
	private String estado;
	private String modelo;
	private String transmicion;
	private String velocidadMax;
	private String cilindraje;
	private int numPasajeros;
	private int numPuertas;
	private double capacidadMaletero;			
	private String aireAcondicionado;
	private String camaraReversa;
	private double velocidadCrucero;
	private String frenoABS;
	private String sensorColision;
	private String sensorTraficoCruzado;
	private String asistenteCarril;
	private String c4x4;
	public Camioneta(String marca, String estado, String modelo, String transmicion, String velocidadMax,
			String cilindraje, int numPasajeros, int numPuertas, double capacidadMaletero, String aireAcondicionado,
			String camaraReversa, double velocidadCrucero, String frenoABS, String sensorColision,
			String sensorTraficoCruzado, String asistenteCarril, String c4x4) {
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
		this.aireAcondicionado = aireAcondicionado;
		this.camaraReversa = camaraReversa;
		this.velocidadCrucero = velocidadCrucero;
		this.frenoABS = frenoABS;
		this.sensorColision = sensorColision;
		this.sensorTraficoCruzado = sensorTraficoCruzado;
		this.asistenteCarril = asistenteCarril;
		this.c4x4 = c4x4;
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
	public double getVelocidadCrucero() {
		return velocidadCrucero;
	}
	public void setVelocidadCrucero(double velocidadCrucero) {
		this.velocidadCrucero = velocidadCrucero;
	}
	public String getFrenoABS() {
		return frenoABS;
	}
	public void setFrenoABS(String frenoABS) {
		this.frenoABS = frenoABS;
	}
	public String getSensorColision() {
		return sensorColision;
	}
	public void setSensorColision(String sensorColision) {
		this.sensorColision = sensorColision;
	}
	public String getSensorTraficoCruzado() {
		return sensorTraficoCruzado;
	}
	public void setSensorTraficoCruzado(String sensorTraficoCruzado) {
		this.sensorTraficoCruzado = sensorTraficoCruzado;
	}
	public String getAsistenteCarril() {
		return asistenteCarril;
	}
	public void setAsistenteCarril(String asistenteCarril) {
		this.asistenteCarril = asistenteCarril;
	}
	public String getC4x4() {
		return c4x4;
	}
	public void setC4x4(String c4x4) {
		this.c4x4 = c4x4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aireAcondicionado == null) ? 0 : aireAcondicionado.hashCode());
		result = prime * result + ((asistenteCarril == null) ? 0 : asistenteCarril.hashCode());
		result = prime * result + ((c4x4 == null) ? 0 : c4x4.hashCode());
		result = prime * result + ((camaraReversa == null) ? 0 : camaraReversa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(capacidadMaletero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cilindraje == null) ? 0 : cilindraje.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((frenoABS == null) ? 0 : frenoABS.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + numPasajeros;
		result = prime * result + numPuertas;
		result = prime * result + ((sensorColision == null) ? 0 : sensorColision.hashCode());
		result = prime * result + ((sensorTraficoCruzado == null) ? 0 : sensorTraficoCruzado.hashCode());
		result = prime * result + ((transmicion == null) ? 0 : transmicion.hashCode());
		temp = Double.doubleToLongBits(velocidadCrucero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((velocidadMax == null) ? 0 : velocidadMax.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camioneta other = (Camioneta) obj;
		if (aireAcondicionado == null) {
			if (other.aireAcondicionado != null)
				return false;
		} else if (!aireAcondicionado.equals(other.aireAcondicionado))
			return false;
		if (asistenteCarril == null) {
			if (other.asistenteCarril != null)
				return false;
		} else if (!asistenteCarril.equals(other.asistenteCarril))
			return false;
		if (c4x4 == null) {
			if (other.c4x4 != null)
				return false;
		} else if (!c4x4.equals(other.c4x4))
			return false;
		if (camaraReversa == null) {
			if (other.camaraReversa != null)
				return false;
		} else if (!camaraReversa.equals(other.camaraReversa))
			return false;
		if (Double.doubleToLongBits(capacidadMaletero) != Double.doubleToLongBits(other.capacidadMaletero))
			return false;
		if (cilindraje == null) {
			if (other.cilindraje != null)
				return false;
		} else if (!cilindraje.equals(other.cilindraje))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (frenoABS == null) {
			if (other.frenoABS != null)
				return false;
		} else if (!frenoABS.equals(other.frenoABS))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (numPasajeros != other.numPasajeros)
			return false;
		if (numPuertas != other.numPuertas)
			return false;
		if (sensorColision == null) {
			if (other.sensorColision != null)
				return false;
		} else if (!sensorColision.equals(other.sensorColision))
			return false;
		if (sensorTraficoCruzado == null) {
			if (other.sensorTraficoCruzado != null)
				return false;
		} else if (!sensorTraficoCruzado.equals(other.sensorTraficoCruzado))
			return false;
		if (transmicion == null) {
			if (other.transmicion != null)
				return false;
		} else if (!transmicion.equals(other.transmicion))
			return false;
		if (Double.doubleToLongBits(velocidadCrucero) != Double.doubleToLongBits(other.velocidadCrucero))
			return false;
		if (velocidadMax == null) {
			if (other.velocidadMax != null)
				return false;
		} else if (!velocidadMax.equals(other.velocidadMax))
			return false;
		return true;
	}
	
	
	
	
}
