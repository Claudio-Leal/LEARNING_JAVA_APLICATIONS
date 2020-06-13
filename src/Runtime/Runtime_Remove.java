package Runtime;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Runtime_Remove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Runtime_Remove window = new Runtime_Remove();
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
	public Runtime_Remove() {
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
		
		
		// BLOCO TRAZIDO PARA C� (PRECISA EXISTIR PARA SER REMOVIDO)
		//------------------------------------------------------------
		JLabel label = new JLabel("Este objeto ser� removido!");
		label.setBounds(0, 34, 200, 14);
		frame.getContentPane().add(label);
		//------------------------------------------------------------
		
		
		// BLOCO CRIADO COM O DUPLO CLIQUE NO BOT�O. 
		//------------------------------------------------------------
		JButton btnNewButton = new JButton("Remove label");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// estes dois componentes precisam ser mantidos...
				// e � mais apropriado que sejam executados antes da remo��o. 
				frame.revalidate();
				frame.repaint();				
				frame.getContentPane().remove(label);
				
				
			}
		});
		//------------------------------------------------------------
		
		
		btnNewButton.setBounds(0, 0, 111, 23);
		frame.getContentPane().add(btnNewButton);
		
		// Bloco ser� levado para o in�cio do c�digo, pois para remover, � necess�rio existir. 
		//		JLabel lblNewLabel = new JLabel("New label");
		//		lblNewLabel.setBounds(0, 34, 46, 14);
		//		frame.getContentPane().add(lblNewLabel);
	}
}
