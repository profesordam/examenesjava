package examen1ev20221207;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Escribe un programa Java que lea de la consola una secuencia de cadenas
 * y la procese según las especificaciones siguientes:
 * 
 *     * Una vez leída la secuencia, se mostrará de nuevo en la consola imprimiendo cada palabra
 *       en una línea y en orden alfabético.
 *       
 *     * Cada palabra irá acompañada en la misma línea de un cifrado que se obtendrá con un método
 *       llamado cifrar de la forma siguiente:
 *       
 *           - Cada vocal se multiplica por la longitud de la cadena.
 *           
 *           - Cada consonante se divide por la longitud de la cadena.
 *           
 *           - Se suman todos los resultados obtenidos en los dos apartados anteriores y ese será
 *             el resultado del cifrado.
 *             
 *     * Para llevar a cabo la lectura de los datos que el usuario escribe en la consola se asumen
 *       los supuestos siguientes.
 *       
 *           - En la primera línea el usuario escribe el número N de palabras que escribirá a continuación.
 *           
 *           - En la primera línea siempre escribe un número entero y nunca se equivoca.
 *           
 *           - A continuación, escribe N palabras, cada una en una nueva línea.
 *           
 *           - El usuario no está obligado a introducir las palabras en orden alfabético.
 *           
 *           - No escribirá más palabras de las especificadas. 
 *           
 * La solución del problema deberá estar basada en el uso de las clases Integer, String y Arrays.
 * 
 */


public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String [] palabras = new String[n];
		for (int i=0; i<palabras.length; i++)
			palabras[i] = in.readLine();
		Arrays.sort(palabras);
		for (String p: palabras)
			System.out.println(p + " - " + cifrar(p));
	}
	
	static long cifrar(String p) {
		long suma = 0;
		for (char c: p.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				suma += c * p.length();
			else
				suma += c / p.length();
		}
		return suma;
	}
	
}
