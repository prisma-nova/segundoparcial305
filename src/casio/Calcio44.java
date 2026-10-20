package casio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;


public class Calcio44 {

	private JFrame frame;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcio44 window = new Calcio44();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calcio44() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Calcio44.class.getResource("/casio/calc.png")));
		frame.setTitle("⊹₊ ˚‧︵‿₊୨ Calculadora V4.0 ୧₊‿︵‧ ˚ ₊⊹");
		frame.setBounds(100, 100, 537, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);

		
		JLabel lblN1 = new JLabel("Numero 1:");
		lblN1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblN1.setBounds(67, 58, 105, 22);
		frame.getContentPane().add(lblN1);

		
		JLabel lblN2 = new JLabel("Numero 2:");
		lblN2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblN2.setBounds(67, 95, 118, 32);
		frame.getContentPane().add(lblN2);

		
		txtN1 = new JTextField();
		txtN1.setBounds(211, 58, 105, 24);
		frame.getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(211, 102, 105, 25);
		frame.getContentPane().add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblResult = new JLabel("Resultados");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblResult.setBounds(67, 216, 398, 91);
		frame.getContentPane().add(lblResult);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double n1=Double.parseDouble(txtN1.getText());
					double n2=Double.parseDouble(txtN2.getText());
					lblResult.setText("Suma: "+(n1+n2));
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Algo salio mal","ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSuma.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnSuma.setBounds(20, 170, 97, 32);
		frame.getContentPane().add(btnSuma);
		

		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double n1=Double.parseDouble(txtN1.getText());
					double n2=Double.parseDouble(txtN2.getText());
					lblResult.setText("Resta: "+(n1-n2));
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Algo salio mal","ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnResta.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnResta.setBounds(139, 170, 105, 32);
		frame.getContentPane().add(btnResta);
		
		JButton btnMulti = new JButton("Multi");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double n1=Double.parseDouble(txtN1.getText());
					double n2=Double.parseDouble(txtN2.getText());
					lblResult.setText("Multiplicación: "+(n1*n2));
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Algo salio mal","ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnMulti.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnMulti.setBounds(265, 170, 104, 32);
		frame.getContentPane().add(btnMulti);
		
		JButton btnDivi = new JButton("División");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DecimalFormat df = new DecimalFormat("#.00");
					double n1=Double.parseDouble(txtN1.getText());
					double n2=Double.parseDouble(txtN2.getText());
					double resDiv=n1/n2;
					
					String red = df.format(resDiv); 
					
					JOptionPane.showMessageDialog(null, red);
					lblResult.setText("División: "+red);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Algo salio mal","ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnDivi.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		btnDivi.setBounds(389, 170, 104, 34);
		frame.getContentPane().add(btnDivi);
		
		


		
	}
}
