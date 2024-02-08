package Empleado;

public class Coche {
	private static int contadorCodigo = 1;
	private String marca;
	private String modelo;
	private String matricula;
	private int kilometraje;
	boolean disponible;
	private int codigo;
	static private int kmtotal;
	
	Coche(){
		modelo = "No especificado";
		marca = "No especificado";
		disponible = false;
		matricula = "0000ABC";
		kilometraje = 0;
		this.codigo += contadorCodigo++;
	}
	Coche(String mar, String mod, String mat){
		this.marca = mar;
		this.modelo = mod;
		this.matricula = mat;
		disponible = true;
		
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public boolean getDisponible(){
		return disponible;
	}
	public void setMarca (String mar){
		this.marca = mar;
	}
	public void setModelo (String mod){
		this.modelo= mod;
	}
	public void setMatricula (String mat){
		this.matricula = mat;
	}
	public void setKilometraje (int km){
		this.kilometraje = km;
	}
	public void setDisponible (boolean dis) {
		this.disponible = dis;
	}
	public String toString() {
		return "\nLa marca del coche es: " + marca + "\nEl modelo es: " + modelo + "\nLa matricula es: " + matricula;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void recorre (int km) {
		kilometraje += km;
		kmtotal += km; 
	}
	public static int getKmtotal () {
		return kmtotal;
	}
	public int getCodigo() {
		return codigo;
	}

}
