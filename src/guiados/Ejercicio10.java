package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Toolkit;

public class Ejercicio10 {

	public JFrame frmBarraDesplazamiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 window = new Ejercicio10();
					window.frmBarraDesplazamiento.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBarraDesplazamiento = new JFrame();
		frmBarraDesplazamiento.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\clock_26.png"));
		frmBarraDesplazamiento.setTitle("Barra de desplazamiento");
		frmBarraDesplazamiento.setBounds(100, 100, 450, 271);
		frmBarraDesplazamiento.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmBarraDesplazamiento.setLocationRelativeTo(null);
		frmBarraDesplazamiento.getContentPane().setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setBounds(25, 110, 296, 28);
		frmBarraDesplazamiento.getContentPane().add(etiValor);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiValor.setBorder(borde);
		
		JScrollBar desValor = new JScrollBar();
		desValor.setValue(70);
		desValor.setBlockIncrement(20);
		desValor.setUnitIncrement(2);
		desValor.setMinimum(50);
		desValor.setMaximum(150);
		desValor.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				etiValor.setText("El valor es: "+desValor.getValue());
			}
		});
		desValor.setOrientation(JScrollBar.HORIZONTAL);
		desValor.setBounds(25, 37, 387, 28);
		frmBarraDesplazamiento.getContentPane().add(desValor);
		
		
	}
}
