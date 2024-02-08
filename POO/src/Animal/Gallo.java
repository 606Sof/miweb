package Animal;

public class Gallo extends Ave{
	private int cresta;
	
	/*Gallo(){
		cresta = 1;
	}*/
	
	static void despertar() {
		System.out.println("Se ha despertado");
	}


	public int getCresta() {
		return cresta;
	}


	public void setCresta(int cresta) {
		this.cresta = cresta;
	}
	public String toString() {
		return cresta + " cm " + super.toString();
	}
	@Override
	public void volar(){
		System.out.println("Vuelaa");
	}
}
