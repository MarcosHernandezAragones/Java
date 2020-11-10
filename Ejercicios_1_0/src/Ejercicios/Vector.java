package Ejercicios;

import java.util.Random;

public class Vector {

	public static void main(String[] args) {
		int vNum[];
		int mNum[][];
		int tam = 10;

		String vNombre[];

		vNum = new int[10];
		vNombre = new String[tam];
		mNum = new int[5][5];

		vNum[0] = 1;
		vNum[9] = 10;

		Random r = new Random();

		for (int i = 0; i < mNum.length; i++) {

			for (int j = 0; j < mNum[i].length; j++) {
				mNum[i][j] = r.nextInt(9);

			}

		}

		for (int i = 0; i < mNum.length; i++) {

			for (int j = 0; j < mNum[i].length; j++) {
				System.out.print(mNum[i][j] + " ");
			}
			System.out.println("");
		}

		/*
		 * for (int i = 0; i < vNum.length; i++) { System.out.println(vNum[i]); }
		 * 
		 * for (int i = 0; i < vNombre.length; i++) { if (vNombre[i]!=null) {
		 * System.out.println(vNombre[i].toUpperCase()); } }
		 */

	}

}
