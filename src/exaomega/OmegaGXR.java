package exaomega;

import java.util.Scanner;

public class OmegaGXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int mayor=0;
		
		for (int i=0; i<n; i++) {
			int ed=in.nextInt();
			if (ed>mayor) {
				mayor=ed;
			}
		}
		
		System.out.println(mayor);


	}

}
