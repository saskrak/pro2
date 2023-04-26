package co.edu.uniquindio.consecionario.model;

import java.util.ArrayList;

public class Vehiculos {
	private ArrayList<Moto> listaMotos= new ArrayList<>();
	private ArrayList<Sedan> listaSedan= new ArrayList<>();
	private ArrayList<Deportivo> listaDeportivo= new ArrayList<>();
	private ArrayList<Camioneta> listaCamioneta= new ArrayList<>();
	private ArrayList<PickUps> listaPickUps= new ArrayList<>();
	private ArrayList<Vans> listaVans= new ArrayList<>();
	private ArrayList<Bus> listaBus= new ArrayList<>();
	private ArrayList<Camion> listaCamion= new ArrayList<>();
	
	
	public Vehiculos(ArrayList<Moto> listaMotos, ArrayList<Sedan> listaSedan, ArrayList<Deportivo> listaDeportivo,
			ArrayList<Camioneta> listaCamioneta, ArrayList<PickUps> listaPickUps, ArrayList<Vans> listaVans,
			ArrayList<Bus> listaBus, ArrayList<Camion> listaCamion) {
		super();
		this.listaMotos = listaMotos;
		this.listaSedan = listaSedan;
		this.listaDeportivo = listaDeportivo;
		this.listaCamioneta = listaCamioneta;
		this.listaPickUps = listaPickUps;
		this.listaVans = listaVans;
		this.listaBus = listaBus;
		this.listaCamion = listaCamion;
	}
	@Override
	public String toString() {
		return "Vehiculos [listaMotos=" + listaMotos + ", listaSedan=" + listaSedan + ", listaDeportivo="
				+ listaDeportivo + ", listaCamioneta=" + listaCamioneta + ", listaPickUps=" + listaPickUps
				+ ", listaVans=" + listaVans + ", listaBus=" + listaBus + ", listaCamion=" + listaCamion + "]";
	}
	public ArrayList<Moto> getListaMotos() {
		return listaMotos;
	}
	public void setListaMotos(ArrayList<Moto> listaMotos) {
		this.listaMotos = listaMotos;
	}
	public ArrayList<Sedan> getListaSedan() {
		return listaSedan;
	}
	public void setListaSedan(ArrayList<Sedan> listaSedan) {
		this.listaSedan = listaSedan;
	}
	public ArrayList<Deportivo> getListaDeportivo() {
		return listaDeportivo;
	}
	public void setListaDeportivo(ArrayList<Deportivo> listaDeportivo) {
		this.listaDeportivo = listaDeportivo;
	}
	public ArrayList<Camioneta> getListaCamioneta() {
		return listaCamioneta;
	}
	public void setListaCamioneta(ArrayList<Camioneta> listaCamioneta) {
		this.listaCamioneta = listaCamioneta;
	}
	public ArrayList<PickUps> getListaPickUps() {
		return listaPickUps;
	}
	public void setListaPickUps(ArrayList<PickUps> listaPickUps) {
		this.listaPickUps = listaPickUps;
	}
	public ArrayList<Vans> getListaVans() {
		return listaVans;
	}
	public void setListaVans(ArrayList<Vans> listaVans) {
		this.listaVans = listaVans;
	}
	public ArrayList<Bus> getListaBus() {
		return listaBus;
	}
	public void setListaBus(ArrayList<Bus> listaBus) {
		this.listaBus = listaBus;
	}
	public ArrayList<Camion> getListaCamion() {
		return listaCamion;
	}
	public void setListaCamion(ArrayList<Camion> listaCamion) {
		this.listaCamion = listaCamion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaBus == null) ? 0 : listaBus.hashCode());
		result = prime * result + ((listaCamion == null) ? 0 : listaCamion.hashCode());
		result = prime * result + ((listaCamioneta == null) ? 0 : listaCamioneta.hashCode());
		result = prime * result + ((listaDeportivo == null) ? 0 : listaDeportivo.hashCode());
		result = prime * result + ((listaMotos == null) ? 0 : listaMotos.hashCode());
		result = prime * result + ((listaPickUps == null) ? 0 : listaPickUps.hashCode());
		result = prime * result + ((listaSedan == null) ? 0 : listaSedan.hashCode());
		result = prime * result + ((listaVans == null) ? 0 : listaVans.hashCode());
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
		Vehiculos other = (Vehiculos) obj;
		if (listaBus == null) {
			if (other.listaBus != null)
				return false;
		} else if (!listaBus.equals(other.listaBus))
			return false;
		if (listaCamion == null) {
			if (other.listaCamion != null)
				return false;
		} else if (!listaCamion.equals(other.listaCamion))
			return false;
		if (listaCamioneta == null) {
			if (other.listaCamioneta != null)
				return false;
		} else if (!listaCamioneta.equals(other.listaCamioneta))
			return false;
		if (listaDeportivo == null) {
			if (other.listaDeportivo != null)
				return false;
		} else if (!listaDeportivo.equals(other.listaDeportivo))
			return false;
		if (listaMotos == null) {
			if (other.listaMotos != null)
				return false;
		} else if (!listaMotos.equals(other.listaMotos))
			return false;
		if (listaPickUps == null) {
			if (other.listaPickUps != null)
				return false;
		} else if (!listaPickUps.equals(other.listaPickUps))
			return false;
		if (listaSedan == null) {
			if (other.listaSedan != null)
				return false;
		} else if (!listaSedan.equals(other.listaSedan))
			return false;
		if (listaVans == null) {
			if (other.listaVans != null)
				return false;
		} else if (!listaVans.equals(other.listaVans))
			return false;
		return true;
	}
	
	
	
	
}
