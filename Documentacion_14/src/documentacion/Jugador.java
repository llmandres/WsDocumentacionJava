package documentacion;

/**
 * La clase jugador contiene al objeto jugador cuyos atributos son
 * el numero de dorsal, numero de tarjetas amarillas, y numero de tarjetas rojas.
 * Tiene dos metodos, uno para ingresar el numero de dorsal del jugador, y otro para 
 * saber si el jugador esta expulsado.
 */
public class Jugador {

	/**
	 * Atributo de tipo int que representa el numero de dorsal del jugador
	 */
	private int dorsal;

	/**
	 * Atributo de tipo int que representa el numero de tarjetas amarillas del jugador.
	 */
	private int numeroTarjetasAmarillas;

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
	 * Metodo para ingresar el numero de dorsal del jugador, si el numero ingresado 
	 * por parametro es igual o mayor que 1 y menos o igual que 30, el dorsal sera 
	 * valido y se establecera correctamente, en caso de que la norma anterior no se respete,
	 * el dorsal se igualara a "-1"
	 * 
	 * @param dorsal numero ingresado por parametro para establecer el numero de dorsal comprendido entre
	 * el 1 y el 30 incluidos estos 2 , para que sea valido, en caso de no ser valido, el dorsal sera igual a "-1"
	 */
	public void ponerDorsal(int dorsal) {

		if (dorsal >= 1 && dorsal <= 30) {

			this.dorsal = dorsal;

		} else {

			this.dorsal = -1;

		}

	}
	
	
	/**
	 * metodo que establece si el jugador esta expulsado o no, se establece por defecto que el jugador
	 * no esta expulsado, por lo que el atributo "expulsado" del metodo, se iguala a "false" significando esto
	 * que el jugador no esta expulsado, si el atributo "numeroTarjetasAmarillas" del jugador es igual a 2,
	 * el atributo "expulsado" se igualara a true, significando que el jugador esta expulsado, si el atributo
	 * "numeroTarjetasRojas" del jugador es igual a 1, el atributo "expulsado" tambien se igualara a true, por lo
	 * que el jugador tambien estara expulsado en este caso. El metodo finalmente devuelve el atributo "expulsado"
	 * @return Devuelve el atributo "expulsado" significando "true" que el jugador esta expulsado, y "false" que no lo esta.
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