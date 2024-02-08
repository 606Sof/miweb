package Carta;

public class pruebaBaraja {

	public static void main(String[] args) {
		Palo palo = null;
		Carta c1 = new Carta(palo.OROS, 3);
		Baraja esp = new Baraja(c1);
		
		esp.setCartas(c1);
		esp.mostrar();
	}
	
}
