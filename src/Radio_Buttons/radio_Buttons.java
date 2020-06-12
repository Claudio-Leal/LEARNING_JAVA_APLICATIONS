package Radio_Buttons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class radio_Buttons {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio_Buttons window = new radio_Buttons();
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
	public radio_Buttons() {
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
		
		JRadioButton radiobox1 = new JRadioButton("Item 1");
		buttonGroup.add(radiobox1);
		radiobox1.setBounds(6, 7, 109, 23);
		frame.getContentPane().add(radiobox1);
		
		JRadioButton radiobox2 = new JRadioButton("Item 2");
		buttonGroup.add(radiobox2);
		radiobox2.setBounds(6, 33, 109, 23);
		frame.getContentPane().add(radiobox2);
		
		JRadioButton radiobox3 = new JRadioButton("Item 3");
		buttonGroup.add(radiobox3);
		radiobox3.setBounds(6, 59, 109, 23);
		frame.getContentPane().add(radiobox3);
	}
}
