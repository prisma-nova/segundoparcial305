package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class Ejercicio9 {

	public JFrame frmSpinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 window = new Ejercicio9();
					window.frmSpinner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpinner = new JFrame();
		frmSpinner.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\chain.png"));
		frmSpinner.setTitle("Spinner");
		frmSpinner.setBounds(100, 100, 173, 163);
		frmSpinner.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSpinner.setLocationRelativeTo(null);
		frmSpinner.getContentPane().setLayout(null);
		
		
		JLabel etiValor = new JLabel("");
		etiValor.setBounds(20, 71, 115, 20);
		frmSpinner.getContentPane().add(etiValor);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiValor.setBorder(borde);
		
		JSpinner spiValor = new JSpinner();
		spiValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+spiValor.getValue().toString());
			}
		});
		spiValor.setBounds(20, 27, 115, 20);
		frmSpinner.getContentPane().add(spiValor);
		
		SpinnerNumberModel nm = new SpinnerNumberModel();
		nm.setMaximum(10);
		nm.setMinimum(0);
		nm.setStepSize(2);
		spiValor.setModel(nm);
		
		spiValor.setValue(4);
		
	}
}
