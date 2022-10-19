package examen1ev20221019;

import java.util.Arrays;

/*
 * En una clase llamada Ejercicio1, resolverlos problemassiguientes:
 * 
 *   • Definir un método llamado mostrar que reciba en un parámetro
 *     formal un array de números enteros y muestre su contenido en
 *     la pantalla usando una sola sentencia no repetitiva.
 *     A continuación, retornará el número almacenado en una posición
 *     elegida de forma aleatoria (no usar la clase Random).
 *     
 *   • En el método main invocar al anterior y mostrar en pantalla el
 *     valor retornado.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Número elegido: " + mostrar(numeros));
	}
	
	public static int mostrar(int [] numeros) {
		System.out.println(Arrays.toString(numeros));
		return numeros[(int) Math.round(Math.random() * (numeros.length - 1))]; 
	}

}
