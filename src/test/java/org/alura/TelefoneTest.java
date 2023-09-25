package org.alura;

import org.alura.domain.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789")
        );
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789")
        );
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("9", "123456789")
        );

    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("98", null)
        );
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("98", "")
        );
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("98", "123")
        );
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDAndNumeroValidos() {
        String ddd = "98";
        String numero = "123456789";
        var telefone = new Telefone(ddd, numero);

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }

}