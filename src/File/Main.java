/*
 * Comentários no arquivo Teste_File.java.
 * Somente com a indicação do endereço do arquivo é que consegui compilar. 
 * 
 * RELEMBRANDO FOREACH:
 * 
 * A menos que especificado de outra forma pela classe de implementação,... 
 * as ações são executadas na ordem da iteração do conjunto de entradas...
 * (se uma ordem de iteração for especificada.) 
 * Exceções lançadas pela ação são retransmitidas para o chamador.
 * 
 * A sintaxe do for each é a seguinte:
 * for ( tipo variavel_do_tipo_do_seuArray : seuArray){
   seu código
   }   
 * 
 * EXEMPLO:
 * FOREACH (VARIÁVEL INT X  : ARRAYINT Y) {
 * BLOCO DO FOREACH. 
 * }
 * 
 * NO EXEMPLO, A VARIÁVEL INT X VARRERRÁ E RECEBERÁ TODO OS DADOS DO ARRAY. 
 * E DENTRO DO BLOCO DE EXECUÇÃO, COLOCAREMOS OS COMANDOS, COMO SOUT, ETC. 
 * 
 * Mais informações, em pullrequest.  
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
		
		
		// Utilização do FOREACH, como opção ao FOR ACIMA como método que recebe uma string.
		// Esta declaração é um pouco incomum para mim, porque não sei para que serve o símbolo "->".
		// lines chama o método forEach. 
		// Para cada valor armazenado em "lines", no caso, "n", o valor de n é impresso. 
		// lines.forEach((n) -> System.out.println(n));
		
		
		// Uma outra sintaxe possível com forEach.
		// Trata-se de uma passagem por referência.
		// lines, através do método forEach, passa a referência de cada linha,...
		// com a utilização de ::.
		lines.forEach(System.out::println);
		System.out.println("Fim!");
	
	}
}
