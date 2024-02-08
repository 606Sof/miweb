package Figura;

public class Circulo extends Figura{
	private double pi = Math.PI;
	private double radio;
	
	Circulo(){
		radio = 1.2;
	}
	
	Circulo(double rad, String nom){
		this.radio = rad;
		this.nombre = nom;
	}
	
	public double calculoArea() {
		double pow = Math.pow(radio, 2);
		return  pi*pow;
	}
	
	@Override
	public String area() {
		return "Soy un circulo";
	}
	public void setRadio(double rad) {
		this.radio = rad;
	}
	
	public double getRadio() {
		return radio;
	}
	
}	
