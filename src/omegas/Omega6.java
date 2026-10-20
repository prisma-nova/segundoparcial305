package omegas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Omega6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
		
		double b=in.nextDouble();
		double a=in.nextDouble();
		
		double areaT=(b*a)/2;
		
		String red = df.format(areaT); 
		
        System.out.println(red);

	}

}

