package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Menu {

	private JFrame frmMenu;
	Ejercicio11 e1=new Ejercicio11();
	Ejercicio2 e2=new Ejercicio2();
	Ejercicio3 e3=new Ejercicio3();
	Ejercicio4 e4=new Ejercicio4();
	Ejercicio5 e5=new Ejercicio5();
	Ejercicio6 e6=new Ejercicio6();
	Ejercicio7 e7=new Ejercicio7();
	Ejercicio8 e8=new Ejercicio8();
	Ejercicio9 e9=new Ejercicio9();
	Ejercicio10 e10=new Ejercicio10();
	Ejercicio111 e11=new Ejercicio111();
	Ejercicio12 e12=new Ejercicio12();
	Ejercicio13 e13=new Ejercicio13();
	Ejercicio1322 e132=new Ejercicio1322();
	Ejercicio14 e14=new Ejercicio14();
	Ejercicio15 e15=new Ejercicio15();
	Ejercicio152 e152=new Ejercicio152();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\writable_book.png"));
		frmMenu.setTitle("Menú");
		frmMenu.setBounds(100, 100, 301, 592);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.setLocationRelativeTo(null);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnE1 = new JButton("Ejercicio 1");
		btnE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e1.frmCasillaDeVerificacion.setVisible(true);
			}
		});
		btnE1.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE1.setBounds(10, 10, 180, 20);
		frmMenu.getContentPane().add(btnE1);
		
		JButton btnE2 = new JButton("Ejercicio 2");
		btnE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e2.frmBotonOpcion.setVisible(true);
			}
		});
		btnE2.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE2.setBounds(10, 40, 180, 20);
		frmMenu.getContentPane().add(btnE2);
		
		JButton btnE3 = new JButton("Ejercicio 3");
		btnE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e3.frmListas.setVisible(true);
			}
		});
		btnE3.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE3.setBounds(10, 70, 180, 20);
		frmMenu.getContentPane().add(btnE3);
		
		JButton btnE4 = new JButton("Ejercicio 4");
		btnE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e4.frmCombo.setVisible(true);
			}
		});
		btnE4.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE4.setBounds(10, 100, 180, 20);
		frmMenu.getContentPane().add(btnE4);
		
		JButton btnE5 = new JButton("Ejercicio 5");
		btnE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e5.frmModelListas.setVisible(true);
			}
		});
		btnE5.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE5.setBounds(10, 130, 180, 20);
		frmMenu.getContentPane().add(btnE5);
		
		JButton btnE6 = new JButton("Ejercicio 6");
		btnE6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e6.frmModelCombos.setVisible(true);
			}
		});
		btnE6.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE6.setBounds(10, 160, 180, 20);
		frmMenu.getContentPane().add(btnE6);
		
		JButton btnE7 = new JButton("Ejercicio 7");
		btnE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e7.frmToggle.setVisible(true);
			}
		});
		btnE7.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE7.setBounds(10, 193, 180, 20);
		frmMenu.getContentPane().add(btnE7);
		
		JButton btnE8 = new JButton("Ejercicio 8");
		btnE8.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e8.frmSlider.setVisible(true);
			}
		});
		btnE8.setBounds(10, 223, 180, 20);
		frmMenu.getContentPane().add(btnE8);
		
		JButton btnE9 = new JButton("Ejercicio 9");
		btnE9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e9.frmSpinner.setVisible(true);
			}
		});
		btnE9.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE9.setBounds(10, 253, 180, 20);
		frmMenu.getContentPane().add(btnE9);
		
		JButton btnE10 = new JButton("Ejercicio 10");
		btnE10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e10.frmBarraDesplazamiento.setVisible(true);
			}
		});
		btnE10.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE10.setBounds(10, 283, 180, 20);
		frmMenu.getContentPane().add(btnE10);
		
		JButton btnE11 = new JButton("Ejercicio 11");
		btnE11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e11.frmMenus.setVisible(true);
			}
		});
		btnE11.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE11.setBounds(10, 313, 180, 20);
		frmMenu.getContentPane().add(btnE11);
		
		JButton btnE12 = new JButton("Ejercicio 12");
		btnE12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e12.frmToolbar.setVisible(true);
			}
		});
		btnE12.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE12.setBounds(10, 343, 180, 20);
		frmMenu.getContentPane().add(btnE12);
		
		
		JButton btnE13 = new JButton("Ejercicio 13");
		btnE13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e13.frmMenuEmergente.setVisible(true);
			}
		});
		btnE13.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE13.setBounds(10, 377, 180, 20);
		frmMenu.getContentPane().add(btnE13);
		
		JButton btnE132 = new JButton("Ejercicio 13.2");
		btnE132.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e132.frmMenuEmergente.setVisible(true);
			}
		});
		btnE132.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE132.setBounds(10, 407, 180, 20);
		frmMenu.getContentPane().add(btnE132);
		
		JButton btnE14 = new JButton("Ejercicio 14");
		btnE14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e14.frmFileChooser.setVisible(true);
			}
		});
		btnE14.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE14.setBounds(10, 437, 180, 20);
		frmMenu.getContentPane().add(btnE14);
		
		JButton btnE15 = new JButton("Ejercicio 15");
		btnE15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e15.frmJscrollpane.setVisible(true);
			}
		});
		btnE15.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE15.setBounds(10, 467, 180, 20);
		frmMenu.getContentPane().add(btnE15);
		
		JButton btnE152 = new JButton("Ejercicio 15.2");
		btnE152.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e152.frmJscrollpane2.setVisible(true);
			}
		});
		btnE152.setFont(new Font("Determination", Font.PLAIN, 14));
		btnE152.setBounds(10, 497, 180, 20);
		frmMenu.getContentPane().add(btnE152);
	}
}
