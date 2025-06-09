package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
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
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(70, 129, 109, 23);
		frame.getContentPane().add(femaleRadioButton);
		
		JRadioButton otherRadioButton = new JRadioButton("Other");
		otherRadioButton.setBounds(70, 155, 109, 23);
		frame.getContentPane().add(otherRadioButton);
		
		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setSelected(true);
		maleRadioButton.setBounds(70, 103, 109, 23);
		frame.getContentPane().add(maleRadioButton);
		
		
		
		maleRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(maleRadioButton.isSelected())  {
					
					femaleRadioButton.setSelected(false);
					otherRadioButton.setSelected(false);
				}	
			}
		});
		
		femaleRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(femaleRadioButton.isSelected())  {
					
					maleRadioButton.setSelected(false);
					otherRadioButton.setSelected(false);
				}	
			}
		});
		
		otherRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(otherRadioButton.isSelected())  {
					
					maleRadioButton.setSelected(false);
					femaleRadioButton.setSelected(false);
				}	
			}
		});
		
		
		
		
		
		
		
		JButton button = new JButton("Click Me!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (maleRadioButton.isSelected())  {
					textField.setText("Male selected");
				}
				
				if (femaleRadioButton.isSelected())  {
					textField.setText("Female selected");
				}
				
				if (otherRadioButton.isSelected())  {
					textField.setText("Other selected");
				}
				
			}
		});
		button.setBounds(70, 200, 89, 23);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(241, 130, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
