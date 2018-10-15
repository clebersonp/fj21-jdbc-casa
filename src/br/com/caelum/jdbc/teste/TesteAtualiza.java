package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteAtualiza {

  public static void main(final String[] args) throws InterruptedException {
    // final String email = "kim@gmail.com.br";
    //
    // // pronto para gravar
    // final Contato contato = new Contato();
    // contato.setNome("Kim");
    // contato.setEmail(email);
    // contato.setEndereco("R. Kim 5255");
    // contato.setDataNascimento(new Date());
    //
    // // grave nessa conexão!
    // final ContatoDao dao = new ContatoDao();
    //
    // // metodo elegante
    // dao.adiciona(contato);
    // System.out.println("Contato salvo: " + contato);
    // Thread.sleep(5000L);
    //
    // // Recuperar um contato pelo email para altera-lo
    // final Contato contatoRecuperado = dao.getContato(email);
    //
    // contatoRecuperado.setNome("Kim ALTERADO");
    // contatoRecuperado.setEndereco("Kim ALTERADO 53622");
    // contatoRecuperado.setEmail("teste@kim.com.br");
    //
    // final Contato contatoAlterado = dao.altera(contatoRecuperado);
    // System.out.println("Contato alterado: " + contatoAlterado);

    final String usuario = "maria";

    final Funcionario funcionario = new Funcionario("Maria", usuario, "maria");

    final FuncionarioDao dao = new FuncionarioDao();

    dao.adiciona(funcionario);
    System.out.println("Funcionario salvo com sucesso!");


    final Funcionario funcionarioRecuperado = dao.getFuncionario(usuario);
    funcionarioRecuperado.setUsuario("maria_123");
    funcionarioRecuperado.setSenha("maria_123");

    dao.alterar(funcionarioRecuperado);
    System.out.println("Funcionario alterado com sucesso!");
  }
}
