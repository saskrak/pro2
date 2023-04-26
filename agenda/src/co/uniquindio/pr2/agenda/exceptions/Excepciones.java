package co.uniquindio.pr2.agenda.exceptions;

public class Excepciones {
	
	@SuppressWarnings("serial")
	class ContactoException extends Exception{
		public ContactoException(){}
		public ContactoException(String msj){
			super(msj);
		}
	}

	
	@SuppressWarnings("serial")
	class Agendallena extends Exception{
		public Agendallena(){}
		public Agendallena(String msj){
			super(msj);
		}
	}
	
	
	
	
	
	
	
}
