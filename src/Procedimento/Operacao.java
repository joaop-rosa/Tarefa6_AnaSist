package Procedimento;

import java.time.LocalDate;

import Pessoa.ProfissionalDeSaude.ProfissionalDeSaude;

public class Operacao extends Procedimento {
    private String descricao;
    private LocalDate data;

    public Operacao(ProfissionalDeSaude profissionalDeSaude, String descricao, LocalDate data) {
        super(profissionalDeSaude);
        this.descricao = descricao;
        this.data = data;
    }
}
