package org.alura.domain.aluno;

public class Cpf {

    private String numeracao;
    public Cpf(String numeracao) {

        if(numeracao == null || !numeracao.matches("\\\\d{3}\\\\.\\\\d{3}\\\\.\\\\d{3}\\\\-\\\\d{2}")){
            throw new IllegalArgumentException("CPF Invalid");
        }
        this.numeracao = numeracao;
    }

    public String getNumeracao() {
        return numeracao;
    }
}
