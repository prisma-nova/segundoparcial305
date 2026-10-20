package casio;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class Calcio3 {

	public static void main(String[] args) {
		try {
			DecimalFormat df = new DecimalFormat("#.00");
			JOptionPane.showMessageDialog(null, "Bienvenido a\n⊹₊ ˚‧︵‿₊୨ Calculadora V3.0 ୧₊‿︵‧ ˚ ₊⊹","˖˚⊹Calculadora V3ৎ‎",  JOptionPane.PLAIN_MESSAGE);
			double n1=Double.parseDouble(JOptionPane.showInputDialog("Numero 1: "));
			double n2=Double.parseDouble(JOptionPane.showInputDialog("Numero 2: "));
			double d=n1/n2;
			String red = df.format(d);
			JOptionPane.showMessageDialog(null, "Suma:˖˚⊹ ꣑‎"+(n1+n2)+"‎\nResta:˖˚⊹ ꣑‎"+(n1-n2)+"ৎ‎\nMultiplicación:˖˚⊹ "+(n1*n2)+"ৎ‎\nDivisión:˖˚⊹ "+red+"ৎ‎","⊹₊ ˚‧︵‿₊୨Resultados୧₊‿︵‧ ˚ ₊⊹", JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo salio mal","ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}

}

