package br.com.m5Project.teste;

import java.sql.SQLException;

import br.com.m5Project.entidades.Usuario;
import br.com.m5Project.jdbc.UsuarioDAO;

public class TesteDAO {

	public static void main(String[] args) {
		
		//testeCadastrar();
		//testeAlterar();
		testeExcluir();
	}

	private static void testeCadastrar() {
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
	
	private static void testeAlterar(){
		Usuario user = new Usuario();
		user.setLogin("matheus");
		user.setNome("matheus faustino");
		user.setSenha("1234");
		user.setId(7);
		
		UsuarioDAO userDAO = new UsuarioDAO();
		try {
			userDAO.alterar(user);
			System.out.println("Alterado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao alterar!");
			e.printStackTrace();
		}
	}
	
	private static void testeExcluir(){
		Usuario user = new Usuario();
		user.setId(1);
		
		UsuarioDAO userDAO = new UsuarioDAO();
		try {
			userDAO.excluir(user);
			System.out.println("Exclu�do com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao excluir!");
			e.printStackTrace();
		}
	}

}
