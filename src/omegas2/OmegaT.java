package omegas2;

import java.util.Scanner;

public class OmegaT {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		
		if (a+b==5) {
			b=b+3;
			System.out.println((a*2)+b);
		} else {
			a=a-1;
			if (((7*a)+b)%2==0) {
				System.out.println(a-b);
			} else {
				System.out.println(a*b);
			}
		}
	}

}
