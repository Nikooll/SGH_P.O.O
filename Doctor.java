import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Persona implements GestiónCitas {
    private EspecialidadesMedicas especialidad;
    private ArrayList<Paciente> pacientes;

    private final String idDoctor;

    private static int contadorCitas = 0;

    public Doctor(String nombre, String identificacion, String direccion, EspecialidadesMedicas especialidad) {
        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
        this.pacientes = new ArrayList<>();
        this.idDoctor = generateId();
    }

    private String generateId() {
        return "DOC" + getIdentificacion();
    }
    public EspecialidadesMedicas getEspecialidad() {
        return especialidad;
    }
    public String getIdDoctor() {
        return idDoctor;
    }
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    @Override
    public void programarCita(Date fecha, String motivo) {

        contadorCitas++;
    }
    @Override
    public void cancelarCita(CitaMedica cita) {
    }
    @Override
    public void realizarCita(CitaMedica cita) {

    }
}