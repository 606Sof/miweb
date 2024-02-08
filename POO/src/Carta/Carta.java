package Carta;

public class Carta {
	private Palo palo;
	private Integer numero;
	
	//se debe poder:
	/*crear carta con valores validos
	 * e.g.- 50 de oros no existe, debe ser entre 1-12 (o del 1-7 y 10-12)
	 * se puede crear una carta aleatoria (aleatorio del num y del palo)
	 * metodo mostrar e.g. 6 de oros
	 * no tiene sentido poder modificar la carta
	 * una vez se tiene una carta, debemos crear una baraja (crear clase Baraja)*/
	
	// constructor por defecto que genera una carta aleatoria
	public Carta(){
		this.numero = (int)(Math.random()*12+1);
		int palo_num = (int)(Math.random()*4+1);
		/*CREAR UN METODO QUE COMPRUEBE SI LA CARTA SE HA REPETIDO O NO*/
		if(palo_num == 1) {
			palo = Palo.OROS;
		} else if (palo_num == 2) {
			palo = Palo.COPAS;
		} else if (palo_num == 3) {
			palo = Palo.BASTOS;
		} else {
			palo = Palo.ESPADAS;
		}
	}
	//constructor con paramatros, tiene control de datos para comprobar que tanto el numero como el palo son validos
	Carta(Palo palo, int num){
		if(paloValido(palo)) {
			this.palo = palo;
		} else {
			System.out.println("Se pondrá por defecto un palo.");
			this.palo = Palo.BASTOS;	
		}
		if (cartaValida(num)) {	
			this.numero = num;
		} else {
			System.out.println("Se le asignara un valor por defecto a la carta.");
			this.numero = 1;
		}
	}
	public int getNumero() {
		return numero;
	}
	public Palo getPalo() {
		return palo;
	}
	// este metodo recibe el numero de la carta y devuelve un boolean dependiendo de si el numero es o no valido
	public boolean cartaValida(int numero) {
		boolean comprobar = false;
		if (numero > 1 || numero < 12) {
			comprobar = true;
		} 
		return comprobar;
	}
	//este metodo recibe el palo de la carta, comprueba si el palo es valido y devuelve T/F
	public boolean paloValido(Palo palo) {
		boolean comprobar = false;
		if (palo == Palo.OROS || palo == Palo.COPAS || palo == Palo.BASTOS || palo == Palo.ESPADAS) {
			comprobar = true;
		} 
		return comprobar;
	}
	public void mostrar() {
		System.out.println("La carta es: " + numero + " de " + palo);
	}
	//este metodo recibe un objeto de tipo carta y compara los palos con los numeros, devuelve T/F 
	public boolean equals(Carta otraCarta) {
		if(palo == otraCarta.getPalo() && numero == otraCarta.getNumero()) {
			return true;
		} else {
			return false;
		}
	}
}