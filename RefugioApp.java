package paq21;

import java.util.*;

import paq20.Canario;
import paq20.Gato;
import paq20.Perro; 
import paq20.Animal;

public class RefugioApp {

	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static Scanner scBoolean = new Scanner(System.in);
	static Animal a1;
	static Animal a2;
	static Animal a3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---ALTA INICIAL DE ANIMALES EN EL REFUGIO---\n");

		System.out.println("--ALTA DE PERRO--\n");
		System.out.printf("Nombre del perro: ");
		String nombreP = scLine.nextLine();
		System.out.printf("Edad del perro: ");
		int edadP = scInt.nextInt();
		System.out.printf("Raza del perro: ");
		String raza = scLine.nextLine();

		a1 = new Perro(nombreP, edadP, raza);

		System.out.println("\n--ALTA DE GATO--");
		System.out.printf("Nombre del gato: ");
		String nombreG = scLine.nextLine();
		System.out.printf("Edad del gato: ");
		int edadG = scInt.nextInt();
		System.out.printf("¿Es cazador? (true/false): ");
		boolean cazador = scBoolean.nextBoolean();

		a2 = new Gato(nombreG, edadG, cazador);

		System.out.println("\n--ALTA DE CANARIO--");
		System.out.printf("Nombre del canario: ");
		String nombreC = scLine.nextLine();
		System.out.printf("Edad del canario: ");
		int edadC = scInt.nextInt();
		System.out.printf("Color de la pluma: ");
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
				opcion1();

				break;

			case 2:
				opcion2();

				break;

			case 3:
				opcion3();

				break;

			case 4:
				opcion4();

				break;

			case 0:
				System.out.println("Saliendo del refugio...");
				salir = true;
				break;
			}
		} while (!salir);

	}

	private static void opcion4() {
		// TODO Auto-generated method stub
		elegirAnimal(a1, a2, a3);
	}

	private static void opcion3() {
		// TODO Auto-generated method stub
		System.out.println("Animal más viejo: ");
		Animal viejo = calcularMasViejo(a1, a2, a3);
		mostrarFicha(viejo);
	}

	private static void opcion2() {
		// TODO Auto-generated method stub
		System.out.println("\n--FICHAS DE LOS ANIMALES--\n");
		mostrarFicha(a1);
		System.out.println("\n");
		mostrarFicha(a2);
		System.out.println("\n");
		mostrarFicha(a3);
	}

	private static void opcion1() {
		// TODO Auto-generated method stub
		System.out.println("\n--SONIDO DE TODOS LOS ANIMALES--");
		System.out.println(a1.emitirSonido());
		System.out.println(a2.emitirSonido());
		System.out.println(a3.emitirSonido());
	}

	private static void elegirAnimal(Animal a1, Animal a2, Animal a3) {
		// TODO Auto-generated method stub
		System.out.println("\n--PROBAR UN ANIMAL CONCRETO--");
		System.out.println("\n¿Qué animal quieres elegir?");
		boolean pregunta = false;
		while (!pregunta) {
			System.out.println("1.-Primero");
			System.out.println("2.-Segundo");
			System.out.println("3.-Tercero");
			int opcion1 = scInt.nextInt();
			switch (opcion1) {
			case 1:
				System.out.println(a1.getTipo());
				System.out.println(a1.emitirSonido());
				pregunta = true;
				break;
			case 2:
				System.out.println(a2.getTipo());
				System.out.println(a2.emitirSonido());
				pregunta = true;
				break;
			case 3:
				System.out.println(a3.getTipo());
				System.out.println(a3.emitirSonido());
				pregunta = true;
				break;
			}

		}

	}

	private static Animal calcularMasViejo(Animal a1, Animal a2, Animal a3) {
		// TODO Auto-generated method stub

		if (a1.getEdad() > a2.getEdad() && a1.getEdad() > a3.getEdad()) {
			return a1;
		} else if (a2.getEdad() > a1.getEdad() && a2.getEdad() > a3.getEdad()) {
			return a2;
		} else {
			return a3;
		}

	}

	public static void mostrarFicha(Animal a) {

		System.out.println(a.getTipo());
		System.out.println(a.emitirSonido());
	}

}

