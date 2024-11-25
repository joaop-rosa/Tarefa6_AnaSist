package Pessoa;

import java.time.LocalDate;

public abstract class Pessoa {
    String nome;
    LocalDate dataNascimento;
    String cpf;
    String endereco;
    String telefone;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
