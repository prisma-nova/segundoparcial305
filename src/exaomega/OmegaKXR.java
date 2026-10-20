package exaomega;

import java.util.Scanner;

public class OmegaKXR {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.nextLine();
		String orden=in.nextLine();
		int A = 0;
		int B = 0;
		int C = 0;
		if (a > b && a > c) {
			if (c > b) {
				A = b;
				B = c;
				C = a;
			} else {
				A = c;
				B = b;
				C = a;
			}
		}

		if (b > c && b > a) {
			if (a > c) {
				A = c;
				B = a;
				C = b;
			} else {
				A = a;
				B = c;
				C = b;
			}
		}
		if (c > a && c > b) {
			if (a > b) {
				A = b;
				B = a;
				C = c;

			} else {
				A = a;
				B = b;
				C = c;
			}
		}
		if(orden.charAt(0)=='A') {
			System.out.print(A+" ");
		}
		if(orden.charAt(0)=='B') {
			System.out.print(B+" ");
		}
		
		if(orden.charAt(0)=='C') {
			System.out.print(C+" ");
		}
		if(orden.charAt(1)=='A') {
			System.out.print(A+" ");
		}
		if(orden.charAt(1)=='B') {
			System.out.print(B+" ");
		}
		
		if(orden.charAt(1)=='C') {
			System.out.print(C+" ");
		}
		if(orden.charAt(2)=='A') {
			System.out.print(A+" ");
		}
		if(orden.charAt(2)=='B') {
			System.out.print(B+" ");
		}
		
		if(orden.charAt(2)=='C') {
			System.out.print(C+" ");
		}
		
		

	}

}