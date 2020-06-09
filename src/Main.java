/*
 * Revis�o de fun��es (m�todos).
 * 
 * Static: � UMA PALAVRA CHAVE, UM MODIFICADOR. Significa que o m�todo pode ser chamado sem que a classe seja instanciada em um objeto, 
 * � muito �til para a classe principal (main) j� que � a primeira a ser executada. 
 * Resumindo, inserir STATIC � importante para que os m�todos da classe possam ser acessados sem que...
 * a classe seja instanciada. Desta forma, algumas linhas de c�digo podem ser dispensadas. 
 */


public class Main {

	public static void main(String[] args) {	
		// Chamada do m�todo "est�tico". 
		printStatic("Static method!");	
		
		
		// Chamada do m�todo "n�o est�tico".
		// Estamos chamando o m�todo dentro da classe Main, ent�o ela precisa ser instanciada. 
		// Somente assim, o m�todo "printNonStatic" pode ser chamado.  
		Main myMain = new Main ();
		myMain.printNonStatic("Non Static Method!");
	}	
	
	
	//----------------------------------------------------------------------------
	// M�todo: pois possui retorno.
	// Static: permite acesso aos m�todos sem que a classe seja instanciada. 
	// printS: nome do m�todo. 
	// (): argumentos.
	// String data: par�metros,...com a string data declarada. 
	static void printStatic (String dataStatic) {
		System.out.println(dataStatic);
	}
		
	
	//----------------------------------------------------------------------------
	// M�todo n�o est�tico. 
	void printNonStatic (String dataNonStatic) {
		System.out.println(dataNonStatic);
	}	
}
