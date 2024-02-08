package clases_internas;

public class Huevo {
	private Yema yema;
	private Clara clara;
	
	public class Yema {
		private int tamaño;
		public Yema(int tama) {
			tamaño=tama;
		}
		public int getTamaño() {
			return tamaño;
		}
	}
	public class Clara {
		private int volumen;
		public Clara (int volumen) {
			this.volumen = volumen;
		}
		public int getVolumen() {
			return volumen;
		}
	}
	public Huevo(Yema y, Clara c) {
		this.yema = y;
		this.clara = c;
	}
	public Huevo (int tamaYema, int voluClara) {
		this.yema = new Yema(tamaYema);
		this.clara = new Clara(voluClara);
	}
	public Yema getYema() {
		return yema;
	}
	public Clara getClara() {
		return clara;
	}
}
