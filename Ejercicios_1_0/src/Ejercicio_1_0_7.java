import java.util.Scanner;

public class Ejercicio_1_0_7 {

	public static void main(String[] args) {

		float num1, num2, suma = 0;
		float ni�os, ni�as;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Dime el numero de niños");
		num1 = leer.nextInt();

		System.out.println("Dime el numero de niñas");
		num2 = leer.nextInt();

		suma = num1 + num2;

		ni�os = (num1 / suma) * 100;
		ni�as = (num2 / suma) * 100;

		System.out.println("El porcentaje de niñós son " + ni�os);
		System.out.println("El porcentaje de niñas son " + ni�as);

	}

}
