package paq20;

public class Gato extends Animal {
	
	private boolean esCazador;
	
	
	public Gato(String nombre, int edad, boolean esCazador) {
		super(nombre, edad);
		this.esCazador = esCazador;
	}

	
	public boolean isEsCazador() {
		return esCazador;
	}

	public void setEsCazador(boolean esCazador) {
		this.esCazador = esCazador;
	}
	
	
	
	public String emitirSonido() {
		return "Miau miau, soy un gato llamado " + super.getNombre();
	}
	
	public String getTipo() {
		return "Tipo: Gato, " + super.toString() + ", es cazador: " + transformar() ;
	}

	public String transformar() {
		if (this.esCazador == true) {
			return "sí";
		} else
			return "no";
	}

	
	
	
	
	
	
	
}
