package Libro;

public class ejercicios_libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro quijote = new Libro();
		quijote.setTitulo("Quijote");
		quijote.setPaginas(1560);
		System.out.println(quijote.toString());
		quijote.alquilar();
		if (quijote.alquilar()==0) {
			System.out.println("No es posible alquilarlo en este momento");
		} else {
			System.out.println("El libro está disponible para alquilar");
		}
		
		System.out.println("------------------------------------------------------------------ \nLibro 2:");
		Libro cerditos = new Libro("Los tres cerditos");
		cerditos.setPaginas(56);
		cerditos.setAutor("Joseph Jacob");
		System.out.println(cerditos.Print());
		cerditos.leer(5);
		
		cerditos.almacenar();
		
		System.out.println();
		//para imprimir el array de libro, hay que imprimir la posicion del array donde se encuentra dicho libro
	}

}
