package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Toolkit;

public class Ejercicio2 {

	public JFrame frmBotonOpcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 window = new Ejercicio2();
					window.frmBotonOpcion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonOpcion = new JFrame();
		frmBotonOpcion.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\armadillo_scute.png"));
		frmBotonOpcion.setTitle("Botón opción");
		frmBotonOpcion.setBounds(100, 100, 450, 300);
		frmBotonOpcion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmBotonOpcion.setLocationRelativeTo(null);
		frmBotonOpcion.getContentPane().setLayout(null);
		
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(10, 212, 365, 26);
		frmBotonOpcion.getContentPane().add(etiResultado);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiResultado.setBorder(borde);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Colores", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 255)));
		panel.setBounds(10, 10, 203, 131);
		frmBotonOpcion.getContentPane().add(panel);
		panel.setLayout(null);
		
		ButtonGroup grupoColores = new ButtonGroup();
		
		JRadioButton optRojo = new JRadioButton("Rojo");
		optRojo.setBounds(25, 20, 108, 21);
		panel.add(optRojo);
		
		JRadioButton optVerde = new JRadioButton("Verde");
		optVerde.setBounds(25, 53, 142, 21);
		panel.add(optVerde);
		
		JRadioButton optAzul = new JRadioButton("Azul");
		optAzul.setBounds(25, 86, 118, 21);
		panel.add(optAzul);
		
		grupoColores.add(optRojo);
		grupoColores.add(optVerde);
		grupoColores.add(optAzul);
		
		optRojo.setSelected(true);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Color elegido: ";
				if (optRojo.isSelected()) {
					mensaje=mensaje+"Rojo";
				} else if (optVerde.isSelected()) {
					mensaje=mensaje+"Verde";
				} else if (optAzul.isSelected()) {
					mensaje=mensaje+"Azul";
				}
				
				etiResultado.setText(mensaje);
				
			}
		});
		btnAceptar.setBounds(10, 169, 84, 20);
		frmBotonOpcion.getContentPane().add(btnAceptar);
		
		
		
	}
}
