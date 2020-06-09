/*
 * Array:
 * Quando se cria um array em Java, � necess�rio determinar qual o tipo de dado
 * dos valores que ser�o armazenados em cada posi��o do array.
 * Arrays sempre iniciam com zero. 
 */


package Array;

public class Main {
	public static void main (String [] args) {
		
		// String:      tipo do array.
		// []:          siginifica que estamos tratando de um array. 
		// breakfast:   nome do array. 
		// new String:  A string breakfast recebe uma inst�ncia String. 
		// [3]:         Inst�ncia criada com tr�s posi��es. 
		String [] breakfast = new String [3];
		
		// Mostrando o tamanho do array:
		System.out.println("Tamanho do array : " + breakfast.length);
		
		System.out.println("----------------------------------------------------");
		
		
		// Fazendo atribui��es a cada posi��o da String:
		breakfast [0] = "Ovo";
		breakfast [1] = "P�o";
		breakfast [2] = "Manteiga";		
		
		
		// M�todo simples para impress�o do que foi armazenado em cada posi��o do array.		
		System.out.println("APENAS SOUT:");
		System.out.println("Valor na posi��o 0: " + breakfast[0]);
		System.out.println("Valor na posi��o 1: " + breakfast[1]);
		System.out.println("Valor na posi��o 2: " + breakfast[2]);
		
		
		System.out.println("----------------------------------------------------");

		
		// Impress�o com a utiliza��o do for.
		System.out.println("COM FOR:");
		for (int i = 0; i < breakfast.length; i++) {
			System.out.println("Valor na posi��o " + i + ": " + breakfast[i]);
		}
	}
}
