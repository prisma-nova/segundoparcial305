package omegas2;

import java.util.Scanner;

public class OmegaP {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		if (n==m) {
			System.out.println("iguales");
		} else if (n>m) {
			System.out.println("mayor");
		} else {
			System.out.println("menor");
		}
	}

}
