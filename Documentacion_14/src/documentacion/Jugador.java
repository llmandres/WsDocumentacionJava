package documentacion;

/**
 * Clase que representa un jugador con tres atributos, numeroTarjetasAmarillas y
 * numeroTarjetasRojas.
 * 
 * Se usara para determinar las estadisticas de los jugadores.
 */

public class Jugador {
	/**
	 * Numero del dorsal que llevara el jugador
	 * estando entre en 1 y el 30 incluidos
	 */
	private int dorsal;
/**
 * Determinara la expulsion de un jugador con su numero 
 * maximo de tarjetas amarillas 2
 */
	private int numeroTarjetasAmarillas;
/**
 * Determinara la expulsion de un jugador con su numero 
 * maximo de tarjetas rojas 1
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
	 * Metodo que añade el dorsal que se pasa por parametro si es mayor o igual que
	 * 1 y es igual o menor que 30. En el caso de que no el dorsal sera de -1.
	 * 
	 * @param Dorsal que se introduce por parametro.
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}

	/**
	 * Metodo que verifica si el jugador esta expulsado. En el caso de que tenga 2
	 * amarillas lo estara o si tiene 1 tarjeta roja, por lo contrario no lo estara.
	 * 
	 * @return Si el jugador esta expulsado true si lo esta y false si no lo esta.
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