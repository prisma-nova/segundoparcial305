package guiados;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Ejercicio20 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUnidades;
	private JTextField txtPrecio;
	private JLabel etiTotal;
	private JButton btnCalcular;
	private JButton btnConfiguracion;
	
	double iva;
	double descuento;
	
	private JDialog dialogoConfiguracion;
	private JTextField txtIva;
	private JTextField txtDescuento;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio20 frame = new Ejercicio20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		descuento = 0;
		iva = 0;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setBounds(30, 30, 80, 20);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(120, 30, 120, 22);
		txtUnidades.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(30, 70, 80, 20);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(120, 70, 120, 22);
		txtPrecio.setColumns(10);
		
		JLabel lblTotalTexto = new JLabel("TOTAL:");
		lblTotalTexto.setBounds(30, 120, 80, 20);
		
		etiTotal = new JLabel("");
		etiTotal.setBounds(120, 120, 120, 20);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiTotal.setBorder(borde);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(30, 223, 110, 25);
		
		btnConfiguracion = new JButton("Configuracion...");
		btnConfiguracion.setBounds(158, 223, 130, 25);
		contentPane.setLayout(null);
		contentPane.add(btnCalcular);
		contentPane.add(btnConfiguracion);
		contentPane.add(lblUnidades);
		contentPane.add(txtUnidades);
		contentPane.add(lblPrecio);
		contentPane.add(txtPrecio);
		contentPane.add(lblTotalTexto);
		contentPane.add(etiTotal);
		
		dialogoConfiguracion = new JDialog();
		dialogoConfiguracion.setTitle("Configuracion de iva y descuento");
		dialogoConfiguracion.setModal(true);
		dialogoConfiguracion.setAlwaysOnTop(true);
		dialogoConfiguracion.getContentPane().setLayout(null);
		
		JLabel lblIva = new JLabel("IVA %:");
		lblIva.setBounds(30, 30, 90, 20);
		dialogoConfiguracion.getContentPane().add(lblIva);
		
		txtIva = new JTextField("0");
		txtIva.setBounds(130, 30, 80, 22);
		dialogoConfiguracion.getContentPane().add(txtIva);
		txtIva.setColumns(10);
		
		JLabel lblDescuento = new JLabel("DESCUENTO %:");
		lblDescuento.setBounds(30, 70, 100, 20);
		dialogoConfiguracion.getContentPane().add(lblDescuento);
		
		txtDescuento = new JTextField("0");
		txtDescuento.setBounds(130, 70, 80, 22);
		dialogoConfiguracion.getContentPane().add(txtDescuento);
		txtDescuento.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(30, 120, 90, 25);
		dialogoConfiguracion.getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(130, 120, 95, 25);
		dialogoConfiguracion.getContentPane().add(btnCancelar);
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO add your handling code here:
				double unidades;
				double precio;
				double total;
				double cantiva;
				double cantdes;
				double totalsiniva;
				
				unidades = Double.parseDouble(txtUnidades.getText());
				precio = Double.parseDouble(txtPrecio.getText());
				
				totalsiniva = precio * unidades;
				cantiva = totalsiniva * iva / 100;
				cantdes = totalsiniva * descuento / 100;
				
				total = totalsiniva + cantiva - cantdes;
				
				etiTotal.setText("" + total);
			}
		});
		
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO add your handling code here:
				dialogoConfiguracion.setTitle(getTitle());
				dialogoConfiguracion.setSize(270, 210);
				dialogoConfiguracion.setLocation(100, 100);
				dialogoConfiguracion.setVisible(true);
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO add your handling code here:
				iva = Double.parseDouble(txtIva.getText());
				descuento = Double.parseDouble(txtDescuento.getText());
				dialogoConfiguracion.dispose();
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO add your handling code here:
				dialogoConfiguracion.dispose();
			}
		});
	}
}