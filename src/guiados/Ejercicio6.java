package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio6 {

	public JFrame frmModelCombos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6 window = new Ejercicio6();
					window.frmModelCombos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModelCombos = new JFrame();
		frmModelCombos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\flower_banner_pattern.png"));
		frmModelCombos.setTitle("Model combos");
		frmModelCombos.setBounds(100, 100, 450, 300);
		frmModelCombos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmModelCombos.setLocationRelativeTo(null);
		frmModelCombos.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(29, 125, 326, 27);
		frmModelCombos.getContentPane().add(etiResultado);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiResultado.setBorder(borde);
		
		JComboBox cboNumeros = new JComboBox();
		cboNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiResultado.setText(cboNumeros.getSelectedItem().toString());
			}
		});
		cboNumeros.setBounds(10, 29, 133, 21);
		frmModelCombos.getContentPane().add(cboNumeros);
		
		JButton btnPares = new JButton("Pares");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=0;i<10;i+=2) {
				modelo.addElement("N° "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnPares.setBounds(184, 29, 77, 21);
		frmModelCombos.getContentPane().add(btnPares);
		
		JButton btnImpares = new JButton("Impares");
		btnImpares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				for (i=1;i<10;i+=2) {
				modelo.addElement("N° "+i);
				}
				cboNumeros.setModel(modelo);
			}
		});
		btnImpares.setBounds(282, 29, 90, 21);
		frmModelCombos.getContentPane().add(btnImpares);
		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel modelo = new DefaultComboBoxModel();
				cboNumeros.setModel(modelo);
			}
		});
		btnVaciar.setBounds(232, 65, 84, 20);
		frmModelCombos.getContentPane().add(btnVaciar);
		
		
	}
}
