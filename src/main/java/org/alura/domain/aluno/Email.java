package org.alura.domain.aluno;

public class Email {
    // value object
    private String address;
    public Email(String address) {
        if (address == null ||
                !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail invalido!");
        }

        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
