/*
 * Cria��o de uma classe apenas para exemplificar a intera��o entre os arquivos.
 * Estrutura b�sica de uma classe.  
 */

package Classes;

public class MyClass {	
	// Cria��o de vari�veis (atributos) dentro da classe, mas fora do m�todo. 
	int myInt = 5;
	
	// M�todo construtor.
	// N�o possui retorno (o retorno � o da pr�pria classe). 
	MyClass() {
		System.out.println("This is my constructor method!");
	}	
	
	// M�todo, pois possui retorno.
	// myMethod: nome do m�todo.
	// nenhum par�metro definido nos argumentos. 
	// quando chamado, este m�todo executar� o sout.
	// N�o possui o modificador Static, ent�o a classe precisar� ser instanciada, quando...
	// quisermos chamar o myMethod.
	void myMethod () {
		System.out.println("This is my method!");
	}
}
