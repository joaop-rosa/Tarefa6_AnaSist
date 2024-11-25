package Procedimento;

import java.time.LocalDate;

import Pessoa.ProfissionalDeSaude.ProfissionalDeSaude;

public class Tratamento extends Procedimento {
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    // Construtor
    public Tratamento(ProfissionalDeSaude profissionalDeSaude, String descricao, LocalDate dataInicio,
            LocalDate dataTermino) {
        super(profissionalDeSaude);
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

}
