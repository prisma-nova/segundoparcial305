package casio;

import java.util.Scanner;

public class Calcio2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("⊹₊ ˚‧︵‿₊୨ Calculadora V2.0 ୧₊‿︵‧ ˚ ₊⊹");
		System.out.println("Numero 1: ");
		double n1=in.nextDouble();
		System.out.println("Numero 2: ");
		double n2=in.nextDouble();
		
		Operaciones o=new Operaciones(n1, n2);
		
		System.out.println("Suma:˖˚⊹ ꣑‎"+o.sumaNumeros()+"ৎ‎");
		System.out.println("Resta:˖˚⊹ ꣑‎"+o.restaNumeros()+"ৎ‎");
		System.out.println("Multiplicación:˖˚⊹ "+o.multiNumeros()+"ৎ‎");
		System.out.println("División:˖˚⊹ "+o.diviNumeros()+"ৎ‎");
		System.out.println("⊹₊ ˚‧︵‿₊୨ Calculadora V2.0 ୧₊‿︵‧ ˚ ₊⊹");

	}

}

