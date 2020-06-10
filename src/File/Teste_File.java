/*
 * Leitura de arquivos.
 * Como j� aprendemos anteriormente, quando se manipula arquivos, � importante
 * tratar as exce��es. no c�digo abaixo a exce��o foi tratada na pr�pria classe main,
 * com a inclus�o de throws IOException:
 * Sinais de que ocorreu alguma exce��o de E / S. 
 * Essa classe � a classe geral de exce��es produzidas por opera��es de 
 * E / S com falha ou interrompidas. 
 */


package File;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


// Lembrando que poder�amos fazer isso:
// import java.nio.file.*;

public class Teste_File {

	public static void main(String[] args) throws IOException {
		// Path: � uma classe.
		// Um objeto que pode ser usado para localizar um arquivo em um sistema de arquivos. 
		// Representar� tipicamente um caminho de arquivo dependente do sistema.
		// filePath: nome da inst�ncia da classe que criamos.
		
		// FileSystems: � uma classe.
		// M�todos de f�brica para sistemas de arquivos. 
		// Essa classe define o m�todo getDefault para obter o sistema de arquivos padr�o... 
		// e os m�todos de f�brica para construir outros tipos de sistemas de arquivos.
		
		
		// getPath � uma inteface. 
		// par�metro 1: endere�o. 
		// par�metro 2: nome do arquivo.		 
		Path filePath = FileSystems.getDefault().getPath("", "File.txt");
		
		// Cria��o de uma lista chamada lines. 
		// Utiliza��o da classe Files, com o seu m�todo readAllLines,..
		// em que passamos como par�metro os dados da lista a ser lida. 
		List<String> lines = Files.readAllLines(filePath);
		
		// Cria��o do for para varrer a lista. 
		// Como j� registramos, em caso de listas, utilizamos size, e n�o lenght. 
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
	}
}
