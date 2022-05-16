import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
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
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distrito");
		lblNewLabel.setBounds(23, 26, 127, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox distrito = new JComboBox();
		distrito.setModel(new DefaultComboBoxModel(new String[] {"Trujillo", "Huelin", "El Palo"}));
		distrito.setBounds(175, 34, 148, 22);
		
		frame.getContentPane().add(distrito);
		
		JLabel lblNewLabel_1 = new JLabel("Provincia");
		lblNewLabel_1.setBounds(23, 101, 104, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Comunidad Aut\u00F3noma");
		lblNewLabel_2.setBounds(23, 172, 127, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox provincia = new JComboBox();
		provincia.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Toledo", "Sevilla", "Valladolid"}));
		provincia.setBounds(175, 97, 148, 22);
		frame.getContentPane().add(provincia);
		
		JComboBox ccaa = new JComboBox();
		ccaa.setModel(new DefaultComboBoxModel(new String[] {"Andalucia", "Castilla la Mancha", "Madrid", "Castilla y león"}));
		ccaa.setBounds(175, 172, 148, 22);
		frame.getContentPane().add(ccaa);
		
		JButton salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		salir.setBounds(139, 219, 121, 31);
		frame.getContentPane().add(salir);
		
		
	}
}
