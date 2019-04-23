import java.io.IOException;
import java.io.PrintWriter;

public class ExemploGravacao {

	public static void main(String[] args) {
		
		try {
			PrintWriter writer = new PrintWriter(
					"C:\\Users\\Inmetrics\\Documents\\AtivJavaMod3.txt");
			
			writer.println("Erick Testando sua aplicação");
			writer.println("Aula de Java módulo 3");
			
			writer.close();
			
			System.out.println("Gravado com sucesso!");
			
		} catch (IOException e) {
			System.out.println("Não foi possível gravar o arquivo");
		}
	}
}
