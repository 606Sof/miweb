package calendario;

import java.util.Scanner;

public class prueba_calendario {

	public static void main(String[] args) {
		// Main de la practica calendario
		int opc =0;
		Calendario c1 = new Calendario();
		do {
	        opc = menu();
	        switch(opc) {
	            case 1:
	            	c1 = calendario_manual();
	            	break;
	            case 2:
	            	c1 = fechaActual();
	            	break;
	            case 3:
	            	menu_secundario(c1);
	            	break;
	            case 4:
	            	comparaCalendarios(c1);
	        }
	        System.out.println("\nCalendario actual: ");
	        c1.mostrar();
	    } while (opc != 0);
		
	}
	//este método imprime el menú, tiene control de datos para que introuduzca solo un entero
	static int menu() {
		Scanner pregunta = new Scanner(System.in);
		int opc = 0;
		System.out.println("¿Qué quieres hacer? \n1.- Crear un nuevo calendario manualmente. \n2.- Agregar un calendario con la fecha actual. \n3.- Modificar el calendario. "
				+ "\n4.- Comparar el calendario con la fecha actual. \n0.- Cerrar el menú.");
		while (!pregunta.hasNextInt()) {
			System.out.println("Introduce un número válido.");
				pregunta.next();
		}
		opc = pregunta.nextInt();

		return opc;
	}
	// este metodo no recibe ningun parametro y devuelve un objeto de tipo Calendario
	// este metodo crea un calendario con los parametros que quiera el usuario, comprueba que los días concuerdan con los meses y que ningun valor sea 0
	static Calendario calendario_manual() {
		Scanner pregunta = new Scanner(System.in);
		Calendario calen = new Calendario();
		int dia = 0;
		int mes = 0;
		int año = 0;
		
		do {
			System.out.println("¿En qué mes quieres iniciar el calendario?");
			while (!pregunta.hasNextInt()) {
				System.out.println("Introduce un número.");
					pregunta.next();
			}
			mes = pregunta.nextInt();
			calen.setMes(mes);	
		}  while(mes < 1 || mes > 12); //comprueba que esta en el intervalo entre 1 y 12, por eso no hay comprobacion de si el mes es 0
		
		do {
			System.out.println("¿En qué día quieres iniciar el calendario?");
			while (!pregunta.hasNextInt()) {
				System.out.println("Introduce un número.");
					pregunta.next();
			}
			dia = pregunta.nextInt();
			calen.setDias(dia);	
		} while(comprobarDias(calen, dia, mes) || dia <= 0); //esta funcion comprueba que los dias no pasen del maximo del mes (Si es febrero que no pase de 28...)
		
		do {
			System.out.println("¿En qué año quieres iniciar el calendario?");
			while (!pregunta.hasNextInt()) {
				System.out.println("Introduce un número.");
					pregunta.next();
			}
			año = pregunta.nextInt();
			calen.setAño(año);	
		} while(año <= 0);
		
		return calen;
		
	}
	//este metodo no recibe nada y devuelve un objeto de tipo calendario con el constructor por defecto
	static Calendario fechaActual() {
		Calendario c1 = new Calendario(); //el constructor por defecto toma los valores de la fecha actual
		return c1;
	}
	//este metodo recibe un objeto calendario, el dia y el mes, devuelve T/F
	//este metodo hace comprueba si el dia introducido no pasa el maximo de el mes introducido comparando con la constante declarada en el constructor (array de MESES)
	static boolean comprobarDias(Calendario c1, int dia, int mes) {
		boolean comprobar = true;
		if(dia <= c1.getMESES()[mes-1]){ // la constante contiene el numero maximo de dias por mes (febrero solo puede tener 28, no hay años bisiestos)
			comprobar = false;
		}
		return comprobar;
	}
	//este metodo recibe un calendario (el creado en el menu principal) y opera con el, no devuelve nada (imprime cosas por pantalla)
	//este metodo hace uso de las funciones del constructor para añadir valores a la fecha del calendario creado con el primer menu
	static void menu_secundario(Calendario c2) {
		Scanner pregunta = new Scanner(System.in);
		int opc;

	    do {
	        System.out.println("¿Qué quieres hacer? \n1.-Añadir un día al calendario actual. \n2.-Añadir un mes al calendario actual. \n3.-Añadir un año al calendario actual. \n0.- Salir.");
	        while (!pregunta.hasNextInt()) {
	            System.out.println("Introduce un número válido.");
	            pregunta.next();
	        }
	        opc = pregunta.nextInt();

	        switch (opc) {
	            case 1:
	                c2.añadirDia();
	                break;
	            case 2:
	                c2.añadirMes();
	                break;
	            case 3:
	                c2.añadirAño();
	                break;
	        }
	        c2.mostrar();
	    } while (opc != 0);
	}
	//este metodo recibe un objeto calendario y no devuelve nada (imprime cosas por pantalla)
	//este metodo usa la funcion del constructor compara(calendario) que devuelve T/F y da un mensaje segun el resultado (calcula la diferencia si es false)
	static void comparaCalendarios (Calendario c1) {
		System.out.println("\nVamos a comparar el calendario con la fecha actual:");
		Calendario c2 = new Calendario();
		if(c1.iguales(c2)==true) {
			System.out.println("\nLas fechas de los calendarios son iguales");
		} else {
			System.out.println("\nLas fechas de los calendarios son distintas. \nLa diferencia son:");
			if(c1.getAño()>c2.getAño()) {
				System.out.print(c1.getAño()-c2.getAño() + " año(s),");
			} else {
				System.out.print(c2.getAño()-c1.getAño() + " año(s),");
			}
			if(c1.getMes()>c2.getMes()) {
				System.out.print(c1.getMes()-c2.getMes() + " mes(es),");
			} else {
				System.out.print(c2.getMes()-c1.getMes() + " mes(es),");
			}
			if(c1.getDias()>c2.getDias()) {
				System.out.print(" y " + (c1.getDias()-c2.getDias()) + " día(s).");
			} else {
				System.out.print(" y " + (c2.getDias()-c1.getDias()) + " día(s).");
			}
		}
		
		
	}
}