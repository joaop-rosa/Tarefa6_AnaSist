package HistoricoMedico;

import java.util.ArrayList;
import java.util.List;

import Pessoa.Paciente.Paciente;
import Procedimento.Comorbidade;
import Procedimento.Consulta;
import Procedimento.Operacao;
import Procedimento.Procedimento;
import Procedimento.Tratamento;

public class HistoricoMedico {
    private String restricao;
    private List<Tratamento> tratamentos;
    private List<Consulta> consultas;
    private List<Comorbidade> comorbidades;
    private Paciente paciente;
    private List<Operacao> operacoes;

    // Construtor
    public HistoricoMedico(String restricao, List<Tratamento> tratamentos, List<Consulta> consultas,
            List<Comorbidade> comorbidades, Paciente paciente, List<Operacao> operacoes) {
        this.restricao = restricao;
        this.tratamentos = tratamentos;
        this.consultas = consultas;
        this.comorbidades = comorbidades;
        this.paciente = paciente;
        this.operacoes = operacoes;
    }

    public List<Procedimento> agruparHistorico() {
        List<Procedimento> historicoAgrupado = new ArrayList<>();

        if (tratamentos != null) {
            historicoAgrupado.addAll(tratamentos);
        }

        if (consultas != null) {
            historicoAgrupado.addAll(consultas);
        }

        if (comorbidades != null) {
            historicoAgrupado.addAll(comorbidades);
        }

        if (operacoes != null) {
            historicoAgrupado.addAll(operacoes);
        }

        return historicoAgrupado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Histórico Médico:\n");
        sb.append("Paciente: ").append(paciente != null ? paciente.getNome() : "Desconhecido").append("\n");
        sb.append("Restrição: ").append(restricao != null ? restricao : "Nenhuma").append("\n");

        sb.append("Tratamentos:\n");
        if (tratamentos != null && !tratamentos.isEmpty()) {
            for (Tratamento tratamento : tratamentos) {
                sb.append("- ").append(tratamento).append("\n");
            }
        } else {
            sb.append("- Nenhum tratamento registrado\n");
        }

        sb.append("Consultas:\n");
        if (consultas != null && !consultas.isEmpty()) {
            for (Consulta consulta : consultas) {
                sb.append("- ").append(consulta).append("\n");
            }
        } else {
            sb.append("- Nenhuma consulta registrada\n");
        }

        sb.append("Comorbidades:\n");
        if (comorbidades != null && !comorbidades.isEmpty()) {
            for (Comorbidade comorbidade : comorbidades) {
                sb.append("- ").append(comorbidade).append("\n");
            }
        } else {
            sb.append("- Nenhuma comorbidade registrada\n");
        }

        sb.append("Operações:\n");
        if (operacoes != null && !operacoes.isEmpty()) {
            for (Operacao operacao : operacoes) {
                sb.append("- ").append(operacao).append("\n");
            }
        } else {
            sb.append("- Nenhuma operação registrada\n");
        }

        return sb.toString();
    }
}
