import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class actividad3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad3 window = new actividad3();
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
	public actividad3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Texto");
		panel.setBorder(new TitledBorder(new LineBorder(new Color(135, 206, 250)), "Registro de Alumnos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
		panel.setBounds(10, 11, 577, 154);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(10, 24, 18, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(65, 21, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 52, 267, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(179, 24, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(235, 21, 97, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setBounds(365, 24, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(433, 21, 134, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Distrito");
		lblNewLabel_3_1.setBounds(365, 55, 46, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setBounds(10, 90, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(65, 87, 131, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(250, 87, 82, 20);
		panel.add(textField_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Celular");
		lblNewLabel_2_1.setBounds(206, 90, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Carrera");
		lblNewLabel_1_1_1.setBounds(10, 123, 46, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Trujillo", "Huelin", "El Palo"}));
		comboBox.setBounds(433, 51, 134, 22);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Computaci\u00F3n e Inform\u00E1tica", "Medicina", "Matem\u00E1ticas", "Historia"}));
		comboBox_1.setBounds(65, 119, 160, 22);
		panel.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(135, 206, 250)), "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
		panel_1.setBounds(10, 176, 577, 129);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 22, 557, 96);
		panel_1.add(textArea);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(178, 326, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(324, 326, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
