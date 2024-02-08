package Figura;

public class Cuadrado extends Figura{
	private double lado;
	
	Cuadrado(){
		lado = 1;
	}
	Cuadrado(double lado, String nom){
		this.setLado(lado);
		this.nombre = nom;
	}
	public double calculoArea() {
		return lado*lado;
	}
	@Override
	public String area() {
		return "Soy un cuadrado";
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
}
