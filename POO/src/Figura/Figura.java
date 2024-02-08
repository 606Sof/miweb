package Figura;

public class Figura {
	//
	protected String nombre;
	
	public String area() {
		return "Soy una figura";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}
}
