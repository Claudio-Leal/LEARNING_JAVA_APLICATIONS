package Tabela_Arquivo_Externo;

import java.awt.EventQueue;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;


import javax.swing.JScrollPane;

public class Tabela_Arquivo_Externo {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabela_Arquivo_Externo window = new Tabela_Arquivo_Externo();
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

		
		private static final long serialVersionUID = 8891089288473519354L;
		// A declara��o abaixo determina um array bidimensional 3x3.
		// Uma nova declara��o ser� feita para que o arquivo seja lido at� que todos os dados tenham sido lidos. 
		// Para isso, vamos criar a vari�vel array sem inici�-la. E dentro do for que varre o arquivo (i), vamos incluir um teste para ver se /0 foi encontrado. 
		int [][] allData;
		// int [][] allData = new int [3][3];		
		public DadosTabela (){
		// Bloco de comentado, pois agora a leitura ser� do arquivo csv.		
		//		allData [0] = new int [] {1, 2, 3};
		//		allData [1] = new int [] {4, 5, 6};
		//		allData [2] = new int [] {7, 8, 9};
		// Chamada do m�todo que faz a leitura do arquivo. 
		loadFile("ArquivoTabela.csv");
		}
		
		//---------------------------------------------
		//  BLOCO DE C�DIGO PARA LEITURA DO ARQUIVO
		//          M�TODO loadFile criado
		void loadFile (String fileName) {
			Path filePath = FileSystems.getDefault().getPath("C:/SERRATEC/LEARNING_JAVA_APLICATIONS/src/Tabela_Arquivo_Externo", fileName);
			try {
				// Cria��o da lista. 
				List<String> lines = Files.readAllLines(filePath);				
				// For que vai varrer a lista. 
				for (int i = 0; i < lines.size(); i++) {
					// Pegando os valores das linhas. 
					String lineString = lines.get(i);
					String [] lineArrayString = lineString.split(",");
					// If inserido para testar se allData � igual a null. 
					if (allData == null) {
						allData = new int [lines.size()][lineArrayString.length];
					}
					for (int j = 0 ; j < lineArrayString.length ; j++) {						
					int parsedInt = Integer.parseInt(lineArrayString[j]);
					allData[i][j] = parsedInt;
					}
					// Utiliza��o do m�todo split:
					// Esse m�todo funciona como se invocando o m�todo de divis�o de dois argumentos... 
					// com a express�o fornecida e um limite de zero. 
					// As seq��ncias de caracteres vazias � direita n�o s�o inclu�das na matriz resultante.
					// Nos par�metros (regex), determinamos o que dever� ser rejeitado,...ou seja, o que n�o deve ser lido.					
					// For para converter os valores de string para inteiro.
					// No bloco do for de dentro (j), utiliza��o de parse, para converter de string para inteiro.					
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}				
		//---------------------------------------------
				

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub 
			return allData.length;			
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub			
			return allData[rowIndex][columnIndex];			
		}		
	}
	
	
	public Tabela_Arquivo_Externo() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		DadosTabela dadosTabela = new DadosTabela();
		table.setModel(dadosTabela);
	}
}
