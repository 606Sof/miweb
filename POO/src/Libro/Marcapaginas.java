package Libro;

public class Marcapaginas {
	int num_paginas;
	public Marcapaginas() {
		num_paginas = 0;
	}
	
	public void incrementaPagina (int cuantas){
		num_paginas += cuantas;
	}
	
	public int ultimaPagina() { //muestra la ultima pagina leida
		return num_paginas;
	}
	
	public int comenzarPagina() { //devuelve el marcapaginas al inicio
		num_paginas = 0;
		return num_paginas;
	}
}
