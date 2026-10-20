package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio1322 {

	public JFrame frmMenuEmergente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1322 window = new Ejercicio1322();
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
	public Ejercicio1322() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuEmergente = new JFrame();
		frmMenuEmergente.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\spider_spawn_egg.png"));
		frmMenuEmergente.setTitle("Menu emergente");
		frmMenuEmergente.setBounds(100, 100, 450, 300);
		frmMenuEmergente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMenuEmergente.setLocationRelativeTo(null);
		frmMenuEmergente.getContentPane().setLayout(null);
		
		JPopupMenu menuEmergente = new JPopupMenu();
		menuEmergente.setBounds(-7, -30, 89, 84);
		
		
		JMenuItem menuRojo = new JMenuItem("Rojo");
		menuRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuEmergente.getContentPane().setBackground(Color.RED);
			}
		});
		menuEmergente.add(menuRojo);
		
		JMenuItem menuVerde = new JMenuItem("Verde");
		menuEmergente.add(menuVerde);
		menuVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuEmergente.getContentPane().setBackground(Color.GREEN);
			}
		});
		
		JMenuItem menuAzul = new JMenuItem("Azul");
		menuEmergente.add(menuAzul);
		menuAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuEmergente.getContentPane().setBackground(Color.BLUE);
			}
		});
		
		frmMenuEmergente.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				if (evt.getButton()==3) {
					addPopup(frmMenuEmergente.getContentPane(), menuEmergente);
					menuEmergente.show(frmMenuEmergente,evt.getX(),evt.getY());
					}
			}
		});
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton()==3) {
				if (e.isPopupTrigger()) {
					
						showMenu(e);
						
				}
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.getButton()==3) {
				if (e.isPopupTrigger()) {
					
						showMenu(e);
				}
				}
			}
			private void showMenu(MouseEvent e) {
				if (e.getButton()==3) {
					popup.show(e.getComponent(), e.getX(), e.getY());
					}
				
			}
		});
	}
}
