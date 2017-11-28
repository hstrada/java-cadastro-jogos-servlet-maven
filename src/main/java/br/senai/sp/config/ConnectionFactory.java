package br.senai.sp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			// Registra o driver jdbc
			Class.forName("com.mysql.jdbc.Driver");

			// Retorna uma conexão com o banco de dados
			// gerada pelo DriveManager
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jogos_senai?autoReconnect=true&useSSL=false",
					"root", "root");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
	}

}
