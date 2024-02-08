package ejercicios;

public class prueba_cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubo c1 = new Cubo(5);
		Cubo c2 = new Cubo(8,2);
		System.out.println("Cubo 1: ");
		c1.llenar(3);
		c1.pintar();
		System.out.println("\nCubo 2: ");
		c2.pintar();
		System.out.println("\nCubo 2 + 2 huecos");
		c2.llenar(2);
		c2.pintar();
		System.out.println("\n\nCubo 1 + vaciar");
		c1.vaciar();
		c1.pintar();
		
	}

}
