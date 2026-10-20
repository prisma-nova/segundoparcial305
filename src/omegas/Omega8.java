package omegas;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Omega8 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");
		int cal=in.nextInt();
		int cal2=in.nextInt();
		int cal3=in.nextInt();
		int cal4=in.nextInt();
		int cal5=in.nextInt();
		
		double suma=cal+cal2+cal3+cal4+cal5;
		double prom=(suma)/5;
		
		String red = df.format(prom); 
		
        System.out.println(red);

	}

}

