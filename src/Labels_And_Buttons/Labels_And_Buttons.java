package Labels_And_Buttons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Labels_And_Buttons {

	private JFrame frame;
	private JTextField txtBoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Labels_And_Buttons window = new Labels_And_Buttons();
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
	public Labels_And_Buttons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtBoto = new JTextField();
		txtBoto.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBoto.setBounds(83, 14, 195, 20);
		frame.getContentPane().add(txtBoto);
		txtBoto.setColumns(10);
		
		JButton btnNewButton = new JButton("Gabriel");
		btnNewButton.setBounds(288, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(10, 15, 63, 16);
		frame.getContentPane().add(lblNewLabel);
	}
}
