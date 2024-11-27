import java.time.LocalDate;

import HistoricoMedico.HistoricoMedico;
import HistoricoMedico.HistoricoMedicoController;
import Pessoa.Paciente.Paciente;
import Pessoa.Paciente.PacienteController;

public class TesteCenarioBuscaHistoricoMedico {
    public static void main(String[] args) throws Exception {
        // Adição dos pacientes
        HistoricoMedicoController historicoMedicoController = new HistoricoMedicoController();
        PacienteController pacienteController = new PacienteController();

        pacienteController.iniciarRegistroPaciente("token");
        Paciente paciente1 = pacienteController.adicionarPaciente("Joao Rosa", LocalDate.of(2000, 11, 14),
                "832.609.520-63",
                "R. Brasil, 22 - Centro", "51999999999", "1234566789");
        Paciente paciente2 = pacienteController.adicionarPaciente("Mateus H Reinheimer", LocalDate.of(1997, 05, 11),
                "832.609.520-63",
                "R. Venezuela, 11 - Centro", "51999999998", "912348892");
        historicoMedicoController.adicionarHistoricoMedico("Restrito", null, null, null, paciente1, null);
        historicoMedicoController.adicionarHistoricoMedico("Restrito", null, null, null, paciente2, null);

        historicoMedicoController.iniciarConsultaHistorico("token");
        Paciente paciente = pacienteController.buscarPorIdentificador("832.609.520-63");
        HistoricoMedico historicoMedico = historicoMedicoController.buscarHistoricoPaciente(paciente);

        System.out.println(historicoMedico.toString());
    }
}
