package examen1ev20221207;

import java.util.Arrays;

/*
 * Programa Java que realice las acciones siguientes definiendo, además del método main,
 * todos los métodos adicionales que se consideren necesarios: 
 * 
 *     * Crear un array de un tamaño aleatorio entre 10 y 50.
 *     
 *     * Usando la clase Math, almacenar en el array números aleatorios comprendidos entre
 *       -1000 y 1000 y con una precisión de dos decimales.
 *
 *     * Obtener el resultado de procesar el contenido del array de la forma siguiente:
 *     
 *       - Se sumarán los valores almacenados comenzando desde la posición cero en adelante.
 *       
 *       - Si en cualquier momento del proceso de cálculo de la suma ésta supera la mitad del
 *         valor máximo posible, el resultado final será el 33,33% del valor obtenido hasta
 *         ese momento, y no se sumarán el resto de los números almacenados en el array.
 *         
 *       - Si no se produce la situación anterior, el resultado final será el 66,66% de la suma obtenida.
 *       
 *     * Mostrar en la consola el array y el resultado de procesar su contenido si usar
 *       sentencias repetitivas.
 */


public class Ejercicio2 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 50 + 10);
		double [] array = new double[(int) Ejercicio1.aleatorio(10, 50)];
		for (int i=0; i<array.length; i++)
			array[i] = (long) ((Math.random() * 2000 - 1000) * 100) / 100d ;
		System.out.println(Arrays.toString(array));
		double max = (1000 * array.length) / 2;
		double suma = 0;
		int i = 0;
		do {
			suma += array[i];
			i++;
		} while (i < array.length && suma < max);
		double resultado;
		if (suma <= max)
			resultado = suma * 0.6666;
		else
			resultado = suma * 0.3333;
		System.out.println(resultado);
	}
	
}
