import java.util.ArrayList;

public class ExpedienteMedico {
        private ArrayList<String> historial;

        // Constructor
        public ExpedienteMedico() {
            this.historial = new ArrayList<>();
        }

        // Método para agregar entrada al historial
        public void agregarEntrada(String entrada) {
            historial.add(entrada);
        }
    }
