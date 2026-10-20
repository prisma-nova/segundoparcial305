package omegas2;

import java.util.Scanner;

public class OmegaL {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();

		for (int i=0; i<n; i++) { 
			for (int j=0; j<m; j++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
