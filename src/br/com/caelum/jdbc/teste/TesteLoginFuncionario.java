package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteLoginFuncionario {

  public static void main(final String[] args) {

    final String usuario = "joao";
    final String senha = "joao";

    final FuncionarioDao dao = new FuncionarioDao();
    final Funcionario funcionario = dao.login(usuario, senha);

    System.out.println(funcionario);

  }

}
