package arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int suma = 0;
		long multi = 1;
		int sumaPar=0;
		int sumaImpar=0;
		
		System.out.println("Ingresa tamaño del array");
		int n=in.nextInt();
	
		int array1[] = new int[n];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = in.nextInt();
		}

		System.out.println(" . ˙— Normales");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Array1[" + i + "] => " + array1[i]);
			suma += array1[i];
			multi *= array1[i];
			if (array1[i]%2==0) {
				sumaPar+=array1[i];
			} else {
				sumaImpar+=array1[i];
			}
		}

		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = 0; j < array1.length - i - 1; j++) {
				if (array1[j] > array1[j + 1]) {

					int temp = array1[j];
					array1[j] = array1[j + 1];
					array1[j + 1] = temp;
				}
			}
		}
		
		// suma
		System.out.println("Suma = " + suma);
		System.out.println("Multi = " + multi);

		System.out.println("\n\n . ˙— Sorteados");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]+" ");
		}
		
		System.out.println("\n\n . ˙— Sorteados: Al reves");
		for (int i = array1.length-1; i >=0; i--) {
			System.out.print(array1[i]+" ");
		}

		System.out.println("\n\nMayor : "+array1[array1.length-1]);
		System.out.println("Menor : "+array1[0]);


		System.out.println("\nSuma Impares : "+sumaImpar);
		System.out.println("Suma Pares : "+sumaPar);

	}

}
