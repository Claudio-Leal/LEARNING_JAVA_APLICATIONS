/*
 * Revisão de funções (métodos).
 * 
 * Static: É UMA PALAVRA CHAVE, UM MODIFICADOR. Significa que o método pode ser chamado sem que a classe seja instanciada em um objeto, 
 * é muito útil para a classe principal (main) já que é a primeira a ser executada. 
 * Resumindo, inserir STATIC é importante para que os métodos da classe possam ser acessados sem que...
 * a classe seja instanciada. Desta forma, algumas linhas de código podem ser dispensadas. 
 */


public class Main {

	public static void main(String[] args) {	
		// Chamada do método "estático". 
		printStatic("Static method!");	
		
		
		// Chamada do método "não estático".
		// Estamos chamando o método dentro da classe Main, então ela precisa ser instanciada. 
		// Somente assim, o método "printNonStatic" pode ser chamado.  
		Main myMain = new Main ();
		myMain.printNonStatic("Non Static Method!");
	}	
	
	
	//----------------------------------------------------------------------------
	// Método: pois possui retorno.
	// Static: permite acesso aos métodos sem que a classe seja instanciada. 
	// printS: nome do método. 
	// (): argumentos.
	// String data: parâmetros,...com a string data declarada. 
	static void printStatic (String dataStatic) {
		System.out.println(dataStatic);
	}
		
	
	//----------------------------------------------------------------------------
	// Método não estático. 
	void printNonStatic (String dataNonStatic) {
		System.out.println(dataNonStatic);
	}	
}
