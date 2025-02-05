package ics3uLessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculatorGUI {

	// variables
	private JFrame frame;
	int num1 = 0;
	int num2 = 0;
	int sum = 0;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculatorGUI window = new AddCalculatorGUI();
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
	public AddCalculatorGUI() {
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
		
		JLabel label1 = new JLabel("Add Calculator");
		label1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label1.setBounds(152, 41, 139, 30);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("First Number");
		label2.setBounds(52, 108, 90, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("Second Number");
		label3.setBounds(52, 149, 105, 14);
		frame.getContentPane().add(label3);
		
		JLabel label4 = new JLabel("Sum");
		label4.setBounds(52, 190, 46, 14);
		frame.getContentPane().add(label4);
		
		textField1 = new JTextField();
		textField1.setBounds(171, 105, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(171, 146, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(171, 187, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JButton button1 = new JButton("Add");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					// get input
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
	
					// add button code goes here
					sum = num1 + num2;

					// output
					textField3.setText(Integer.toString(sum));
				}
				
				catch (Exception e1)  {
					
					JOptionPane.showMessageDialog(null, "Invalid entry.");
				}
			}
		});
		button1.setBounds(301, 104, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Clear");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// clear button code goes here
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
			}
		});
		button2.setBounds(301, 145, 89, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("Exit");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit button goes here
				System.exit(0);
			}
		});
		
		button3.setBounds(301, 186, 89, 23);
		frame.getContentPane().add(button3);
	}

}
