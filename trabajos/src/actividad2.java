import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;

public class actividad2 {

	private JFrame frmContrasea;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad2 window = new actividad2();
					window.frmContrasea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public actividad2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContrasea = new JFrame();
		frmContrasea.setForeground(Color.LIGHT_GRAY);
		frmContrasea.setTitle("                                                     Contrase\u00F1a");
		frmContrasea.setBounds(100, 100, 450, 300);
		frmContrasea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContrasea.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(76, 47, 46, 14);
		frmContrasea.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(65, 137, 72, 14);
		frmContrasea.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(161, 44, 122, 20);
		frmContrasea.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 134, 122, 20);
		frmContrasea.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(88, 196, 89, 23);
		frmContrasea.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setBounds(224, 196, 89, 23);
		frmContrasea.getContentPane().add(btnNewButton_1);
	}
}
