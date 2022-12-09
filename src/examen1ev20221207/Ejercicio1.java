package examen1ev20221207;

import java.util.Arrays;

/*
 * Programa que realice las acciones siguientes definiendo, además del método main, 
 * todos los métodos adicionales que se consideren necesarios: 
 * 
 *     * Almacenar en una variable de tipo long un número aleatorio comprendido
 *       entre dos valores cualesquiera usando la clase Math.
 *     
 *     * Sin usar sentencias if y sin convertir el número a cadena, determinar si
 *       el número obtenido me gusta. Un número sólo me gusta si:
 *     
 *           - La suma de los dígitos cuyo valor es impar es mayor que la suma del
 *             resto de dígitos.
 *           
 *           - No se cumple la condición anterior, pero el número es impar y la suma
 *             de todos sus dígitos también lo es.
 *           
 *     * Almacenar en un array de caracteres cada uno de los dígitos del número sin
 *       usar sentencias repetitivas.
 *     
 *     * Mostrar en la consola los resultados obtenidos en cada uno de los apartados anteriores.
 *  
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		long numero = aleatorio(1000, 9999);
		System.out.println(numero);
		System.out.println(meGusta(numero) ? "Me gusta" : "No me gusta");
		char [] array = String.valueOf(numero).toCharArray();
		System.out.println(Arrays.toString(array));
	}
	
	static boolean meGusta(long numero) {
		long sumaP = 0;
		long sumaI = 0;
		long sumaD = 0;
		while (numero > 0) {
			long d = numero % 10;
			numero /= 10;
			sumaP += d % 2 == 0 ? d : 0;
			sumaI += d % 2 == 0 ? 0 : d;
			sumaD += d;
		}
		return sumaI > sumaP || (numero % 2 != 0 && sumaD % 2 != 0);
	}
	
	public static long aleatorio(long min, long max) {
		long numero;
		
		if (min == max)
			numero = min;
		else {
			if (min > max) {
				long aux = min;
				min = max;
				max = aux;
			}
			numero = (long) (Math.random() * (max - min) + min);
		}
		return numero;
	}

}
