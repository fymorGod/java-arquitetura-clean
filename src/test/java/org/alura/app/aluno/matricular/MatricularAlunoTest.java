package org.alura.app.aluno.matricular;

import org.alura.domain.aluno.Aluno;
import org.alura.domain.aluno.Cpf;
import org.alura.infra.aluno.AlunoRepositoryInMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // MOCK -> Mockito( a estudar )
        AlunoRepositoryInMemory repository = new AlunoRepositoryInMemory();
        MatricularAluno useCase  = new MatricularAluno(repository);

        MatricularAlunoDTO dados = new MatricularAlunoDTO("fulano", "123.456.789-00", "fulano@email.com");
        useCase.execute(dados);

        Aluno encontrado = repository.buscarPorCPF(new Cpf("123.456.789-00"));

        assertEquals("fulano", encontrado.getName());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());

    }
}