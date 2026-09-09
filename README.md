# Refugio de Animales

Aplicación de consola en Java que gestiona animales de un refugio usando herencia y polimorfismo dinámico. Sin arrays ni colecciones: todo se maneja con variables individuales.

## Diseño

**Clase `Animal` (superclase)**: `nombre`, `edad`. Getters/setters, `emitirSonido()` genérico, `getTipo()`, `toString()`.

**Subclases**
- `Perro` — `raza`
- `Gato` — `esCazador`
- `Canario` — `colorPluma`

Cada subclase sobrescribe `emitirSonido()` y `getTipo()`.

## Clase principal (`RefugioApp`)

Da de alta un Perro, un Gato y un Canario por teclado, guardándolos en variables de tipo `Animal` (polimorfismo), y ofrece un menú:

1. Escuchar a todos los animales
2. Ver fichas de los animales
3. Mostrar animal más viejo
4. Elegir un animal y mostrar su ficha
0. Salir

**Métodos auxiliares**: `mostrarFicha(Animal a)`, `calcularMasViejo(Animal a1, Animal a2, Animal a3)`, `elegirAnimal(...)`.

## Autor

**Kaori** — DAW 2025/2026  
[GitHub](https://github.com/Mia-Kaori)
