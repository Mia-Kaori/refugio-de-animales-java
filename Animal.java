package paq20;

public class Animal {

	protected String nombre; 
	protected int edad;
	
	
	public Animal() {
		super();
	}

	public Animal(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	public String emitirSonido() {
		return "El animal hace ruido";
	}

	public String getTipo() {
		return "Animal";
	}

	@Override
	public String toString() {
		return "nombre: " + this.nombre + ", edad: " + this.edad;
	}
	
	
	
	
	
	
	
	
	
	
	
}
