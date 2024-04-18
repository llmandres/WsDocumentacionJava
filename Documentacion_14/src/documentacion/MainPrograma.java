package documentacion;

public class MainPrograma {

	public static void main(String[] args) {
		
		// PRUEBAS UNITARIAS
		
		// Clase Jugador
		
		// Metodo ponerDorsal(int dorsal)
		
		// Prueba 1
		// dorsal = 1
		// resultadoEsperado = 1
		
		// Prueba 2
		// dorsal = 31
		// resultadoEsperado = -1
		
		// Prueba 3
		// dorsal = -2
		// resultadoEsperado = -1
		
		// Prueba 1 ponerDorsal(int dorsal) Ejecucion
		System.out.println("ponerDorsal() JUGADOR");
		System.out.println("-------------------------------");
		Jugador jugador1 = new Jugador();
		int dorsal1 = 1;
		jugador1.ponerDorsal(dorsal1);
		int resultadoObtenido = jugador1.getDorsal();
		int resultadoEsperado =  1;
		if(resultadoObtenido == resultadoEsperado) {
			System.out.println("Prueba 1 ponerDorsal() realizado correctamente");
		}else {
			System.out.println("Prueba 1 ponerDorsal() Erronea");
		}
		// Prueba 2 ponerDorsal(int dorsal) Ejecucion
		System.out.println("-------------------------------");
		Jugador jugador2 = new Jugador();
		int dorsal2 = 31;
		jugador2.ponerDorsal(dorsal2);
		int resultadoObtenido2 = jugador2.getDorsal();
		int resultadoEsperado2 =  -1;
		if(resultadoObtenido2 == resultadoEsperado2) {
			System.out.println("Prueba 2 ponerDorsal() realizado correctamente");
		}else {
			System.out.println("Prueba 2 ponerDorsal() Erronea");
		}
		// Prueba 3 ponerDorsal(int dorsal) Ejecucion
		System.out.println("-------------------------------");
		Jugador jugador3 = new Jugador();
		int dorsal3 = -2;
		jugador3.ponerDorsal(dorsal3);
		int resultadoObtenido3 = jugador3.getDorsal();
		int resultadoEsperado3 =  -1;
		if(resultadoObtenido3 == resultadoEsperado3) {
			System.out.println("Prueba 3 ponerDorsal() realizado correctamente");
		}else {
			System.out.println("Prueba 3 ponerDorsal() Erronea");
		}
		System.out.println("------------------------");
		System.out.println("estaExpulsado() JUGADOR");
		System.out.println("------------------------");
		
		
		// Metodo estaExpulsado()
		
		// Prueba 1 estaExpulsado()
		// numeroTarjetasAmarillas = 2
		// numeroTarjetasRojas = 0
		// resultadoEsperado = true
		
		// Prueba 2 estaExpulsado()
		// numeroTarjetasAmarillas = 1
		// numeroTarjetasRojas = 1
		// resultadoEsperado = true
		
		// Prueba 3 estaExpulsado()
		// numeroTarjetasAmarillas = 1
		// numeroTarjetasRojas = 0
		// resultadoEsperado = false
		
		// Prueba 1 estaExpulsado()
		System.out.println("------------------------");
		Jugador jugador4 = new Jugador();
		jugador4.setNumeroTarjetasAmarillas(2);
		jugador4.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado4 = true;
		boolean resultadoObtenido4 = jugador4.estaExpulsado();
		if(resultadoEsperado4 == resultadoObtenido4) {
			System.out.println("Prueba 1 estaExpulsado() realizado correctamente");
		}else {
			System.out.println("Prueba 1 estaExpulsado() Erronea");
		}
		// Prueba 2 estaExpulsado()
		System.out.println("------------------------");
		Jugador jugador5 = new Jugador();
		jugador5.setNumeroTarjetasAmarillas(1);
		jugador5.setNumeroTarjetasRojas(1);
		boolean resultadoEsperado5 = true;
		boolean resultadoObtenido5 = jugador5.estaExpulsado();
		if(resultadoEsperado5 == resultadoObtenido5) {
			System.out.println("Prueba 2 estaExpulsado() realizado correctamente");
		}else {
			System.out.println("Prueba 2 estaExpulsado() Erronea");
		}
		// Prueba 3 estaExpulsado()
		System.out.println("------------------------");
		Jugador jugador6 = new Jugador();
		jugador6.setNumeroTarjetasAmarillas(1);
		jugador6.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado6 = false;
		boolean resultadoObtenido6 = jugador6.estaExpulsado();
		if(resultadoEsperado6 == resultadoObtenido6) {
			System.out.println("Prueba 3 estaExpulsado() realizado correctamente");
		}else {
			System.out.println("Prueba 3 estaExpulsado() Erronea");
		}
		System.out.println("------------------------");
		System.out.println("puedeDisparar() SOLDADO");
		System.out.println("------------------------");
		
		// Clase Soldado
		
		// Metodo puedeDisparar()
		
		// Prueba 1 puedeDisparar()
		// numeroBalas = 0
		// resultadoEsperado= false
		
		// Prueba 2 puedeDisparar()
		// numeroBalas= 10
		// resultadoEsperado = true
		
		// Prueba 3 puedeDisparar()
		// numeroBalas= -10
		// resultadoEsperado = false
		
		// Prueba 1 puedeDisparar()
		System.out.println("------------------------");
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(0);
		boolean resultadoEsperado7 = false; 
		boolean resultadoObtenido7 = soldado1.puedeDisparar();
		if(resultadoEsperado7 == resultadoObtenido7) {
			System.out.println("Prueba 1 puedeDisparar() realizado correctamente");
		}else {
			System.out.println("Prueba 1 puedeDisparar() Erronea");
		}
		// Prueba 2 puedeDisparar()
		System.out.println("------------------------");
		Soldado soldado2 = new Soldado();
		soldado2.setNumeroBalas(10);
		boolean resultadoEsperado8 = true; 
		boolean resultadoObtenido8 = soldado2.puedeDisparar();
		if(resultadoEsperado8 == resultadoObtenido8) {
			System.out.println("Prueba 2 puedeDisparar() realizado correctamente");
		}else {
			System.out.println("Prueba 2 puedeDisparar() Erronea");
		}
		// Prueba 3 puedeDisparar()
		System.out.println("------------------------");
		Soldado soldado3 = new Soldado();
		soldado1.setNumeroBalas(-10);
		boolean resultadoEsperado9 = false; 
		boolean resultadoObtenido9 = soldado3.puedeDisparar();
		if(resultadoEsperado9 == resultadoObtenido9) {
			System.out.println("Prueba 3 puedeDisparar() realizado correctamente");
		}else {
			System.out.println("Prueba 3 puedeDisparar() Erronea");
		}
		System.out.println("------------------------");
		System.out.println("disparar() SOLDADO");
		System.out.println("------------------------");
		// Metodo disparar()
		
		// Prueba 1
		// numeroBalas = 1
		// numeroBalasEsperado = 1
		// estadoDeSoldado = true
		System.out.println("------------------------");
		Soldado soldado4 = new Soldado();
		soldado4.setNumeroBalas(1);
		int numeroBalasEsperado = 0;
		boolean resultadoEsperado10 = true;
		soldado4.disparar(soldado4);
		boolean resultadoObtenido10 = soldado4.isEstaMuerto();
		if(resultadoEsperado10 == resultadoObtenido10 && soldado4.getNumeroBalas() == numeroBalasEsperado ) {
			System.out.println("Prueba 1 disparar() realizado correctamente");
		}else {
			System.out.println("Prueba 1 disparar() Erronea");
		}
		
		
		
		
		
		
		

	}

}
