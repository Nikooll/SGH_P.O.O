public class Main {

    public static void main(String[] args) {
        // Crear algunas instancias de Paciente, Doctor, Enfermero, CitaMedica y ExpedienteMedico
        Paciente paciente1 = new Paciente("");
        Doctor doctor1 = new Doctor();
        Enfermero enfermero1 = new Enfermero();

        ExpedienteMedico expediente1 = new ExpedienteMedico();
        paciente1.setExpediente(expediente1);

        expediente1.agregarEntrada("");
    }
