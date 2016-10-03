package br.com.m5Project.teste;

import java.sql.SQLException;

import br.com.m5Project.entidades.Usuario;
import br.com.m5Project.jdbc.UsuarioDAO;

public class TesteDAO {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		user.setLogin("matheus");
		user.setNome("matheus");
		user.setSenha("1234");
		
		UsuarioDAO userDAO = new UsuarioDAO();
		try {
			userDAO.cadastrar(user);
			System.out.println("Cadastrado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar!");
		}
	}

}
