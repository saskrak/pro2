package co.uniquindio.pr2.agenda.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import co.edu.uniquindio.biblioteca.model.Estudiante;
import co.edu.uniquindio.biblioteca.model.Exception.*;
import co.edu.uniquindio.biblioteca.model.String;

//import co.uniquindio.pr2.agenda.exceptions.Excepciones;

public class Agenda implements Serializable {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String nombre;
	private Contacto[] listaContactos;
	private Grupo[] listaGrupos;
	private Reunion[] listaReuniones;
	
	
	public Agenda(String nombre, int numeroContactos,int numeroGrupos,int numeroReuniones) {
		super();
		this.nombre = nombre;
		this.listaContactos = new Contacto[numeroContactos];
		this.listaGrupos = new Grupo[numeroGrupos];
		this.listaReuniones = new Reunion[numeroReuniones];
	}


	public Agenda() {
		super();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Contacto[] getListaContactos() {
		return listaContactos;
	}


	public void setListaContactos(Contacto[] listaContactos) {
		this.listaContactos = listaContactos;
	}


	public Grupo[] getListaGrupos() {
		return listaGrupos;
	}


	public void setListaGrupos(Grupo[] listaGrupos) {
		this.listaGrupos = listaGrupos;
	}


	public Reunion[] getListaReuniones() {
		return listaReuniones;
	}


	public void setListaReuniones(Reunion[] listaReuniones) {
		this.listaReuniones = listaReuniones;
	}


	@Override
	public String toString() {
		return "Agenda [nombre=" + nombre + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Agenda other = (Agenda) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	public void aniadirContacto(Contacto newContacto){
		
		Contacto contacto = buscarContacto(newContacto);
		int posDisponible = 0;

		if(contacto != null){
			throw new ContactoException("El contacto ya existe");
		}
		posDisponible = obtenerPosicion();
		
		if(posDisponible == -1){
			throw new ContactoException("Agenda llena");
		}
		listaContactos[posDisponible] = newContacto;
		
	}


	private int obtenerPosicion() {
		
		return 0;
	}


	private Contacto buscarContacto(Contacto newContacto) {

		List<Contacto> asList = Arrays.asList(listaContactos);
		
		Optional<Contacto> findFirst = asList.stream().filter(c -> c.equals(newContacto)).findFirst();
		
		return findFirst.get();
	}
	
	private boolean existeContacto(Contacto newContacto) {

		List<Contacto> asList = Arrays.asList(listaContactos);
		return asList.stream().filter(c -> c.equals(newContacto)).findFirst().isPresent();
	}
	
	public void eliminarContaco(String telefono) throws Exception
	{
		Contacto contactoEncontrado = obtenerContacto(telefono);
		if(contactoEncontrado == null){
			throw new Exception("El contacto no esta registrado");
		}
		arr= ArrayUtils.removeElement(listaContactos, contactoEncontrado);
		System.out.println(Arrays.toString(arr));
	}
	
	public Contacto obtenerContacto (String telefono){

		Contacto contactoEncontrado = null;

		for (Contacto contacto : listaContactos) {
			if(contacto.getTelefono().equals(telefono)){
				contactoEncontrado = contactoEncontrado;
			}
		}
		return contactoEncontrado;
	}
	
	public Contacto agendaLlena (Contacto[] listaContactos, int numContactos) throws Exception{
		if(listaContactos.length == numContactos) throw new Agendallena("agenda llena");
		else System.out.println("aun hay espacio en la agenda");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
