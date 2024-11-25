package Pessoa.ProfissionalDeSaude;

public class Autorizacao {
    boolean estaAutenticado(String token) {
        return !token.isEmpty();
    }
}
