package Animal;

public class Animal {
	protected String nombre;
	private String tipo;
	
	Animal(){
		nombre = "No definido";
		tipo = "No definido";
	}
	Animal(String nom, String tip){
		this.nombre = nom;
		this.tipo = tip;
	}
	public void duerme() {
		System.out.println("ZZZzzzz...");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	public String ruge() {
		return "Rujo como un animal";
	}
}
