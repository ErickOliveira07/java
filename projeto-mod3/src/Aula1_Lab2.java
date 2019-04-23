import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Aula1_Lab2 {

	private static final String PASTA_ORIGEM = "";
	private static final String PASTA_BACKUP = "";
	
	public static void main(String[] args) {
		
		/* Cria referencias das pastas */
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_BACKUP);
		
		try {
			
			/* Verifica se diretorio destino já existe */
			if (Files.exists(backup)) {
				System.out.println("Diretório " + backup.getFileName() + " já existe.");
			} else {
				Files.createDirectories(backup);
				System.out.println("Diretório " + backup.getFileName() + " criado com sucesso.");
			}
			
			Stream<Path> streamOrigem = Files.list(origem);
			
			streamOrigem.forEach(p -> {
				try {
					System.out.println("Copiando arquivo " + p.getFileName());
					Files.copy(p, backup.resolve(p.getFileName()));
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
	}
}
