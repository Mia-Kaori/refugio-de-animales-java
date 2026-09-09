package paq20;

public class Perro extends Animal{

	private String raza;

	
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}

	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	} 
	
	
	
	public String emitirSonido() {
		return "Guau guau, soy un perro llamado " + super.getNombre();
	}
	
	public String getTipo() {
		return "Tipo: Perro, " + super.toString() + ", raza: " + this.raza;
	}
	
	
	
	
	
	
	
}
