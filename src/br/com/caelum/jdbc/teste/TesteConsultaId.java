package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;

public class TesteConsultaId {

  public static void main(final String[] args) {

    // final ContatoDao dao = new ContatoDao();
    // System.out.println(dao.getContato(1L));
    // System.out.println(dao.getContato(2L));

    final FuncionarioDao dao = new FuncionarioDao();
    System.out.println(dao.getFuncionario(1L));
  }

}
