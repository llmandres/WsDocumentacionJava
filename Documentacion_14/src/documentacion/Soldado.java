package documentacion;
/**
 * Clase que representara un soldado con los atributos estaMuerto
 * y numeroBalas
 * Se usara para un juego de disparos
 */
public class Soldado {
	/**
	 * Atributo que determina si el soldado esta muerto,
	 * estara muerto si su vida sera de 0.
	 */
	private boolean estaMuerto;
/**
 * Atributo que representa las balas del soldado,
 * las balas se iran gastando por cada disparo.
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
	 * El metodo deuelve si se puede disparar, en el caso de que
	 * tenga 1 bala o mas podra disparar, si no no.
	 * @return true si puede disparar y false si no.
	 */
	
	
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	/**
	 * Metodo que resta las balas del soldado. El soldado que
	 * se paso por parametro estara muerto
	 * @param Soldado que es pasado por parametro
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

}
