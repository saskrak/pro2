package co.edu.uniquindio.consecionario.exeption;

import java.lang.Exception;

public class ExeptionsUqMotors {

	@SuppressWarnings("serial")
	class VehiculoNoDisponible extends Exception{


		public VehiculoNoDisponible(){}
		public VehiculoNoDisponible(String msj){
			super(msj);
		}

	}

	@SuppressWarnings("serial")
	class MontoNoValido extends Exception{


		public MontoNoValido(){}
		public MontoNoValido(String msj){
			super(msj);
		}

	}

	@SuppressWarnings("serial")
	class ModeloDescontinuado extends Exception{
		public ModeloDescontinuado(){}
		public ModeloDescontinuado(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class AlquilerNoDisponible extends Exception{
		public AlquilerNoDisponible(){}
		public AlquilerNoDisponible(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class ServicioNoDisponible extends Exception{
		public ServicioNoDisponible(){}
		public ServicioNoDisponible(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class AsesorNoDisponible extends Exception{
		public AsesorNoDisponible(){}
		public AsesorNoDisponible(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class AdministradorNoDisponible extends Exception{
		public AdministradorNoDisponible(){}
		public AdministradorNoDisponible(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class CompraRechazada extends Exception{
		public CompraRechazada(){}
		public CompraRechazada(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class TecnomecanicaRechazada extends Exception{
		public TecnomecanicaRechazada(){}
		public TecnomecanicaRechazada(String msj){
			super(msj);
		}


	}

	@SuppressWarnings("serial")
	class ConcesionarioCerrado extends Exception{
		public ConcesionarioCerrado(){}
		public ConcesionarioCerrado(String msj){
			super(msj);
		}


	}



}
