package br.com.caelum.jdbc.teste;

import java.util.List;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaLista {

  public static void main(final String[] args) {

    // final ContatoDao dao = new ContatoDao();
    // final List<Contato> contatos = dao.getLista();

    // System.out.println(contatos);

    final FuncionarioDao dao = new FuncionarioDao();
    final List<Funcionario> funcionarios = dao.getLista();

    funcionarios.forEach(System.out::println);
  }
}
