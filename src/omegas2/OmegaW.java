package omegas2;

import java.util.Scanner;

public class OmegaW {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int a[]=new int[n];
		
		for (int i=0; i<n; i++) {
			a[i]=in.nextInt();
		}
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println(a[0]);

	}

}
