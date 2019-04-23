import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Aula1_Lab1 {

	private static void escrever(String texto) {
		
		try {
			FileOutputStream arquivo = new FileOutputStream("C:\\Users\\Inmetrics\\Documents\\DW.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			
			dados.writeChars(texto);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
	}	

private static void ler() {
	
	try {
		
		FileInputStream arquivo = new FileInputStream("C:\\Users\\Inmetrics\\Documents\\DW.txt");
		DataInputStream dados = new DataInputStream(arquivo);
		
		while (dados.available() > 0 ) {
			char c = dados.readChar();
			System.out.println(c);
		}
	} catch (IOException ioe) {
		ioe.printStackTrace();
	}
}

public static void main(String[] args) {
	escrever("");
	ler();
	}
}