/*
 * Como fazer inputs e outputs de dados.
 * Utiliza��o da classe Scanner. Uma isnt�ncia dela precisa sempre ser criada,
 * para que seus objetos possam ser utilizados. 
 */


package InputAndOutput;

// Biblioteca importada.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// A esquerda:
		// Scanner: classe.
		// scanner: nome da inst�ncia da classe Scanner. 
		
		// A direita:
		// new Scanner: cria��o da inst�ncia da classe.
		// System.in: Classe System, campo in.
		// O fluxo de entrada "padr�o". Esse fluxo j� est� aberto e pronto para fornecer dados de entrada. 
		// Normalmente, esse fluxo corresponde � entrada do teclado ou outra fonte de entrada.... 
		// especificada pelo ambiente ou usu�rio do host.
		
		// Agora consigo entender o porque que esta chamada s� ocorre uma vez:
		// Uma vez instanciada, todos os os m�todos existentes dentro da classe j� podem...
		// ser utilizados livremente na classe que a chama. 
		
		Scanner scanner = new Scanner(System.in);
		// Mensagem para entrada de dados:
		System.out.println("Digite o seu nome: ");
		// Armazenando os dados.
		// A string nomeString recebe o valor que foi armazenado "pr�xima linha". 
		// A classe scanner, que foi instanciada no in�cio, utiliza um dos seus m�todos,...
		// no caso, nextLine. 
		String nomeString = scanner.nextLine();
		// Por �ltimo, imprimindo o conte�do armazenado em nomeString:
		System.out.println("Seu nome �: " + nomeString);
		// Sempre importante fechar classe Scanner instanciada, e o m�todo
		// close serve para isso. 
		scanner.close();
	}
}
