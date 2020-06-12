package Listener_Classes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
// biblioteca importada com a implementa��o da classe RadioListener. 
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Listener_Classes {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();	
	// Esta linha de c�digo, que cria uma isnt�ncia de JLabel, foi retirada l� de baixo e trazida para c�.
	// Ser� utilizada na classe que estamos criando (RadioListener). 
	JLabel label = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listener_Classes window = new Listener_Classes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	// Uma classe ser� criada aqui, manualmente, ap�s a classe main:
	// class: uma classe foi criada.
	// RadioListener: nome da classe.
	// implements: palavra chave que permite a defini��o de classe para herdar multiplos tipos de interfaces.
	// J� tenho anota��es anteriores sobre o uso de implements. Mas consigo "enxergar" tranquilamente que a inten��o
	// � herdar as interfaces de ActionListener. 
	// {} bloco de c�digo da classe.
	// Lembrando que:
	// estamos criando uma classe dentro de outra classe. 
	class RadioListener implements ActionListener {

		// Override: a inten��o �: quando o combobox for selecionado, a a��o ser� executada. 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Comentar esta parte do c�digo.
			// Temos a classe JRadioButton declarando o "objeto" botao.
			// Este objeto recebe o valor do bot�o, acompanhado do objeto no qual cada evento inicial ocorreu (getSource).
			// Declara��o um pouco incomum para mim,...mas o que est� acontecendo aqui � que botao est� recebendo o valor representado..
			// pela sele��o do bot�o correspondente. 
			// label (que � o label que inserimos na interface) "seta" o tal valor,...passando como par�metro getText. 
			// getSource est� passando para a vari�vel "bot�o" o valor referente a cada op��o escolhida, no caso, a vari�vel...
			// que representa cada um dos comboboxs. 
			// O funcionamento disso depende diretamente das linhas de c�digos inseridas nos bot�es. 
			JRadioButton botao = (JRadioButton)e.getSource();
			label.setText(botao.getText());			
		}		
	}	
	
	/**
	 * Create the application.
	 */
	public Listener_Classes() {
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
		
		
		
		
		
		// AQUI EST� O BLOCO COM OS TR�S BOT�ES DO COMBOBOX CRIADOS.
		// VAMOS IMPLEMENTAR AS A��ES REFERENTES � EXECU��O DE CADA UM DESTES BOT�ES. 
		//----------------------------------------------------------------
		
		// Inst�ncia da classe RadioListener, chamada listener, foi criada.
		// Ela precisou ser instanciada para que possamos associar as a��es aos bot�es do combobox. 
		// **************************************************************
		RadioListener listener = new RadioListener();
		// **************************************************************
		
		
		
		JRadioButton combobox1 = new JRadioButton("Item 1");
		buttonGroup.add(combobox1);
		combobox1.setBounds(6, 7, 109, 23);
		frame.getContentPane().add(combobox1);
		// Linha abaixo foi inclu�da manualmente. � ela que executa a a��o. 
		combobox1.addActionListener(listener);
		
		JRadioButton combobox2 = new JRadioButton("Item 2");
		buttonGroup.add(combobox2);
		combobox2.setBounds(6, 33, 109, 23);
		frame.getContentPane().add(combobox2);
		// Linha abaixo foi inclu�da manualmente. � ela que executa a a��o.
		combobox2.addActionListener(listener);
		
		JRadioButton combobox3 = new JRadioButton("Item 3");
		buttonGroup.add(combobox3);
		combobox3.setBounds(6, 59, 109, 23);
		frame.getContentPane().add(combobox3);
		// Linha abaixo foi inclu�da manualmente. � ela que executa a a��o.
		combobox3.addActionListener(listener);
		
		//----------------------------------------------------------------
		
		// A linha de c�digo abaixo foi retirada desta parte do c�digo e levada...
		// para o in�cio do c�digo. 
		// JLabel label = new JLabel("");
		label.setBounds(6, 89, 253, 17);
		frame.getContentPane().add(label);
	}

}
