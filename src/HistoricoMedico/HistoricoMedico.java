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
        return new ArrayList<>();
    }

}
