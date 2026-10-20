package segundoparcial;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablas2 {

	private JFrame frmTablasDeMultiplicar;
	private JTextArea txtResultado;
	private JSlider sldNumero;
	private JLabel lblNumero;
	private JButton btnBorrar;

	
	public static void main(String[] args) {
		
					Tablas2 window = new Tablas2();
					window.frmTablasDeMultiplicar.setVisible(true);
				
			}
	

	
	public Tablas2() {
		initialize();
	}
	
	public void calcularTabla() {
		try {
			int n=sldNumero.getValue();		
			
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
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\bamboo_door.png"));
		frmTablasDeMultiplicar.setTitle("Tablas de multiplicar 2");
		frmTablasDeMultiplicar.setBounds(100, 100, 496, 390);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumero.setBounds(332, 22, 46, 28);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		txtResultado = new JTextArea();
		txtResultado.setFont(new Font("Determination", Font.BOLD, 18));
		txtResultado.setBackground(new Color(128, 128, 255));
		txtResultado.setEditable(false);
		txtResultado.setBounds(22, 79, 361, 244);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		sldNumero = new JSlider();
		sldNumero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumero.setText(""+sldNumero.getValue());
				calcularTabla();
			}
		});
		sldNumero.setMajorTickSpacing(10);
		sldNumero.setPaintTicks(true);
		sldNumero.setValue(0);
		sldNumero.setSnapToTicks(true);
		sldNumero.setPaintLabels(true);
		sldNumero.setBounds(22, 22, 288, 47);
		frmTablasDeMultiplicar.getContentPane().add(sldNumero);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldNumero.setValue(0);
				lblNumero.setText("0");
				txtResultado.setText("");
			}
		});
		btnBorrar.setBounds(376, 28, 84, 20);
		frmTablasDeMultiplicar.getContentPane().add(btnBorrar);
		
	
	}
}
