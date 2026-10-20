package exaomega;

import java.util.Scanner;

public class OmegaBXR {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int d=in.nextInt();
		int m=in.nextInt();
		
		switch (m) {
		
		case 1:
			if (d>19) {
				System.out.println("Acuario");
			} else {
				System.out.println("Capricornio");
			}
			System.out.println("Invierno");
			break;
			
		case 2:
			if (d>18) {
				System.out.println("Piscis");
			} else {
				System.out.println("Acuario");
			}
			System.out.println("Invierno");
			break;
			
		case 3:
			if (d>20) {
				System.out.println("Aries");
				System.out.println("Primavera");
			} else {
				System.out.println("Piscis");
				System.out.println("Invierno");
			}
			
			break;
			
		case 4:
			if (d>19) {
				System.out.println("Tauro");
			} else {
				System.out.println("Aries");
			}
			System.out.println("Primavera");
			break;
			
		case 5:
			if (d>20) {
				System.out.println("Geminis");
			} else {
				System.out.println("Tauro");
			}
			System.out.println("Primavera");
			break;
			
		case 6:
			if (d>20) {
				System.out.println("Cancer");
				System.out.println("Verano");
			} else {
				System.out.println("Geminis");
				System.out.println("Primavera");
			}
			break;
			
		case 7:
			if (d>22) {
				System.out.println("Leo");
			} else {
				System.out.println("Cancer");
			}
			System.out.println("Verano");
			break;
			
		case 8:
			if (d>22) {
				System.out.println("Virgo");
			} else {
				System.out.println("Leo");
			}
			System.out.println("Verano");
			break;
			
		case 9:
			if (d>22) {
				System.out.println("Libra");
			} else {
				System.out.println("Virgo");
			}
			if (d<21) {
				System.out.println("Verano");
			} else {
				System.out.println("Otono");
			}
			
			break;
			
		case 10:
			if (d>22) {
				System.out.println("Escorpion");
			} else {
				System.out.println("Libra");
			}
			System.out.println("Otono");
			break;
			
		case 11:
			if (d>21) {
				System.out.println("Sagitario");
			} else {
				System.out.println("Escorpion");
			}
			System.out.println("Otono");
			break;
			
		case 12:
			if (d>21) {
				System.out.println("Capricornio");
			} else {
				System.out.println("Sagitario");
			}
			if (d<21) {
				System.out.println("Otono");
			} else {
				System.out.println("Invierno");
			}
			
			break;
			
			default:
				break;
			
		}


	}

}
