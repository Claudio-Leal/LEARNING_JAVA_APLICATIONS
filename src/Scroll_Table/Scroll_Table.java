package Scroll_Table;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JScrollPane;

public class Scroll_Table {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scroll_Table window = new Scroll_Table();
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
		
		// vou criar o array aqui,...acho que não fará muita diferença. O professor criou antes do ID, mas vou colocá-lo aqui.
		// no caso, podemos dizer que criamos um array com 3 linhas e 3 colunas.
		// apenas para relembrar:
		// posição 0, possui 3 posições.
		// posição 1, possui 3 posições. 
		// posição 2, possui 3 posições. 
		int [][] allData = new int [3][3];
		
		// Criação de um método construtor, para atribuir os valores a cada posição do array:
		public DadosTabela (){			
		// O professor ensinou desta forma, mas informou que a sintaxe abaixo é mais legível:
		//			allData [0][0] = 1;
		//			allData [0][1] = 2;
		//			allData [0][2] = 3;
			
		// É o melhor método para ver o resultado na tabela, pois cada linha será escrita exatamente como está abaixo:
		// 1º linha: 1 - 2 - 3
		// 2º linha: 3 - 4 - 5
		// 3º linha: 6 - 7 - 8
		allData [0] = new int [] {1, 2, 3};
		allData [1] = new int [] {4, 5, 6};
		allData [2] = new int [] {7, 8, 9};
		// Agora só falta conectar a tabela com estes dados. Precisaremos mexer nos métodos abaixo.
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
			// Aqui, retornaremos o comprimento da posição zero.
			// Retornará todos os itens da posição zero da matriz.						
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub			
			return allData[rowIndex][columnIndex];			
		}		
	}
	
	
	
	
	
	public Scroll_Table() {
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
		
		// Bloco de código do surround with. 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 65);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		// Esta linha de código precisa ser retirada daqui e colocada após a criação da instância da tabela. 
		// Parece que é um bug do Eclipse.  
		// table.setModel(dadosTabela);
		
		DadosTabela dadosTabela = new DadosTabela();
		// Agora sim, na posição correta:
		table.setModel(dadosTabela);
	}
}
