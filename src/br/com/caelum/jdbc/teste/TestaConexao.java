package br.com.caelum.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.caelum.jdbc.ConnectionFactory;

public class TestaConexao {
  public static void main(final String[] args) throws SQLException {
    final Connection connection = new ConnectionFactory().getConnection();
    System.out.println("Conexão aberta!");
    connection.close();
  }
}
