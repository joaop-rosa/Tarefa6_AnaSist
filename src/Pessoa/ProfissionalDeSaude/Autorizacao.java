package Pessoa.ProfissionalDeSaude;

public class Autorizacao {
    public boolean estaAutenticado(String token) {
        return !token.isEmpty();
    }
}
