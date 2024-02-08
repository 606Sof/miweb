package inicios;

public class Gato {
	int edad;
	String color;
	private String raza;
	String nombre;
	int patas;
	
	public Gato() {
		color = "amarillo";
		raza = "desconocida";
	}
	
	public Gato(String r, int e, String n) {
		raza = r;
		edad = e;
		nombre = n;
	}
	
	//getter, para poder acceder a la raza sin modificarlo
	public String getRaza() {
		return raza;
	}
	
	//setter
	public void setRaza(String r) {
		raza = r;
	}
	
	//mismo mecanismo pero añadimos atributo de entrada para cambiarlo por defecto
	public Gato (int ed, int p) {
		edad = ed;
		patas = p;
	}
	public void como() {
		System.out.println("Como de todo");
	}
	public void come (String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Ñam ñam, me gusta el " + comida);
		} else {
			System.out.println("No me gusta :(");
		}
	}
	public String toString() {
		return raza + "-" + edad + "-" + color;
	}
	public String formato() {
		String cadena = "";
		cadena += "\n--------------------------------------------";
		cadena += "\nEl gato se llama " + nombre;
		cadena += "\nTiene: " + edad + " años";
		cadena += "\nNuestro gatito tiene: " + patas + " patitas";
		cadena += "\nNuestro gato es de color: " + color;
		cadena += "\nNuestro gato es de raza: " + raza;
		cadena += "\n--------------------------------------------";
		return cadena;
	}
	
	//metodo pelea con, recibe como parametro otro gato
	//gana el que tenga raza salvaje
	//si los dos son salvajes, empate
	public void peleaCon (Gato contrincante) {
		String gato1 = nombre;
		String gato2 = contrincante.nombre;
		if (this.raza.equals("Salvaje")&&contrincante.raza.equals("Salvaje")) {
			System.out.println("Empate");
		} else {
			if (contrincante.raza.equals("Salvaje")){
				System.out.println("Gana gato 2: " + gato2);
			}else if(this.raza.equals("Salvaje")){
				System.out.println("Gana gato 1: " + gato1);
			}	
		}
	}
}