package alumno;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
	static int contCodigos;
	private int codigo;
	private String nombre;
	String[] modulos;
	
	Alumno(){
		codigo=contCodigos++;
		setNombre("No introducido");
		modulos = new String[0];
	}
	Alumno(String nom, int cod, String[] modulos){
		this.setCodigo(cod);
		this.setNombre(nom);
		this.modulos = modulos;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCodigo(int cod) {
		this.codigo = cod;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public String toString() {
		return "Nombre: " + nombre + "\nCódigo: " + codigo;
	}
	public void listarModulos() {
		if(modulos.length==0){
			System.out.println("No hay modulos");
		} else {
			for(int i = 0; i < modulos.length; i++) {
				System.out.println(modulos[i]);
			}
		}
	}
	public String[] agregarModulos(int cuantos, String[] modulos, Alumno a2) {
		Scanner pregunta = new Scanner(System.in);
		String[] array_copia = Arrays.copyOf(modulos, modulos.length+cuantos);
		String datos = "";
		
		for(int i = 0; i < cuantos; i++) {
			System.out.println("Introduce el módulo " + (i+1));
				datos = pregunta.nextLine();
			array_copia[i] = datos;
		}
		a2.modulos = array_copia;
		return a2.modulos;
	}
	
}
