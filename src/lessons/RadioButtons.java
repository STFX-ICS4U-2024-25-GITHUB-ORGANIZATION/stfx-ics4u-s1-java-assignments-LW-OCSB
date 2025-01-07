package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RadioButtons {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons window = new RadioButtons();
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
	public RadioButtons() {
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
		
		JLabel lblNewLabel = new JLabel("Radio Button Demo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(155, 35, 132, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(242, 124, 132, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setBounds(40, 97, 109, 23);
		frame.getContentPane().add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(40, 137, 109, 23);
		frame.getContentPane().add(femaleRadioButton);
		
		JRadioButton otherRadioButton = new JRadioButton("Other");
		otherRadioButton.setBounds(40, 180, 109, 23);
		frame.getContentPane().add(otherRadioButton);
		otherRadioButton.setSelected(true);			
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (otherRadioButton.isSelected())  {
					textField.setText("Other selected.");
				}
				
				else if (maleRadioButton.isSelected())  {
					textField.setText("Male selected.");
				}
				
				else
					textField.setText("Female selected.");
			}
		});
		btnClickMe.setBounds(264, 180, 89, 23);
		frame.getContentPane().add(btnClickMe);
		
		// action performed section
		
		otherRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if (otherRadioButton.isSelected())  {
					
					maleRadioButton.setSelected(false);
					femaleRadioButton.setSelected(false);
				}	
			}
		});
			
		maleRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if (maleRadioButton.isSelected())  {
					
					otherRadioButton.setSelected(false);
					femaleRadioButton.setSelected(false);
				}	
			}
		});
		
		femaleRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if (femaleRadioButton.isSelected())  {
					
					otherRadioButton.setSelected(false);
					maleRadioButton.setSelected(false);
				}	
			}
		});
		
	}
}
