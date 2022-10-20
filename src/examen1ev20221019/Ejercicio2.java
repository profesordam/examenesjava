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
		System.out.println("25, 22 -> " + blackjack(25, 22));
		
	}
	
//	static int suma(int a, int b, int c) {
//		if (a >= 13 && a <= 19 && a != 15 && a != 16)
//			a = 0;
//		if (b >= 13 && b <= 19 && b != 15 && b != 16)
//			b = 0;
//		if (c >= 13 && c <= 19 && c != 15 && c != 16)
//			c = 0;
//		return a + b + c;
//	}
	
	static int suma(int a, int b, int c) {
		return cambiarValor(a) + cambiarValor(b) + cambiarValor(c);
	}
	
	static int cambiarValor(int n) {
		return n >= 13 && n <= 19 && n != 15 && n != 16 ? 0 : n;
//		if (n >= 13 && n <= 19 && n != 15 && n != 16)
//			return 0;
//		else
//			return n;
	}
	
	static int blackjack(int a, int b) {
		if(a>21)a=-1;
		if(b>21)b=-1;
		int r = ((21-b)>(21-a) ? a : b);
		return r < 0 ? 0 : r;
	}
	
//	static int blackjack(int a, int b) {
//		if (a > 21 && b > 21)
//			return 0;
//		else if (b > 21 || (a <= 21 && a > b))
//			return a;
//		else 
//			return b;
//	}
	
	

}
