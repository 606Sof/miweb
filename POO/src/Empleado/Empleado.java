package Empleado;

public class Empleado {
	//
	static private int Contcod;
	private int codigo;
	private String nombre;
	private int año;
	private Coche cocheEmpresa;
	
	Empleado(){
		cocheEmpresa = null;
	}
	Empleado(String nombre, int años, int codigo, Coche c){
		if (c.getDisponible()) {
			this.nombre = nombre;
			this.año = años;
			this.codigo = codigo;
			this.cocheEmpresa = c;
			c.setDisponible(false);
		} else { //si el coche no esta disponible
			this.nombre = nombre;
			this.año = años;
			this.codigo = codigo;
		}
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public int getAño() {
		return año;
	}
	public Coche getCoche() {
		return cocheEmpresa;
	}
	public void setCoche (Coche c) {
		if (c.getDisponible()) {
			this.cocheEmpresa = c;
			c.setDisponible(false);
		}
	}
	public void setNombre (String nom) {
		this.nombre = nom;
	}
	public void setAño (int años) {
		this.año = años;
	}
	public String toString () {
		return "\nEl nombre del empleado es: " + nombre + "\nEl codigo del empleado es: " + codigo + "\nEl coche es: " + cocheEmpresa;
	}
	public int calculaAntiguedad() {
		return 2024-año;
	}
	public boolean compara(Empleado e1, Empleado e2) {
		boolean comp = false;
		if(e1.getAño()==e2.getAño())
			comp = true;
		else
			comp = false;
		
		return comp;
	}
	
}
