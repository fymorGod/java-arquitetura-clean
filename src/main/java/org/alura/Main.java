package org.alura;

import org.alura.app.aluno.matricular.MatricularAluno;
import org.alura.app.aluno.matricular.MatricularAlunoDTO;
import org.alura.infra.aluno.AlunoRepositoryInMemory;

public class Main {
    public static void main(String[] args) {
        String nome = "Fulano da silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        //Patterns Command
        MatricularAluno matricular = new MatricularAluno(new AlunoRepositoryInMemory());
        matricular.execute(new MatricularAlunoDTO(nome, cpf, email));
    }
}