package Empleado;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicios_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc =0;
		Empleado[] array = new Empleado[0];
		Coche[] coches = new Coche[0];
		do {
	        opc = menu();
	        switch(opc) {
	            case 1:
	            	listarEmpleados(array);
	            	break;
	            case 2:
	            	array = nuevoEmpleado(array);
	            	break;
	            case 3:
	            	array = eliminarEmpleado(array);
	            	break;
	            case 4:
	            	compararEmpleados();
	            	break;
	            case 5:
	            	coches = nuevoCoche(coches);
	            	break;
	            case 6:
	            	modificarCoche(array, coches);
	            	break;
	        }
	    } while (opc != 0);
	}
		//este método imprime el menú, tiene control de datos para que introuduzca solo un entero
		static int menu() {
			Scanner pregunta = new Scanner(System.in);
			int opc = 0;
			System.out.println("¿Qué quieres hacer? \n1.-Ver el listado de empleados. \n2.-Agregar un empleado. \n3.-Borrar un empleado. "
					+ "\n4.- Comparar la antigüedad de dos empleados. \n5.- Agregar un nuevo coche. \n6.-Asignar un coche a un empleado.");
			while (!pregunta.hasNextInt()) {
				System.out.println("Introduce un número válido.");
					pregunta.next();
			}
			opc = pregunta.nextInt();

			return opc;

		}
		public static Empleado[] nuevoEmpleado(Empleado[] array) {
			Scanner pregunta = new Scanner(System.in);
			Empleado e1 = new Empleado();
			Empleado[] copia = Arrays.copyOf(array, array.length+1);
			String respuesta = "";
			int año = 0;
			
			System.out.println("¿Cual es el nombre del empleado?");
				respuesta = pregunta.nextLine();
			e1.setNombre(respuesta);
			
			System.out.println("¿En qué año entró a la empresa?");
				año = pregunta.nextInt();
			e1.setAño(año);
			
			copia[copia.length-1] = e1;
					
			return copia;
		}
		public static Empleado[] eliminarEmpleado(Empleado[] e1) {
			Empleado[] borrado = Arrays.copyOf(e1, e1.length-1);
			
			
			return borrado;
		}
		public static String compararEmpleados() {
			Scanner pregunta = new Scanner(System.in);
			String respuesta = "";
			
			System.out.println("¿Qué dos empleados quieres comparar? (introuduce su nombre)");
				respuesta = pregunta.nextLine();
			
			return "El empleado con más antigüedad es";
		}
		/**/
		public static Coche[] nuevoCoche(Coche[] coches) {
			Scanner pregunta = new Scanner(System.in);
			String respuesta = "";
			int datos = 0;
			Coche[] coches_copia = Arrays.copyOf(coches, coches.length+1);
			Coche c1 = new Coche();
			
			System.out.println("¿Cuál es la marca del coche?");
				respuesta = pregunta.nextLine();
			c1.setMarca(respuesta);
			System.out.println("¿Cuál es el modelo del coche?");
				respuesta = pregunta.nextLine();
			c1.setModelo(respuesta);
			System.out.println("¿Ha hecho el coche algún kilóemtro? (Si es que si, introduzca cuantos, si es que no introduzca 0)");
				respuesta = pregunta.nextLine();
			c1.setKilometraje(datos);
			System.out.println("¿Qué matrícula tiene el coche? (introducela sin espacios y con formato 1234ABC)");
				respuesta = pregunta.nextLine();
			c1.setMatricula(respuesta.trim());
			
			c1 = coches_copia[coches_copia.length-1];
			return coches_copia;
			
		}
		/**/
		public static void modificarCoche(Empleado[] array, Coche[] coches){
			Coche c1 = buscarCoche(coches);
			Empleado e1 = buscarEmpleado(array);
			if (c1 == null || e1 == null) {
				do {
					System.out.println("Vuelve a introducir los datos correctamente, por favor.");
					c1 = buscarCoche(coches);
					e1 = buscarEmpleado(array);	
				} while(c1 == null || e1 == null);	
			}
			else if(e1.getCoche()==c1) {
				System.out.println("Ese empleado ya tiene asignado ese coche.");
			} 
			else if (!c1.disponible) {
				System.out.println("Ese coche no esta disponible, no se puede asignar a dicho empleado.");
			} 
			else {
				e1.setCoche(c1);
				System.out.println("Se ha registrado el coche a: " + e1.getNombre());
			}
			
		}
		/**/
		public static Empleado buscarEmpleado(Empleado[] array) {
			Empleado e1 = null;
			int codigo = 0;
			Scanner pregunta = new Scanner(System.in);
			
			System.out.println("¿Que empleado quieres buscar? (Introduce su código)");
			while (!pregunta.hasNextInt()) {
				System.out.println("Introduce un número válido.");
					pregunta.next();
			}
			codigo = pregunta.nextInt();
				
			
			for (int j = 0; j < array.length; j++) {
				if(array[j].getCodigo() == codigo) {
					e1 = array[j];
				}
			}
		    if (e1 == null) {
		        System.out.println("El empleado no se ha encontrado");
		    }
			return e1;
		}
		public static Coche buscarCoche(Coche[] coches) {
			Coche c1 = null;
			String matricula = "";
			Scanner pregunta = new Scanner(System.in);
			
			System.out.println("¿Que coche quieres buscar? (Introduce su matricula)");
				matricula = pregunta.next();
				
			for (int j = 0; j < coches.length; j++) {
				if(coches[j].getMatricula().equals(matricula)) {
					c1 = coches[j];
				}
			}
			if (c1 == null) {
		        System.out.println("El coche no se ha encontrado");
		    }
			return c1;
		}
		/*Este método recibe el array de empleados y los imprime con el método toString*/
		static void listarEmpleados(Empleado[] array) {
			if(array.length == 0) {
				System.out.println("No hay empleados.");
			} else {
				for(int o = 0; o < array.length; o++) {
					System.out.print(array[o].toString());
				}
			}
			
		}

}
