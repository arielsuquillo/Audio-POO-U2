public class SerieDeTV extends ContenidoAudiovisual {
    // Atributos específicos de SerieDeTV
    private int numeroTemporadas;
    private int episodiosTotales;

    // Constructor vacío
    public SerieDeTV() {
        super();
    }

    // Constructor parametrizado
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento, int numeroTemporadas, int episodiosTotales) {
        super(titulo, duracionEnMinutos, genero, anioLanzamiento);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosTotales = episodiosTotales;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("--- Detalle de Serie de TV ---");
        System.out.println(toString());
        System.out.println("Número de Temporadas: " + numeroTemporadas);
        System.out.println("Episodios Totales: " + episodiosTotales);
    }

    // Getters y Setters
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getEpisodiosTotales() {
        return episodiosTotales;
    }

    public void setEpisodiosTotales(int episodiosTotales) {
        this.episodiosTotales = episodiosTotales;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temporadas: " + numeroTemporadas;
    }
}