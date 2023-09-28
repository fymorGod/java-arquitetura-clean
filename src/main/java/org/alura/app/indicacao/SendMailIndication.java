package org.alura.app.indicacao;

import org.alura.domain.aluno.Aluno;

public interface SendMailIndication {

    void sendTo(Aluno indicado);
}
