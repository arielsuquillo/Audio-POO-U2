public class TransmisionEnVivo extends ContenidoAudiovisual {
    // Atributos específicos de TransmisionEnVivo
    private String plataforma;
    private int espectadoresActuales;

    // Constructor vacío
    public TransmisionEnVivo() {
        super();
    }

    // Constructor parametrizado
    public TransmisionEnVivo(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento, String plataforma, int espectadoresActuales) {
        super(titulo, duracionEnMinutos, genero, anioLanzamiento);
        this.plataforma = plataforma;
        this.espectadoresActuales = espectadoresActuales;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalle de Transmisión en Vivo ---");
        System.out.println(toString());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Espectadores Actuales: " + espectadoresActuales);
    }

    // Getters y Setters
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getEspectadoresActuales() {
        return espectadoresActuales;
    }

    public void setEspectadoresActuales(int espectadoresActuales) {
        this.espectadoresActuales = espectadoresActuales;
    }

    @Override
    public String toString() {
        return super.toString() + ", Plataforma: " + plataforma;
    }
}