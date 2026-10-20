package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ejercicio19 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio19 window = new Ejercicio19();
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
	public Ejercicio19() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		frame.getContentPane().add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Ejercicio de distribucion de paneles y Layout");
		panelTitulo.add(lblNewLabel);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		lblNewLabel.setBorder(borde);
		
		JLabel lblNewLabel_1 = new JLabel("Por C&A");
		panelTitulo.add(lblNewLabel_1);
		lblNewLabel_1.setBorder(borde);
		
		JPanel panelDatos = new JPanel();
		frame.getContentPane().add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panelEtiqueta1 = new JPanel();
		panelDatos.add(panelEtiqueta1);
		
		JLabel lblNewLabel_5 = new JLabel("Dato 1:");
		GroupLayout gl_panelEtiqueta1 = new GroupLayout(panelEtiqueta1);
		gl_panelEtiqueta1.setHorizontalGroup(
			gl_panelEtiqueta1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEtiqueta1.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel_5)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_panelEtiqueta1.setVerticalGroup(
			gl_panelEtiqueta1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEtiqueta1.createSequentialGroup()
					.addGap(45)
					.addComponent(lblNewLabel_5)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		panelEtiqueta1.setLayout(gl_panelEtiqueta1);
		
		JPanel panelCuadro1 = new JPanel();
		panelDatos.add(panelCuadro1);
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_panelCuadro1 = new GroupLayout(panelCuadro1);
		gl_panelCuadro1.setHorizontalGroup(
			gl_panelCuadro1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelCuadro1.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(56))
		);
		gl_panelCuadro1.setVerticalGroup(
			gl_panelCuadro1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuadro1.createSequentialGroup()
					.addGap(41)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		panelCuadro1.setLayout(gl_panelCuadro1);
		
		JPanel panelEtiqueta2 = new JPanel();
		panelDatos.add(panelEtiqueta2);
		
		JLabel lblNewLabel_6 = new JLabel("Dato 2:");
		GroupLayout gl_panelEtiqueta2 = new GroupLayout(panelEtiqueta2);
		gl_panelEtiqueta2.setHorizontalGroup(
			gl_panelEtiqueta2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEtiqueta2.createSequentialGroup()
					.addGap(86)
					.addComponent(lblNewLabel_6)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_panelEtiqueta2.setVerticalGroup(
			gl_panelEtiqueta2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEtiqueta2.createSequentialGroup()
					.addGap(45)
					.addComponent(lblNewLabel_6)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		panelEtiqueta2.setLayout(gl_panelEtiqueta2);
		
		JPanel panelCuadro2 = new JPanel();
		panelDatos.add(panelCuadro2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		GroupLayout gl_panelCuadro2 = new GroupLayout(panelCuadro2);
		gl_panelCuadro2.setHorizontalGroup(
			gl_panelCuadro2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelCuadro2.createSequentialGroup()
					.addContainerGap(63, Short.MAX_VALUE)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(58))
		);
		gl_panelCuadro2.setVerticalGroup(
			gl_panelCuadro2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCuadro2.createSequentialGroup()
					.addGap(43)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		panelCuadro2.setLayout(gl_panelCuadro2);
		
		JPanel panelEstado = new JPanel();
		frame.getContentPane().add(panelEstado, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		GroupLayout gl_panelEstado = new GroupLayout(panelEstado);
		gl_panelEstado.setHorizontalGroup(
			gl_panelEstado.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelEstado.createSequentialGroup()
					.addContainerGap(258, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panelEstado.setVerticalGroup(
			gl_panelEstado.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelEstado.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelEstado.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)))
		);
		panelEstado.setLayout(gl_panelEstado);
		
		JPanel panelBotonera = new JPanel();
		panelBotonera.setBackground(new Color(128, 0, 0));
		frame.getContentPane().add(panelBotonera, BorderLayout.WEST);
		panelBotonera.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 84, 20);
		panelBotonera.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 0, 84, 20);
		panelBotonera.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 0, 84, 20);
		panelBotonera.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(0, 0, 84, 20);
		panelBotonera.add(btnNewButton_3);
		
		JPanel panelVerificacion = new JPanel();
		frame.getContentPane().add(panelVerificacion, BorderLayout.EAST);
		panelVerificacion.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(0, 0, 92, 20);
		panelVerificacion.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(0, 0, 92, 20);
		panelVerificacion.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setBounds(0, 0, 92, 20);
		panelVerificacion.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("New check box");
		chckbxNewCheckBox_3.setBounds(0, 0, 92, 20);
		panelVerificacion.add(chckbxNewCheckBox_3);
	}
}
