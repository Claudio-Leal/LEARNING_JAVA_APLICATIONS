package Runtime;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Runtime_Add {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Runtime_Add window = new Runtime_Add();
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
	public Runtime_Add() {
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
		
		// BLOCO DE CÓDIGO CRIADO COM O CLIQUE DUPLO NO BOTÃO. 
		//-----------------------------------------------------------
		
		JButton btnNewButton = new JButton("Create label");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				// LABEL INSERIDA MANUALMENTE DENTRO DO BOTÃO. 
				JLabel label = new JLabel("Runtime Add!");
				label.setBounds(0, 38, 150, 14);				
				frame.getContentPane().add(label);
				
				// COMPONENTES INSERIDOS MANUALMENTE.
				// REVALIDATE:
				// Esse é um método de conveniência que deve ajudar os desenvolvedores de... 
				// aplicativos a evitar a validação manual de raízes. 
				// Basicamente, é equivalente a chamar primeiro o método invalidate () neste componente e,... 
				// em seguida, chamar o método validate () na raiz válida mais próxima.
				// REPAINT:
				// Repita este componente.
				// Se esse componente for um componente leve, esse método causará uma chamada ao método...
				// de pintura desse componente o mais rápido possível. 
				// Caso contrário, esse método causará uma chamada para o método de atualização desse componente o mais rápido possível.
				
				frame.revalidate();
				frame.repaint();
			}
		});
		
		//-----------------------------------------------------------		
		
		btnNewButton.setBounds(0, 0, 124, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		// Bloco abaixo foi recortado e inserido dentro do bloco de código do botão. 
//		JLabel label = new JLabel("New label");
//		label.setBounds(0, 38, 46, 14);
//		frame.getContentPane().add(label);
	}

}
