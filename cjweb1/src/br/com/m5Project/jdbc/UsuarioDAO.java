package br.com.m5Project.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.m5Project.entidades.Usuario;

public class UsuarioDAO {
	
	private Connection con = Conexao.getConnection();
	
	public void cadastrar (Usuario usuario) throws SQLException {
		String sql = "insert into usuario (nome, login, senha) values (?,?,?)";
		
		PreparedStatement preparador = con.prepareStatement(sql);
		preparador.setString(1, usuario.getNome());
		preparador.setString(2, usuario.getLogin());
		preparador.setString(3, usuario.getSenha());
		
		preparador.execute();
		preparador.close();
	}
}
