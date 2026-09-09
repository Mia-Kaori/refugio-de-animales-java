package paq1;

import java.util.*;

import paq.*;

public class RefugioApp {

	static Scanner scLine = new Scanner (System.in);
	static Scanner scInt = new Scanner (System.in);
	static Scanner scBoolean = new Scanner (System.in);
	static Scanner scDouble = new Scanner (System.in);
	static Animal a1;
	static Animal a2;
	static Animal a3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--ALTA INICIAL DE ANIMALES EN EL REFUGIO--");
		
		System.out.println("--ALTA DE PERRO--");
		System.out.println("Nombre del perro: ");
		String nombreP = scLine.nextLine();
		
		System.out.println("Edad del perro: ");
		int edadP = scInt.nextInt();
		
		System.out.println("Raza del perro: ");
		String raza = scLine.nextLine();
		
		a1=new Perro(nombreP, edadP, raza);
		
		System.out.println("--ALTA DE GATO--");
		System.out.println("Nombre del gato: ");
		String nombreG = scLine.nextLine();
		
		System.out.println("Edad del gato: ");
		int edadG = scInt.nextInt();
		
		System.out.println("¿Es cazador? (true/false): ");
		boolean cazador = scBoolean.nextBoolean();
		
		a2 =new Gato(nombreG, edadG, cazador);
		
		System.out.println("--ALTA DE CANARIO--");
		System.out.printf("Nombre del canario: ");
		String nombreC = scLine.nextLine();
		
		System.out.println("Edad del canario: ");
		int edadC = scInt.nextInt();
		
		System.out.println("Color de la pluma ");
		String color = scLine.nextLine();
		
		a3 = new Canario(nombreC, edadC, color);
		
		boolean salir = false;

		do {
			System.out.println("\n---MENÚ REFUGIO---");
			System.out.println("1.-Escuchar a todos los animales");
			System.out.println("2.-Ver fichas de los animales");
			System.out.println("3.-Mostrar animal más viejo");
			System.out.println("4.-Elegir un animal y mostrar su ficha");
			System.out.println("0.-Salir");
			System.out.println("Elige una opción: ");
			int opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				sonidoAnimales();
				break;

			case 2:
				fichasAnimales();
				break;

			case 3:
				animalViejo();
				break;

			case 4:
				elegirAnimalMostrar();
				break;

			case 0:
				salir = true;
				System.out.println("Saliendo del refugio...");
				break;
			}

		} while (!salir);
	
	}

	
	

	private static void elegirAnimalMostrar() {
		// TODO Auto-generated method stub
		elegirAnimal();
	}

	public static void elegirAnimal() {
		System.out.println("--PROBAR UN ANIMAL COMPLETO--");
		boolean salir = false;
		do {
			System.out.println("¿Qué animal quieres elegir?");
			System.out.println("1.-Primero");
			System.out.println("2.-Segundo");
			System.out.println("3.-Tercero");
			System.out.println("Elige una opción: ");
			int opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Has elegido a: ");
				mostrarFicha(a1);
				salir = true;
				break;

			case 2:
				System.out.println("Has elegido a: ");
				mostrarFicha(a2);
				salir = true;
				break;

			case 3:
				System.out.println("Has elegido a: ");
				mostrarFicha(a3);
				salir = true;
				break;
			}

		} while (!salir);
	}


	private static void animalViejo() {
		// TODO Auto-generated method stub
		System.out.println("El animal más viejo es: ");
		Animal viejo = calcularMasViejo( a1,  a2,  a3);
		mostrarFicha(viejo);
	}
	
	public static Animal calcularMasViejo(Animal a1, Animal a2, Animal a3) {
		if(a1.getEdad()>a2.getEdad() && a1.getEdad()>a3.getEdad()) {
			return a1;
		}if(a2.getEdad()>a1.getEdad() && a2.getEdad()>a3.getEdad()) {
			return a2;
		}else {
			return a3;
		}	
	}

	private static void fichasAnimales() {
		// TODO Auto-generated method stub
		System.out.println("FICHAS DE LOS ANIMALES");
		mostrarFicha(a1);
		System.out.println("\n");
		mostrarFicha(a2);
		System.out.println("\n");
		mostrarFicha(a3);
	}
	
	public static void mostrarFicha(Animal a) {
		System.out.println(a.getTipo());
		System.out.println(a.emitirSonido());
	}

	private static void sonidoAnimales() {
		// TODO Auto-generated method stub
		System.out.println("SONIDO DE TODOS LOS ANIMALES");
		System.out.println(a1.emitirSonido());
		System.out.println(a2.emitirSonido());
		System.out.println(a3.emitirSonido());
	}

}
