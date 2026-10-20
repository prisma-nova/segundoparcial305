package segundoparcial;

import java.util.Scanner;

public class ProyectoMate {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean salir=false;
		
		do {
			
			System.out.println("°ᡣ𐭩.° .જ⁀➴ Proyecto Matematicas Segundo Parcial °ᡣ𐭩.° .જ⁀➴");
			System.out.println("1. — ✧ Línea\n2. — ✧ Cuadro\n3. — ✧ Rectángulo\n4. — ✧ Triángulos\n5. — ✧ Cuadro Contorno\n6. — ✧ Rombo\n7. — ✧ Rombo Contorno\n8. — ✧ Flecha\n9. — ✧ Árbol Navideño\n0. — ✧ Salir");
			int op=in.nextInt();
			
			switch (op) {
			
			
			
			
			case 0:
				System.out.println("— ✧ Cerrando programa...\nAdios");
				salir=true;
				break;
				
				default:
					System.out.println("Elije una opcion valida");
				
				
			}
		
		
		} while (!salir);

	}

}
