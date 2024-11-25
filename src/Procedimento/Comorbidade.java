package Procedimento;

import java.time.LocalDate;

import Pessoa.ProfissionalDeSaude.ProfissionalDeSaude;

public class Comorbidade extends Procedimento {
    private String nome;
    private LocalDate dataDiagnostico;
    private String descricao;

    // Construtor
    public Comorbidade(ProfissionalDeSaude profissionalDeSaude, String nome, LocalDate dataDiagnostico,
            String descricao) {
        super(profissionalDeSaude);
        this.nome = nome;
        this.dataDiagnostico = dataDiagnostico;
        this.descricao = descricao;
    }
}
