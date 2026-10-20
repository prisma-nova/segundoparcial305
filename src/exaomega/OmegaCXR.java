package exaomega;

import java.util.Scanner;

public class OmegaCXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int res=0;
		
		for (int i=0; i<n; i++) {
			int a=in.nextInt();
			if (a==8) {
				res=1;
			}
		}
		
		System.out.println(res);
		


	}

}
