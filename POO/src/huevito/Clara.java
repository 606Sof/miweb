package huevito;

public class Clara {
	private double volumen;
	public String claridad;
	
	public Clara() {
		volumen = 0.2;
		claridad = "no defindo";
	}
	public Clara(double vol, String clar) {
		this.volumen = vol;
		this.claridad = clar;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumnen) {
		this.volumen = volumnen;
	}
	public String getClaridad() {
		return claridad;
	}
	public void setClaridad(String claridad) {
		this.claridad = claridad;
	}

}
