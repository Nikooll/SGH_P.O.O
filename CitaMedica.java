import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private String motivo;
    private String estado;
    private Paciente paciente;
    private Doctor doctor;

    // Constructor
    public CitaMedica(Date fecha, String motivo, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
        this.estado = "Programada";
    }
}
