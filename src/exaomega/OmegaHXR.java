package exaomega;

import java.util.Scanner;

public class OmegaHXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		int e=in.nextInt();
		
		int sumaJ=a+b+c;
		int sumaP=d+e;
		
		if (sumaJ>sumaP) {
			System.out.println("Juan");
		} else {
			System.out.println("Pedro");
		}


	}

}
