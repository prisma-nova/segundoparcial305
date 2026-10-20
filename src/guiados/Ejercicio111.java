package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio111 {

	public JFrame frmMenus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio111 window = new Ejercicio111();
					window.frmMenus.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio111() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenus = new JFrame();
		frmMenus.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\armor_stand.png"));
		frmMenus.setTitle("Menus");
		frmMenus.setBounds(100, 100, 450, 300);
		frmMenus.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMenus.getContentPane().setLayout(null);
		frmMenus.setLocationRelativeTo(null);
		
		JMenuBar barraMenus = new JMenuBar();
		frmMenus.setJMenuBar(barraMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);
		
		JMenuItem menuItemAbrir = new JMenuItem("Abrir");
		menuArchivo.add(menuItemAbrir);
		
		JMenuItem menuItemGuardar = new JMenuItem("Guardar");
		menuArchivo.add(menuItemGuardar);
		
		JSeparator separador1 = new JSeparator();
		menuArchivo.add(separador1);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuArchivo.add(menuSalir);
		
		JMenu menuEdicion = new JMenu("Edición");
		barraMenus.add(menuEdicion);
		
		JMenu menuColores = new JMenu("Colores");
		menuEdicion.add(menuColores);
		
		JMenuItem menuItemRojo = new JMenuItem("Rojo");
		menuItemRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenus.getContentPane().setBackground(Color.RED);
			}
		});
		menuColores.add(menuItemRojo);
		
		JMenuItem menuItemVerde = new JMenuItem("Verde");
		menuItemVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenus.getContentPane().setBackground(Color.GREEN);
			}
		});
		menuColores.add(menuItemVerde);
		
		JMenuItem menuItemAzul = new JMenuItem("Azul");
		menuItemAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenus.getContentPane().setBackground(Color.BLUE);
			}
		});
		menuColores.add(menuItemAzul);
		
		JMenu menuInsertar = new JMenu("Insertar");
		barraMenus.add(menuInsertar);
	}
}
