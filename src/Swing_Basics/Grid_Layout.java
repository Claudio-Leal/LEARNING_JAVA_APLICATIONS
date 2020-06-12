package Swing_Basics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Grid_Layout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grid_Layout window = new Grid_Layout();
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
	public Grid_Layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Bot\u00E3o 1");
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bot\u00E3o 2");
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Bot\u00E3o 3");
		frame.getContentPane().add(btnNewButton_2);
	}

}
