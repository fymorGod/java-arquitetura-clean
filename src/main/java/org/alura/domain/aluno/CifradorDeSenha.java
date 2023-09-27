package org.alura.domain.aluno;

public interface CifradorDeSenha {

    String cifrarSenha(String password);

    boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta);
}
