package exaomega;

import java.util.Scanner;

public class OmegaJXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int ck=0;
		
		
		for (int i=0; i<n; i++) {
			int num=in.nextInt();
			if (num==k) {
				ck+=1;
			}
		}
		
		System.out.println(ck);

	}

}
