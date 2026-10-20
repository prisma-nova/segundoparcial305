package guiados;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Ejercicio25 {

	private JFrame frame;
	JCheckBox vcuadros[];
	JLabel etiInv;
	JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio25 window = new Ejercicio25();
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
	public Ejercicio25() {
		initialize();
		CreacionVentana();
	}
	
	public void CreacionVentana() {
		frame.setTitle("Ejemplo de vector de componentes");
		frame.setSize(300,600);
		
		vcuadros = new JCheckBox[10];
		String vtextos[]= {"rojo","verde","azul","rosa","celeste","morado","amarillo","marron","naranja","blanco"};
		
		int i;
		for (i=0; i<vcuadros.length; i++) {
			vcuadros[i]=new JCheckBox();
			vcuadros[i].setText(vtextos[i]);
			
			vcuadros[i].setBounds(10,10+30*i,100,20);
			frame.getContentPane().add(vcuadros[i]);
			
		}
		
		btnAceptar = new JButton();
		btnAceptar.setText("Aceptar");
		btnAceptar.setBounds(10,360,100,20);
		frame.getContentPane().add(btnAceptar);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int i;
				int cont=0;
				
				for (i=0; i<vcuadros.length; i++) {
					if (vcuadros[i].isSelected()) {
						cont++;
					}
				}
				JOptionPane.showMessageDialog(null, "Hay "+cont+" cuadros seleccionados");
				
			}
		});
		
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
