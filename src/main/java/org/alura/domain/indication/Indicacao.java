package org.alura.domain.indication;

import org.alura.domain.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno indicado;//quem foi indicado
    private Aluno indicante;//quem indica
    private LocalDateTime dataIndicacao;
    public Indicacao(Aluno indicado, Aluno indicante) {

        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }
}
