import java.util.Scanner;

public class Ejercicio_1_0_7 {

	public static void main(String[] args) {

		float num1, num2, suma = 0;
		float niños, niñas;

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		// Pedir por pantalla
		System.out.println("Dime el numero de niÃ±os");
		num1 = leer.nextInt();

		System.out.println("Dime el numero de niÃ±as");
		num2 = leer.nextInt();

		suma = num1 + num2;

		niños = (num1 / suma) * 100;
		niñas = (num2 / suma) * 100;

		System.out.println("El porcentaje de niÃ±Ã³s son " + niños);
		System.out.println("El porcentaje de niÃ±as son " + niñas);

	}

}
