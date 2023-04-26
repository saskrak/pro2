package co.edu.uniquindio.consecionario.model;

import java.util.ArrayList;

public class Empleado {
	private String nombre;
	private ArrayList<Compra> listaVehiculosComprados= new ArrayList<>();
	private ArrayList<Alquiler> listaVehiculosAlquiler= new ArrayList<>();
	private ArrayList<Venta> listaVehiculosVenta= new ArrayList<>();
	public Empleado(String nombre, ArrayList<Compra> listaVehiculosComprados,
			ArrayList<Alquiler> listaVehiculosAlquiler, ArrayList<Venta> listaVehiculosVenta) {
		super();
		this.nombre = nombre;
		this.listaVehiculosComprados = listaVehiculosComprados;
		this.listaVehiculosAlquiler = listaVehiculosAlquiler;
		this.listaVehiculosVenta = listaVehiculosVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Compra> getListaVehiculosComprados() {
		return listaVehiculosComprados;
	}
	public void setListaVehiculosComprados(ArrayList<Compra> listaVehiculosComprados) {
		this.listaVehiculosComprados = listaVehiculosComprados;
	}
	public ArrayList<Alquiler> getListaVehiculosAlquiler() {
		return listaVehiculosAlquiler;
	}
	public void setListaVehiculosAlquiler(ArrayList<Alquiler> listaVehiculosAlquiler) {
		this.listaVehiculosAlquiler = listaVehiculosAlquiler;
	}
	public ArrayList<Venta> getListaVehiculosVenta() {
		return listaVehiculosVenta;
	}
	public void setListaVehiculosVenta(ArrayList<Venta> listaVehiculosVenta) {
		this.listaVehiculosVenta = listaVehiculosVenta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaVehiculosAlquiler == null) ? 0 : listaVehiculosAlquiler.hashCode());
		result = prime * result + ((listaVehiculosComprados == null) ? 0 : listaVehiculosComprados.hashCode());
		result = prime * result + ((listaVehiculosVenta == null) ? 0 : listaVehiculosVenta.hashCode());
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
		Empleado other = (Empleado) obj;
		if (listaVehiculosAlquiler == null) {
			if (other.listaVehiculosAlquiler != null)
				return false;
		} else if (!listaVehiculosAlquiler.equals(other.listaVehiculosAlquiler))
			return false;
		if (listaVehiculosComprados == null) {
			if (other.listaVehiculosComprados != null)
				return false;
		} else if (!listaVehiculosComprados.equals(other.listaVehiculosComprados))
			return false;
		if (listaVehiculosVenta == null) {
			if (other.listaVehiculosVenta != null)
				return false;
		} else if (!listaVehiculosVenta.equals(other.listaVehiculosVenta))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
