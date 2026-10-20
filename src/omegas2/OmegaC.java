package omegas2;

import java.util.Scanner;

public class OmegaC {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		
		if (a<18) {
			System.out.println("joven");
		} else {
			System.out.println("adulto");
		}

	}

}
