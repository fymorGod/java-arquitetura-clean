package org.alura.domain.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    //entity
    private Cpf cpf;
    private String name;
    private Email email;
    private String password;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf cpf, String name, Email email) {

        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {

        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return cpf.getNumeracao();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.getAddress();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
