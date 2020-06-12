package CheckBoxes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckBoxex {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxex window = new CheckBoxex();
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
	public CheckBoxex() {
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
		
		
		// Label recortado do final do c�digo e colado aqui. 
		// Ser� tratado dentro do bloco do checkbox. 
		JLabel label = new JLabel("Off");
		label.setBounds(30, 33, 62, 22);
		frame.getContentPane().add(label);		
		
		
		// BLOCO CRIADO COM O ACESSO �S SEGUINTES FUN��ES:
		// BOT�O DIREITO NO OBJETO CHECKBOX > ADD EVENT HANDLER > ACTION > ACTION PERFORMED
		//---------------------------------------------------------		
		
		JCheckBox checkbox = new JCheckBox("Cl\u00E1udio On/Off");
		checkbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Tratamento do check box com a utiliza��o do label. 
				// Utiliza��o do Operador tern�rio. 
				// O teste �:
				// checkbox est� marcado? Se positivo, imprima "On",...se negativo, imprima "Off". 
				String textString = (checkbox.isSelected()) ? "On" : "Off";
				// chamada de "label":
				// Off � o valor padr�o do label, mas poder� ser modificado para On, caso o checkbox esteja marcado. 
				label.setText(textString);
			}
		});
		//---------------------------------------------------------
		checkbox.setBounds(26, 7, 109, 31);
		frame.getContentPane().add(checkbox);
		
		
		// Bloco referente ao Label com o texto Off. 
		// Ele ser� recortado daqui e colocado antes do bloco do checkbox, para que ele possa ser...
		// ser chamado pelo bloco checkbox. 
		//		JLabel label = new JLabel("Off");
		//		label.setBounds(30, 33, 62, 22);
		//		frame.getContentPane().add(label);
	}
}
