package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.Border;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio3 {

	public JFrame frmListas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 window = new Ejercicio3();
					window.frmListas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListas = new JFrame();
		frmListas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\command_block_minecart.png"));
		frmListas.setTitle("Listas");
		frmListas.setBounds(100, 100, 450, 300);
		frmListas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmListas.setLocationRelativeTo(null);
		frmListas.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(20, 200, 371, 35);
		frmListas.getContentPane().add(etiResultado);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiResultado.setBorder(borde);
		
		JList lstColores = new JList();
		lstColores.setModel(new AbstractListModel() {
			String[] values = new String[] {"Rojo", "Verde", "Azul"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstColores.setBounds(20, 21, 146, 113);
		frmListas.getContentPane().add(lstColores);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje;
				mensaje="El color seleccionado es: "+lstColores.getSelectedValue().toString();
				etiResultado.setText(mensaje);
			}
		});
		btnAceptar.setBounds(20, 156, 84, 20);
		frmListas.getContentPane().add(btnAceptar);
	}
}
