package colores;

public class colorcitos {

	public static void main(String[] args) {
		Colores col = Colores.BLACK;
		pinta(col.BLACK, "Frase en negro");
		pinta(Colores.RED, "Frase en rojo");
		pinta(Colores.BLUE, "Frase en asu");
		pinta(Colores.GREEN, "Frase en vede");
		pinta(Colores.YELLOW, "Frase en marillo");
		pinta(Colores.PURPLE, "Frase en morao");
	}
	public static void pinta(Colores col, String frase) {
		switch(col) {
			case BLACK:
				System.out.println("\u001B[30m" + frase);
				break;
			case RED:
				System.out.println("\u001B[31m" + frase);
				break;
			case GREEN:
				System.out.println("\u001B[32m" + frase);
				break;
			case YELLOW:
				System.out.println("\u001B[33m" + frase);
				break;
			case BLUE:
				System.out.println("\u001B[34m" + frase);
				break;
			case PURPLE:
				System.out.println("\u001B[35m" + frase);
				break;
			case CYAN:
				System.out.println("\u001B[36m" + frase);
				break;
		}
	}

}
