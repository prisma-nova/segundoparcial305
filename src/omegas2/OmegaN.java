package omegas2;

import java.util.Scanner;

public class OmegaN {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double c=in.nextInt();
		double k=c+273.15;
		double f=(c*1.8)+32;
		double r=c*0.8;
			
		System.out.print((int)k+" "+(int)f+" "+(int)r+" ");
		}

	}


