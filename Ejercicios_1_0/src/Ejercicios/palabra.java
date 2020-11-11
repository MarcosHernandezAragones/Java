package Ejercicios;

import java.util.Scanner;

public class palabra {

	public static void main(String[] args) {

		String frase = "", palabra = "";

		int cont = 0;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Escribe tu frase");
		frase = leer.next();
		
		System.out.println("Escribe tu palabra");
		palabra = leer.next();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.substring(i,i+frase.length())==palabra && frase.substring(i-1,i-1)==" " || frase.substring(i+frase.length(),i+frase.length())==palabra && frase.substring(i-1,i-1)==" " || frase.substring(i+frase.length(),i+frase.length())==palabra && frase.substring(i+frase.length()==" ",i+frase.length()==" ") || frase.substring(i+frase.length(),i+frase.length()=="")) {
				cont=cont+1;
			}
		}

		System.out.println("palabra "+ palabra + cont + " veces ");
	}

}
