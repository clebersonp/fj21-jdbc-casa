package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteInsere {

  public static void main(final String[] args) {

    // pronto para gravar
    // final Contato contato = new Contato();
    // contato.setNome("Caelum");
    // contato.setEmail("contato@caelum.com.br");
    // contato.setEndereco("R. Vergueiro 3185 cj57");
    // contato.setDataNascimento(new Date());

    // grave nessa conexão!
    // final ContatoDao dao = new ContatoDao();

    // metodo elegante
    // dao.adiciona(contato);

    final Funcionario funcionario = new Funcionario("João", "joao", "joao");

    final FuncionarioDao dao = new FuncionarioDao();
    dao.adiciona(funcionario);
  }
}
