package examen1ev20221019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * En una clase llamada Ejercicio3, resolver los problemas siguientes:
 * 
 *   • Crear un vector de números enteros de un tamaño especificado por el usuario que estará comprendido
 *     entre 10 y 200 elementos.
 *     
 *   • Llenar el vector con números aleatorios comprendidos entre -100 y 100.
 *   
 *   • Mostrar la suma de los números almacenados teniendo en cuenta que hay quien piensa que el número 13 
 *     es el número de la mala suerte. Por tanto, si en alguna posición se encuentra almacenado el número 13,
 *     este no se sumará. Tampoco los que se encuentren en las 13 posiciones siguientes (o las que haya hasta
 *     el final del vector si estas son menos de 13), a no ser que sumen 7.
 *   
 *   • Mostrar el contenido del vector, el resultado de la suma y la cantidad de números que no se han sumado.
 *     Resolver cada apartado ensu propio método (el último en el método main, en el que también se invocará a
 *     los otros en el orden requerido para que se lleven a cabo todas las tareas).
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		int[] numeros = crearVector(10, 200);
		llenarVector(numeros);
		
		
		// para probar
//		int [] numeros = {1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4}; 
//		int [] numeros = {1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//		int [] numeros = {1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//		int [] numeros = {1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//		int [] numeros = {1, 13, 1, 1, 1, 1, 1, 1, 1, 1, -1};
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("no sumados = " + mostrarSuma(numeros));
	}
	
	static int[] crearVector(int min, int max) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		if (min < 1 || min >= max)
			return null;
		boolean correcto;
		int l = 0;
		do {
			correcto = true;
			System.out.println("Tamaño del vector (entre " + min + " y " + max + "): ");
			try {
				l = Integer.parseInt(in.readLine());
				if (l < min || l > max) {
					correcto = false;
					System.out.println("no esta dentro del intervalo, inténtalo de nuevo");
				}
			} catch (NumberFormatException e) {
				System.out.println("no es un número, inténtalo de nuevo");
				correcto = false;
			}
		} while (!correcto);
		return new int[l];
	}
	
	static void llenarVector(int[] vector) {
		for (int i=0; i<vector.length; i++)
			vector[i] = (int) Math.round(Math.random() * 200 - 100);
	}
	
	// retorna la candidad de números que no se sumaron
	static int mostrarSuma(int [] vector) {
		int noSumados = 0;
		int suma = 0;
		int i = 0;
		while (i < vector.length) {
			if (vector[i] != 13) {
				suma += vector[i];
				i++;
			}
			else {
				i++;
				int parcial = 0;
				int nosumadosParcial = 0;
				while (i < vector.length && nosumadosParcial < 13) {
					parcial += vector[i];
					i++;
					nosumadosParcial++;
				}
				if (parcial == 7)
					suma += parcial;
				else
					noSumados += nosumadosParcial;
			}
		}
		System.out.println("Suma = " + suma);
		return noSumados;
	}

}
