package Figura;

public class poligonos {

	public static void main(String[] args) {
		//crear un objeto de cada clase.
		Figura f1 = new Figura();
		Cuadrado c1 = new Cuadrado(8.4, "Paco");
		Cuadrado c2 = new Cuadrado(3, "Lisa");
		Cuadrado c3 = new Cuadrado(4.2, "Jennie");
		Circulo cir1 = new Circulo(1.8, "Sergio");
		Circulo cir2 = new Circulo(8.75, "Andres");
		Cuadrado[] array_cuadrados = {c1, c2, c3};
		
		Figura[] array_figuras = {c1, cir1, c2, cir2, f1};
		for(int i = 0; i<array_cuadrados.length; i++) {
			System.out.println(array_cuadrados[i].nombre + " tiene área: " + array_cuadrados[i].area());		
		}
		System.out.println("\n");
		for(int i = 0; i < array_figuras.length; i++) {
			System.out.println(array_figuras[i].nombre + " tiene área: " + array_figuras[i].area());		
		}
		System.out.println("\n");
		for(int i = 0; i < array_figuras.length; i++) {
			if(array_figuras[i] instanceof Circulo) {
				System.out.println("Soy un chilculo");
			} 
			else if (array_figuras[i] instanceof Cuadrado) {
				System.out.println("Soy un chuadrado");
			}
			else {
				System.out.println("Soy una figurita");
			}
		}
	}

}
