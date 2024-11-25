package Pessoa.Paciente;

import java.time.LocalDate;

public class PacienteFactory {
    public Paciente criarPaciente(String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone,
            String cns) {
        return new Paciente(nome, dataNascimento, cpf, endereco, telefone, cns);
    }
}
