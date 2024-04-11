package documentacion;

/**
 * La clase Soldado contiene el objeto soldado, cuyos atributos son
 * el atributo estaMuerto, que representa si el soldado esta o no muerto
 * y el atributo numeroBalas, que indica el numero de balas del soldado
 * Y encontraremos metodos para saber si el soldado puede o no disparar y el
 * metodo correpondiente para disparar en caso de que pueda.
 */
public class Soldado {
	
	/**
	*Atributo de valor booleano, que representa si el soldado esta muerto ("true") o si esta vivo ("false")
	*/
	private boolean estaMuerto;

	/**
	*Atributo cuyo tipo de valor es int y representa el numero de balas de un soldado
	*/
	private int numeroBalas;

	
	public boolean isEstaMuerto() {
		return estaMuerto;
	}


	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}

	
	/**
	*Metodo que devuelve true o false dependiendo de si el soldado puede o no disparar, en caso
	*de que el soldado tenga un numero superior a 0 en el atributo "numeroBalas", el metodo devolvera
	*"true" en caso de tener 0 o menos, el metodo devolvera "false"
	*/
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	/**
	 * Metodo que lleva a cabo la accion de disparar a un soldado ingresado por parametro
	 * al disparar, el numero de balas de el soldado de la clase disminuye en 1 unidad, y el
	 * soldado ingresado por parametro, moriria, igualando su atributo "estaMuerto" a true.
	 * @param sol Soldado ingresado por parametro que quieres que muera
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

}
