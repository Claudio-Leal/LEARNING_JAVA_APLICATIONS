package Condicionais;

public class Condicionais {
	
	public static void main (String [] args) {
		
		// Variável statemement, que é um booleano, recebe o resultado booleano da comparação.
		// Booleanos só trabalham com true ou false. Então o que ela recebe é o resultado da comparação. 
		boolean statement1 = 1 == 1;
		boolean statement2 = 1 > 3;
		
		// Testando se os resultados acima são verdadeiros. 
		// Note que não precisei indicar as atribuições feitas nas variáveis,...
		// inserindo apenas as variáveis, o compilador já entende que estamos perguntando se...
		// as condições foram atendidas, ou seja, se são true. 
		if (statement1 && statement2) {
			System.out.println("Conditional is true!");
		} else {
			System.out.println("Conditional is false!");		
		}		
	}
}

