package Pessoa.Paciente;

import java.time.LocalDate;

import Pessoa.Pessoa;

public class Paciente extends Pessoa {
    private String cns;

    // Construtor
    public Paciente(String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone, String CNS) {
        super(nome, dataNascimento, cpf, endereco, telefone);
        this.cns = cns;
    }

}
