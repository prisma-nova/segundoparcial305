package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio4 {

	public JFrame frmCombo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 window = new Ejercicio4();
					window.frmCombo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombo = new JFrame();
		frmCombo.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\bamboo_hanging_sign.png"));
		frmCombo.setTitle("Combo");
		frmCombo.setBounds(100, 100, 450, 300);
		frmCombo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCombo.setLocationRelativeTo(null);
		frmCombo.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(26, 211, 327, 29);
		frmCombo.getContentPane().add(etiResultado);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiResultado.setBorder(borde);
		
		JComboBox cboColores = new JComboBox();
		cboColores.setEditable(true);
		cboColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="El color elegido es ";
				mensaje=mensaje+cboColores.getSelectedItem().toString();
				etiResultado.setText(mensaje);
			}
		});
		cboColores.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Verde", "Azul"}));
		cboColores.setBounds(26, 22, 162, 21);
		frmCombo.getContentPane().add(cboColores);
		
	}
}
