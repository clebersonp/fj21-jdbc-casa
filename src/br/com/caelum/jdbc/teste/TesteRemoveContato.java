package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteRemoveContato {

  public static void main(final String[] args) {

    final Long idContato = 2L;
    final Contato contatoARemover = new Contato();
    contatoARemover.setId(idContato);
    final ContatoDao dao = new ContatoDao();

    dao.remove(contatoARemover);
    System.err.println("Contato removido com sucesso!");
  }
}
