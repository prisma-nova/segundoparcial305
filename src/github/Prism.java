package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Prism {

	private JFrame frmHolaGit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prism window = new Prism();
					window.frmHolaGit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prism() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaGit = new JFrame();
		frmHolaGit.setTitle("Hola Git");
		frmHolaGit.setBounds(100, 100, 450, 300);
		frmHolaGit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaGit.getContentPane().setLayout(null);
		frmHolaGit.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Hola Github con GIT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Determination", Font.BOLD, 26));
		lblNewLabel.setBounds(49, 80, 330, 100);
		frmHolaGit.getContentPane().add(lblNewLabel);
	}
}
