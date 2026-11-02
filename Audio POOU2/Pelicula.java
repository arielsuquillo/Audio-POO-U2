public class Pelicula extends ContenidoAudiovisual {
    // Atributos específicos de Película
    private String estudioCinematografico;
    private boolean disponibleEnStreaming;

    // Constructor vacío
    public Pelicula() {
        super();
    }

    // Constructor parametrizado
    public Pelicula(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento, String estudioCinematografico, boolean disponibleEnStreaming) {
        super(titulo, duracionEnMinutos, genero, anioLanzamiento);
        this.estudioCinematografico = estudioCinematografico;
        this.disponibleEnStreaming = disponibleEnStreaming;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalle de Película ---");
        System.out.println(toString());
        System.out.println("Estudio: " + estudioCinematografico);
        System.out.println("Disponible en Streaming: " + (disponibleEnStreaming ? "Sí" : "No"));
    }

    // Getters y Setters
    public String getEstudioCinematografico() {
        return estudioCinematografico;
    }

    public void setEstudioCinematografico(String estudioCinematografico) {
        this.estudioCinematografico = estudioCinematografico;
    }

    public boolean isDisponibleEnStreaming() {
        return disponibleEnStreaming;
    }

    public void setDisponibleEnStreaming(boolean disponibleEnStreaming) {
        this.disponibleEnStreaming = disponibleEnStreaming;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudio: " + estudioCinematografico;
    }
}