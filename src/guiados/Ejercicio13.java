package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Ejercicio13 {

	public JFrame frmMenuEmergente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio13 window = new Ejercicio13();
					window.frmMenuEmergente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuEmergente = new JFrame();
		frmMenuEmergente.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\spider_spawn_egg.png"));
		frmMenuEmergente.setTitle("Menu emergente");
		
		JPopupMenu menuEmergente = new JPopupMenu();
		menuEmergente.setBounds(56, 55, 93, 74);
		frmMenuEmergente.getContentPane().add(menuEmergente);
		
		
		frmMenuEmergente.getContentPane().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				menuEmergente.show(null,e.getX(),e.getY());
				if (e.getButton()==1) {
					JOptionPane.showMessageDialog(null,"Pulso el izquierdo");
					} else if (e.getButton()==2) {
					JOptionPane.showMessageDialog(null,"Pulso el central");
					} else if (e.getButton()==3) {
					JOptionPane.showMessageDialog(null,"Pulso el derecho");
					}
			}
		});
		frmMenuEmergente.setBounds(100, 100, 450, 300);
		frmMenuEmergente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMenuEmergente.getContentPane().setLayout(null);
		frmMenuEmergente.setLocationRelativeTo(null);
		
		
		
	}
}
