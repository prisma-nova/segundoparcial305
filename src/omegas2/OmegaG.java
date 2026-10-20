package omegas2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OmegaG {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		double h=in.nextDouble();
		double p=in.nextDouble();
	
		String red = df.format(p/(h*h));
		double imc=Double.parseDouble(red);
		System.out.println(imc);
		
		if (imc<18.50) {
			System.out.println("Infra Peso");
		}else if (imc<25) {
			System.out.println("Peso normal");
		}else if (imc<30) {
			System.out.println("Sobre Peso");
		}else if (imc<35) {
			System.out.println("Obesidad Leve");
		}else if (imc<40) {
			System.out.println("Obesidad Media");
		}else if (imc>39.99) {
			System.out.println("Obesidad Morbida");
		}
		
		
	}

}
