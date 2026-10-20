package omegas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Omega10 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
		
		int a=in.nextInt();
		
		int b=in.nextInt();
		
		double t=(a*a)+(b*b);
		double c=Math.sqrt(t);
		
		String red = df.format(c); 
		
        System.out.println(red);	

	}

}

