package calendario;

import java.time.LocalDate;
import java.util.Arrays;

public class Calendario {
	private int dias;
	private int mes;
	private int año;
	private final int[] MESES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Calendario() {
		 año =  LocalDate.now().getYear();
         mes =  LocalDate.now().getMonthValue();
         dias =  LocalDate.now().getDayOfMonth();
	}
	
	public Calendario(int anio, int mes, int dias) {
		if (anio <= 0) {
			System.out.println("El año no puede ser 0 o menor que 0, se establecerá el año actual como el año del calendario");
			this.año =  LocalDate.now().getYear();
		} else {
			this.año = anio;
		}
		if (mes <= 0) {
			System.out.println("El mes no puede ser 0 o menor que 0, se establecerá el mes actual como el mes del calendario");
			this.mes = LocalDate.now().getMonthValue();
		} else {
			this.mes = mes;
		}
		if (dias <= 0) {
			System.out.println("El día no puede ser 0 o menor que 0, se establecerá el día actual como el día del calendario");
			this.dias =  LocalDate.now().getDayOfMonth();
		} else {
			this.dias = dias;
		}
		
		
	}
	
	public int getDias() {
		return dias;
	}
	public int getMes() {
		return mes;
	}
	public int getAño() {
		return año;
	}
	public int[] getMESES() {
		return MESES;
	}
	
	public void añadirDia() {
		if(dias >= MESES[getMes()-1]) { // si el numero de dias, al añadir 1 dia, es mayor al maximo de dias del mes, resetea el contador de dias y añade un mes
			añadirMes();
			dias = 1;
		} else {
			dias++;
		}
	}

	public void añadirMes() {
		mes++;
		if(mes >= 12) {
			añadirAño();
			mes = 1; 
			dias = 1; //reseteamos el mes y el dia a 1 para que empiece de nuevo el año
		} else if (dias >= MESES[getMes()-1]){ // en caso de que al incrementar el mes, ese numero de dias no existan, pasa al siguiente mes y reinicia el contador de dias
			dias = 1;
			mes++;
		} 
	}
	public void añadirAño() {
		año++;
	}
	public void mostrar() {
		System.out.println("El día es: " + dias + " el mes es: " + mes + ", y es el año: " + año);
	}
	public static Calendario[] guardarFecha(Calendario[] array, Calendario c1) {
		Calendario[] array_fechas = Arrays.copyOf(array, array.length+1);
		array_fechas[array.length-1] = c1;
		return array_fechas;
	}
	public boolean iguales (Calendario otraFecha) {
		boolean comprobar = false;
		if(dias == otraFecha.getDias()) {
			if(mes == otraFecha.getMes()) {
				if(año == otraFecha.getAño()) {
					comprobar = true;
				}
			}
		}
		
		return comprobar;
	}

	public void setMes(int mes2) {
		this.mes = mes2;
		
	}

	public void setDias(int dia) {
		this.dias = dia; 
		
	}

	public void setAño(int año2) {
		this.año = año2;
		
	}
}
