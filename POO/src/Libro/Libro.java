package Libro;

public class Libro {
	//variables privadas
	private String autor; 
	protected int paginas; 
	private String titulo; 
	//variables publicas
	double precio;
	int marcador; //por defecto
	public boolean disponibilidad;
	
	//el constructor por defecto que va a determinar los valores iniciales de un libro al ser creado sin parametros
	public Libro() {
		titulo = "No tiene";
		autor = "No tiene autor";
		disponibilidad = true;
		precio = 10.40;
	}
	
	//constructor para darle por defecto un titulo a un libro, recibiendo un string al hacer uso de dicho contructor
	public Libro(String t) {
		this.titulo = t;
		disponibilidad = true;
	}
	
	//getter del titulo
	public String getTitulo() {
		return titulo;
	}
	
	//setter del titulo
	public void setTitulo(String t) {
		this.titulo = t;
	}
	
	public void setPaginas(int p) {
		this.paginas = p;
	}
	
	public void setAutor(String a) {
		this.autor = a;
	}
	
	//funcion para ir registrando cuanto llevas leido
	public void leer (int n_pag) {
		int cont_pag = this.paginas - n_pag;
		if(cont_pag == this.paginas) {
			System.out.println("Te has acabado el libro");
		} else if (n_pag > paginas) {
			System.out.println("Este libro no tiene tantas páginas. No te flipes");
		} else {
			System.out.println("Llevas: " + n_pag + " páginas.\nTe quedan: " + cont_pag + " páginas para terminarlo.");
		}
		
	}
	
	//metodo para imprimir la informacion del libro
	public String toString() {
		String cadena = "";
		cadena += "\n----------------------------------------------------";
		cadena += "\nTítulo: " + titulo;
		cadena += "\nTiene: " + paginas + " páginas en total.";
		cadena += "\nEl precio es: " + precio + "€";
		cadena += "\nLo ha escito: " + autor;
		cadena += disponibilidad==true?"\nEl libro esta disponible":"\nEl libro no esta disponible todavía.";
		cadena += alquilar()==0?"\nNo es posible alquilarlo en este momento":"\nEl libro está disponible para alquilar";
		cadena += "\n----------------------------------------------------";
		return cadena;
	}
	
	// MOVER A OTRA CLASE PARA HACER USO DE LA CLASE.
	
	//array de libros para almacenar varios objetos (libros)
	public Libro[] almacenar() {
		Libro[] libreria = new Libro[1+1]; //creamos un nuevo array añadiendo una posicion a el array para intoducir el nuevo dato
		libreria[libreria.length-1] = new Libro(); 
		return libreria;
	}
	
	//imprimir las cosas basicas del libro
	public String Print() {
		return titulo + "- por: " + autor + "\nPrecio: " + precio + "\nYa en nuestras tiendas.";
	}
	
	//metodo para saber si se puede alquilar el libro en cuestion o no
	public int alquilar() {
		//si funciona, devuelve 1
		//si no, devuelve 0
		int resultado = 0;
		if (disponibilidad==true) {
			disponibilidad=false;
			resultado = 1;
		} else {
			resultado = 0;
		}
		return resultado;
	}
}

