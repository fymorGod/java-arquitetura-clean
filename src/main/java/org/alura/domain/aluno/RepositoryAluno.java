package org.alura.domain.aluno;

import java.util.List;

public interface RepositoryAluno {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(Cpf cpf);

    List<Aluno> listAllAlunosMatriculados();

    //...
}
