package guiados;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class Ejercicio8 {

	public JFrame frmSlider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8 window = new Ejercicio8();
					window.frmSlider.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSlider = new JFrame();
		frmSlider.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\dolphin_spawn_egg.png"));
		frmSlider.setTitle("Slider");
		frmSlider.setBounds(100, 100, 450, 300);
		frmSlider.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSlider.setLocationRelativeTo(null);
		frmSlider.getContentPane().setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setForeground(new Color(0, 0, 0));
		etiValor.setBounds(29, 108, 370, 25);
		frmSlider.getContentPane().add(etiValor);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiValor.setBorder(borde);
		
		JSlider slDeslizador = new JSlider();
		slDeslizador.setPaintTicks(true);
		slDeslizador.setPaintLabels(true);
		slDeslizador.setSnapToTicks(true);
		slDeslizador.setMinorTickSpacing(10);
		slDeslizador.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+slDeslizador.getValue());
			}
		});
		slDeslizador.setMajorTickSpacing(50);
		slDeslizador.setValue(400);
		slDeslizador.setMinimum(100);
		slDeslizador.setMaximum(500);
		slDeslizador.setBounds(29, 20, 370, 65);
		frmSlider.getContentPane().add(slDeslizador);
		
		
	}
}
