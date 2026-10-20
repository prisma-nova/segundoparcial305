package casio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calcio1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("⊹₊ ˚‧︵‿₊୨ Calculadora V1.0 ୧₊‿︵‧ ˚ ₊⊹");
		System.out.println("Numero 1: ");
		double n1=in.nextDouble();
		System.out.println("Numero 2: ");
		double n2=in.nextDouble();
		
		String red = df.format(n1/n2);
		
		System.out.println("Suma:˖˚⊹ ꣑‎"+(n1+n2)+"ৎ‎");
		System.out.println("Resta:˖˚⊹ ꣑‎"+(n1-n2)+"ৎ‎");
		System.out.println("Multiplicación:˖˚⊹ "+(n1*n2)+"ৎ‎");
		System.out.println("División:˖˚⊹ "+(red)+"ৎ‎");
		System.out.println("⊹₊ ˚‧︵‿₊୨ Calculadora V1.0 ୧₊‿︵‧ ˚ ₊⊹");

	}

}

