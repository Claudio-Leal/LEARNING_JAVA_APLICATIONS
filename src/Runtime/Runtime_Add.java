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
		
		// BLOCO DE C�DIGO CRIADO COM O CLIQUE DUPLO NO BOT�O. 
		//-----------------------------------------------------------
		
		JButton btnNewButton = new JButton("Create label");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				// LABEL INSERIDA MANUALMENTE DENTRO DO BOT�O. 
				JLabel label = new JLabel("Runtime Add!");
				label.setBounds(0, 38, 150, 14);				
				frame.getContentPane().add(label);
				
				// COMPONENTES INSERIDOS MANUALMENTE.
				// REVALIDATE:
				// Esse � um m�todo de conveni�ncia que deve ajudar os desenvolvedores de... 
				// aplicativos a evitar a valida��o manual de ra�zes. 
				// Basicamente, � equivalente a chamar primeiro o m�todo invalidate () neste componente e,... 
				// em seguida, chamar o m�todo validate () na raiz v�lida mais pr�xima.
				// REPAINT:
				// Repita este componente.
				// Se esse componente for um componente leve, esse m�todo causar� uma chamada ao m�todo...
				// de pintura desse componente o mais r�pido poss�vel. 
				// Caso contr�rio, esse m�todo causar� uma chamada para o m�todo de atualiza��o desse componente o mais r�pido poss�vel.
				
				frame.revalidate();
				frame.repaint();
			}
		});
		
		//-----------------------------------------------------------		
		
		btnNewButton.setBounds(0, 0, 124, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		// Bloco abaixo foi recortado e inserido dentro do bloco de c�digo do bot�o. 
//		JLabel label = new JLabel("New label");
//		label.setBounds(0, 38, 46, 14);
//		frame.getContentPane().add(label);
	}

}
