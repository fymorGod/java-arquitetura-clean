package org.alura.app.aluno.matricular;

import org.alura.domain.aluno.Aluno;
import org.alura.domain.aluno.Cpf;
import org.alura.domain.aluno.Email;

public class MatricularAlunoDTO {
    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;
    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(
                new Cpf(cpfAluno),
                nomeAluno,
                new Email(emailAluno)
        );
    }
}
