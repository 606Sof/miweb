package Animal;

public class Tigre extends Animal{
	private String raza;
	private int edad;
	private String nombre;
	
	Tigre(){
		raza = "No aplica";
		edad = 1;
	}
	Tigre(String raz, int ed, String nom){
		this.raza = raz;
		this.edad = ed;
		this.nombre = nom;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String ruge() {
		return "GRRRRRRRRRRRR... " + super.ruge();
	}

	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean esIgual(Object otro) {
		if (this.edad == ((Tigre)otro).edad) {
			return true;
		} else {
			return false;
		}
		/*return edad == other.edad;-> es lo mismo que este método*/
	}
	/*si this.edad es mayor que otro.edad devuelve un negativo y si this.edad es menor que otro.edad devuelve un positivo*/
	public int compara (Tigre otro) {
		return this.edad - otro.edad;
	}

	public boolean equals(Tigre otro) {
		return (this.nombre.equals(otro.nombre)) && (this.edad == otro.edad);
	}
}
