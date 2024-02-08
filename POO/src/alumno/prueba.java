package alumno;

import java.util.Arrays;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		int opc = 0;
		Alumno[] array = {};
		String[] modulos = {} ;
		
		  do {
	          opc = menu();
	          switch(opc) {
	              case 1:
	                  array = nuevoAlumno(array);
	                  break;
	              case 2:
	                  listarAlumnos(array, modulos);
	          }
	      } while (opc != 0);
	      
	}
			//este método imprime el menú, tiene control de datos para que introuduzca solo un entero
			static int menu() {
				Scanner pregunta = new Scanner(System.in);
				int opc = 0;
				System.out.println("¿Qué quieres hacer? \n1.-Crear un nuevo alumno. \n2.-Listar los alumnos. \n0.-Cerrar el menú.");
				while (!pregunta.hasNextInt()) {
					System.out.println("Introduce un número válido.");
						pregunta.next();
				}
				opc = pregunta.nextInt();

				return opc;

				
			}
			//este método recibe un objeto Alumno y los mete en un array creando un array y añadiendole una posicion
			static Alumno[] nuevoAlumno(Alumno[] array) {
				Scanner pregunta = new Scanner(System.in);
				Alumno a = new Alumno();

			    Alumno[] array_copia = Arrays.copyOf(array, array.length + 1);
			    array_copia[array_copia.length - 1] = a; // Añadir alumno al array

			    String[] modulos_copia = Arrays.copyOf(a.modulos, a.modulos.length);
			    String datos = "";
			    int modulos = 0;
				
				System.out.println("¿Cuál es el nombre del alumno?");
					datos = pregunta.nextLine();
				a.setNombre(datos);
				array_copia[array_copia.length-1] = a;
				System.out.println("¿Cuántos módulos tiene?");
					modulos = pregunta.nextInt();
				modulos_copia = agregarModulos(modulos, a.modulos);
				a.modulos = modulos_copia;
				
				return array_copia;
			}
			//este metodo recibe un array de objetos Alumno y lista los módulos asociados a el
			public static void listarModulos(Alumno a) {
			    if (a.modulos.length == 0) {
			        System.out.println("El alumno no tiene módulos.");
			    }

			    for (int i = 0; i < a.modulos.length; i++) {
			        System.out.println(a.modulos[i]); 
			    }
			}
			//este método lista los alumnos concatenados con los módulos
			//recibe el array de alumnos y el array de modulos
			static void listarAlumnos(Alumno[] array, String[] modulos) {
				 if (array.length == 0) {
				        System.out.println("No hay alumnos para mostrar.");
				        return;
				    }

				    for (Alumno alumno : array) {
				        System.out.println(alumno.toString()); //información del alumno

				        System.out.println("Módulos del alumno:");
				        listarModulos(alumno); //mosdulos del alumno

				    }
			}
			//este método recibe cuantos módulos quieres añadir y un array de String
			//introduce tantas posiciones en el array como reciba y va preguntando los nombres de los modulos que quieras introducir
			static String[] agregarModulos(int cuantos, String[] modulos) {
				Scanner pregunta = new Scanner(System.in);
				String[] array_copia = Arrays.copyOf(modulos, modulos.length+cuantos);
				String datos = "";
				
				for(int i = 0; i < cuantos; i++) {
					System.out.println("Introduce el módulo " + (i+1));
						datos = pregunta.nextLine();
					array_copia[i] = datos;
				}
				
				return array_copia;
			}

}
