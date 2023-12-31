package org.alura.domain.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno withNameCpfEmail(String nome, String cpf, String email) {

        this.aluno = new Aluno(new Cpf(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno withPhoneNumber(String ddd, String numero) {

        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno create() {
        return this.aluno;
    }
}
