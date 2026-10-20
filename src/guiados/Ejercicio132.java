package guiados;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Ejercicio132 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio132 window = new Ejercicio132();
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
	public Ejercicio132() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPopupMenu menuEmergente = new JPopupMenu();
		menuEmergente.setBounds(56, 55, 93, 74);
		frame.getContentPane().add(menuEmergente);
		
		JMenuItem menuRojo = new JMenuItem("Rojo");
		menuRojo.setBounds(0, 0, 134, 25);
		frame.getContentPane().add(menuRojo);
		
		JMenuItem menuVerde = new JMenuItem("Verde");
		menuVerde.setBounds(0, 0, 134, 25);
		frame.getContentPane().add(menuVerde);
		
		JMenuItem menuAzul = new JMenuItem("Azul");
		menuAzul.setBounds(0, 0, 134, 25);
		frame.getContentPane().add(menuAzul);
		
		
		
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				menuEmergente.show(frame,e.getX(),e.getY());
			}
		});
		
		
	}

}
