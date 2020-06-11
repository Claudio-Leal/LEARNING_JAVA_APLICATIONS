package ManipularErros;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Chamada do m�todo loadfile.
		// Passando a string File.txt para o m�todo. 
		try {
			loadfile("File.txt");
			System.out.println("Tudo ok!");
		} catch (IOException e) {			
			System.out.println(e);
		}		
	}
	
	
	
	// Todo o bloco de c�digo que estava em main, foi trazido para este m�todo.
	// static: m�todo poder� ser chamado sem que a classe seja instanciada.
	// void: tipo de retorno.
	// loadfile: nome do m�todo.
	// Argumentos: par�metro string fileName foi passado. 
	// todo o bloco foi  tratado com "throws IOException.
	static void loadfile (String fileName) throws IOException {
		Path filePath = FileSystems.getDefault().getPath("C:/SERRATEC/LEARNING_JAVA_APLICATIONS/src/ManipularErros",fileName);		
		List<String> lines = Files.readAllLines(filePath);	
		lines.forEach(System.out::println);
		System.out.println("Fim!");		
	}
}



