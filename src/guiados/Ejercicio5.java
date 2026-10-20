package guiados;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Ejercicio5 {

	public JFrame frmModelListas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 window = new Ejercicio5();
					window.frmModelListas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModelListas = new JFrame();
		frmModelListas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ellok\\OneDrive\\Desktop\\jar mc files\\assets\\minecraft\\textures\\item\\knowledge_book.png"));
		frmModelListas.setTitle("Model listas");
		frmModelListas.setBounds(100, 100, 450, 300);
		frmModelListas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmModelListas.setLocationRelativeTo(null);
		frmModelListas.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(173, 20, 240, 34);
		frmModelListas.getContentPane().add(etiResultado);
		Border borde = BorderFactory.createLineBorder(Color.BLACK, 1);
		etiResultado.setBorder(borde);
		
		JList lstNombres = new JList();
		lstNombres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				etiResultado.setText(lstNombres.getSelectedValue().toString());
			}
		});
		lstNombres.setBounds(30, 20, 117, 130);
		frmModelListas.getContentPane().add(lstNombres);
		
		JButton btnCurso1 = new JButton("Curso 1");
		btnCurso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Juan");
				modelo.addElement("María");
				modelo.addElement("Luis");
				lstNombres.setModel(modelo);
			}
		});
		btnCurso1.setBounds(30, 174, 84, 20);
		frmModelListas.getContentPane().add(btnCurso1);
		
		JButton btnCurso2 = new JButton("Curso 2");
		btnCurso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				modelo.addElement("Ana");
				modelo.addElement("Marta");
				modelo.addElement("Jose");
				lstNombres.setModel(modelo);
			}
		});
		btnCurso2.setBounds(30, 211, 84, 20);
		frmModelListas.getContentPane().add(btnCurso2);
		
		JButton btnVaciar = new JButton("Vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel modelo = new DefaultListModel();
				lstNombres.setModel(modelo);
			}
		});
		btnVaciar.setBounds(147, 195, 84, 20);
		frmModelListas.getContentPane().add(btnVaciar);
	}

}
