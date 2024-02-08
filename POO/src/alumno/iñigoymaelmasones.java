package alumno;

import java.util.Arrays;
import java.util.Scanner;

public class iñigoymaelmasones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
//		Alumno alum = new Alumno();
		Alumno[] array = {};
		String[] modulos = {} ;
		
		  do {
	          opc = menu();
	          switch(opc) {
	              case 1:
	                  array = nuevoAlumno(array);
	                  break;
	              case 2:
	                  listarAlumnos(array);
	              case 3:
	            	  modificarModulos(modulos, array);
	          }
	      } while (opc != 0);
		
	}
	//este método imprime el menú, tiene control de datos para que introuduzca solo un entero
	static int menu() {
		Scanner pregunta = new Scanner(System.in);
		int opc = 0;
		System.out.println("¿Qué quieres hacer? \n1.-Crear un nuevo alumno. \n2.-Listar los alumnos. \n3.-Modificar modulos. \n0.-Cerrar el menú.");
		while (!pregunta.hasNextInt()) {
			System.out.println("Introduce un número válido.");
				pregunta.next();
		}
		opc = pregunta.nextInt();

		return opc;

		
	}
	static Alumno[] nuevoAlumno(Alumno[] array) {
		Scanner pregunta = new Scanner(System.in);
		Alumno a = new Alumno();

	    Alumno[] array_copia = Arrays.copyOf(array, array.length + 1);
	    array_copia[array_copia.length - 1] = a; // Add the new Alumno object to the array

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
	public static void listarModulos(Alumno a) {
	    if (a.modulos.length == 0) {
	        System.out.println("El alumno no tiene módulos.");
	    }

	    for (int i = 0; i < a.modulos.length; i++) {
	        System.out.println(a.modulos[i]); 
	    }
	}
	static void listarAlumnos(Alumno[] array) {
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
	static void modificarModulos (String[] array, Alumno[] alumnos) {
		Scanner pregunta = new Scanner(System.in);
		String clave = "";
		boolean eliminado = false;
		int posicion = 0;
		int cuan = 1;
		
		if(array.length == 0) {
			System.out.println("No hay módulos.");
		} else {
			System.out.println("¿Qué quieres hacer? \n1.-Borrar un módulo. \n2.-Añadir un módulo. \n0.-Cerrar el menú.");
			while (!pregunta.hasNextInt()) {
				System.out.println("Introduce un número válido.");
					pregunta.next();
			}
			do {
		          posicion = menu();
		          switch(posicion) {
		              case 1:
		            	  
		            	  array = borrarModulo(array, alumnos);
		                  break;
		              case 2:
		                  array = agregarModulos(cuan, array);
		          }
		      } while (posicion != 0);
			posicion = pregunta.nextInt();
		}
				
	}
	//si el array contiene el módulo que se le introduce, decrece la capacidad del array a la vez que borra dicho modulo
	//sino, devuelve el mismo array. (recibe un array y el modulo que se quiere buscar)
	public static String[] borrarModulo(String[] array, Alumno[] alumnos) {
		Scanner pregunta = new Scanner(System.in);
		int codigo = 0;
		String modulo = "";
		boolean comprueba = false;
		String[] array_borrado = {};
		System.out.println("¿De qué alumno quieres borrar los módulos?(introduce el código)");
  	  		codigo = pregunta.nextInt();
  	  	Alumno a4 = encontrarAlumno(alumnos, codigo);
  	  	
  	  	System.out.println("¿Qué módulo quieres borrar?");
  	  		modulo = pregunta.nextLine();
	  	do {
		  	for (int i = 0; i < a4.modulos.length; i++) {
		  		if(a4.modulos[i] == modulo) {
		  			comprueba = true;
		  	  	} else {
		  	  		comprueba = false;
		  	  	}
		  	}
		  	if (comprueba == true) {
		  		array_borrado = borrarPosicion(array, modulo);
		  	} else {
		  		System.out.println("El módulo no se ha encontrado");
		  		System.out.println("¿Qué módulo quieres borrar?");
	  	  			modulo = pregunta.nextLine();
		  	}
	  	} while(comprueba==false);	
  	  	
		return array_borrado;
	}
	public static Alumno encontrarAlumno(Alumno[] alumnos, int codigo) {
		Alumno a3 = new Alumno();
		for(int j = 0; j < alumnos.length; j++) {
  	  		if(alumnos[j].getCodigo() == codigo) {
  	  			a3 = alumnos[j];
  	  		} else {
  	  			System.out.println("El alumno no se ha encontrado");
  	  		}
  	  	}
		return a3;
	}
	static String[] borrarPosicion (String[] array, String modulo) {
		String borrado[] = new String[array.length-1];
		int posicion = 0;
		boolean eliminado = false;
		for (int i = 0; i < array.length; i++) {
			  if (array[i] == modulo && !eliminado) {
	                eliminado = true;  
	            }	        
              borrado[posicion] = array[i];
              posicion++;
              if (!eliminado) {
              	return array;
              } 
	        }
		return borrado;
	}

}

