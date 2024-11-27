package Pessoa;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected String cpf;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
