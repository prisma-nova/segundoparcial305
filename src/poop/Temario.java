package poop;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Temario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("✴︎𓊆 𓊇˳✧༚ Signo del zodiaco ✴︎𓊆 𓊇˳✧༚");
		System.out.println("ᐝ꙳𓇣-Ingresa tu dia de nacimiento");
		int dia = in.nextInt();

		System.out.println("ᐝ꙳𓇣-Ingresa tu mes de nacimiento");
		int mes = in.nextInt();

		String signo = "";

		switch (mes) {

		case 1:
			signo = dia >= 20 ? "♒︎ Acuario" : "♑︎ Capricornio";
			break;

		case 2:
			signo = dia >= 19 ? "♓︎ Piscis" : "♒︎ Acuario";
			break;

		case 3:
			signo = dia >= 21 ? "♈︎ Aries" : "♓︎ Piscis";
			break;

		case 4:
			signo = dia >= 20 ? "♉︎ Tauro" : "♈︎Aries";
			break;

		case 5:
			signo = dia >= 21 ? "♊︎ Geminis" : "♉︎ Tauro";
			break;

		case 6:
			signo = dia >= 21 ? "♋︎ Cancer" : "♊︎ Geminis";
			break;

		case 7:
			signo = dia >= 23 ? "♌︎ Leo" : "♋︎ Cancer";
			break;

		case 8:
			signo = dia >= 23 ? "♍︎ Virgo" : "♌︎ Leo";
			break;

		case 9:
			signo = dia >= 23 ? "♎︎ Libra" : "♍︎ Virgo";
			break;

		case 10:
			signo = dia >= 23 ? "♏︎ Escorpio" : "♎︎ Libra";
			break;

		case 11:
			signo = dia >= 22 ? "♐︎ Sagitario" : "♏︎ Escorpio";
			break;

		case 12:
			signo = dia >= 22 ? "♑︎ Capricornio" : "♐︎ Sagitario";
			break;

		default:
			JOptionPane.showMessageDialog(null, "Algo salio mal", "ERROR", JOptionPane.ERROR_MESSAGE);
			break;
		}

		System.out.println("\nᐝ꙳𓇣-Tu signo es: " + signo);
	}

}
