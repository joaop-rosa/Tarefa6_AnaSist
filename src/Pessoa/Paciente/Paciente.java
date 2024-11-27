package Pessoa.Paciente;

import java.time.LocalDate;

import Pessoa.Pessoa;

public class Paciente extends Pessoa {
    public String cns;

    // Construtor
    public Paciente(String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone, String cns) {
        super(nome, dataNascimento, cpf, endereco, telefone);
        this.cns = cns;
    }

    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cns='" + this.cns + '\'' +
                '}';
    }
}
