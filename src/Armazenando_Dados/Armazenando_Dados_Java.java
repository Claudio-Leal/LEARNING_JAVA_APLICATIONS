package Armazenando_Dados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;

public class Armazenando_Dados_Java {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Armazenando_Dados_Java window = new Armazenando_Dados_Java();
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
	
//---------------------------------------------------------------------------------------------------
	class DadosTabela extends AbstractTableModel {

		// Observe que o serial foi criado dentro da nova classe.		
		private static final long serialVersionUID = 8891089288473519354L;
		
		// vou criar o array aqui,...acho que n�o far� muita diferen�a. O professor criou antes do ID, mas vou coloc�-lo aqui.
		// no caso, podemos dizer que criamos um array com 3 linhas e 3 colunas.
		// apenas para relembrar:
		// posi��o 0, possui 3 posi��es.
		// posi��o 1, possui 3 posi��es. 
		// posi��o 2, possui 3 posi��es. 
		int [][] allData = new int [3][3];
		
		// Cria��o de um m�todo construtor, para atribuir os valores a cada posi��o do array:
		public DadosTabela (){			
		// O professor ensinou desta forma, mas informou que a sintaxe abaixo � mais leg�vel:
		//			allData [0][0] = 1;
		//			allData [0][1] = 2;
		//			allData [0][2] = 3;
			
		// � o melhor m�todo para ver o resultado na tabela, pois cada linha ser� escrita exatamente como est� abaixo:
		// 1� linha: 1 - 2 - 3
		// 2� linha: 3 - 4 - 5
		// 3� linha: 6 - 7 - 8
		allData [0] = new int [] {1, 2, 3};
		allData [1] = new int [] {4, 5, 6};
		allData [2] = new int [] {7, 8, 9};
		// Agora s� falta conectar a tabela com estes dados. Precisaremos mexer nos m�todos abaixo.
		}
//---------------------------------------------------------------------------------------------------
		

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			// Para determinar as linhas, retornaremos o comprimento de allData. 
			return allData.length;
			
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			// Aqui, retornaremos o comprimento da posi��o zero.
			// Retornar� todos os itens da posi��o zero da matriz.						
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub			
			return allData[rowIndex][columnIndex];			
		}		
	}
	
	
	
	
	
	public Armazenando_Dados_Java() {
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
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(table);
		
		DadosTabela dadosTabela = new DadosTabela();
		table.setModel(dadosTabela);
	}
}
