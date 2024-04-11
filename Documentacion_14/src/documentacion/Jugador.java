package documentacion;

/**

 * La clase jugador contiene al objeto jugador cuyos atributos son
 * el numero de dorsal, numero de tarjetas amarillas, y numero de tarjetas rojas.
 * Tiene dos metodos, uno para ingresar el numero de dorsal del jugador, y otro para 
 * saber si el jugador esta expulsado.
 */
public class Jugador {

	/**
	 * Atributo entero cuyo valor representa el dorsal que usa el Jugador
	 * 
	 */
	private int dorsal;
	
	/**
	 * Atributo entero cuyo valor representa el numero de tarjetas amarillas
	 * que el Jugador tiene.
	 */
	private int numeroTarjetasAmarillas;
	
	/**
	 * Atributo entero cuyo valor representa el numero de tarjetas rojas
	 * que el Jugador tiene.


	/**
	 * Atributo de tipo int que representa el numero de tarjetas rojas del jugador
	 */
	private int numeroTarjetasRojas;

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}

	
	/**
<<<<<<< HEAD
	 * En este metodo se introduce por parametro el valor para el atributo 'dorsal',
	 * este valor introducido por parametro se establecera como el del atributo 'dorsal'
	 * si esta entre el rango de numero 1 a 30 incluidos, en caso de que esten fuera de 
	 * este rango el atributo 'dorsal' se establecera en el valor -1.
	 * 
	 * 
	 * @param Numero entero que se establecera como valor del atributo dorsal del jugador 
	 * que invoque el metodo siempre y cuando este entre el rango de numero 1 a 30 incluidos.
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * Este metodo devuelve un 'true' o 'false' en base a los atributos
	 *  numeroTarjetasAmarillas y numeroTarjetasRojas que el objeto jugador 
	 *  tenga.Se inicializa la variable 'expulsado' en false, el valor de esta
	 *  variable sera true si el objeto Jugador tiene como valor '2' en el
	 *  atributo 'numeroTarjetasAmarillas' o si el objeto jugador tiene como valor
	 *  '1' en el atributo 'numeroTarjetasRojas', finalmente se devolvera el valor 
	 *  de la variable.
	 * 
	 * 
	 * @return la variable booleana inicializada como 'false' y que sera 'true' en 
	 * en base a los atributos 'numeroTarjetasAmarillas' y 'numeroTarjetasRojas' del
	 * objeto Jugador. 
	 */
	public boolean estaExpulsado() {

		boolean expulsado = false;

		if (numeroTarjetasAmarillas == 2) {

			expulsado = true;

		}

		if (numeroTarjetasRojas == 1) {

			expulsado = true;

		}

		return expulsado;

	}

}