package org.alura.app.aluno.matricular;

import org.alura.domain.aluno.Aluno;
import org.alura.domain.aluno.RepositoryAluno;

public class MatricularAluno {

    private final RepositoryAluno repositoryAluno;

    public MatricularAluno(RepositoryAluno repositoryAluno) {
        this.repositoryAluno = repositoryAluno;
    }
    //Usando DTO - Data transfer Object
    public void execute(MatricularAlunoDTO dados) {
        Aluno novo = dados.criarAluno();
        repositoryAluno.matricular(novo);
    }
}
