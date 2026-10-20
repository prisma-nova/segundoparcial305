package omegas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Omega3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		double cal=in.nextDouble();
		double cal2=in.nextDouble();
		double cal3=in.nextDouble();
		double cal4=in.nextDouble();
		double cal5=in.nextDouble();
		double cal6=in.nextDouble();
		double cal7=in.nextDouble();
		
		double prom=(cal+cal2+cal3+cal4+cal5+cal6+cal7)/7;
		
		String red = df.format(prom); 
		
        System.out.println(red);

	}

}

