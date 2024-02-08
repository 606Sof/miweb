package inicios;

public class prueba_Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato garfield = new Gato();
		
		//valores por defecto
		System.out.println("Gato garfield");
		System.out.println(garfield.getRaza());
		System.out.println(garfield.edad = 2);
		System.out.println(garfield.color = "naranja");
		
		//cambiamos los atributos
		garfield.color = "verde";
		System.out.println(garfield.color);
		
		//usamos metodos de la clase
		System.out.println("\nUtilizacion de metodos dentro de la clase");
		garfield.como();
		
		garfield.nombre = "Garfield";
		System.out.println(garfield.formato());
		
		//Gato con parametros
		Gato pepe = new Gato("Nieve", 2, "Pepe");
		System.out.println("\n--------------------------------------------");
		pepe.nombre = "Pepe";
		pepe.come("pescado");
		System.out.println(pepe.toString());
		System.out.println(pepe.formato());
		
		//nuevo gato
		System.out.println("");
		Gato gato2 = new Gato(2,4);
		gato2.nombre = "Polar";
		gato2.setRaza("Salvaje");
		gato2.color = "blanco";
		System.out.println(gato2);
		System.out.println(gato2.formato());
		
		Gato gato3 = new Gato();
		gato3.nombre = "Estrella";


		//metodo salvaje
		gato3.peleaCon(gato2);
	}

}
