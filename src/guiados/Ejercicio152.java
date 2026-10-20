package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Ejercicio152 {

	public JFrame frmJscrollpane2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio152 window = new Ejercicio152();
					window.frmJscrollpane2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio152() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJscrollpane2 = new JFrame();
		frmJscrollpane2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\echo_shard.png"));
		frmJscrollpane2.setTitle("JScrollPane 2.0");
		frmJscrollpane2.setBounds(100, 100, 436, 318);
		frmJscrollpane2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmJscrollpane2.getContentPane().setLayout(null);
		frmJscrollpane2.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Ejemplo 2 de JScrollPane");
		lblNewLabel.setBounds(10, 10, 180, 12);
		frmJscrollpane2.getContentPane().add(lblNewLabel);
		
		JScrollPane scpDatos = new JScrollPane();
		scpDatos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scpDatos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scpDatos.setBounds(10, 32, 391, 225);
		frmJscrollpane2.getContentPane().add(scpDatos);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(128, 128, 255));
		scpDatos.setViewportView(panelDatos);
		panelDatos.setLayout(null);
		panelDatos.setPreferredSize(new Dimension(400, 400));
		
		JLabel lbl = new JLabel("Panel de Datos");
		lbl.setBounds(10, 10, 181, 20);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelDatos.add(lbl);
		
		JLabel lblNewLabel_1 = new JLabel("Lunes");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 57, 100, 12);
		panelDatos.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Martes");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 104, 100, 12);
		panelDatos.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Miercoles");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 151, 100, 12);
		panelDatos.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Jueves");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(10, 196, 100, 12);
		panelDatos.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Viernes");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(10, 246, 100, 12);
		panelDatos.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Sabado");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(10, 297, 100, 12);
		panelDatos.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Domingo");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(10, 351, 100, 12);
		panelDatos.add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setBounds(120, 56, 257, 18);
		panelDatos.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 103, 257, 18);
		panelDatos.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 150, 257, 18);
		panelDatos.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 195, 257, 18);
		panelDatos.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 245, 257, 18);
		panelDatos.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 296, 257, 18);
		panelDatos.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(120, 350, 257, 18);
		panelDatos.add(textField_6);
	}
}
