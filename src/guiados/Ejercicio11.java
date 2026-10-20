package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class Ejercicio11 {

	public JFrame frmCasillaDeVerificacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio11 window = new Ejercicio11();
					window.frmCasillaDeVerificacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCasillaDeVerificacion = new JFrame();
		frmCasillaDeVerificacion.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\armadillo_spawn_egg.png"));
		frmCasillaDeVerificacion.setTitle("Casilla de verificacion");
		frmCasillaDeVerificacion.setBounds(100, 100, 450, 300);
		frmCasillaDeVerificacion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCasillaDeVerificacion.setLocationRelativeTo(null);
		frmCasillaDeVerificacion.getContentPane().setLayout(null);
		
		JCheckBox chkPerro = new JCheckBox("Perro");
		chkPerro.setBounds(30, 27, 92, 20);
		frmCasillaDeVerificacion.getContentPane().add(chkPerro);
		
		JCheckBox chkGato = new JCheckBox("Gato");
		chkGato.setBounds(30, 64, 92, 20);
		frmCasillaDeVerificacion.getContentPane().add(chkGato);
		
		JCheckBox chkRaton = new JCheckBox("Ratón");
		chkRaton.setBounds(30, 99, 92, 20);
		frmCasillaDeVerificacion.getContentPane().add(chkRaton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(24, 162, 373, 50);
		frmCasillaDeVerificacion.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(6, 15, 361, 29);
		panel.add(etiResultado);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiResultado.setBorder(borde);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Animales elegidos: ";
				if (chkPerro.isSelected()) {
					mensaje=mensaje+"Perro ";
				}
				
				if (chkGato.isSelected()) {
					mensaje=mensaje+"Gato ";
				}
				
				if (chkRaton.isSelected()) {
					mensaje=mensaje+"Raton ";
				}
				
				etiResultado.setText(mensaje);
				
			}
		});
		btnAceptar.setBounds(30, 136, 84, 20);
		frmCasillaDeVerificacion.getContentPane().add(btnAceptar);
	}
}
