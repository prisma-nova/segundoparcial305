package omegas2;

import java.util.Scanner;

public class OmegaA {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		double x=in.nextDouble();
		double y=in.nextDouble();
		double z=in.nextDouble();
		
		double parentesis1=((x*2)+y)/z;
		double parentesis2=((y*y*y)-z);
		double divi1=(x+(2*y)+(3*z))/(z-(2*y)-(3*x));
		double denominador=divi1+(x*x)+(z*z);
		
		double resultado=(parentesis1*parentesis2)/denominador;
		
		System.out.println(resultado);

	}

}
