package co.edu.uniquindio.consecionario.model;

public class Bus {
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
	private int numBolsasAire;
	private String frenoABS;
	private int numEjes;
	private int numSalidasEmergencias;
	
	
	
	
	public Bus(String marca, String estado, String modelo, String transmicion, String velocidadMax, String cilindraje,
			int numPasajeros, int numPuertas, double capacidadMaletero, String aireAcondicionado, String camaraReversa,
			int numBolsasAire, String frenoABS, int numEjes, int numSalidasEmergencias) {
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
		this.numBolsasAire = numBolsasAire;
		this.frenoABS = frenoABS;
		this.numEjes = numEjes;
		this.numSalidasEmergencias = numSalidasEmergencias;
	}
	
	
	@Override
	public String toString() {
		return "Bus [marca=" + marca + ", estado=" + estado + ", modelo=" + modelo + ", transmicion=" + transmicion
				+ ", velocidadMax=" + velocidadMax + ", cilindraje=" + cilindraje + ", numPasajeros=" + numPasajeros
				+ ", numPuertas=" + numPuertas + ", capacidadMaletero=" + capacidadMaletero + ", aireAcondicionado="
				+ aireAcondicionado + ", camaraReversa=" + camaraReversa + ", numBolsasAire=" + numBolsasAire
				+ ", frenoABS=" + frenoABS + ", numEjes=" + numEjes + ", numSalidasEmergencias=" + numSalidasEmergencias
				+ "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aireAcondicionado == null) ? 0 : aireAcondicionado.hashCode());
		result = prime * result + ((camaraReversa == null) ? 0 : camaraReversa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(capacidadMaletero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cilindraje == null) ? 0 : cilindraje.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((frenoABS == null) ? 0 : frenoABS.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + numBolsasAire;
		result = prime * result + numEjes;
		result = prime * result + numPasajeros;
		result = prime * result + numPuertas;
		result = prime * result + numSalidasEmergencias;
		result = prime * result + ((transmicion == null) ? 0 : transmicion.hashCode());
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
		Bus other = (Bus) obj;
		if (aireAcondicionado == null) {
			if (other.aireAcondicionado != null)
				return false;
		} else if (!aireAcondicionado.equals(other.aireAcondicionado))
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
		if (numBolsasAire != other.numBolsasAire)
			return false;
		if (numEjes != other.numEjes)
			return false;
		if (numPasajeros != other.numPasajeros)
			return false;
		if (numPuertas != other.numPuertas)
			return false;
		if (numSalidasEmergencias != other.numSalidasEmergencias)
			return false;
		if (transmicion == null) {
			if (other.transmicion != null)
				return false;
		} else if (!transmicion.equals(other.transmicion))
			return false;
		if (velocidadMax == null) {
			if (other.velocidadMax != null)
				return false;
		} else if (!velocidadMax.equals(other.velocidadMax))
			return false;
		return true;
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
	public int getNumBolsasAire() {
		return numBolsasAire;
	}
	public void setNumBolsasAire(int numBolsasAire) {
		this.numBolsasAire = numBolsasAire;
	}
	public String getFrenoABS() {
		return frenoABS;
	}
	public void setFrenoABS(String frenoABS) {
		this.frenoABS = frenoABS;
	}
	public int getNumEjes() {
		return numEjes;
	}
	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	public int getNumSalidasEmergencias() {
		return numSalidasEmergencias;
	}
	public void setNumSalidasEmergencias(int numSalidasEmergencias) {
		this.numSalidasEmergencias = numSalidasEmergencias;
	}

	


}
