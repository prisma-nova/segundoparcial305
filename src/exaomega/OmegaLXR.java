package exaomega;

import java.util.Scanner;

public class OmegaLXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		
		for (int i=0; i<n; i++) {
			a[i]=in.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			b[i]=in.nextInt();
		}
		
		int res=0;
		
		for (int i=0; i<n; i++) {
			res=(b[i]*a[i])+res;
		}

		System.out.println(res);

	}

}
