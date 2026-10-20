package omegas2;

import java.util.Scanner;

public class OmegaK {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		
		if (l<4) {
			System.out.println("BEBE");
		}else if (l<15) {
			System.out.println("NINO");
		}else if (l<19) {
			System.out.println("JOVEN");
		}else if (l<66) {
			System.out.println("ADULTO");
		}else if (l>65) {
			System.out.println("ADULTO 3RA");
		}
	}

}