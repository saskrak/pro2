package co.edu.uniquindio.consecionario.model;

public class Cuenta {
	private String correo;
	private String contrasena;

	public Cuenta() {
		super();
	}

	public Cuenta(String correo, String contrasena) {
		super();
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Cuenta [correo=" + correo + ", contrasena=" + contrasena + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
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
		Cuenta other = (Cuenta) obj;
		if (contrasena == null) {
			if (other.contrasena != null)
				return false;
		} else if (!contrasena.equals(other.contrasena))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		return true;
	}



}