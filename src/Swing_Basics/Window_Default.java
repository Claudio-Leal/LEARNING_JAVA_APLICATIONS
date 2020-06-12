package Swing_Basics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Window_Default {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_Default window = new Window_Default();
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
	public Window_Default() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Bot\u00E3o 2");
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Bot\u00E3o 3");
		frame.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("Bot\u00E3o 1");
		frame.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("Bot\u00E3o 4");
		frame.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("Bot\u00E3o 5");
		frame.getContentPane().add(btnNewButton_4, BorderLayout.EAST);
	}

}
