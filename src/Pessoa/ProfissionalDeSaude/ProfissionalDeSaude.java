package Pessoa.ProfissionalDeSaude;

import java.time.LocalDate;

import Pessoa.Pessoa;

public class ProfissionalDeSaude extends Pessoa {
    String permissao;
    String crm;

    public ProfissionalDeSaude(String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone,
            String CRM, String permissao) {
        super(nome, dataNascimento, cpf, endereco, telefone);
        this.crm = crm;
        this.permissao = permissao;
    }

}
