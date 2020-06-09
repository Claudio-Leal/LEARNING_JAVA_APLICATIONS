/*
 * Array:
 * Quando se cria um array em Java, é necessário determinar qual o tipo de dado
 * dos valores que serão armazenados em cada posição do array.
 * Arrays sempre iniciam com zero. 
 */


package Array;

public class Main {
	public static void main (String [] args) {
		
		// String:      tipo do array.
		// []:          siginifica que estamos tratando de um array. 
		// breakfast:   nome do array. 
		// new String:  A string breakfast recebe uma instância String. 
		// [3]:         Instância criada com três posições. 
		String [] breakfast = new String [3];
		
		// Mostrando o tamanho do array:
		System.out.println("Tamanho do array : " + breakfast.length);
		
		System.out.println("----------------------------------------------------");
		
		
		// Fazendo atribuições a cada posição da String:
		breakfast [0] = "Ovo";
		breakfast [1] = "Pão";
		breakfast [2] = "Manteiga";		
		
		
		// Método simples para impressão do que foi armazenado em cada posição do array.		
		System.out.println("APENAS SOUT:");
		System.out.println("Valor na posição 0: " + breakfast[0]);
		System.out.println("Valor na posição 1: " + breakfast[1]);
		System.out.println("Valor na posição 2: " + breakfast[2]);
		
		
		System.out.println("----------------------------------------------------");

		
		// Impressão com a utilização do for.
		System.out.println("COM FOR:");
		for (int i = 0; i < breakfast.length; i++) {
			System.out.println("Valor na posição " + i + ": " + breakfast[i]);
		}
	}
}
