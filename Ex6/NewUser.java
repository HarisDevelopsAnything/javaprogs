import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.*;
import javax.swing.*;

public class NewUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 30));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblCreateNewStutor = new JLabel("Create new Stutor user");
		lblCreateNewStutor.setFont(new Font("Product Sans", Font.PLAIN, 10));
		lblCreateNewStutor.setForeground(new Color(255, 255, 255));
		panel.add(lblCreateNewStutor);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(10, 2, 0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Personal details:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_10);
		
		JPanel panel_2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("First name:");
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last name:");
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Gender:");
		panel_2.add(lblNewLabel_8);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addItem("Male");
		comboBox_3.addItem("Female");
		comboBox_3.addItem("Prefer not to say");
		panel_2.add(comboBox_3);
		
		JPanel panel_3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Age:");
		panel_3.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		panel_3.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Dept.:");
		panel_3.add(lblNewLabel_3);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("CSE");
		comboBox.addItem("ECE");
		comboBox.addItem("EEE");
		comboBox.setSelectedIndex(0);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_3_1 = new JLabel("Section:");
		panel_3.add(lblNewLabel_3_1);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("A");
		comboBox_1.addItem("B");
		comboBox_1.addItem("C");
		comboBox_1.setSelectedIndex(0);
		panel_3.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Year:");
		panel_3.add(lblNewLabel_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("I");
		comboBox_2.addItem("II");
		comboBox_2.addItem("III");
		comboBox_2.addItem("IV");
		panel_3.add(comboBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("Roll no.:");
		panel_3.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.add(panel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Father's name:");
		panel_4.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mobile no.: +91");
		panel_4.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel_9 = new JLabel("Email:");
		panel_5.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		panel_5.add(textField_5);
		textField_5.setColumns(20);
		
		JPanel panel_6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel_1.add(panel_6);
		ButtonGroup bg= new ButtonGroup();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hosteller");
		bg.add(rdbtnNewRadioButton);
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dayscholar");
		bg.add(rdbtnNewRadioButton_1);
		panel_6.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Credentials (for login):");
		panel_1.add(lblNewLabel_10_1);
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_11 = new JLabel("Login ID:");
		panel_7.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		panel_7.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Password:");
		panel_7.add(lblNewLabel_12);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel_7.add(passwordField);

		JButton btnNewButton = new JButton("Register");
		panel_1.add(btnNewButton);
		
	}
}
