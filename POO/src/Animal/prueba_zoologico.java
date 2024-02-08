package Animal;

import java.util.Arrays;

public class prueba_zoologico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Gallo pepe = new Gallo();
		
		pepe.duerme();
		pepe.nombre = "Pepe";
		pepe.vuela = true;
		pepe.despertar();
		pepe.ruge();
		pepe.volar();
		System.out.println(pepe);
		
		Tigre simba = new Tigre();
		simba.setRaza("Bengala");
		System.out.println(simba.ruge());
		
		Ave golon = new Ave("Glositoo","golondrina");
		golon.volar();
		System.out.println(golon);*/
		String[] cadena = {"Mario","Mael","Iñigo","Andres"};
		Arrays.sort(cadena);
		System.out.println(Arrays.toString(cadena));
		
		Tigre este = new Tigre("Salvaje",9,"Lucia");
		Tigre otro = new Tigre("Salvaje",2,"Pedro");
		System.out.println(este.compara(otro));
		
		if(este.compara(otro) > 0) {
			System.out.println(este.getRaza() + " es mayor.");
		} else if (este.compara(otro) < 0) {
			System.out.println(otro.getRaza() + " es mayor.");
		} else {
			System.out.println(este.getRaza() + " tiene la misma edad que " + otro.getRaza());
		}
		Tigre[] array = {este, otro};
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i].getNombre());
		}
		
		
	}

}
