package segundoparcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;

public class Signozodiacal {

	private JFrame frmSignoZodiacal;
	String fecha;
	JLabel lblDia;
	JLabel lblValorDia;
	JLabel lblMes;
	JLabel lblSigno;
	JLabel lblFecha;
	JComboBox cmbMes;
	JSlider sldDia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signozodiacal window = new Signozodiacal();
					window.frmSignoZodiacal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Signozodiacal() {
		initialize();
	}
	
	public void calcularSigno() {
		int dia=sldDia.getValue();
		lblValorDia.setText(""+dia);
		String mes=cmbMes.getSelectedItem().toString();
		lblFecha.setText(dia+" de "+mes);
		
switch (mes) {
		
		case "Enero":
			if (dia>19) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\acuario.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\capricornio.png"));
			}
			break;
			
		case "Febrero":
			if (dia>18) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\piscis.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\acuario.png"));
			}
			break;
			
		case "Marzo":
			if (dia>20) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\aries.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\piscis.png"));
			}
			break;
			
		case "Abril":
			if (dia>19) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\tauro.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\aries.png"));
			}
			break;
			
		case "Mayo":
			if (dia>20) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\geminis.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\tauro.png"));
			}
			break;
			
		case "Junio":
			if (dia>20) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\cancer.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\geminis.png"));
			}
			break;
			
		case "Julio":
			if (dia>22) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\leo.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\cancer.png"));
			}
			break;
			
		case "Agosto":
			if (dia>22) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\virgo.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\leo.png"));
			}
			break;
			
		case "Septiembre":
			if (dia>22) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\libra.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\virgo.png"));
			}
			break;
			
		case "Octubre":
			if (dia>22) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\escorpio.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\libra.png"));
			}
			break;
			
		case "Noviembre":
			if (dia>21) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\sagitario.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\escorpio.png"));
			}
			break;
			
		case "Diciembre":
			if (dia>21) {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\capricornio.png"));
			} else {
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\sagitario.png"));
			}
			break;
			
			default:
				break;
			
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignoZodiacal = new JFrame();
		frmSignoZodiacal.setResizable(false);
		frmSignoZodiacal.setTitle("Signos zodiacales");
		frmSignoZodiacal.setBackground(new Color(0, 0, 0));
		frmSignoZodiacal.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\mob_effect\\health_boost.png"));
		frmSignoZodiacal.getContentPane().setBackground(new Color(0, 0, 0));
		frmSignoZodiacal.setBounds(100, 100, 686, 479);
		frmSignoZodiacal.setLocationRelativeTo(null);
		frmSignoZodiacal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignoZodiacal.getContentPane().setLayout(null);
		
		lblDia = new JLabel("Dia");
		lblDia.setForeground(new Color(255, 255, 255));
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDia.setBounds(16, 21, 44, 12);
		frmSignoZodiacal.getContentPane().add(lblDia);
		
		
		lblValorDia = new JLabel("1");
		lblValorDia.setForeground(new Color(255, 255, 255));
		lblValorDia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorDia.setBounds(587, 30, 46, 43);
		frmSignoZodiacal.getContentPane().add(lblValorDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setForeground(new Color(255, 255, 255));
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMes.setBounds(16, 104, 53, 16);
		frmSignoZodiacal.getContentPane().add(lblMes);
		
		lblSigno = new JLabel("");
		lblSigno.setHorizontalAlignment(SwingConstants.CENTER);
		lblSigno.setBounds(206, 104, 342, 326);
		frmSignoZodiacal.getContentPane().add(lblSigno);
		
		lblFecha = new JLabel("");
		lblFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFecha.setForeground(new Color(255, 255, 255));
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFecha.setBounds(16, 192, 139, 22);
		frmSignoZodiacal.getContentPane().add(lblFecha);
		
		cmbMes = new JComboBox();
		cmbMes.setModel(new DefaultComboBoxModel(new String[] {"Enero","Febrero","Marzo","Abril","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre",}));
		cmbMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcularSigno();
			}
		});
		cmbMes.setBounds(16, 127, 139, 28);
		frmSignoZodiacal.getContentPane().add(cmbMes);
		
		
		
		sldDia = new JSlider();
		sldDia.setForeground(new Color(255, 255, 255));
		sldDia.setBackground(new Color(0, 0, 0));
		sldDia.setValue(0);
		sldDia.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				calcularSigno();
			}
		});
		sldDia.setMaximum(30);
		sldDia.setMajorTickSpacing(1);
		sldDia.setMinorTickSpacing(1);
		sldDia.setMinimum(1);
		sldDia.setSnapToTicks(true);
		sldDia.setPaintTicks(true);
		sldDia.setPaintLabels(true);
		sldDia.setBounds(13, 37, 553, 54);
		frmSignoZodiacal.getContentPane().add(sldDia);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sldDia.setValue(1);
				lblValorDia.setText("1");
				cmbMes.setSelectedIndex(0);
				lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\signzodiac.png"));
				lblFecha.setText("");
			}
		});
		btnReset.setBounds(16, 240, 91, 28);
		frmSignoZodiacal.getContentPane().add(btnReset);
		
		lblSigno.setIcon(new ImageIcon("C:\\Users\\ellok\\Downloads\\signzodiac.png"));
		
		
		
	}
}
