package omegas2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OmegaM {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
		int n=in.nextInt();
		
		switch (n) {
		case 0:
			float baseMayor=in.nextFloat();
			float baseMenor=in.nextFloat();
			float altura=in.nextFloat();
			
			double temp=((baseMayor+baseMenor)*altura)/2;
			String areaTrapecio = df.format(temp);
			
			System.out.println("Trapecio");
			System.out.println(areaTrapecio);
			
			break;
		case 1:
			float base=in.nextFloat();
			altura=in.nextFloat();
			
			temp=(base*altura)/2;
			String areaTriangulo = df.format(temp);
			
			System.out.println("Triangulo");
			System.out.println(areaTriangulo);
			
			break;
		case 2:
			float lado=in.nextFloat();
			
			temp=lado*lado;
			String areaCuadrado = df.format(temp);
			
			System.out.println("Cuadrado");
			System.out.println(areaCuadrado);
			
			break;
			
		case 3:
			base=in.nextFloat();
			altura=in.nextFloat();
			
			temp=base*altura;
			String areaRectangulo = df.format(temp);
			
			System.out.println("Rectangulo");
			System.out.println(areaRectangulo);
			
			break;
			
		case 4:
			float radio=in.nextFloat();
			
			temp=3.1416*(radio*radio);
			String areaCirculo = df.format(temp);
			
			System.out.println("Circulo");
			System.out.println(areaCirculo);
			
			
			break;
			
			default:
				System.out.println("Figura no valida");
				break;
		}

	}

}
