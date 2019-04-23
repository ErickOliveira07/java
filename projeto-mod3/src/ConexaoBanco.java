import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("");
			
			Connection cn = DriverManager.getConnection(
					"jdbc:sql",
					"admin", "admin");
			
			System.out.println("Driver carregado com sucesso.");
			
			cn.close();
			System.out.println("Conexão encerrada.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Falha ao carregar o drive.");
		} catch (SQLException e) {
			System.out.println("Não foi possível abrir a conexão.");
			e.printStackTrace();
		}
	}

}
