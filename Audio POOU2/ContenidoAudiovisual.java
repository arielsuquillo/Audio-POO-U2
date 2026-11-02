public abstract class ContenidoAudiovisual {
    // Atributos principales
    protected String titulo;
    protected int duracionEnMinutos;
    protected String genero;
    protected int anioLanzamiento;

    // Constructor vacío
    public ContenidoAudiovisual() {
    }

    // Constructor parametrizado
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero, int anioLanzamiento) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.anioLanzamiento = anioLanzamiento;
    }

    // Método abstracto que las subclases deberán implementar obligatoriamente
    public abstract void mostrarDetalles();

    // Métodos Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Género: " + genero + ", Duración: " + duracionEnMinutos + " min, Año: " + anioLanzamiento;
    }
} 
    

