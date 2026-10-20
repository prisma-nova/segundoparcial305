package segundoparcial;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablas {

	private JFrame frmTablasDeMultiplicar;
	private JTextField txtNumero;
	private JTextArea txtResultado;
	private JButton btnDel;

	
	public static void main(String[] args) {
		
					Tablas window = new Tablas();
					window.frmTablasDeMultiplicar.setVisible(true);
				
			}
		
	

	public Tablas() {
		initialize();
	}
	
	public void calcularTabla() {
		try {
			int n=Integer.parseInt(txtNumero.getText().toString());
			
			txtResultado.setText(
					n+" x "+" 1 = "+(n*1)+"\n"+
					n+" x "+" 2 = "+(n*2)+"\n"+
					n+" x "+" 3 = "+(n*3)+"\n"+
					n+" x "+" 4 = "+(n*4)+"\n"+
					n+" x "+" 5 = "+(n*5)+"\n"+
					n+" x "+" 6 = "+(n*6)+"\n"+
					n+" x "+" 7 = "+(n*7)+"\n"+
					n+" x "+" 8 = "+(n*8)+"\n"+
					n+" x "+" 9 = "+(n*9)+"\n"+
					n+" x "+" 10 = "+(n*10));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo salio mal");
		}
		
	}

	
	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\oak_door.png"));
		frmTablasDeMultiplicar.setTitle("Tablas de multiplicar");
		frmTablasDeMultiplicar.setBounds(100, 100, 427, 457);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumero.setBounds(23, 29, 96, 23);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(99, 33, 144, 20);
		frmTablasDeMultiplicar.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnVer = new JButton("Ver");
		btnVer.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularTabla();
			}
		});
		btnVer.setBounds(253, 31, 68, 20);
		frmTablasDeMultiplicar.getContentPane().add(btnVer);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Determination", Font.BOLD, 18));
		txtResultado.setEditable(false);
		txtResultado.setBounds(23, 73, 374, 285);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		btnDel = new JButton("Del..");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumero.setText("");
				txtResultado.setText("");
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDel.setBounds(331, 31, 68, 20);
		frmTablasDeMultiplicar.getContentPane().add(btnDel);
		
		
		
		
	}
}
