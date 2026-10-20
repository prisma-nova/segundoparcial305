package omegas2;

import java.util.Scanner;

public class OmegaZ {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		
		if (a>b && a>c) {
			if (b>c) {
				System.out.println(c);
				System.out.println(a);
			} else {
				System.out.println(b);
				System.out.println(a);
			}
			
		} else if (b>a && b>c) {
			if (a>c) {
				System.out.println(c);
				System.out.println(b);
			} else {
				System.out.println(a);
				System.out.println(b);
			}
			
		} else if (c>b && c>a) {
			if (b>a) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(b);
				System.out.println(c);
			}
			
		}

	}
}
