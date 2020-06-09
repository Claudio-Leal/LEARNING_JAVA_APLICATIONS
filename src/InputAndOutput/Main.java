/*
 * Como fazer inputs e outputs de dados.
 * Utilização da classe Scanner. Uma isntância dela precisa sempre ser criada,
 * para que seus objetos possam ser utilizados. 
 */


package InputAndOutput;

// Biblioteca importada.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// A esquerda:
		// Scanner: classe.
		// scanner: nome da instância da classe Scanner. 
		
		// A direita:
		// new Scanner: criação da instância da classe.
		// System.in: Classe System, campo in.
		// O fluxo de entrada "padrão". Esse fluxo já está aberto e pronto para fornecer dados de entrada. 
		// Normalmente, esse fluxo corresponde à entrada do teclado ou outra fonte de entrada.... 
		// especificada pelo ambiente ou usuário do host.
		
		// Agora consigo entender o porque que esta chamada só ocorre uma vez:
		// Uma vez instanciada, todos os os métodos existentes dentro da classe já podem...
		// ser utilizados livremente na classe que a chama. 
		
		Scanner scanner = new Scanner(System.in);
		// Mensagem para entrada de dados:
		System.out.println("Digite o seu nome: ");
		// Armazenando os dados.
		// A string nomeString recebe o valor que foi armazenado "próxima linha". 
		// A classe scanner, que foi instanciada no início, utiliza um dos seus métodos,...
		// no caso, nextLine. 
		String nomeString = scanner.nextLine();
		// Por último, imprimindo o conteúdo armazenado em nomeString:
		System.out.println("Seu nome é: " + nomeString);
		// Sempre importante fechar classe Scanner instanciada, e o método
		// close serve para isso. 
		scanner.close();
	}
}
