package exaomega;

import java.util.Scanner;

public class OmegaOXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		int []a=new int[n];
	
		for (int i=0; i<n; i++) {
			a[i]=in.nextInt();
		}
		
		int k=in.nextInt();
		int ck=0;
		
		for (int i=0; i<n; i++) {
			if (a[i]==k) {
				ck+=1;
			}
		}
		
		
		System.out.println(ck);

	}

}
