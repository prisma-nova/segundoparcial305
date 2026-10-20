package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); System.out.println("Ingresa el ancho");
		 * int n = in.nextInt(); System.out.println("Ingresa el alto"); int m =
		 * in.nextInt();
		 * 
		 * int matrix[][] = new int[m][n];
		 * 
		 * for (int i = 0; i < m; i++) { for (int j = 0; j < n; j++) { matrix[i][j] =
		 * in.nextInt(); } }
		 * 
		 * for (int i = 0; i < m; i++) { for (int j = 0; j < n; j++) {
		 * System.out.print(matrix[i][j] + " "); } System.out.println(""); }
		 */

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Ingresa el ancho de Strings");
			int n = Integer.parseInt(in.readLine());

			System.out.println("Ingresa el alto de Strings");
			int m = Integer.parseInt(in.readLine());

			String matrix[][] = new String[m][n];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = in.readLine();
				}
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println("");

			}
		}

		catch (IOException e) {

			JOptionPane.showMessageDialog(null,"Algo salio mal", "ERROR", JOptionPane.ERROR_MESSAGE);
		}

		

	}
}
