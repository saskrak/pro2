package co.edu.uniquindio.consecionario.model;

import java.util.ArrayList;

public class Administrador {
	private String nombre;
	private String identificacon;
	private ArrayList<Cuenta> listaCuentasEmpleados= new ArrayList<>();
	
	public Administrador(String nombre, String identificacon, ArrayList<Cuenta> listaCuentasEmpleados) {
		super();
		this.nombre = nombre;
		this.identificacon = identificacon;
		this.listaCuentasEmpleados = listaCuentasEmpleados;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacon == null) ? 0 : identificacon.hashCode());
		result = prime * result + ((listaCuentasEmpleados == null) ? 0 : listaCuentasEmpleados.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Administrador other = (Administrador) obj;
		if (identificacon == null) {
			if (other.identificacon != null)
				return false;
		} else if (!identificacon.equals(other.identificacon))
			return false;
		if (listaCuentasEmpleados == null) {
			if (other.listaCuentasEmpleados != null)
				return false;
		} else if (!listaCuentasEmpleados.equals(other.listaCuentasEmpleados))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", identificacon=" + identificacon + ", listaCuentasEmpleados="
				+ listaCuentasEmpleados + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacon() {
		return identificacon;
	}

	public void setIdentificacon(String identificacon) {
		this.identificacon = identificacon;
	}

	public ArrayList<Cuenta> getListaCuentasEmpleados() {
		return listaCuentasEmpleados;
	}

	public void setListaCuentasEmpleados(ArrayList<Cuenta> listaCuentasEmpleados) {
		this.listaCuentasEmpleados = listaCuentasEmpleados;
	}
	
	
	

}
