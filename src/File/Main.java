/*
 * Coment�rios no arquivo Teste_File.java.
 * Somente com a indica��o do endere�o do arquivo � que consegui compilar. 
 * 
 * RELEMBRANDO FOREACH:
 * 
 * A menos que especificado de outra forma pela classe de implementa��o,... 
 * as a��es s�o executadas na ordem da itera��o do conjunto de entradas...
 * (se uma ordem de itera��o for especificada.) 
 * Exce��es lan�adas pela a��o s�o retransmitidas para o chamador.
 * 
 * A sintaxe do for each � a seguinte:
 * for ( tipo variavel_do_tipo_do_seuArray : seuArray){
   seu c�digo
   }   
 * 
 * EXEMPLO:
 * FOREACH (VARI�VEL INT X  : ARRAYINT Y) {
 * BLOCO DO FOREACH. 
 * }
 * 
 * NO EXEMPLO, A VARI�VEL INT X VARRERR� E RECEBER� TODO OS DADOS DO ARRAY. 
 * E DENTRO DO BLOCO DE EXECU��O, COLOCAREMOS OS COMANDOS, COMO SOUT, ETC. 
 * 
 * Mais informa��es, em pullrequest.  
 * 
 * Criei uma classe neste pacote apenas para testar o exemplo de foreach que encontrei na internet. 
 * 
 */

package File;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		Path filePath = FileSystems.getDefault().getPath("C:/SERRATEC/LEARNING_JAVA_APLICATIONS/src/File", "File.txt");		
		List<String> lines = Files.readAllLines(filePath);		
		/*
		 * for (int i = 0; i < lines.size(); i++) { System.out.println(lines.get(i)); }
		 */	
		
		
		// Utiliza��o do FOREACH, como op��o ao FOR ACIMA como m�todo que recebe uma string.
		// Esta declara��o � um pouco incomum para mim, porque n�o sei para que serve o s�mbolo "->".
		// lines chama o m�todo forEach. 
		// Para cada valor armazenado em "lines", no caso, "n", o valor de n � impresso. 
		// lines.forEach((n) -> System.out.println(n));
		
		
		// Uma outra sintaxe poss�vel com forEach.
		// Trata-se de uma passagem por refer�ncia.
		// lines, atrav�s do m�todo forEach, passa a refer�ncia de cada linha,...
		// com a utiliza��o de ::.
		lines.forEach(System.out::println);
		System.out.println("Fim!");
	
	}
}
