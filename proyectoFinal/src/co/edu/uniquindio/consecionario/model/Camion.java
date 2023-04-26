	package co.edu.uniquindio.consecionario.model;

public class Camion {
	private String marca;
	private String estado;
	private String modelo;
	private String transmicion;
	private String velocidadMax;
	private String cilindraje;
	private double capacidadCarga;
	private String aireAcondicionado;
	private String frenoAire;
	private String frenoABS;
	private int numEjes;
	
	public Camion(String marca, String estado, String modelo, String transmicion, String velocidadMax,
			String cilindraje, double capacidadCarga, String aireAcondicionado, String frenoAire, String frenoABS,
			int numEjes) {
		super();
		this.marca = marca;
		this.estado = estado;
		this.modelo = modelo;
		this.transmicion = transmicion;
		this.velocidadMax = velocidadMax;
		this.cilindraje = cilindraje;
		this.capacidadCarga = capacidadCarga;
		this.aireAcondicionado = aireAcondicionado;
		this.frenoAire = frenoAire;
		this.frenoABS = frenoABS;
		this.numEjes = numEjes;
	}
	
	

	@Override
	public String toString() {
		return "Camion [marca=" + marca + ", estado=" + estado + ", modelo=" + modelo + ", transmicion=" + transmicion
				+ ", velocidadMax=" + velocidadMax + ", cilindraje=" + cilindraje + ", capacidadCarga=" + capacidadCarga
				+ ", aireAcondicionado=" + aireAcondicionado + ", frenoAire=" + frenoAire + ", frenoABS=" + frenoABS
				+ ", numEjes=" + numEjes + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aireAcondicionado == null) ? 0 : aireAcondicionado.hashCode());
		long temp;
		temp = Double.doubleToLongBits(capacidadCarga);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cilindraje == null) ? 0 : cilindraje.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((frenoABS == null) ? 0 : frenoABS.hashCode());
		result = prime * result + ((frenoAire == null) ? 0 : frenoAire.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + numEjes;
		result = prime * result + ((transmicion == null) ? 0 : transmicion.hashCode());
		result = prime * result + ((velocidadMax == null) ? 0 : velocidadMax.hashCode());
		return result;
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

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public String getAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(String aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public String getFrenoAire() {
		return frenoAire;
	}

	public void setFrenoAire(String frenoAire) {
		this.frenoAire = frenoAire;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camion other = (Camion) obj;
		if (aireAcondicionado == null) {
			if (other.aireAcondicionado != null)
				return false;
		} else if (!aireAcondicionado.equals(other.aireAcondicionado))
			return false;
		if (Double.doubleToLongBits(capacidadCarga) != Double.doubleToLongBits(other.capacidadCarga))
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
		if (frenoAire == null) {
			if (other.frenoAire != null)
				return false;
		} else if (!frenoAire.equals(other.frenoAire))
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
		if (numEjes != other.numEjes)
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
	
	
	
	
	
	
}
