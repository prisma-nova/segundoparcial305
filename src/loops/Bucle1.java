package loops;

import java.util.Scanner;

public class Bucle1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean salir=false;
		
		do {
			
			System.out.println("\n\n\n\n°ᡣ𐭩.° .જ⁀➴ Figuras: MENU °ᡣ𐭩.° .જ⁀➴");
			System.out.println("1. — ✧ Línea\n2. — ✧ Cuadro\n3. — ✧ Rectángulo\n4. — ✧ Triángulos\n5. — ✧ Cuadro Contorno\n6. — ✧ Rombo\n7. — ✧ Rombo Contorno\n8. — ✧ Flecha\n9. — ✧ Árbol Navideño\n0. — ✧ Salir");
			int op=in.nextInt();
			
			switch (op) {
			
			case 1: 
				System.out.println("\n°ᡣ𐭩.° .જ⁀➴ LÍNEA °ᡣ𐭩.° .જ⁀➴");
				int n=in.nextInt();
				
				System.out.println("\n✶◟# ⁺ Con FOR ⁺ #◟✶\n");
				
				for (int i=0; i<n; i++) {
					System.out.print("✶ ");
				}
				
				System.out.println("\n\n\n✶◟# ⁺ Con WHILE ⁺ #◟✶\n");
				
				int i=0;
				while(i<n) {
					System.out.print("✶ ");
					i++;
				}
				
				System.out.println("\n\n\n✶◟# ⁺ Con DO WHILE ⁺ #◟✶\n");
				
				i=0;
				do {
					System.out.print("✶ ");
					i++;
					
				} while(i<n);
				break;
				
				
			case 2:
				System.out.println("\n\n\n°ᡣ𐭩.° .જ⁀➴ CUADRO ➴⁀જ. °.ᡣ𐭩°");
				
				int a=in.nextInt();
				
				
				System.out.println("\n✶◟# ⁺ Con FOR ⁺ #◟✶\n");
				
				for (i=0; i<a; i++) { //filas
					for (int j=0; j<a; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				
				System.out.println("\n\n\n✶◟# ⁺ Con WHILE ⁺ #◟✶\n");
				
				i=0;
				int j=0;
				while(i<a) {
					j=0;
					while(j<a) {
						System.out.print("✶ ");
						j++;
					}
					System.out.println("");
					i++;
				}
				break;
				
			case 3:
				System.out.println("\n\n\n✶◟# ⁺ Rectangulo ⁺ #◟✶\n");
				int ancho=in.nextInt();
				int alto=in.nextInt();

				for (i=0; i<ancho; i++) { //filas
					for (j=0; j<alto; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				break;
				
			case 4:
				System.out.println("\n\n\n✶◟# ⁺ Triangulo 1.0 ⁺ #◟✶\n");
				alto=in.nextInt();

				for (i=0; i<alto; i++) { //filas
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				
				System.out.println("\n\n\n✶◟# ⁺ Triangulo 2.0 ⁺ #◟✶\n");
				alto=in.nextInt();

				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i-1; j++) { //columnas
						System.out.print(" ");
					}
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				break;
				
			case 5:
				System.out.println("\n\n\n✶◟# ⁺ Cuadro CONTORNO ⁺ #◟✶\n");
				int lado=in.nextInt();
				
				for (i=0; i<lado; i++) {
					System.out.print("✶ ");
				}
				System.out.println("");
				
				for (i=0; i<lado-2; i++) { //filas
					System.out.print("✶ ");
					for (j=0; j<lado-2; j++) { //columnas
						System.out.print("  ");
					}
					System.out.println("✶ ");
				}
				
				for (i=0; i<lado; i++) {
					System.out.print("✶ ");
				}
				break;
				
			case 6:
				System.out.println("\n\n\n✶◟# ⁺ Rombo ⁺ #◟✶\n");
				alto=in.nextInt();
				
				//arriba
				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i; j++) { //columnas
						System.out.print(" ");
					}
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				
				//abajo
				for (i = 0; i < alto; i++) { //filas
					for (j = 0; j < i+1; j++) { //columnas
						System.out.print(" ");
					}
					for (j = 0; j < alto-i; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				break;
				
			case 7:
				System.out.println("\n\n\n✶◟# ⁺ Rombo CONTORNO ⁺ #◟✶\n");
				alto=in.nextInt();
				
				//arriba
				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i-1; j++) { //columnas
						System.out.print(" ");
					}
					System.out.print("✶ ");
					for (j=0; j<(i*2)-2; j++) { //columnas
						System.out.print(" ");
					}
					if (i>0) {
						System.out.println("✶ ");
					}
					if (i==0) {
						System.out.println("");
					}
				}
				
				//abajo
				for (i = 0; i < alto-1; i++) { //filas
					for (j = 0; j < i+1; j++) { //columnas
						System.out.print(" ");
					}
					System.out.print("✶ ");
					for (j = 0; j < ((alto-i-3)*2); j++) { //columnas
						System.out.print(" ");
					}
					if (i<alto-2) {
						System.out.println("✶ ");
					}
				}
				break;
			
			case 8:
				System.out.println("\n✶◟# ⁺ Flecha ⁺ #◟✶\n");
				alto=in.nextInt();

				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i-1; j++) { //columnas
						System.out.print(" ");
					}
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				
				for (i=0; i<alto; i++) {
					for (j=0; j<alto/3; j++) {
						System.out.print("  ");
					}
					for (j=0; j<alto/3+1; j++) {
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				break;
				
			case 9:
				System.out.println("\n✶◟# ⁺ Árbol ⁺ #◟✶\n");
				alto=in.nextInt();

				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i-1; j++) { //columnas
						System.out.print(" ");
					}
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i-1; j++) { //columnas
						System.out.print(" ");
					}
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				for (i=0; i<alto; i++) { //filas
					for (j=0; j<alto-i-1; j++) { //columnas
						System.out.print(" ");
					}
					for (j=0; j<i+1; j++) { //columnas
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				
				for (i=0; i<alto; i++) {
					for (j=0; j<alto/3; j++) {
						System.out.print("  ");
					}
					for (j=0; j<alto/3+1; j++) {
						System.out.print("✶ ");
					}
					System.out.println("");
				}
				break;
				
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

