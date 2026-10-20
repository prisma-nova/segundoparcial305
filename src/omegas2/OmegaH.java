package omegas2;

import java.util.Scanner;

public class OmegaH {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		if (n<18) {
			System.out.println("MENOR DE EDAD");
		} else {
			System.out.println("MAYOR DE EDAD");
		}

	}

}
