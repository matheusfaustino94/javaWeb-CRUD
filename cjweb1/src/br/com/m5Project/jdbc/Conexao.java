package br.com.m5Project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao{
	
	public static Connection getConnection() {
		Connection con = null;
		String driver = "jdbc:postgresql://localhost:5432/bancocjweb1";
		String user = "postgres";
		String password = "mr1418";
		try {
			con = DriverManager.getConnection(driver, user, password);
			System.out.println("Conex�o com o banco: "+driver+" efetuada com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro de conex�o");
			e.printStackTrace();
		}
		return con;
	}

}
