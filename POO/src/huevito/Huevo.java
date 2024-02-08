package huevito;

public class Huevo {
	Yema yema;
	Clara clara;
	
	public Huevo() {
		yema = new Yema();
		clara = new Clara();
	}
	
	@Override
	public String toString() {
		return "Huevo [yema=" + yema + ", clara=" + clara + ", getYema()=" + getYema() + ", getClara()=" + getClara() + "]";
	}
		
	public Yema getYema() {
		return yema;
	}
	public void setYema(Yema yema) {
		this.yema = yema;
	}
	public Clara getClara() {
		return clara;
	}
	public void setClara(Clara clara) {
		this.clara = clara;
	}
	public void romper() {
		System.out.println("Se ha roto el huevo");
	}
	public void cocinar() {
		System.out.println("Hemos cocinado el buevito");
	}
	
	
}
