package Connect_UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Connect_UI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connect_UI window = new Connect_UI();
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
	public Connect_UI() {
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
		
		
		// Bloco de c�digo referente ao label exemplo (retirado l� de baixo e inserido aqui). 		
		JLabel label_exemplo = new JLabel("");
		label_exemplo.setBounds(86, 62, 289, 23);
		frame.getContentPane().add(label_exemplo);
		
		
		//------------------------------------------------------------------
		JButton Bot�o = new JButton("Diga: Ol\u00E1!");
		Bot�o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acessei esta �rea dando clique duplo no bot�o existente em design.
				// Este bloco de c�digo � criado automaticamente quando dou o clique duplo no bot�o. 
				// � aqui que entrar� a parcela do c�digo que desejo executar. 				
				// Chamando label_exemplo e passando para ele, atrav�s do m�todo setText, a string Ol�, que ser� concatenada com o texto...
				// digitado pelo usu�rio. 
				label_exemplo.setText("Ol� " + textField.getText() + "!");
			}		
		});
		//------------------------------------------------------------------
		Bot�o.setBounds(308, 11, 89, 23);
		frame.getContentPane().add(Bot�o);
		
		textField = new JTextField();
		textField.setBounds(117, 11, 181, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(10, 6, 97, 28);
		frame.getContentPane().add(lblNewLabel);
		
		// Linhas de c�digo que representa o label_exemplo.
		// Foram retiradas daqui e inseridas acima do bloco de c�digo do bot�o. 
		//		JLabel label_exemplo = new JLabel("");
		//		label_exemplo.setBounds(86, 62, 289, 23);
		//		frame.getContentPane().add(label_exemplo);
	}

}
