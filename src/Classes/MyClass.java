/*
 * Criação de uma classe apenas para exemplificar a interação entre os arquivos.
 * Estrutura básica de uma classe.  
 */

package Classes;

public class MyClass {	
	// Criação de variáveis (atributos) dentro da classe, mas fora do método. 
	int myInt = 5;
	
	// Método construtor.
	// Não possui retorno (o retorno é o da própria classe). 
	MyClass() {
		System.out.println("This is my constructor method!");
	}	
	
	// Método, pois possui retorno.
	// myMethod: nome do método.
	// nenhum parâmetro definido nos argumentos. 
	// quando chamado, este método executará o sout.
	// Não possui o modificador Static, então a classe precisará ser instanciada, quando...
	// quisermos chamar o myMethod.
	void myMethod () {
		System.out.println("This is my method!");
	}
}
