package guiados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class Ejercicio15 {

	public JFrame frmJscrollpane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio15 window = new Ejercicio15();
					window.frmJscrollpane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJscrollpane = new JFrame();
		frmJscrollpane.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\echo_shard.png"));
		frmJscrollpane.setTitle("JScrollPane");
		frmJscrollpane.setBounds(100, 100, 425, 300);
		frmJscrollpane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmJscrollpane.getContentPane().setLayout(null);
		frmJscrollpane.setLocationRelativeTo(null);
		
		JLabel etiImagen = new JLabel(new ImageIcon("C:\\Users\\ellok\\OneDrive\\Pictures\\bg\\20250915_011734.jpg"));
		JScrollPane scpImagen = new JScrollPane(etiImagen);
		frmJscrollpane.getContentPane().add(scpImagen);
		
		scpImagen.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scpImagen.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scpImagen.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scpImagen.setBounds(17, 20, 371, 224);
		frmJscrollpane.getContentPane().add(scpImagen);
	}
}
