import java.io.IOException;
import java.io.PrintWriter;

public class ExemploGravacao {

	public static void main(String[] args) {
		
		try {
			PrintWriter writer = new PrintWriter(
					"C:\\Users\\Inmetrics\\Documents\\AtivJavaMod3.txt");
			
			writer.println("Erick Testando sua aplica��o");
			writer.println("Aula de Java m�dulo 3");
			
			writer.close();
			
			System.out.println("Gravado com sucesso!");
			
		} catch (IOException e) {
			System.out.println("N�o foi poss�vel gravar o arquivo");
		}
	}
}
