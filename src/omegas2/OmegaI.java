package omegas2;

import java.util.Scanner;

public class OmegaI {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double h=in.nextDouble();
		
		if (h>1.70) {
			System.out.println("Aceptado");
		} else {
			System.out.println("Rechazado");
		}

	}

}
