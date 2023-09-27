package org.alura.infra.aluno;

import org.alura.domain.aluno.Aluno;
import org.alura.domain.aluno.AlunoNaoEncontrado;
import org.alura.domain.aluno.Cpf;
import org.alura.domain.aluno.RepositoryAluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryInMemory implements RepositoryAluno {

    private List<Aluno> matriculados = new ArrayList<>();
    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(Cpf cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumeracao()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listAllAlunosMatriculados() {
        return this.matriculados;
    }
}
