package documentacion;


/**
 * Un soldado tiene un atributo booleano que representa si esta vivo o no
 * y un atributo entero cuyo valor representa el numero de balas que tiene *
 * 
 * @author Andres
 */

public class Soldado {
	/**
	 * Atributo booleano que representa si el soldado esta vivo, dependiendo si este atributo
	 * tiene valor 'true' o 'false'
	 * 
	 * @author Andres
	 */
	private boolean estaMuerto;

	/**
	 * Atributo entero, que contiene el valor del numero de balas que tiene.
	 * 
	 * @author Andres
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
	 * Este método devuelve 'true' o 'false' si el objeto Soldado puede disparar o no
	 * .Si el valor del atributo 'numeroBalas' es mayor a 0 sera 'true' por lo tanto podrá
	 * disparar, en caso de que el valor del atributo 'numeroBalas' se menor a 0 devolvera
	 * 'false' y no puede disparar.
	 * 
	 * @return devuelve 'true' o 'false' dependiendo si el valor del atributo numeroBalas es 
	 * mayor a 0 devolviendo true, o menor a 0 devolviendo false.
	 * 
	 * @author Andres
	 */
	public boolean puedeDisparar() {

		if (this.numeroBalas > 0) {

			return true;

		}

		return false;

	}

	/**
	 * En este método se introduce por parametro un objeto soldado,las balas del objeto soldado
	 * que invoca el método seran reducidas en 1 , posteriormente, el valor del atributo 'estaMuerto'
	 * del objeto soldado introducido por parametro se establecera como 'true'
	 * 
	 * @param Un objeto soldado que sera disparado por lo tanto, el valor de su atributo 'estaMuerto'
	 * pasara a ser 'true'
	 */
	public void disparar(Soldado sol) {

		this.numeroBalas--;

		sol.estaMuerto = true;

	}

}
