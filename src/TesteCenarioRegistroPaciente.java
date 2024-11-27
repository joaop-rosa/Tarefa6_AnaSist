import java.time.LocalDate;

import Pessoa.Paciente.PacienteController;

public class TesteCenarioRegistroPaciente {
    public static void main(String[] args) throws Exception {
        PacienteController pacienteController = new PacienteController();
        pacienteController.iniciarRegistroPaciente("token");
        pacienteController.adicionarPaciente("Joao Rosa", LocalDate.of(2000, 11, 14), "832.609.520-63",
                "R. Brasil, 22 - Centro", "51999999999", "1234566789");
        pacienteController.adicionarPaciente("Mateus H Reinheimer", LocalDate.of(1997, 05, 11), "832.609.520-63",
                "R. Venezuela, 11 - Centro", "51999999998", "912348892");

        // Adicionado o print para mostrar que a os pacientes estão sendo salvos
        System.out.println("lista de pacientes: \n");
        pacienteController.printarListaDePacientes();
    }
}
