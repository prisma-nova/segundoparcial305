package guiados;

import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio14 {

	public JFrame frmFileChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio14 window = new Ejercicio14();
					window.frmFileChooser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFileChooser = new JFrame();
		frmFileChooser.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\feather.png"));
		frmFileChooser.setTitle("File Chooser");
		frmFileChooser.setBounds(100, 100, 450, 300);
		frmFileChooser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmFileChooser.setLocationRelativeTo(null);
		
		JMenuBar barraMenus = new JMenuBar();
		frmFileChooser.setJMenuBar(barraMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);
		
		JMenuItem menuAbrir = new JMenuItem("Abrir");
		menuAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser elegirFichero = new JFileChooser();
				elegirFichero.setCurrentDirectory(new File(System.getProperty("user.home")));

				int resp=elegirFichero.showOpenDialog(null);
				if (resp==JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null,elegirFichero.getSelectedFile(
				).toString());
				} else if (resp==JFileChooser.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null,"Se pulsó la opción Cancelar");
				}
			}
		});
		menuArchivo.add(menuAbrir);
		
		JSeparator separator = new JSeparator();
		menuArchivo.add(separator);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuArchivo.add(menuSalir);
		frmFileChooser.getContentPane().setLayout(null);
	}
}
