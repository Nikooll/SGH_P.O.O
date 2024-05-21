import java.util.Date;

interface GestiónCitas {
    void programarCita(Date fecha, String motivo);
    void cancelarCita(CitaMedica cita);
    void realizarCita(CitaMedica cita);
}