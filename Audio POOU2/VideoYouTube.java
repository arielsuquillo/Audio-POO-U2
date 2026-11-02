public class VideoYouTube extends ContenidoAudiovisual {
    // Atributos específicos de VideoYouTube
    private String nombreCanal;
    private long numeroVisualizaciones;

    // Constructor vacío
    public VideoYouTube() {
        super();
    }

    // Constructor parametrizado
    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento, String nombreCanal, long numeroVisualizaciones) {
        super(titulo, duracionEnMinutos, genero, anioLanzamiento);
        this.nombreCanal = nombreCanal;
        this.numeroVisualizaciones = numeroVisualizaciones;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalle de Video de YouTube ---");
        System.out.println(toString());
        System.out.println("Canal: " + nombreCanal);
        System.out.println("Visualizaciones: " + numeroVisualizaciones);
    }

    // Getters y Setters
    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public long getNumeroVisualizaciones() {
        return numeroVisualizaciones;
    }

    public void setNumeroVisualizaciones(long numeroVisualizaciones) {
        this.numeroVisualizaciones = numeroVisualizaciones;
    }

    @Override
    public String toString() {
        return super.toString() + ", Canal: " + nombreCanal;
    }
}