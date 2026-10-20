package omegas2;

import java.util.Scanner;

public class OmegaY {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		if (n>2 && n<6) {
			System.out.println("PRIMAVERA");
		} else if (n<9 && n>5) {
			System.out.println("VERANO");
		} else if (n<12 && n>8) {
			System.out.println("OTONIO");
		} else if (n<3 || n==12) {
			System.out.println("INVIERNO");
		} else {
			System.out.println("ERROR");
		}
		

	}

}
