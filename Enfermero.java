import java.util.ArrayList;

public class Enfermero extends Persona {
        private ArrayList<Doctor> doctores;
        private ArrayList<Paciente> pacientes;

        // Constructor
        public Enfermero(String nombre, String identificacion, String direccion) {
            super(nombre, identificacion, direccion);
            this.doctores = new ArrayList<>();
            this.pacientes = new ArrayList<>();
        }

        // Método para asignar doctor
        public void asignarDoctor(Doctor doctor) {
            doctores.add(doctor);
        }

        // Método para asignar paciente
        public void asignarPaciente(Paciente paciente) {
            pacientes.add(paciente);
        }
    }