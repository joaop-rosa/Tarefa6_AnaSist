package HistoricoMedico;

import java.util.ArrayList;
import java.util.List;

import Pessoa.Paciente.Paciente;
import Pessoa.ProfissionalDeSaude.Autorizacao;
import Procedimento.Comorbidade;
import Procedimento.Consulta;
import Procedimento.Operacao;
import Procedimento.Tratamento;

public class HistoricoMedicoController {
    List<HistoricoMedico> listaDeHistoricos = new ArrayList<>();

    public HistoricoMedicoController() {
    }

    public HistoricoMedico buscarHistoricoPaciente(Paciente paciente) {
        for (HistoricoMedico historico : listaDeHistoricos) {
            if (historico.getPaciente().getCpf() == paciente.getCpf()) {
                return historico;
            }
        }
        throw new IllegalArgumentException("Histórico médico do paciente não encontrado.");
    }

    public void iniciarConsultaHistorico(String token) {
        Autorizacao autorizacao = new Autorizacao();
        if (!autorizacao.estaAutenticado(token)) {
            throw new Error();
        }
    }

    public void adicionarHistoricoMedico(String restricao, List<Tratamento> tratamentos, List<Consulta> consultas,
            List<Comorbidade> comorbidades, Paciente paciente, List<Operacao> operacoes) {
        for (HistoricoMedico historico : listaDeHistoricos) {
            if (historico.getPaciente().equals(paciente)) {
                throw new IllegalArgumentException("O paciente já possui um histórico médico registrado.");
            }
        }

        HistoricoMedico novoHistorico = new HistoricoMedico(restricao, tratamentos, consultas, comorbidades, paciente,
                operacoes);
        listaDeHistoricos.add(novoHistorico);
    }
}
