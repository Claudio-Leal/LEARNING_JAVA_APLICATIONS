/*
 * Uma li��o que est� sendo fixada aqui:
 * Toda vez que criarmos uma classe, quando os atributos, m�todos e construtores 
 * da classe forem chamadas a partir de outras classes, � necess�rio instanci�-la. 
 * 
 * Exce��o para o modificador static, que autoriza o acesso a estes itens, sem a necessidade
 * de instanci�-la. 
 * 
 * Em caso de cria��o de inst�ncias, n�o faremos a chamada utilizando o nome da classe, mas sim,
 * o nome da inst�ncia que criamos + "." para acesso ao seu conte�do.
 * Exemplo: "mcClass.", conforme c�digo abaixo. 
 */

package Classes;

public class Main {

	public static void main(String[] args) {
		// Classe instanciada, o que permite a chamada de seus m�todos. 
		MyClass mcClass = new MyClass();
		
		// Impress�o do atributo existente na classe.
		System.out.println("Valor da vari�vel myInt dentro da classe: " + mcClass.myInt);
		
		// Modificando o valor do atributo nesta classe. 
		mcClass.myInt = 10;
		System.out.println("Valor da vari�vel myInt modificado nesta classe: " + mcClass.myInt);
		
		// Chamada do m�todo.
		mcClass.myMethod();		
	}
}
