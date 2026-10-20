package segundoparcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Toolkit;

public class Tablas3 {

	private JFrame frmTablasDeMultiplicar;
	JScrollBar sclNumero;
	JLabel lblNumero;
	JTextArea txtResultado;
	JButton btnBorrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablas3 window = new Tablas3();
					window.frmTablasDeMultiplicar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablas3() {
		initialize();
	}
	
	public void calcularTabla() {
		try {
			int n=sclNumero.getValue();		
			
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTablasDeMultiplicar = new JFrame();
		frmTablasDeMultiplicar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\birch_door.png"));
		frmTablasDeMultiplicar.setTitle("Tablas de multiplicar 3");
		frmTablasDeMultiplicar.setBounds(100, 100, 459, 366);
		frmTablasDeMultiplicar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTablasDeMultiplicar.setLocationRelativeTo(null);
		frmTablasDeMultiplicar.getContentPane().setLayout(null);
		
		sclNumero = new JScrollBar();
		sclNumero.setMaximum(110);
		sclNumero.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lblNumero.setText(""+sclNumero.getValue());
				calcularTabla();
			}
		});
		sclNumero.setOrientation(JScrollBar.HORIZONTAL);
		sclNumero.setBounds(10, 10, 350, 41);
		frmTablasDeMultiplicar.getContentPane().add(sclNumero);
		
		lblNumero = new JLabel("0");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNumero.setBounds(370, 10, 56, 41);
		frmTablasDeMultiplicar.getContentPane().add(lblNumero);
		
		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Determination", Font.BOLD, 18));
		txtResultado.setBackground(new Color(255, 255, 128));
		txtResultado.setBounds(10, 67, 327, 252);
		frmTablasDeMultiplicar.getContentPane().add(txtResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sclNumero.setValue(0);
				lblNumero.setText("0");
				txtResultado.setText("");
			}
		});
		btnBorrar.setBounds(347, 67, 84, 33);
		frmTablasDeMultiplicar.getContentPane().add(btnBorrar);
	}
}
