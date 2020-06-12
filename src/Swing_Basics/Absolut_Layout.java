package Swing_Basics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Absolut_Layout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Absolut_Layout window = new Absolut_Layout();
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
	public Absolut_Layout() {
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
		
		JButton btnNewButton = new JButton("Bot\u00E3o 1");
		btnNewButton.setBounds(162, 110, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
