package omegas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Omega5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int r=in.nextInt();
		
		double areaC=3.1416*(r*r);
		
		String red = df.format(areaC); 
		
        System.out.println(red);
		
	}

}

