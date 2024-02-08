package Animal;

public class Ave extends Animal{
	boolean vuela;
	
	Ave(){
		super();
		vuela = false;
	}
	Ave(String tipo, String nombre){
		super(tipo, nombre);
	}
	
	public void volar() {
		System.out.println("Weeeee");
	}
}
