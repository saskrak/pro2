package co.edu.uniquindio.consecionario.model;

import java.util.ArrayList;

public class Consecionario {
	private String nombre;
	private ArrayList<Clientes> listaClientes = new ArrayList<>();
	private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	private ArrayList<Administrador> listaAdministradores = new ArrayList<>();
	private ArrayList<Vehiculos> listaVehiculos = new ArrayList<>();
	public Consecionario(String nombre, ArrayList<Clientes> listaClientes, ArrayList<Empleado> listaEmpleados,
			ArrayList<Administrador> listaAdministradores, ArrayList<Vehiculos> listaVehiculos) {
		super();
		this.nombre = nombre;
		this.listaClientes = listaClientes;
		this.listaEmpleados = listaEmpleados;
		this.listaAdministradores = listaAdministradores;
		this.listaVehiculos = listaVehiculos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Clientes> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(ArrayList<Clientes> listaClientes) {
		this.listaClientes = listaClientes;
	}
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	public ArrayList<Administrador> getListaAdministradores() {
		return listaAdministradores;
	}
	public void setListaAdministradores(ArrayList<Administrador> listaAdministradores) {
		this.listaAdministradores = listaAdministradores;
	}
	public ArrayList<Vehiculos> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(ArrayList<Vehiculos> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	

}
