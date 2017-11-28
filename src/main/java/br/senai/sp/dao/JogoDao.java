package br.senai.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senai.sp.config.ConnectionFactory;
import br.senai.sp.model.Jogo;

public class JogoDao {

	private Connection connection;

	public JogoDao() {
		connection = new ConnectionFactory().getConnection();
	}

	/**
	 * 
	 * Método salvar
	 * 
	 * @param Jogo
	 * 
	 * */
	public void salva(Jogo jogo) {
		String sql = null;

		sql = "INSERT INTO jogos (nome, desenvolvedor, genero) " + "VALUES (?, ?, ?)";

		try {

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, jogo.getNome());
			stmt.setString(2, jogo.getDesenvolvedor());
			stmt.setString(3, jogo.getGenero());

			stmt.execute();

			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// getLista
	public List<Jogo> getLista() {

		try {
			List<Jogo> jogos = new ArrayList<Jogo>();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM jogos");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Jogo jogo = new Jogo();
				jogo.setId(rs.getLong("id"));
				jogo.setNome(rs.getString("nome"));
				jogo.setDesenvolvedor(rs.getString("desenvolvedor"));
				jogo.setGenero(rs.getString("genero"));

				jogos.add(jogo);
			}

			rs.close();

			stmt.close();

			return jogos;
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
