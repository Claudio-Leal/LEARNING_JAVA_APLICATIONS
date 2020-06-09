/*
 * Uma lição que está sendo fixada aqui:
 * Toda vez que criarmos uma classe, quando os atributos, métodos e construtores 
 * da classe forem chamadas a partir de outras classes, é necessário instanciá-la. 
 * 
 * Exceção para o modificador static, que autoriza o acesso a estes itens, sem a necessidade
 * de instanciá-la. 
 * 
 * Em caso de criação de instâncias, não faremos a chamada utilizando o nome da classe, mas sim,
 * o nome da instância que criamos + "." para acesso ao seu conteúdo.
 * Exemplo: "mcClass.", conforme código abaixo. 
 */

package Classes;

public class Main {

	public static void main(String[] args) {
		// Classe instanciada, o que permite a chamada de seus métodos. 
		MyClass mcClass = new MyClass();
		
		// Impressão do atributo existente na classe.
		System.out.println("Valor da variável myInt dentro da classe: " + mcClass.myInt);
		
		// Modificando o valor do atributo nesta classe. 
		mcClass.myInt = 10;
		System.out.println("Valor da variável myInt modificado nesta classe: " + mcClass.myInt);
		
		// Chamada do método.
		mcClass.myMethod();		
	}
}
