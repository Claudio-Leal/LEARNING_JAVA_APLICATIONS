package Condicionais;

public class Condicionais {
	
	public static void main (String [] args) {
		
		// Vari�vel statemement, que � um booleano, recebe o resultado booleano da compara��o.
		// Booleanos s� trabalham com true ou false. Ent�o o que ela recebe � o resultado da compara��o. 
		boolean statement1 = 1 == 1;
		boolean statement2 = 1 > 3;
		
		// Testando se os resultados acima s�o verdadeiros. 
		// Note que n�o precisei indicar as atribui��es feitas nas vari�veis,...
		// inserindo apenas as vari�veis, o compilador j� entende que estamos perguntando se...
		// as condi��es foram atendidas, ou seja, se s�o true. 
		if (statement1 && statement2) {
			System.out.println("Conditional is true!");
		} else {
			System.out.println("Conditional is false!");		
		}		
	}
}

