package Pessoa.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Pessoa.ProfissionalDeSaude.Autorizacao;

public class PacienteController {
    List<Paciente> listaDePacientes = new ArrayList<>();

    public void iniciarRegistroPaciente(String token) {
        Autorizacao autorizacao = new Autorizacao();
        if (!autorizacao.estaAutenticado(token)) {
            throw new Error();
        }

    }

    public Paciente buscarPorIdentificador(String identificador) {
        return obterPaciente(identificador);
    }

    private Paciente obterPaciente(String identificador) {
        for (Paciente paciente : listaDePacientes) {
            if (paciente.getCpf().equals(identificador)) {
                return paciente;
            }
        }

        throw new IllegalArgumentException("Paciente com o CPF " + identificador + " não encontrado.");
    }

    public void printarListaDePacientes() {
        System.out.println(listaDePacientes.toString());
    }

    public Paciente adicionarPaciente(String nome, LocalDate dataNascimento, String cpf, String endereco,
            String telefone,
            String cns) {
        PacienteFactory pacienteFactory = new PacienteFactory();
        Paciente novoPaciente = pacienteFactory.criarPaciente(nome, dataNascimento, cpf, endereco, telefone, cns);
        listaDePacientes.add(novoPaciente);
        return novoPaciente;
    }
}
