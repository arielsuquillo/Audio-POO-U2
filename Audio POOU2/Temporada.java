public class Temporada {
    // Atributos de la clase Temporada
    private int numeroTemporada;
    private int cantidadEpisodios;
    private String fechaEstreno;

    // Constructor vacío
    public Temporada() {
    }

    // Constructor parametrizado
    public Temporada(int numeroTemporada, int cantidadEpisodios, String fechaEstreno) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodios = cantidadEpisodios;
        this.fechaEstreno = fechaEstreno;
    }

    // Método para mostrar los detalles de la temporada
    public void mostrarDetalles() {
        System.out.println("--- Detalle de la Temporada ---");
        System.out.println("Temporada N°: " + numeroTemporada);
        System.out.println("Cantidad de Episodios: " + cantidadEpisodios);
        System.out.println("Fecha de Estreno: " + fechaEstreno);
    }

    // Getters y Setters
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    @Override
    public String toString() {
        return "Temporada " + numeroTemporada + " (" + cantidadEpisodios + " episodios)";
    }
}
