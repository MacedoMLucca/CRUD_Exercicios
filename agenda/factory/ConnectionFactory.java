package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//nome usuario mysql
	private static final String USERNAME = "root";
	
	//Senha do banco 
	private static final String PASSWORD = "MySQL@2022";
	
	
	//caminho do BD
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/AGENDA";
	
	/*
	 conexão com o banco de dados 
	 */
	public static Connection createConnectionToMySQL() throws Exception {
		//faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//Cria a conexao com o banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		// recupera conexao com o banco de dados se ja tiver 
		Connection con = createConnectionToMySQL();
		
		//Testar se a conecxão é nula
		if(con!=null) {
			System.out.println("Conexão obetida com sucesso!");
			con.close();
		}
	}
}
