package alumno;

import java.util.Arrays;
import java.util.Scanner;

public class prueba_alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] modulos = new String[2];
		Alumno al = new Alumno("Alumn1", 01, modulos);
		
		for (int i = 0; i < modulos.length; i++) {
			al.modulos[i] = "Modulo " + (i + 1);
		}
		
		System.out.println("Alumno 1: ");
		al.listarModulos();		
		//String[] modulos2 = new String[1];
		Alumno a2 = new Alumno();
		//modulos2 = Arrays.copyOf(a2.modulos, a2.modulos.length+1);
		
		/*modulos2[0] = "FOL";
		System.out.println("Alumno 2: ");
		modulos2[1]="Programacion";
		a2.modulos = modulos2;
		a2.modulos = Arrays.copyOf(a2.modulos, a2.modulos.length+1);
		a2.modulos[2] = "Nuevo";*/
		a2.agregarModulos(2, a2.modulos, a2);
		a2.listarModulos();
		
	}
}
