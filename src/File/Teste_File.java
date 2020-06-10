/*
 * Leitura de arquivos.
 * Como já aprendemos anteriormente, quando se manipula arquivos, é importante
 * tratar as exceções. no código abaixo a exceção foi tratada na própria classe main,
 * com a inclusão de throws IOException:
 * Sinais de que ocorreu alguma exceção de E / S. 
 * Essa classe é a classe geral de exceções produzidas por operações de 
 * E / S com falha ou interrompidas. 
 */


package File;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


// Lembrando que poderíamos fazer isso:
// import java.nio.file.*;

public class Teste_File {

	public static void main(String[] args) throws IOException {
		// Path: É uma classe.
		// Um objeto que pode ser usado para localizar um arquivo em um sistema de arquivos. 
		// Representará tipicamente um caminho de arquivo dependente do sistema.
		// filePath: nome da instância da classe que criamos.
		
		// FileSystems: É uma classe.
		// Métodos de fábrica para sistemas de arquivos. 
		// Essa classe define o método getDefault para obter o sistema de arquivos padrão... 
		// e os métodos de fábrica para construir outros tipos de sistemas de arquivos.
		
		
		// getPath é uma inteface. 
		// parâmetro 1: endereço. 
		// parâmetro 2: nome do arquivo.		 
		Path filePath = FileSystems.getDefault().getPath("", "File.txt");
		
		// Criação de uma lista chamada lines. 
		// Utilização da classe Files, com o seu método readAllLines,..
		// em que passamos como parâmetro os dados da lista a ser lida. 
		List<String> lines = Files.readAllLines(filePath);
		
		// Criação do for para varrer a lista. 
		// Como já registramos, em caso de listas, utilizamos size, e não lenght. 
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
	}
}
