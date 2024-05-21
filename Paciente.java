import java.util.ArrayList;

class Paciente extends Persona {
    private ExpedienteMedico expediente;
    private ArrayList<CitaMedica> citas;

    public Paciente(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
        this.citas = new ArrayList<>();
    }

    public ExpedienteMedico getExpediente() {
        return expediente;
    }

    public void setExpediente(ExpedienteMedico expediente) {
        this.expediente = expediente;
    }

    public void agregarCita(CitaMedica cita) {
        citas.add(cita);
    }
}