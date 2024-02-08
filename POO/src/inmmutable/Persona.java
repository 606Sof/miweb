package inmmutable;

import java.util.Objects;

public class Persona {
	private String nombre;
	private int ano;
	
	public Persona(String nombre, int ano) {
		this.nombre = nombre;
		this.ano = ano;
	}

	public Persona() {
		nombre = null;
		ano = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return ano == other.ano && Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ano=" + ano + "]";
	}
	
	
	
	
}
