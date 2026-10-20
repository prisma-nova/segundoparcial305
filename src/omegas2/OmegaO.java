package omegas2;

import java.util.Scanner;

public class OmegaO {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int suma=0;
		
		for (int i=0; i<n; i++) {
			int x=in.nextInt();
			if (x==k) {
				suma++;
			}
		}
		System.out.println(suma);
		
		/*Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int sumando[] = new int[n];
		int a[] = new int[n * n]; 

		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        int valor = in.nextInt();
		        a[i * n + j] = valor; 
		        sumando[j] += valor;
		    }
		}
		
		for (short j=0; j<n; j++) {
			System.out.print(sumando[j]+" ");
		}*/
		

	}

}
