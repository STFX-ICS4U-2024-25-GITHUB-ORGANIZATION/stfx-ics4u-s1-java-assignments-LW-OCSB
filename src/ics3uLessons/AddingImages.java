package ics3uLessons;

// need to import for images
import javax.swing.ImageIcon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddingImages {

	// variables
	private JFrame frame;
	ImageIcon myPicture = new ImageIcon(getClass().getResource("/resources/dog.jpg"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingImages window = new AddingImages();
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
	public AddingImages() {
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
		
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(102, 58, 228, 147);
		// add image to label
		lblNewLabel.setIcon(myPicture);
		frame.getContentPane().add(lblNewLabel);
	}
}
