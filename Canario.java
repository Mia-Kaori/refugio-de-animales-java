package paq20;

public class Canario extends Animal{
	
	private String colorPluma;
	

	public Canario(String nombre, int edad, String colorPluma) {
		super(nombre, edad);
		this.colorPluma = colorPluma;
	}
	
	

	public String getColorPluma() {
		return colorPluma;
	}

	public void setColorPluma(String colorPluma) {
		this.colorPluma = colorPluma;
	}
	
	
	
	public String emitirSonido() {
		return "Pío  Pío, soy un canario llamado " + super.getNombre();
	}

	public String getTipo() {
		return "Tipo: Canario, " + super.toString() + ", color pluma: " + this.colorPluma;
	}
	
	
}
