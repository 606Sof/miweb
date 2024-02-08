package ejercicios;

public class Cubo {
	//metodo para capacidad, contenido, llenar, vaciar 
	//llenar(cuanto), pintar, volcar en(otroCubo), vaciar(cuanto)
	private int capacidad;
	int contenido;
	
	public Cubo() {
		capacidad = 3;
		contenido = 0;
	}
	public Cubo(int cap) {
		capacidad = cap;
	}
	public Cubo(int cap, int cont) {
		capacidad = cap;
		contenido = cont;
	}
	public void llenar() {
		this.contenido = this.capacidad;
	}
	public void vaciar(){
		this.contenido = 0;
	}
	public String toString() {
		return "Capacidad: " + capacidad + "\nContenido: " + contenido;
	}
	public void pintar() {
        for(int i = this.capacidad; i >= 0; i--) {
            for(int j = 0; j <= this.capacidad; j++) {
                if(j == 0 || j == this.capacidad) 
                    System.out.print("| ");
                else if( i < this.contenido) {
                    System.out.print("~ ");
                } else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i <= this.capacidad; i++) {
            System.out.print("= ");
        }
	}
	public String llenar (int cuanto) {
		String cubo = "";
		this.contenido += cuanto;
		if (contenido>capacidad) {
			this.contenido = capacidad;
	        System.out.println("El cubo está lleno y te sobran " + (capacidad-contenido) + " litros.");
		} 
		return cubo;
	}
	public void vaciar(int cuanto) {
		contenido -= cuanto;
		if (contenido==0) {
			System.out.println("Ya no queda agua en el cubo");
		} else if (contenido>=0) {
			System.out.println("No se puede vaciar más el cubo");
		} else {
			System.out.println("El cubo ahora está: \nContenido: " + contenido);
		}
	}
	public void volcarEn(Cubo destino) {
		
	}
}
