package org.alura.infra.indicacao;

import org.alura.app.indicacao.SendMailIndication;
import org.alura.domain.aluno.Aluno;

public class SendMailIndicationWithJavaMail implements SendMailIndication {
    @Override
    public void sendTo(Aluno indicado) {
        // lógica de envio de emails com a lib Java Mail
    }
}
