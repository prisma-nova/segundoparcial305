package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class Ejercicio12 {

	public JFrame frmToolbar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio12 window = new Ejercicio12();
					window.frmToolbar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmToolbar = new JFrame();
		frmToolbar.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\iron_pickaxe.png"));
		frmToolbar.setTitle("Toolbar");
		frmToolbar.setBounds(100, 100, 450, 300);
		frmToolbar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmToolbar.getContentPane().setLayout(null);
		frmToolbar.setLocationRelativeTo(null);
		
		JToolBar barraHerramientas = new JToolBar();
		barraHerramientas.setBounds(0, 0, 436, 19);
		frmToolbar.getContentPane().add(barraHerramientas);
		
		JButton btnUno = new JButton("");
		btnUno.setIcon(new ImageIcon("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\cyan_dye.png"));
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el botón uno");
			}
		});
		barraHerramientas.add(btnUno);
		
		JButton btnDos = new JButton("");
		btnDos.setIcon(new ImageIcon("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\green_dye.png"));
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el botón dos");
			}
		});
		barraHerramientas.add(btnDos);
		
		JButton btnTres = new JButton("");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el botón tres");
			}
		});
		btnTres.setIcon(new ImageIcon("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\magenta_dye.png"));
		barraHerramientas.add(btnTres);
		
		JButton btnCuatro = new JButton("");
		btnCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el botón cuatro");
			}
		});
		btnCuatro.setIcon(new ImageIcon("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\black_dye.png"));
		barraHerramientas.add(btnCuatro);
		
		JMenuBar menuBar = new JMenuBar();
		frmToolbar.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Menu");
		menuBar.add(mntmNewMenuItem);
	}
}
