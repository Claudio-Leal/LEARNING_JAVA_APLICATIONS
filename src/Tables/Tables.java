package Tables;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
// Biblioteca importada com a cria��o da classe TableModel. 
import javax.swing.table.AbstractTableModel;

public class Tables {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tables window = new Tables();
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


	
//---------------------------------------------------------------------------
	
	// Vamos criar aqui, uma classe para tratar o modelo da tabela (Tabel Model)
	// class: declara��o da classe. 
	// TableData: nome da classe. 
	// extends: extende, ou seja, herda todos os recursos da classe AbstractTableModel.
	// Teremos 100 c�lulas (10 x 10), com a String Hello!
	class TableData extends AbstractTableModel {

		/**
		 * 
		 */
		// Explica��es sobre esta linha de c�digo (serial) em PullRequest.
		// Esta � a �nica linha de c�digo gerada atrav�s do generated.
		private static final long serialVersionUID = 406509359038651812L;

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			// Modificamos o valor do retorno para 10. 
			return 10;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			// Modificamos o valor do retorno para 10.
			return 10;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			// return null;
			// Ao inv�s de retornar null, vamos retornar string, que aparecer� nas c�lulas da tabela. 
			return "Hello!";
		}
		
	}	
//---------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	public Tables() {
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
		
		// Bloco de c�digo da tabela 
		//------------------------------------------------------------
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(table);
		//------------------------------------------------------------
		
		
		// Cria��o de uma inst�ncia da classe TableData, chamada "data":
		TableData data = new TableData();
		// Define o modelo de dados para esta tabela como dataModel e registra-o para notifica��es do ouvinte do novo modelo de dados.
		// Observe que "data" est� sendo passado como par�metro da chamada do m�todo.
		table.setModel(data);
	}
}
