package examen1ev20221019;

/*
 * En una clase llamada Ejercicio3 resolver los problemas siguientes:
 * 
 *   • Definir un método que acepte a través de parámetros formales tres números enteros
 *     y retorne su suma calculada de la forma siguiente: los que estén en el rango 13..19,
 *     ambos incluidos contarán como cero. Los valores 15 y 16, no contarán como cero, 
 *     aunque pertenezcan a dicho rango.
 *     
 *   • Definir un método que acepte a través de parámetros formales dos números enteros y
 *     retorne el que se aproxime más a 21 sin pasarse. Si ambos se pasan, retornará 0.
 *     
 *   • Poner a prueba el método anterior desde el método main.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("10 + 14 + 16 = " + suma (10, 14, 16));
		System.out.println("17, 20 -> " + blackjack(17, 20));
		System.out.println("20, 17 -> " + blackjack(20, 17));
		System.out.println("17, 17 -> " + blackjack(17, 17));
		System.out.println("22, 20 -> " + blackjack(22, 20));
		System.out.println("20, 22 -> " + blackjack(20, 22));
		
	}
	
	static int suma(int a, int b, int c) {
		return cambiarValor(a) + cambiarValor(b) + cambiarValor(c);
	}
	
	static int cambiarValor(int n) {
		if (n >= 13 && n <= 19 && n != 15 && n != 16)
			return 0;
		else
			return n;
	}
	
	static int blackjack(int a, int b) {
		int da = 21 - a;
		int db = 21 - b;
		if (da < 0 && db < 0)
			return 0;
		else if (db < 0 || (da > 0 && da < db ))
			return a;
		else
			return b;
//		else if (db >= 0 && (da <= 0 || da >= db))
//			return b;
//		else
//			return a;
	}

}
