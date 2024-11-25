package Procedimento;

import Pessoa.ProfissionalDeSaude.ProfissionalDeSaude;

public abstract class Procedimento {
    private ProfissionalDeSaude profissionalDeSaude;

    // Construtor
    public Procedimento(ProfissionalDeSaude profissionalDeSaude) {
        this.profissionalDeSaude = profissionalDeSaude;
    }

}
