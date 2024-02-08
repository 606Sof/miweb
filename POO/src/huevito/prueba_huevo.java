package huevito;

public class prueba_huevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Huevo huevo = new Huevo();
		
		huevo.romper();
		huevo.cocinar();
				
		Yema yema = huevo.getYema();
		
		System.out.println("Color de la yema: " + yema.getColor());
		yema.setColor("verde");
		System.out.println("Nuevo color de la yema: " + yema.getColor());
		
		Clara clara = huevo.getClara();
		System.out.println("Volumen de la clara: " + clara.getVolumen());
		clara.setVolumen(0.5);
		System.out.println("Nuevo volumen de la clara: " + clara.getVolumen());
		
		huevo.getYema().setColor("azul");
		System.out.println("Nuevo color de la yema: " + huevo.getYema().getColor());
	}

}
