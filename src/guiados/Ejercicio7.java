package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ejercicio7 {

	public JFrame frmToggle;
	private JTextField txtPrecioBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 window = new Ejercicio7();
					window.frmToggle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmToggle = new JFrame();
		frmToggle.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\baked_potato.png"));
		frmToggle.setTitle("Toggle");
		frmToggle.setBounds(100, 100, 308, 300);
		frmToggle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmToggle.getContentPane().setLayout(null);
		frmToggle.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Precio base");
		lblNewLabel.setBounds(23, 10, 111, 12);
		frmToggle.getContentPane().add(lblNewLabel);
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setBounds(23, 28, 96, 18);
		frmToggle.getContentPane().add(txtPrecioBase);
		txtPrecioBase.setColumns(10);
		
		
		JLabel etiTotal = new JLabel("");
		etiTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiTotal.setBounds(23, 207, 111, 46);
		frmToggle.getContentPane().add(etiTotal);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiTotal.setBorder(borde);
		
		JToggleButton tbtnInstalacion = new JToggleButton("Instalación");
		tbtnInstalacion.setBounds(23, 69, 114, 20);
		frmToggle.getContentPane().add(tbtnInstalacion);
		
		JToggleButton tbtnFormacion = new JToggleButton("Formación");
		tbtnFormacion.setBounds(23, 99, 114, 20);
		frmToggle.getContentPane().add(tbtnFormacion);
		
		JToggleButton tbtnAlimentacionBD = new JToggleButton("Alimentación BD");
		tbtnAlimentacionBD.setBounds(23, 129, 114, 20);
		frmToggle.getContentPane().add(tbtnAlimentacionBD);
		
		JLabel etiPrecioInstalacion = new JLabel("40");
		etiPrecioInstalacion.setBounds(147, 73, 44, 12);
		frmToggle.getContentPane().add(etiPrecioInstalacion);
		
		JLabel etiPrecioFormacion = new JLabel("200");
		etiPrecioFormacion.setBounds(147, 103, 44, 12);
		frmToggle.getContentPane().add(etiPrecioFormacion);
		
		JLabel etiPrecioAlimentacionBD = new JLabel("200");
		etiPrecioAlimentacionBD.setBounds(147, 133, 44, 12);
		frmToggle.getContentPane().add(etiPrecioAlimentacionBD);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio_base;
				double precio_instal; //precio instalación
				double precio_for; //precio formacion
				double precio_ali; //precio alimentacion
				//Recojo datos desde la ventana:
				precio_base = Double.parseDouble(txtPrecioBase.getText());
				precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
				precio_for = Double.parseDouble(etiPrecioFormacion.getText());
				precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
				//Ahora que tengo los datos, puedo hacer cálculos.
				//Al precio base se le van añadiendo precio de extras
				//según estén o no activados los JToggleButtons
				double precio_total;
				precio_total = precio_base;
				if (tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
				precio_total = precio_total+precio_instal;
				}
				if (tbtnFormacion.isSelected()) { //Si se seleccionó formación
				precio_total = precio_total+precio_for;
				}
				if (tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
				precio_total = precio_total+precio_ali;
				}
				//Finalmente pongo el resultado en la etiqueta
				etiTotal.setText(precio_total+" €");
			}
		});
		btnCalcular.setBounds(23, 177, 114, 20);
		frmToggle.getContentPane().add(btnCalcular);
		
		tbtnInstalacion.setSelected(true);
	}
}
