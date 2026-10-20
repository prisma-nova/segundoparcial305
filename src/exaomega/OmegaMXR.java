package exaomega;

import java.util.Scanner;

public class OmegaMXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int []a=new int[n];
	
		for (int i=0; i<n; i++) {
			a[i]=in.nextInt();
		}
		
		int k=in.nextInt();
		
		for (int i=k; i<n; i++) {
			System.out.print(a[i]+" ");
		}


	}

}
