package Procedimento;

import java.time.LocalDate;

import Pessoa.ProfissionalDeSaude.ProfissionalDeSaude;

public class Consulta extends Procedimento {
    private String diagnostico;
    private String motivo;
    private LocalDate data;

    // Construtor
    public Consulta(ProfissionalDeSaude profissionalDeSaude, String diagnostico, String motivo, LocalDate data) {
        super(profissionalDeSaude);
        this.diagnostico = diagnostico;
        this.motivo = motivo;
        this.data = data;
    }

}
