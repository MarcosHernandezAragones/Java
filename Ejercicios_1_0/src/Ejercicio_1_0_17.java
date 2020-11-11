import java.util.Scanner;

public class Ejercicio_1_0_17 {

	public static void main(String[] args) {

		float num1, max, min, suma=0, contador=0, media=0;

		System.out.println("Dime una serie de numero y cuando escribas cero te dire cual es el maximo, el minimo y la media");

		// leer por teclado
		Scanner leer = new Scanner(System.in);

		num1 = leer.nextFloat();

		
		min=num1;
		max=num1;
		
		while (num1!=0) {
			
			if (num1>max) {
				max=num1;
			}
			
			if (num1<min) {
				min=num1;
			}
			
			suma=suma+num1;
			contador=contador+1;
			
			System.out.println("Escribe tu Número");
			num1 = leer.nextFloat();
		}
		
		media=suma/contador;
		
		System.out.println("El maximo es "+max);
		System.out.println("El minimo es "+min);
		System.out.println("La media es "+media);
		
	}

}
