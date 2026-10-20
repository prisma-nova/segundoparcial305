package guiados;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio26 {

	private JFrame frame;
	JButton vBotones[];
	JLabel etiInv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio26 window = new Ejercicio26();
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
	public Ejercicio26() {
		initialize();
		CreacionVentana();
	}
	
	public void CreacionVentana() {
		frame.setSize(600,200);
		frame.setTitle("Ejemplo de vectores y eventos");
		
		String textoBotones[]= {"Aceptar","Cancelar","Aplicar","Cerrar","Salir"};
		
		vBotones=new JButton[5];
		int i;
		for (i=0; i<vBotones.length; i++) {
			vBotones[i]=new JButton();
			vBotones[i].setText(textoBotones[i]);
			vBotones[i].setBounds(10+i*100,100,90,20);
			frame.getContentPane().add(vBotones[i]);
		}
		
		for (i=0; i<vBotones.length; i++) {
			vBotones[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					JButton botonPulsado=(JButton) evt.getSource();
					JOptionPane.showMessageDialog(null, "Has pulsado el boton "+botonPulsado.getText());
				}
			});
		}
		
		etiInv = new JLabel();
		etiInv.setText("");
		etiInv.setBounds(10,15,100,20);
		frame.getContentPane().add(etiInv);
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
