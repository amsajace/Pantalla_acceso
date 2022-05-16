import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class pruebaGrafica {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaGrafica window = new pruebaGrafica();
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
	public pruebaGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(30, 55, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 52, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(30, 100, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 97, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		lblNewLabel_2.setBounds(30, 145, 64, 14);
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 142, 86, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				String apellidos = textField_1.getText();
				String contraseña = passwordField.getText();
				textField_1.setText("");
				textField.setText("");
				passwordField.setText("");
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR");
			}
		});
		btnNewButton.setBounds(54, 196, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField.setText("");
				passwordField.setText("");
				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR");
			}
		});
		btnNewButton_1.setBounds(179, 196, 89, 23);
		panel.add(btnNewButton_1);
	}
}
