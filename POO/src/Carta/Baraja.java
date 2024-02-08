package Carta;

import java.util.Arrays;

public class Baraja {
	/* Clase Baraja: se compone de cartas, de 40 cartas
	 * en el constructor de baraja se debe inicializar el array de cartas con el tamaño ej-40*/
	private Carta[] cartas;
	private static int contador = 0;
	static final int NUM_CARTAS = 48;
	
	Baraja() {
        cartas = new Carta[NUM_CARTAS];
        int nums = 1;
        int indice = 0;

        for (int i = 0; i < Palo.values().length; i++) {
            for (int j = 1; j <= (NUM_CARTAS/4); j++) {
                Palo palo = null;
                switch (i) {
                    case 0:
                        palo = Palo.BASTOS;
                        break;
                    case 1:
                        palo = Palo.OROS;
                        break;
                    case 2:
                        palo = Palo.COPAS;
                        break;
                    case 3:
                        palo = Palo.ESPADAS;
                        break;
                
                }
                cartas[indice] = new Carta(palo, nums);
                indice++;
                nums++;
            }
            nums = 1;
        }
    }
	Baraja(Carta carta) {
		cartas = new Carta[NUM_CARTAS];
		this.cartas[contador] = carta;
		contador++;
	}
	
	public Carta[] getCartas() {
		return cartas;
	}
	//este metodo recibe un objeto de tipo carta y no devuelve nada
	//mete un objeto de tipo carta en la baraja
	public void setCartas(Carta carta) {
		cartas = new Carta[NUM_CARTAS];
		for(int i = 0; i < cartas.length; i++) {
			cartas[contador] = carta;
		}
		contador++;
	}
	
	public static int getNumCartas() {
		return NUM_CARTAS;
	}

	public void mostrar() {
		for(Carta carta:cartas) {
			if (carta==null) {
				System.out.println("No existe todavia");
			} else {
				carta.mostrar();
			}
		}
	}
	public Carta[] ordenar() {
		int contador = 0;
		Carta[] ordenada = new Carta[NUM_CARTAS];
		for(int i = 0; i < cartas.length; i++) {
			if(cartas[i].getPalo().ordinal() == 0) {
				ordenada[contador] = cartas[i];
				contador++;
			}
		}
		return cartas;
	}

}
