package Listener_Classes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
// biblioteca importada com a implementação da classe RadioListener. 
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Listener_Classes {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();	
	// Esta linha de código, que cria uma isntância de JLabel, foi retirada lá de baixo e trazida para cá.
	// Será utilizada na classe que estamos criando (RadioListener). 
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

	
	// Uma classe será criada aqui, manualmente, após a classe main:
	// class: uma classe foi criada.
	// RadioListener: nome da classe.
	// implements: palavra chave que permite a definição de classe para herdar multiplos tipos de interfaces.
	// Já tenho anotações anteriores sobre o uso de implements. Mas consigo "enxergar" tranquilamente que a intenção
	// é herdar as interfaces de ActionListener. 
	// {} bloco de código da classe.
	// Lembrando que:
	// estamos criando uma classe dentro de outra classe. 
	class RadioListener implements ActionListener {

		// Override: a intenção é: quando o combobox for selecionado, a ação será executada. 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Comentar esta parte do código.
			// Temos a classe JRadioButton declarando o "objeto" botao.
			// Este objeto recebe o valor do botão, acompanhado do objeto no qual cada evento inicial ocorreu (getSource).
			// Declaração um pouco incomum para mim,...mas o que está acontecendo aqui é que botao está recebendo o valor representado..
			// pela seleção do botão correspondente. 
			// label (que é o label que inserimos na interface) "seta" o tal valor,...passando como parâmetro getText. 
			// getSource está passando para a variável "botão" o valor referente a cada opção escolhida, no caso, a variável...
			// que representa cada um dos comboboxs. 
			// O funcionamento disso depende diretamente das linhas de códigos inseridas nos botões. 
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
		
		
		
		
		
		// AQUI ESTÁ O BLOCO COM OS TRÊS BOTÕES DO COMBOBOX CRIADOS.
		// VAMOS IMPLEMENTAR AS AÇÕES REFERENTES À EXECUÇÃO DE CADA UM DESTES BOTÕES. 
		//----------------------------------------------------------------
		
		// Instância da classe RadioListener, chamada listener, foi criada.
		// Ela precisou ser instanciada para que possamos associar as ações aos botões do combobox. 
		// **************************************************************
		RadioListener listener = new RadioListener();
		// **************************************************************
		
		
		
		JRadioButton combobox1 = new JRadioButton("Item 1");
		buttonGroup.add(combobox1);
		combobox1.setBounds(6, 7, 109, 23);
		frame.getContentPane().add(combobox1);
		// Linha abaixo foi incluída manualmente. É ela que executa a ação. 
		combobox1.addActionListener(listener);
		
		JRadioButton combobox2 = new JRadioButton("Item 2");
		buttonGroup.add(combobox2);
		combobox2.setBounds(6, 33, 109, 23);
		frame.getContentPane().add(combobox2);
		// Linha abaixo foi incluída manualmente. É ela que executa a ação.
		combobox2.addActionListener(listener);
		
		JRadioButton combobox3 = new JRadioButton("Item 3");
		buttonGroup.add(combobox3);
		combobox3.setBounds(6, 59, 109, 23);
		frame.getContentPane().add(combobox3);
		// Linha abaixo foi incluída manualmente. É ela que executa a ação.
		combobox3.addActionListener(listener);
		
		//----------------------------------------------------------------
		
		// A linha de código abaixo foi retirada desta parte do código e levada...
		// para o início do código. 
		// JLabel label = new JLabel("");
		label.setBounds(6, 89, 253, 17);
		frame.getContentPane().add(label);
	}

}
