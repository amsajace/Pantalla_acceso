import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Acceso {

	private JFrame frame;
	private JTextField textnombre;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso window = new Acceso();
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
	public Acceso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 43, 80, 25);
		frame.getContentPane().add(lblNewLabel);
		
		textnombre = new JTextField();
		textnombre.setBounds(84, 45, 134, 20);
		frame.getContentPane().add(textnombre);
		textnombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(10, 90, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(84, 87, 134, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hombre");
		chckbxNewCheckBox.setBounds(6, 150, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mujer");
		chckbxNewCheckBox_1.setBounds(137, 150, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(50, 123, 97, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(140, 203, 127, 20);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_2_1 = new JLabel("Fecha nacimiento");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(10, 203, 97, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Insertar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,  "Entrada correcta");
			textField.setText("");
			textnombre.setText("");
								}
		});
		btnNewButton.setBounds(316, 122, 97, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
