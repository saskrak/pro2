package co.edu.uniquindio.consecionario.model;

public class Compra {

	private String tecnoMecanica;

	public Compra(String tecnoMecanica) {
		super();
		this.tecnoMecanica = tecnoMecanica;
	}

	public Compra() {
		super();
	}

	public String getTecnoMecanica() {
		return tecnoMecanica;
	}

	public void setTecnoMecanica(String tecnoMecanica) {
		this.tecnoMecanica = tecnoMecanica;
	}

	@Override
	public String toString() {
		return "Compra [tecnoMecanica=" + tecnoMecanica + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tecnoMecanica == null) ? 0 : tecnoMecanica.hashCode());
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
		Compra other = (Compra) obj;
		if (tecnoMecanica == null) {
			if (other.tecnoMecanica != null)
				return false;
		} else if (!tecnoMecanica.equals(other.tecnoMecanica))
			return false;
		return true;
	}


}
