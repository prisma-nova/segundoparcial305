package omegas2;

import java.util.Scanner;

public class OmegaX {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int alto=in.nextInt();
		int ancho=in.nextInt();
		
		for (int i=0; i<ancho; i++) {
			System.out.print("* ");
		}
		System.out.println("");
		
		
		for (int i=0; i<alto-2; i++) { //ALTO
			if (ancho>1) {
				System.out.print("*");
			}
			
			for (int j=0; j<ancho-2; j++) { //columnas
				System.out.print("  ");
			}
			System.out.println("*");
		}
		
		if (alto>1) {
			for (int i=0; i<ancho; i++) {
				System.out.print("* ");
			}
		}
		

	}

}
